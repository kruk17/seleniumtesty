package manager;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static manager.DriverManager.getDriver;

public class Waity {


    //bazowo 15 sec
    private static WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), 15);
    }

    private static WebDriverWait getWait(long timeInSeconds)
    {
        return new WebDriverWait(getDriver(), timeInSeconds);
    }

    public static void waitForElementVisible(WebElement webElement) {
        WebDriverWait webDriverWait = getWait();
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitForElementVisible(WebElement webElement, long timeInSeconds) {
        WebDriverWait webDriverWait = getWait(timeInSeconds);
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitForElementToBeClickable(WebElement webElement) {
        WebDriverWait webDriverWait = getWait();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static void waitUntilPageHasLoadedCompletelyWithJs(long timeInSeconds) {
        WebDriverWait webDriverWait = getWait(timeInSeconds);

        ExpectedCondition<Boolean> pageCompleted = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                driver = getDriver();
                JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
                return javascriptExecutor.executeScript("return document.readyState").equals("complete");
            }
        };
        webDriverWait.until(pageCompleted);
    }



}


