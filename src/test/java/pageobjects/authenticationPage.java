package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class authenticationPage extends util {
    @FindBy(id = "email_create") protected WebElement txtEmail;
    @FindBy(id= "SubmitCreate") protected WebElement btnCreate;

    public authenticationPage() {
        PageFactory.initElements(driver, this);
    }

    public void escribirEmail(String email){
        wait.until(ExpectedConditions.visibilityOf(txtEmail));
        txtEmail.sendKeys(email);
    }

    public void clickCrearCuenta(){
        wait.until(ExpectedConditions.elementToBeClickable(btnCreate));
        btnCreate.click();
    }

}
