package testy;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import konfiguracja.XlsExcelLoader;
import obiekty.LoginSite;
import obiekty.MainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTestWithExcelXls extends TestBase {

    @TmsLink("ID-7")
    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("login test with xls file")
    public void xlsTest(){

        XlsExcelLoader xlsExcelLoader = new XlsExcelLoader("D://seleniumtesty/src/main/resources/myexcel.xls");

        MainPage mainPage = new MainPage();
        mainPage.enterLoginSite()
                .sendKeysUser(xlsExcelLoader.returnValue(1,1))
                .sendKeysPassword(xlsExcelLoader.returnValue(2,1))
                .clickSignOn();
        LoginSite loginSite = new LoginSite();
        assertTrue(loginSite.getExpectedText().contains("is invalid"));

        System.out.println("username: " +xlsExcelLoader.returnValue(1,1));
        System.out.println("passwrod: " +xlsExcelLoader.returnValue(2,1));


    }
}
