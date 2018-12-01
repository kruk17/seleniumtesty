import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

import static java.lang.Thread.sleep;

public class SelInne {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest(){

        System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts();
        driver.navigate().to("http://przyklady.javastart.pl/test/full_form.html");


    }

    @Test
    public void test(){
        System.out.println( System.getProperty("user.dir"));
        WebElement datePicker  = driver.findElement(By.id("datepicker"));

        datePicker.sendKeys("12/01/2018");
        System.out.println(datePicker.getAttribute("value"));


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);

        for (LogEntry logi: logEntries){
            System.out.println(logi.getLevel()+ logi.getMessage());
        }


    }

    @AfterMethod
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}
