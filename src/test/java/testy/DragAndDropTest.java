package testy;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import manager.JsExecutor;
import manager.Screeny;
import manager.Sleep;
import obiekty.DragAndDropSite;
import obiekty.MainPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

import static java.lang.Thread.sleep;
import static manager.DriverManager.getDriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DragAndDropTest extends TestBase {

    @TmsLink("Id-2")
    @Severity(SeverityLevel.MINOR)
    @Test
    @Description("DragAndDrop main test")
    public void dragAndDropTest() {
        MainPage mainPage = new MainPage();
        mainPage.enterDragAndDropSite();

        assertTrue(JsExecutor.isPagedCompletedJs());

        DragAndDropSite dragAndDropSite = new DragAndDropSite();
        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(dragAndDropSite.columnA,dragAndDropSite.columnB).build().perform();

        System.out.println(dragAndDropSite.getTextColumnA());
        System.out.println(dragAndDropSite.getTextColumnB());

        Sleep.sleep(3000);

        assertEquals(dragAndDropSite.columnA,"B");
        Screeny.takeScr("dragAndDropScreen");

        //WebElement body = getDriver().findElement(By.cssSelector("body"));
        //body.sendKeys(Keys.CONTROL + "t");
        /*
        JsExecutor.openNewWindowWithJs();
        Set<String> okna = getDriver().getWindowHandles();

        System.out.println(okna);
        Sleep.sleep(2000); */


    }
}