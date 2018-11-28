package testy;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import manager.JsExecutor;
import obiekty.DropdownListSite;
import obiekty.MainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownListTest extends TestBase {

 @TmsLink("Id-4")
 @Severity(SeverityLevel.NORMAL)
 @Test
 @Description("dropdownTest by value")
    public void dropdownTest(){

     MainPage mainPage = new MainPage();
     mainPage
             .enterDropdownListSite()
             .clickDropdownList();
     DropdownListSite dropdownListSite = new DropdownListSite();

     assertTrue(JsExecutor.isPagedCompletedJs());

     dropdownListSite.writeAllPossibleOptions(dropdownListSite.dropdown);

     assertEquals(dropdownListSite.getFirstSelectedOption(dropdownListSite.dropdown),"Please select an option");

     dropdownListSite.selectOptionByValue(dropdownListSite.dropdown,"1");
     assertEquals(dropdownListSite.getFirstSelectedOption(dropdownListSite.dropdown),"Option 1");

     dropdownListSite.selectOptionByValue(dropdownListSite.dropdown,"2");
     assertEquals(dropdownListSite.getFirstSelectedOption(dropdownListSite.dropdown),"Option 2");







 }


}
