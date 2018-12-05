package testy.testsUsingCucumber.withoutFramework.stepDefinition;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class CucumberSteps{

        private WebDriver driver;

        @Given("^I'am on a Login Page$")
        public void i_am_on_a_Login_Page () throws Throwable {
            System.setProperty("webdriver.chrome.driver","C://drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.navigate().to("http://the-internet.herokuapp.com/secure");

        }

        @When("^Enter the Username and Password and click Login Button:$")
        public void enter_the_Username_and_Password_and_click_Login_Button (DataTable arg1) throws Throwable {
            List<List<String>> dataTable = arg1.raw();
            System.out.println(dataTable.get(0).get(0));
            System.out.println(dataTable.get(0).get(1));
            WebElement login = driver.findElement(By.id("username"));
            login.clear();
            login.sendKeys(dataTable.get(0).get(0));
            WebElement password = driver.findElement(By.id("password"));
            password.clear();
            password.sendKeys(dataTable.get(0).get(1));
            WebElement signIn = driver.findElement(By.xpath("//*[@id='login']/button/i"));
            signIn.click();
        }

        @Then("^I logged into Site$")
        public void i_logged_into_Site() throws Throwable {
            WebElement messageText = driver.findElement(By.id("flash"));
            System.out.println(messageText.getText());
            assertTrue(messageText.getText().contains("You logged into a secure area!"));
            driver.close();
            driver.quit();



        }
    }

