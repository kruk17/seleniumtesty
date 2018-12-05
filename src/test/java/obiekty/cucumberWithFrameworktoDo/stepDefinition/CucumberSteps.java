package obiekty.cucumberWithFrameworktoDo.stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import obiekty.LoginSite;
import obiekty.MainPage;
import obiekty.ObjectBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testy.TestBase;

import static manager.DriverManager.getDriver;
import static org.testng.Assert.assertTrue;

public class CucumberSteps extends ObjectBase {




        @Given("^I'am on a Login Page$")
        public void i_am_on_a_Login_Page () throws Throwable {
            MainPage mainPage = new MainPage();
            mainPage.enterLoginSite();
            System.out.println("aaaa");

        }

        @When("^Enter the Username and Password and click Login Button:$")
        public void enter_the_Username_and_Password_and_click_Login_Button() throws Throwable {

            LoginSite loginSite = new LoginSite();
            loginSite.sendKeysUser("tomsmith");
            loginSite.sendKeysPassword("SuperSecretPassword!");
            loginSite.clickSignOn();


        }

        @Then("^I logged into Site$")
        public void i_logged_into_Site () throws Throwable {
            WebElement messageText = getDriver().findElement(By.id("flash"));
            assertTrue(messageText.getText().contains("You logged into a secure area!"));


        }
    }

