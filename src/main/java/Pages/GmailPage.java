package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPage extends ParentPage {


    public GmailPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = "[type='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//*[text()='Далее']")
    private WebElement buttonNext;

    @FindBy(css = "[autocomplete='current-password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//*[text()='Не удалось найти аккаунт Google.']")
    private WebElement errorTextEmail;


    public void clickToButtonNext() {
        webElements.clickOnElement(buttonNext);
    }
    public void setEmail(String email){
        webElements.enterText(inputEmail, email);
    }
    public void setPassword(String password){
        webElements.enterText(inputPassword, password);
    }
    public void checkTextErrorEmail(){
        webElements.isElementPresent("//*[text()='Не удалось найти аккаунт Google.']");
    }
    public void checkTextErrorPassword(){
        webElements.isElementPresent("//*[text()='Неверный пароль. Повторите попытку или нажмите на ссылку 'Забыли пароль?', чтобы сбросить его..']");
    }
}


