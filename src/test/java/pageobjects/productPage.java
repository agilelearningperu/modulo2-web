package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class productPage extends util {

    @FindBy(className = "product-container")protected WebElement divContainer;
    @FindBy(xpath = "//*[text()='Add to cart']")protected WebElement btnAgregar;

    public productPage() {
        PageFactory.initElements(driver, this);
    }

    public void mouseoverContainer(){
        wait.until(ExpectedConditions.visibilityOf(divContainer));
        action.moveToElement(divContainer).perform();
    }

    public void clickAgregarCarrito(){
        wait.until(ExpectedConditions.elementToBeClickable(btnAgregar));
        btnAgregar.click();
    }
}
