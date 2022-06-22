package definitions;

import io.cucumber.java.es.*;
import pageobjects.accountPage;
import pageobjects.authenticationPage;
import pageobjects.createAccountPage;
import pageobjects.menuPage;

public class registroUsuarioDefinition {
    menuPage menu;
    authenticationPage auth;
    createAccountPage create;
    accountPage account;

    public registroUsuarioDefinition() {
        menu = new menuPage();
        auth = new authenticationPage();
        create = new createAccountPage();
        account = new accountPage();
    }

    @Dado("que la web esta disponible")
    public void queLaWebEstaDisponible() {
        hooks.driver.get("http://automationpractice.com/index.php");
    }

    @E("ingreso a la opción de inicio de sesión")
    public void ingresoALaOpciónDeInicioDeSesión() {
        menu.clickInicioSesion();
    }

    @E("ingreso un correo {string}")
    public void ingresoUnCorreo(String email) {
        auth.escribirEmail(email);
    }

    @Cuando("valido el correo")
    public void validoElCorreo() {
        auth.clickCrearCuenta();
    }

    @Y("selecciono el titulo {string}")
    public void seleccionoElTitulo(String titulo) {
        create.seleccionarGenero(titulo);
    }

    @E("ingreso nombre {string}")
    public void ingresoNombre(String nombre) {
        create.escribirNombre(nombre);
    }

    @E("ingreso apellido {string}")
    public void ingresoApellido(String apellido) {
        create.escribirApellido(apellido);
    }

    @Y("valido correo {string}")
    public void validoCorreo(String correo) {
        create.validarEmail(correo);
    }

    @E("ingreso la clave {string}")
    public void ingresoLaClave(String clave) {
        create.escribirClave(clave);
    }

    @Y("selecciono el dia de nacimiento {string}")
    public void seleccionoElDiaDeNacimiento(String dia) {
        create.seleccionarDia(dia);
    }

    @Y("selecciono el mes de nacimiento {string}")
    public void seleccionoElMesDeNacimiento(String mes) {
        create.seleccionarMes(mes);
    }

    @Y("Selecciono el año de nacimiento {string}")
    public void seleccionoElAñoDeNacimiento(String anio) {
        create.seleccionarAnio(anio);
    }

    @Y("selecciono el envio de correos")
    public void seleccionoElEnvioDeCorreos() {
        create.seleccionarCorreos();
    }

    @Y("selecciono el envio de ofertas")
    public void seleccionoElEnvioDeOfertas() {
        create.seleccionarOfertas();
    }

    @Y("valido el nombre {string}")
    public void validoElNombre(String nombre) {
        create.validarNombre(nombre);
    }

    @Y("valido el apellido {string}")
    public void validoElApellido(String apellido) {
        create.validarApellido(apellido);
    }

    @E("ingreso el nombre de la empresa {string}")
    public void ingresoElNombreDeLaEmpresa(String empresa) {
        create.escribirEmpresa(empresa);
    }

    @E("ingreso la primera dirección {string}")
    public void ingresoLaPrimeraDirección(String direccion) {
        create.escribirDireccion1(direccion);
    }

    @E("ingreso la segunda dirección {string}")
    public void ingresoLaSegundaDirección(String direccion) {
        create.escribirDireccion2(direccion);
    }

    @E("ingreso la ciudad {string}")
    public void ingresoLaCiudad(String ciudad) {
        create.escribirCiudad(ciudad);
    }

    @Y("selecciono el estado {string}")
    public void seleccionoElEstado(String estado) {
        create.seleccionarEstado(estado);
    }

    @E("ingreso el codigo postal {string}")
    public void ingresoElCodigoPostal(String codigo) {
        create.escribirCodigoPostal(codigo);
    }

    @Y("selecciono el país {string}")
    public void seleccionoElPaís(String pais) {
        create.seleccionarPais(pais);
    }

    @E("ingreso información adicional {string}")
    public void ingresoInformaciónAdicional(String otros) {
        create.escribirOtros(otros);
    }

    @E("ingreso numero de telefono {string}")
    public void ingresoNumeroDeTelefono(String telefono) {
        create.escribirTelefono(telefono);
    }

    @E("ingreso numero de celular {string}")
    public void ingresoNumeroDeCelular(String celular) {
        create.escribirCelular(celular);
    }

    @E("ingreso el alias {string}")
    public void ingresoElAlias(String alias) {
        create.escribirAlias(alias);
    }

    @Y("registro de los datos")
    public void registroDeLosDatos() {
        create.clickRegistrar();
    }

    @Entonces("validar que se registro los datos")
    public void validarQueSeRegistroLosDatos() {
        account.validarRegistro();
    }
}
