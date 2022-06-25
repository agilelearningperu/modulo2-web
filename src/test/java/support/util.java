package support;

import definitions.hooks;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class util extends hooks {
    public static WebDriverWait wait;
    public static Actions action;

    public util() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        action = new Actions(driver);
    }

    public void evidencias() throws IOException {
        Date fecha= new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("ddMMyyyy_HHmmssSSS");

        String path = "/var/jenkins_home/workspace/testing-web/target/evidencias/";
        String imagen = formatofecha.format(fecha)+"_screenshot.jpg";

        File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(path+imagen));
    }
}
