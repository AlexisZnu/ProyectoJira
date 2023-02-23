package Steps;

import Page.SwangPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SwangSteps {

    SwangPage swang = new SwangPage();

    @Given("^Estoy en la pagina de swaglabs$")
        public void ingresoALaPagina(){
            swang.navegoASwangLab();
    }

    @When("^Ingreso las credenciales del (.*)$")
    public void colocoElUsuario(String criteria){
        swang.enterSearchCriteria(criteria);
    }

    @When("^Ingreso la (.*)$")
    public void colocoPassword(String criteria){
        swang.enterSearchCriteria(criteria);
    }

    @Then("^Ingreso correctamente a la pagina$")
    public void ingresoCorrectamente(){
        swang.clickLogin();
    }
}
