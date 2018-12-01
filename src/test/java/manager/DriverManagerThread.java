package manager;

import konfiguracja.PropDefiner;
import org.openqa.selenium.WebDriver;

public class DriverManagerThread {

    private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();
    private static WebDriver driver;
    //deprecated private static final BrowserType BROWSER_TYPE = BrowserType.CHROME;

    private DriverManagerThread(){

    }




    public static WebDriver getDriver(){
        if (threadLocal.get() == null){
            threadLocal.set( BrowserManager.getBrowser(PropDefiner.getBrowserFromProperties()));
        }
        return threadLocal.get();
    }


    public static void quitAndCloseDriver(){
        threadLocal.get().close();
        if (!PropDefiner.getBrowserFromProperties().equals(BrowserType.FIREFOX))
        {threadLocal.get().quit();}
        threadLocal.remove();
    }
}
