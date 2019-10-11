package obiekty;

import io.qameta.allure.Step;
import manager.Waity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.Console;

public class LoginSite extends ObjectBase {


    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//form[@id='login']/button")
    private WebElement signon;

    @FindBy(id = "flash")
    private WebElement expectedText;


    public LoginSite sendKeysUser(String tekst){
        username.clear();
        username.sendKeys(tekst);

        return this;
    }
    @Step("enter password {teksty}")
    public LoginSite sendKeysPassword(String teksty){
        Waity.waitForElementVisible(password);
        password.clear();
        password.sendKeys(teksty);
        logger().info("password:{}"+teksty);
        return this;
    }
    public LoginSite clickSignOn(){
        signon.click();
        System.out.println(signon.getCssValue("button"));
        return this;
    }

    public String getExpectedText(){
        return expectedText.getText();
    }


}

