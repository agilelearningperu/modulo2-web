package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class modalPage extends util {
    @FindBy(xpath = "//i[@class='icon-ok']/ancestor::h2")protected WebElement lblTitulo;
    @FindBy(xpath = "//a[@title='Proceed to checkout']")protected WebElement btnProceed;

    public modalPage() {
        PageFactory.initElements(driver, this);
    }

    public void ValidarTitulo(){
        wait.until(ExpectedConditions.visibilityOf(lblTitulo));
        Assert.assertTrue(lblTitulo.isDisplayed());
    }

    public void clickSiguiente(){
        btnProceed.click();
    }
}
