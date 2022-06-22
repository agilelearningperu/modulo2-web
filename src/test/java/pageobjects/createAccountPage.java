package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import support.util;

public class createAccountPage extends util {
    @FindBy(id = "id_gender1")protected WebElement rdbmr;
    @FindBy(id = "id_gender2")protected WebElement rdbmrs;
    @FindBy(id = "customer_firstname") protected WebElement txtNombre;
    @FindBy(id = "customer_lastname") protected WebElement txtApellido;
    @FindBy(id = "email") protected WebElement txtEmail;
    @FindBy(id = "passwd") protected WebElement txtClave;
    @FindBy(id = "days") protected  WebElement cmbDias;
    @FindBy(id = "months") protected WebElement cmbMes;
    @FindBy(id = "years") protected WebElement cmbAnio;
    @FindBy(id = "newsletter") protected WebElement chkCorreos;
    @FindBy(id = "optin") protected WebElement chkOfertas;
    @FindBy(id = "firstname") protected WebElement txtNombre2;
    @FindBy(id = "lastname") protected WebElement txtApellido2;
    @FindBy(id = "company") protected WebElement txtEmpresa;
    @FindBy(id = "address1") protected WebElement txtDireccion;
    @FindBy(id = "address2") protected WebElement txtDireccion2;
    @FindBy(id = "city") protected WebElement txtCiudad;
    @FindBy(id = "id_state") protected WebElement cmbEstabo;
    @FindBy(id = "postcode") protected WebElement txtCodigo;
    @FindBy(id = "id_country") protected WebElement cmbPais;
    @FindBy(id = "other") protected WebElement txtOtros;
    @FindBy(id = "phone") protected WebElement txtTelefono;
    @FindBy(id = "phone_mobile") protected WebElement txtCelular;
    @FindBy(id = "alias") protected WebElement txtAlias;
    @FindBy(id = "submitAccount") protected WebElement btnRegistrar;

    public createAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public void seleccionarGenero(String genero){
        wait.until(ExpectedConditions.visibilityOf(rdbmr));
        if (genero.equals("señor")){
            rdbmr.click();
            rdbmr.isSelected();
        }else if (genero.equals("señora")){
            rdbmrs.click();
            rdbmrs.isSelected();
        }else{
            System.out.println("El valor permitido debe ser señor o señora, no el valor: "+genero);
        }
    }

    public void escribirNombre(String nombre){
        txtNombre.sendKeys(nombre);
    }

    public void escribirApellido(String apellido){
        txtApellido.sendKeys(apellido);
    }

    public void validarEmail(String email){
        String correo = txtEmail.getAttribute("value");
        Assert.assertEquals(email, correo);
    }

    public void escribirClave(String clave){
        txtClave.sendKeys(clave);
    }

    public void seleccionarDia(String dia){
        new Select(cmbDias).selectByValue(dia);
    }

    public void seleccionarMes(String mes){
        new Select(cmbMes).selectByValue(mes);
    }

    public void seleccionarAnio(String anio){
        new Select(cmbAnio).selectByValue(anio);
    }

    public void seleccionarCorreos(){
        chkCorreos.click();
    }

    public void seleccionarOfertas(){
        chkOfertas.click();
    }

    public void validarNombre(String nombre){
        String valor = txtNombre2.getAttribute("value");
        Assert.assertEquals(nombre, valor);
    }

    public void validarApellido(String apellido){
        String valor = txtApellido2.getAttribute("value");
        Assert.assertEquals(apellido, valor);
    }

    public void escribirEmpresa(String empresa){
        txtEmpresa.sendKeys(empresa);
    }

    public void escribirDireccion1(String direccion){
        txtDireccion.sendKeys(direccion);
    }

    public void escribirDireccion2(String direccion){
        txtDireccion2.sendKeys(direccion);
    }

    public void escribirCiudad(String ciudad){
        txtCiudad.sendKeys(ciudad);
    }

    public void seleccionarEstado(String estado){
        new Select(cmbEstabo).selectByVisibleText(estado);
    }

    public void escribirCodigoPostal(String codigo){
        txtCodigo.sendKeys(codigo);
    }

    public void seleccionarPais(String pais){
        new Select(cmbPais).selectByVisibleText(pais);
    }

    public void escribirTelefono(String telefono){
        txtTelefono.sendKeys(telefono);
    }

    public void escribirCelular(String celular){
        txtCelular.sendKeys(celular);
    }

    public void escribirOtros(String otro){
        txtOtros.sendKeys(otro);
    }

    public void escribirAlias(String alias){
        txtAlias.sendKeys(alias);
    }

    public void clickRegistrar(){
        btnRegistrar.click();
    }
}
