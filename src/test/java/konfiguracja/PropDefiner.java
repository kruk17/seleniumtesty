package konfiguracja;

import manager.BrowserType;

public class PropDefiner {


    public static BrowserType getBrowserFromProperties(){
       return BrowserType.valueOf(PropConfiguration.getProperties().getProperty("prop.browser"));
    }

    public static String getLocationOfChromeDriver(){
        return PropConfiguration.getProperties().getProperty("chrome.driver.location");
    }

    public static String getLocationOfFirefoxDriver(){
        return PropConfiguration.getProperties().getProperty("firefox.driver.location");
    }

    public static String getLocationOfIEDriver(){
        return PropConfiguration.getProperties().getProperty("ie.driver.location");
    }

    public static String getUrl(){
        return PropConfiguration.getProperties().getProperty("prop.url");
    }




}
