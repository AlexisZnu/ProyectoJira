package Steps;

import Page.SwangPage;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class SwangSteps {

    SwangPage swang = new SwangPage();


    @Given("^Estoy en la pagina de swaglabs$")
    public void ingresoALaPagina() {
        swang.navegoASwangLab();
    }

    //Camino feliz
    @When("^Ingreso las credenciales del usuario (.+) y password (.+)$")
    public void colocoElUsuario(String username, String password) {
        swang.enterUseCriteria(username);
        swang.enterPassCriteria(password);
    }

    @And("^Accedo a la pagina mediante el login$")
    public void accedoALaPagina() {
        swang.clickLogin();
    }

    @Then("^Ingreso correctamente a la pagina$")
    public void ingresoCorrectamente() {
        Assert.assertTrue("El elemento está siento mostrado", swang.menuHambur());
    }

// Login con usuario invalido
    @When("El usuario ingresa incorrectamente el (.+) y correcta (.+)")
    public void usersInvalid(String User, String pass) {
        swang.enterUseCriteria(User);
        swang.enterPassCriteria(pass);
    }

    @And("El usuario clickea el boton login")
        public void clicklogin(){
        swang.clickLogin();
    }

    @Then("^Valido el resultado de la pagina$")
    public void validacionDeIngreso() {
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", swang.mensajeDeError());
    }


    //Login con contraseña invalido
    @When("^El usuario ingresa correctamente el (.+) e incorrecta (.+)$")
    public void validUser(String user, String pass) {
        swang.enterUseCriteria(user);
        swang.enterPassCriteria(pass);
    }

    @And("El usuario hace click el boton login")
    public void validPassword(){
        swang.clickLogin();
    }

    @Then("Valido el resultado del ingreso a la pagina")
    public void Ingresologrado() {
    Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",swang.mensajeDeError());
    }

   //Login sin ingresar usuario
    @When("^El usuario ingresa (.+) correcta deja vacio el espacio del usuario$")
        public void validPass(String pass) {
         swang.enterPassCriteria(pass);
    }
    @And("El usuario da un click al boton login")
    public void elUsuarioClickeaElBotonLogin() {
        swang.clickLogin();
    }
    @Then("Valido la respuesta de la pagina")
    public void respuestaDePagina() {
        Assert.assertEquals("Epic sadface: Username is required", swang.mensajeDeError());
    }

   //Login sin ingresar contraseña
    @When("El usuario ingresa correctamente el (.+) y dedja vacio el espacio de contrasenia")
    public void validarSinContrasenia(String user) {
        swang.enterUseCriteria(user);
    }

    @And("El usuario accede a presionar el boton login")
    public void presionarElBoton() {
        swang.clickLogin();
    }

    @Then("Valido si pude acceder a la pagina sin contrasenia")
    public void accedoSinPass() {
        Assert.assertEquals("Epic sadface: Password is required", swang.mensajeDeError());
    }

    //Login con usuario lockeado
    @When("El usuario ingresa el (.+) bloqueado y (.+) correcta")
    public void usuarioBloqueado(String user, String pass) {
        swang.enterUseCriteria(user);
        swang.enterPassCriteria(pass);
    }

    @And("El usuario vuelve a clickear el boton login")
    public void clickUserBloqueado() {
        swang.clickLogin();
    }

    @Then("Valido la respuesta del usuario bloqueado")
    public void usuarioBloqueado() {
        Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", swang.mensajeDeError());
    }

    //Login de usuario con caracteres especiales
    @When("^El usuario ingresa en el (.+) caracteres especiales y una (.+) correcta$")
    public void validPassword(String user, String pass) {
        swang.enterUseCriteria(user);
        swang.enterPassCriteria(pass);
    }

    @And("El intenta ingresar clickeando el boton login")
    public void intentoDeIngreso() {
        swang.clickLogin();
    }

    @Then("valido la respuesta recibida de la aplicacion")
    public void respuestaDeLaAplicacion() {
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", swang.mensajeDeError());
    }

    //Login de password con caracteres especiales
    @When("El usuario ingresa el (.+) valido y la (.+) con caracteres especiales")
    public void passConCaracteresEspeciales(String user, String pass) {
        swang.enterUseCriteria(user);
        swang.enterPassCriteria(pass);
    }
    @And("El usuario clickea el boton login de la aplicacion")
    public void loginDelPass() {
        swang.clickLogin();
    }

    @Then("^valido la respuesta recibida de la aplicacion por la contrasenia escrita$")
    public void respuestaDelPass() {
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", swang.mensajeDeError());
    }

   //Login ingresando  el usuario una cantidad elevada de caracteres
    @When("El usuario en la pantalla de login con su usuario con una cantidad elevada de caracteres y una contrasenia valida")
    public void validUser(String user) {
        swang.enterUseCriteria(user);
    }

    @And("^El usuario ingresa el (.+) y (.+) valida$")
    public void validPassword(String password) {
        swang.enterPassCriteria(password);
    }

    @And("El usuario clickea el boton login")
    public void elUsuarioClickeaElBotonLogin() {
        swang.clickLogin();
    }

    @Then("^verifico si logré ingresar a la pagina$")
    public void Ingresologrado() {
        Assert.assertTrue("The text Products is not there", swang.menuHambur());
    }

   /* //Login ingresando un password con una cantidad elevada de caracteres
    @When("El usuario en la pantalla de login con un usuario valido y una contraseia con caracteres elevados")
    public void validUser(String user) {
        swang.enterUseCriteria(user);
    }

    @And("^El usuario ingresa el (.+) y la (.+) valida$")
    public void validPassword(String password) {

    }

    @And("El usuario clickea el boton login")
    public void elUsuarioClickeaElBotonLogin() {
        swang.clickLogin();
    }

    @Then("^verifico si logré ingresar a la pagina$")
    public void Ingresologrado() {
        Assert.assertTrue("The text Products is not there", swang.menuHambur());
    }

    //Como Tester quiero probar todas las opciones correctas para acceder a la pagina
    @When("^El usario ingresa el user (.*)$")
    public void validUser(String user) {
        swang.enterUseCriteria(user);
    }

    @And("^El usuario ingresa la contrasenia (.*)$")
    public void validPassword(String password) {
    }

    @And("El usuario clickea el boton login")
    public void elUsuarioClickeaElBotonLogin() {
        swang.clickLogin();
    }

    @Then("^verifico si logré ingresar a la pagina$")
    public void Ingresologrado() {
        Assert.assertTrue("The text Products is not there", swang.menuHambur());
    }*/
}
