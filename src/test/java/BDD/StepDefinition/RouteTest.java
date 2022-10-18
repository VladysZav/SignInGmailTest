package BDD.StepDefinition;
import Pages.GmailPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class RouteTest {
    WebDriver webDriver;


    @Given("^I am on the Sign in Gmail$")
    public void open_Sign_In_Gmail() throws Throwable{
        File fileChromeDriver = new File("chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        GmailPage gmailPage = new GmailPage(webDriver);
        gmailPage.open("https://accounts.google.com/");
        System.out.println("This step open Sign in");
    }

    @When("^I enter 'vladyslav048' in email string$")
    public void enter_Email_Address() throws Throwable{
        GmailPage gmailPage = new GmailPage(webDriver);
        gmailPage.setEmail("vladyslav048");
        gmailPage.clickToButtonNext();
        System.out.println("This step enter enter 'vladyslav048' in email string");
    }
    @When("^I enter 'wrong' in email string$")
    public void enter_Wrong_Email_Address() throws Throwable{
        GmailPage gmailPage = new GmailPage(webDriver);
        gmailPage.setEmail("wrong");
        gmailPage.clickToButtonNext();
        System.out.println("This step enter enter 'wrong' in email string");
    }
    @Then("^I enter 'zaval123' in password string$")
    public void enter_Password() throws Throwable{
        GmailPage gmailPage = new GmailPage(webDriver);
        gmailPage.setPassword("zaval123");
        gmailPage.clickToButtonNext();
        TimeUnit.SECONDS.sleep(5);
        webDriver.close();
        System.out.println("This step enter 'zaval123' in password string");
    }
    @Then("^I check error text email$")
    public void check_Error_Email() throws Throwable{
        GmailPage gmailPage = new GmailPage(webDriver);
        gmailPage.checkTextErrorEmail();
        TimeUnit.SECONDS.sleep(2);
        webDriver.close();
        System.out.println("This step check error text");
    }
    @And("^I enter 'wrong' in password string$")
    public void enter_Wrong_Password() throws Throwable {
        GmailPage gmailPage = new GmailPage(webDriver);
        gmailPage.setPassword("wrong");
        gmailPage.clickToButtonNext();
        System.out.println("This step enter 'wrong' in password string");
    }
    @Then("^I check error text password$")
    public void check_Error_Password() throws Throwable {
        GmailPage gmailPage = new GmailPage(webDriver);
        gmailPage.checkTextErrorPassword();
        TimeUnit.SECONDS.sleep(2);
        webDriver.close();
        System.out.println("This step check error text");
    }
}
