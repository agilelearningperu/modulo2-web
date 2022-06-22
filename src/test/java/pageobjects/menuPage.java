package pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class menuPage extends util {
    @FindBy(className = "login") protected WebElement lnkIniciarSesion;

    public menuPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickInicioSesion(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkIniciarSesion));
        lnkIniciarSesion.click();
    }
}
