package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hooks {
    private static String navegador="chrome";
    public static WebDriver driver;

    @Before
    public static void setUp(){
        if (navegador.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
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
