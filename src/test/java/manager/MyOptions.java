package manager;

import java.util.concurrent.TimeUnit;

import static manager.DriverManager.getDriver;

public class MyOptions {



    public static void maximizeWindow(){
        getDriver().manage().window().maximize();
    }

    public static void setImplicitlyWait(long timeInSeconds){
        getDriver().manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.SECONDS);
    }

    public static void navigateToPage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
    }


}
