package testy;

import io.qameta.allure.Description;
import obiekty.LoginSite;
import obiekty.MainPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends TestBase {


    @DataProvider(name = "dataPro")
    public Object[][] dataP (){
        return new Object[][]{
                {"adam","malysz89"},
                {"sven","hanavald2"},
                {"noriaki","M45kasaI"}

        };
    }

    @Test(dataProvider = "dataPro")
    @Description("login test with data provider")
    public void testProvider(String user, String passy){

        MainPage mainPage = new MainPage();
        mainPage.enterLoginSite()
                .sendKeysUser(user)
                .sendKeysPassword(passy)
                .clickSignOn();
        LoginSite loginSite = new LoginSite();
        assertTrue(loginSite.getExpectedText().contains("is invalid"));



    }



}