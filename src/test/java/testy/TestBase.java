package testy;

import konfiguracja.PropConfiguration;
import konfiguracja.PropLoader;
import manager.DriverManager;
import manager.MyOptions;
import manager.TestNgListener;
import manager.Waity;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.util.Properties;

import static manager.DriverManager.getDriver;

@Listeners(TestNgListener.class)
public class TestBase {


    @BeforeClass
    public void beforeClass(){
        PropLoader propLoader = new PropLoader();
        Properties propertiesFile= propLoader.getPropertiesFromFile("configuration.properties");
        PropConfiguration.setProperties(propertiesFile);
    }



    @BeforeMethod
    public void beforeTest(){
        getDriver();
        MyOptions.setImplicitlyWait(10);
        MyOptions.maximizeWindow();
        MyOptions.navigateToPage();


    }




    @AfterMethod
    public void afterTest(){
        DriverManager.quitAndCloseDriver();

    }
}
