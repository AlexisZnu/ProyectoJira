package Steps;

import Page.SwangCompraPage;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class SwangCompraSteps {

    SwangCompraPage compra = new SwangCompraPage();

    @Given("^El usuario navega a la pagina de Swang Labs$")
    public void navegoALaPagina(){
        compra.navigateToSwang();
    }

    @When("El usuario ingresa las credenciales del User \"(.*)\" y contrasenia \"(.*)\"$")
    public void enterCriteria(String username, String password) {
        compra.enterUseCriteria(username);
        compra.enterPassCriteria(password);
    }

    @And("^El usuario clickea login$")
    public void ingresaALaPagina() {
        compra.clickLogin();
    }

    @And("^El usuario agrega un producto al carrito$")
    public void agregoProductoAlCarrito(){
        compra.addToCart();

    }

    @And("El usuario realiza el checkout")
    public void elUsuarioRealizaElCheckout() {
        compra.goToCarrito();
        compra.checkOut();
    }


    @And("^El usuario agrega sus (.*) (.*) (.*) para realizar la compra$")
    public void colocoCredenciales(String first, String last, String codigo){
        compra.writeInformationName(first);
        compra.writeInformationApellido(last);
        compra.writeInformationZip(codigo);
    }

    @Then("El usuario verifica si pudo realizar la compra")
    public void verificoLaCompra(){
        compra.clickContinuar();
        compra.clickButtonFinish();
        Assert.assertTrue("The text is there",compra.compraRealizada());
    }


}
