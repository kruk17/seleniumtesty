package testy;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import manager.JsExecutor;
import manager.Waity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import static manager.DriverManager.getDriver;
import static org.testng.Assert.assertTrue;

public class NumberOne extends TestBase {
    @TmsLink("id-1")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    @Description("isPageCompleted")
    public void myTest(){

        Waity.waitUntilPageHasLoadedCompletelyWithJs(15);
        System.out.println(getDriver().getTitle());



        assertTrue(JsExecutor.isPagedCompletedJs());






        Set<String> zbiorOkienek = getDriver().getWindowHandles();
        Iterator<String> iter = zbiorOkienek.iterator();
        System.out.println(zbiorOkienek);
        String mainW = iter.next();
        System.out.println(mainW);

    }
}
