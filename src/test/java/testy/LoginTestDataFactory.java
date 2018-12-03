package testy;

import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import obiekty.LoginSite;
import obiekty.MainPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTestDataFactory extends TestBase {


    private String user;
    private String passy;

    public LoginTestDataFactory(String user, String passy) {
        this.user = user;
        this.passy = passy;
    }

    @Factory
    public static Object[] factory() {
        LoginTestDataFactory l1 = new LoginTestDataFactory("ajk@mp.pl", "w3ce123");
        LoginTestDataFactory l2 = new LoginTestDataFactory("kazimierz", "kaczor");
        LoginTestDataFactory l3 = new LoginTestDataFactory("kamil", "12344321!");
        return new Object[]{l1, l2, l3};
    }

    @TmsLink("Id-6")
    @Test
    @Description("login test with data factory")
    public void testProvider() {

        MainPage mainPage = new MainPage();
        mainPage.enterLoginSite()
                .sendKeysUser(user)
                .sendKeysPassword(passy)
                .clickSignOn();
        LoginSite loginSite = new LoginSite();
        assertTrue(loginSite.getExpectedText().contains("is invalid"));


    }

}