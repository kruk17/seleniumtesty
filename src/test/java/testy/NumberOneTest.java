package testy;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import manager.HttpRespond;
import manager.JsExecutor;
import manager.Waity;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Set;

import static manager.DriverManager.getDriver;
import static org.testng.Assert.assertTrue;

public class NumberOneTest extends TestBase {
    @TmsLink("id-1")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    @Description("isPageCompleted")
    public void myTest (){

        Waity.waitUntilPageHasLoadedCompletelyWithJs(15);
        String pageTitle = getDriver().getTitle();
        System.out.println(pageTitle);
        assertTrue(pageTitle.contains("The Internet"));


        assertTrue(JsExecutor.isPagedCompletedJs());

        HttpRespond httpRespond = new HttpRespond();
        String infoFromHttpRespond = "";
        try {
            infoFromHttpRespond = httpRespond.getHttpRespondCodeForGet();
        }
        catch (MalformedURLException e){
            e.getMessage();
        }
        System.out.println("HTTP RESPOND: " +infoFromHttpRespond);

        assertTrue(infoFromHttpRespond.contains("200"));






        //TODO
        Set<String> zbiorOkienek = getDriver().getWindowHandles();
        Iterator<String> iter = zbiorOkienek.iterator();
        System.out.println(zbiorOkienek);
        String mainW = iter.next();
        System.out.println(mainW);

    }
}
