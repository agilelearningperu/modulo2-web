package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class signInPage extends util {
    @FindBy(className = "page-heading")protected WebElement lblTitulo;
    @FindBy(id = "email")protected WebElement txtEmail;
    @FindBy(id = "passwd")protected WebElement txtClave;
    @FindBy(id = "SubmitLogin")protected WebElement btnLogin;

    public signInPage() {
        PageFactory.initElements(driver, this);
    }

    public void validarTitulo(String titulo){
        wait.until(ExpectedConditions.visibilityOf(lblTitulo));
        Assert.assertEquals(titulo, lblTitulo.getText());
    }

    public void ingresarEmail(String email){
        txtEmail.sendKeys(email);
    }

    public void ingresarClave(String clave){
        txtClave.sendKeys(clave);
    }

    public void clickLogin(){
        btnLogin.click();
    }
}
