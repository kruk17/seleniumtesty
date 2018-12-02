package manager;

import konfiguracja.PropDefiner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserManager {



    public static WebDriver getBrowser(BrowserType browserType){
        switch (browserType){
            case CHROME:
                System.setProperty("webdriver.chrome.driver", PropDefiner.getLocationOfChromeDriver());
                return new ChromeDriver();
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver",PropDefiner.getLocationOfFirefoxDriver());
                return new FirefoxDriver();
            case IE:
                System.setProperty("webdriver.ie.driver", PropDefiner.getLocationOfIEDriver());
                return new InternetExplorerDriver();

            default: throw new IllegalStateException("There is not such type of browser");


        }


    }
}
