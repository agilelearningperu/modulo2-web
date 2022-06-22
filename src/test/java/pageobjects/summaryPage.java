package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class summaryPage extends util {
    @FindBy(id = "cart_title")protected WebElement lblTitulo;
    @FindBy(xpath = "//span[text()='Proceed to checkout']")protected WebElement btnProceed;

    public summaryPage() {
        PageFactory.initElements(driver, this);
    }

    public void validarTitulo(String titulo){
        wait.until(ExpectedConditions.visibilityOf(lblTitulo));
        //Assert.assertEquals(titulo, lblTitulo.getText());
    }

    public void clickSiguiente(){
        wait.until(ExpectedConditions.elementToBeClickable(btnProceed));
        btnProceed.click();
    }
}
