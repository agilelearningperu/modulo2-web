package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class paymentPage extends util {
    @FindBy(className = "page-heading")protected WebElement lblTitulo;
    @FindBy(className = "bankwire")protected WebElement btnBank;
    @FindBy(xpath = "//*[contains(text(),'I confirm my order')]")protected WebElement btnConfirmar;

    public paymentPage() {
        PageFactory.initElements(driver, this);
    }

    public void validarTitulo(String titulo){
        wait.until(ExpectedConditions.visibilityOf(lblTitulo));
        Assert.assertEquals(titulo, lblTitulo.getText());
    }

    public void clickBanco(){
        btnBank.click();
    }

    public void clickConfirmar(){
        btnConfirmar.click();
    }
}
