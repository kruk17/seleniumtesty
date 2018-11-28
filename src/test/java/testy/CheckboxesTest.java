package testy;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import manager.JsExecutor;
import manager.Screeny;
import obiekty.CheckboxesSite;
import obiekty.MainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxesTest extends TestBase {

    @TmsLink("Id-3")
    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("Checkboxes test with 2 options")
    public void checkboxesTest(){
        MainPage mainPage = new MainPage();
        mainPage.enterCheckBoxesSite();

        assertTrue(JsExecutor.isPagedCompletedJs());

        CheckboxesSite checkboxesSite = new CheckboxesSite();
        assertEquals(checkboxesSite.getTextFromSite(),"Checkboxes");
        assertFalse(checkboxesSite.isFirstCheckboxSelected());
        assertTrue(checkboxesSite.isSecondCheckboxSelected());

        checkboxesSite
                .clickFirstCheckbox()
                .clickSecondCheckbox();
        assertTrue(checkboxesSite.isFirstCheckboxSelected());
        assertFalse(checkboxesSite.isSecondCheckboxSelected());
        Screeny.takeScr("checkboxesScr");

    }
}
