package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class hooks {
    private static String navegador="chrome";
    public static WebDriver driver;

    @Before
    public static void setUp() throws MalformedURLException {
        if (navegador.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
			options.addArguments("--no-sandbox");
            driver = new RemoteWebDriver(new URL("http://172.17.0.3:9222/wd/hub"),options);
//            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }else if (navegador.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
    }

    @After
    public static void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
