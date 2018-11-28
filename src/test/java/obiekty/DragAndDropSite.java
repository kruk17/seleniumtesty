package obiekty;

import manager.Waity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static manager.DriverManager.getDriver;

public class DragAndDropSite extends ObjectBase {

    @FindBy(id = "column-a")
    public WebElement columnA;

    @FindBy(id = "column-b")
    public WebElement columnB;

    /*public DragAndDropSite(){
        PageFactory.initElements(getDriver(),this);
    } */

    public String getTextColumnA(){
        Waity.waitForElementVisible(columnA);
        return columnA.getText();
    }

    public String getTextColumnB(){
        Waity.waitForElementVisible(columnA,10);
        return columnB.getText();
    }



}
