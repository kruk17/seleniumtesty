package obiekty;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSite extends ObjectBase {


    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//*[@id='login']/button")
    private WebElement signon;

    @FindBy(id = "flash")
    public WebElement expectedText;


    public LoginSite sendKeysUser(String tekst){
        username.clear();
        username.sendKeys(tekst);
        return this;
    }
    @Step("enter password {teksty}")
    public LoginSite sendKeysPassword(String teksty){
        password.clear();
        password.sendKeys(teksty);
        logger().info("password: {teksty}");
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

