package obiekty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.log4testng.Logger;

public class HoverSite extends ObjectBase {



    @FindBy (xpath = "//div[@class='example']/div[1]")
    private WebElement ludzik1;

    @FindBy (xpath = "//div[@class='example']/div[2]")
    private WebElement ludzik2;

    @FindBy (xpath = "//div[@class='example']/div[3]")
    private WebElement ludzik3;

    @FindBy (xpath = "//div[@class='example']/div[1]/div/h5")
    private WebElement text1;

    public WebElement returnFirstAvatar(){
        return ludzik1;
    }

    public WebElement returnSecondAvatar(){
        return ludzik2;
    }

    public WebElement returnThirdAvatar(){
        return ludzik3;
    }

    public String returnTextFromFirstAvatar(){
        return text1.getText();
    }
}
