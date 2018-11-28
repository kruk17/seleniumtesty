package manager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static manager.DriverManager.getDriver;

public class JsExecutor {

    public static void openNewWindowWithJs(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)getDriver();
        javascriptExecutor.executeScript("window.open();");
    }

    public static void clickWithJs(WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)getDriver();
        javascriptExecutor.executeScript("arguments[0].click();", element);
    }

    public static void scrollIntoViewJs(WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element );
    }

    public static boolean isPagedCompletedJs(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)getDriver();
        return javascriptExecutor.executeScript("return document.readyState").equals("complete");
    }

    public static String returnPageUrl(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)getDriver();
        return javascriptExecutor.executeScript("return document.URL;").toString();
    }







}
