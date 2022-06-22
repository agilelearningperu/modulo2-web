package definitions;

import io.cucumber.java.es.E;
import io.cucumber.java.es.Y;
import pageobjects.*;

import java.io.IOException;

public class compraProductoDefinition {
    indexPage index;
    productPage product;
    modalPage modal;
    summaryPage summary;
    signInPage sign;
    addressesPage address;
    shippingPage shipping;
    paymentPage payment;

    public compraProductoDefinition() {
        index = new indexPage();
        product = new productPage();
        modal = new modalPage();
        summary = new summaryPage();
        sign = new signInPage();
        address = new addressesPage();
        shipping = new shippingPage();
        payment = new paymentPage();
    }

    @Y("click en la opción causal dresses")
    public void clickEnLaOpciónCausalDresses() throws IOException {
        index.mouseoverWomen();
        index.clickCasualDresses();
        index.evidencias();
    }

    @Y("agregar producto al carrito")
    public void agregarProductoAlCarrito() {
        product.mouseoverContainer();
        product.clickAgregarCarrito();
    }

    @Y("continuar con el proceso compra")
    public void continuarConElProcesoCompra() throws IOException {
        modal.ValidarTitulo();
        modal.clickSiguiente();
        index.evidencias();
    }

    @Y("click en continuar resumen de compra")
    public void clickEnContinuarResumenDeCompra() throws IOException {
        summary.validarTitulo("SHOPPING-CART SUMMARY ");
        index.evidencias();
        summary.clickSiguiente();
    }

    @E("ingresar email {string}")
    public void ingresarEmail(String email) throws IOException {
        sign.validarTitulo("AUTHENTICATION");
        index.evidencias();
        sign.ingresarEmail(email);
    }

    @E("ingresar clave {string}")
    public void ingresarClave(String clave) {
        sign.ingresarClave(clave);
    }

    @Y("click en login")
    public void clickEnLogin() {
        sign.clickLogin();
    }

    @Y("click en continuar dirección")
    public void clickEnContinuarDirección() throws IOException {
        address.validarTitulo("ADDRESSES");
        index.evidencias();
        address.clickSiguiente();
    }

    @Y("click en continuar shipping")
    public void clickEnContinuarShipping() throws IOException {
        shipping.validarTitulo("SHIPPING");
        shipping.clickTerminosCondiciones();
        index.evidencias();
        shipping.clickSiguiente();
    }

    @Y("selecciono modo de pago banco")
    public void seleccionoModoDePagoBanco() {
        payment.validarTitulo("PLEASE CHOOSE YOUR PAYMENT METHOD");
        payment.clickBanco();
    }

    @Y("confirmo compra")
    public void confirmoCompra() throws IOException {
        index.evidencias();
        payment.clickConfirmar();
    }
}
