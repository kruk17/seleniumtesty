package manager;

import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static manager.DriverManager.getDriver;

public class Screeny {


    private static int id = 0;

    public static void takeScr(String nazwa) {
        File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("/screenshots/" + nazwa +" "+ id + ".jpg"));
        } catch (IOException e) {
            e.getMessage();
        }
        id++;
    }

    @Attachment(value = "failed test screen",type = "image",fileExtension = "jpg")
    public static byte[] takeScrToAllure(){
        byte[] scrAlLure = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
        return scrAlLure;
    }
}
