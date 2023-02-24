package Page;

import MainPage.BasePage;
import org.openqa.selenium.NoSuchElementException;

public class SwangPage extends BasePage {

    private String username ="//input[@id='user-name']";
    private String password ="//input[@id='password']";
    private String login = "//input[@id='login-button']";
    private String menú = "//span[contains(text(),'Products')]";
    public SwangPage(){
        super(driver);
    }

    public void navegoASwangLab(){
        navigateTo("https://www.saucedemo.com/");
    }

    public void enterUseCriteria(String criteria){
            write(username,criteria);
    }

    public void enterPassCriteria(String criteria){
            write(password,criteria);
    }

    public void clickLogin(){
        clickElement(login);
    }

    public boolean menuHambur(){
        return elementIsDisplayed(menú);
    }


}
