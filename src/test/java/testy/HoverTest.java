package testy;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import obiekty.HoverSite;
import obiekty.MainPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static manager.DriverManager.getDriver;
import static org.testng.Assert.assertEquals;

public class HoverTest extends TestBase {

    @TmsLink("id-9")
    @Severity(SeverityLevel.MINOR)
    @Test
    @Description("hover test checkout")
    public void hoverTest(){

        Actions actions = new Actions(getDriver());
        MainPage mainPage =new MainPage();
        mainPage.enterHoverSite();
        HoverSite hoverSite = new HoverSite();
        actions.moveToElement(hoverSite.returnThirdAvatar()).moveToElement(hoverSite.returnSecondAvatar())
                .moveToElement(hoverSite.returnFirstAvatar()).build().perform();
        System.out.println(hoverSite.returnTextFromFirstAvatar());
        assertEquals(hoverSite.returnTextFromFirstAvatar(),"name: user1");
    }
}
