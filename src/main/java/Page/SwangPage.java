package Page;

import MainPage.BasePage;
import org.openqa.selenium.NoSuchElementException;

public class SwangPage extends BasePage {

    private String username ="//input[@id='user-name']";
    private String password ="//input[@id='password']";
    private String login = "//input[@id='login-button']";
    private String menú = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]";
    private String notLogin="//*[@id=\"login_button_container\"]/div/form/div[3]/h3";
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

    public String mensajeDeError(){
        return textFromElement(notLogin);
    }


}
