package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class accountPage extends util {
    @FindBy(className = "info-account")protected WebElement lblMensaje;

    public accountPage() {
        PageFactory.initElements(driver, this);
    }

    public void validarRegistro(){
        wait.until(ExpectedConditions.visibilityOf(lblMensaje));
        Assert.assertTrue(lblMensaje.isDisplayed());
    }
}
