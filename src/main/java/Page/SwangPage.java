package Page;

import MainPage.BasePage;

public class SwangPage extends BasePage {

    private String username ="//input[@id='user-name']";
    private String password ="//input[@id='password']";
    private String login = "//input[@id='login-button']";

    public SwangPage(){
        super(driver);
    }

    public void navegoASwangLab(){
        navigateTo("https://www.saucedemo.com/");
    }

    public void enterSearchCriteria(String criteria){
        write(username,criteria);
        write(password,criteria);
    }

    public void clickLogin(){
        clickElement(login);
    }

}
