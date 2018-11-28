package manager;

import konfiguracja.PropDefiner;
import org.openqa.selenium.WebDriver;

public class DriverManager {


    private static WebDriver driver;
   //deprecated private static final BrowserType BROWSER_TYPE = BrowserType.CHROME;

    private DriverManager(){

    }

   // private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();


    public static WebDriver getDriver(){
        if (driver == null){
            driver= BrowserManager.getBrowser(PropDefiner.getBrowserFromProperties());
        }
    return driver;
    }


    public static void quitAndCloseDriver(){
        driver.close();
        if (!PropDefiner.getBrowserFromProperties().equals(BrowserType.FIREFOX))
        {driver.quit();}
        driver = null;
    }



}
