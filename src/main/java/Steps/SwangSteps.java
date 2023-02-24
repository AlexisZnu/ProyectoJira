package Steps;

import Page.SwangPage;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class SwangSteps {

    SwangPage swang = new SwangPage();

    @Given("^Estoy en la pagina de swaglabs$")
        public void ingresoALaPagina(){
            swang.navegoASwangLab();
    }

    @When("^Ingreso las credenciales del usuario (.+) y password (.+)$")
    public void colocoElUsuario(String username, String password){
        swang.enterUseCriteria(username);
        swang.enterPassCriteria(password);
    }

    @And("^Accedo a la pagina mediante el login$")
    public void accedoALaPagina(){
        swang.clickLogin();
    }

    @Then("^Ingreso correctamente a la pagina$")
    public void ingresoCorrectamente(){
    Assert.assertTrue("El elemento está siento mostrado", swang.menuHambur());
    }




    @When("^Ingreso incorrectamente las opciones de (.*)$")
    public void usersInvalid(String criteria){
        swang.enterUseCriteria(criteria);
    }

    @And("^Coloco la (.*)$")
    public void passwordsInvalid(String criteria){
        swang.enterPassCriteria(criteria);
        swang.clickLogin();
    }

    @Then("^valido si pude acceder a la pagina$")
    public void validacionDeIngreso(){
        Assert.assertFalse("The text Products is not there",swang.menuHambur());
    }


    @When("^Escribo la opcion de (.*)$")
    public void validUser(String criteria){
        swang.enterUseCriteria(criteria);
    }

    @And("^Escribo unicamente (.*)$")
    public void validPassword(String criteria){
        swang.enterPassCriteria(criteria);
        swang.clickLogin();
    }

    @Then("^verifico si logré ingresar a la pagina$")
    public void Ingresologrado(){
        Assert.assertTrue("The text Products is not there",swang.menuHambur());
    }
}
