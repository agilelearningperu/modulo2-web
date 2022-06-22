package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class addressesPage extends util {
    @FindBy(className = "page-heading")protected WebElement lblTitulo;
    @FindBy(name = "processAddress")protected WebElement btnProceed;

    public addressesPage() {
        PageFactory.initElements(driver, this);
    }

    public void validarTitulo(String titulo){
        wait.until(ExpectedConditions.visibilityOf(lblTitulo));
        Assert.assertEquals(titulo, lblTitulo.getText());
    }

    public void clickSiguiente(){
        btnProceed.click();
    }
}
