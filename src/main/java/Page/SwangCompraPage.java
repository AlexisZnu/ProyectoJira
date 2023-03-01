package Page;

import MainPage.BasePage;

public class SwangCompraPage extends BasePage {

    private String inputUsername ="//input[@id='user-name']";
    private String inputPassword ="//input[@id='password']";
    private String clickLogin = "//input[@id='login-button']";
    private String addButton = "//button[@id='add-to-cart-sauce-labs-backpack']";
    private String carrito = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]";
    private String checkOut="//button[@id='checkout']";
    private String firstName ="//input[@id='first-name']";
    private String lastName = "//input[@id='last-name']";
    private String postalCode ="//input[@id='postal-code']";

    private String continuar = "//input[@id='continue']";

    private String finishButton= "//button[@id='finish']";

    private String textoCompraRealizada = "//span[contains(text(),'Checkout: Complete!')]";

    public SwangCompraPage(){
        super(driver);
    }

    public void navigateToSwang(){
        navigateTo("https://www.saucedemo.com/");
    }

    public void enterUseCriteria(String username){
        write(inputUsername,username);
    }

    public void enterPassCriteria(String password){
        write(inputPassword,password);
    }

    public void clickLogin(){
        clickElement(clickLogin);
    }

    public void addToCart(){
        clickElement(addButton);
    }

    public void goToCarrito(){
        clickElement(carrito);
    }

    public void checkOut(){
        clickElement(checkOut);
    }

    public void writeInformationName(String name){
        write(firstName,name);
    }

    public void writeInformationApellido(String apellido){
        write(lastName,apellido);
    }

    public void writeInformationZip(String zip){
        write(postalCode,zip);
    }

    public void clickContinuar(){
        clickElement(continuar);
    }

    public void clickButtonFinish(){
        clickElement(finishButton);
    }

    public boolean compraRealizada(){
        return elementIsDisplayed(textoCompraRealizada);
    }
}
