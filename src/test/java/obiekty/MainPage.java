package obiekty;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static manager.DriverManager.getDriver;

public class MainPage extends ObjectBase {




    @FindBy(css = "a[href$='abtest']")
    private WebElement authorizationSite;

    @FindBy(linkText = "Checkboxes")
    private WebElement checkboxSite;

    @FindBy(partialLinkText = "Drag and Drop")
    private WebElement dragAndDropsite;

    @FindBy(partialLinkText = "Dropdown")
    private WebElement dropdownlistSite;

    @FindBy(partialLinkText = "Form Authentication")
    private WebElement loginSite;

    @FindBy(partialLinkText = "Hovers")
    private WebElement hovers;

    /*public MainPage(){
        PageFactory.initElements(getDriver(),this);
    } --deprecated */




    public CheckboxesSite enterCheckBoxesSite(){
        logger().info("Enterted Checkboxes site");
        checkboxSite.click();
        return new CheckboxesSite();
    }

    public DragAndDropSite enterDragAndDropSite(){
        logger().info("Enterted DragAndDrop site");
        dragAndDropsite.click();
        return new DragAndDropSite();
    }

    public DropdownListSite enterDropdownListSite(){
        logger().info("Enterted Dropdown list site");
        dropdownlistSite.click();
        return new DropdownListSite();
    }
    public LoginSite enterLoginSite() {
        logger().info("Enterted Login site");
        loginSite.click();
        return new LoginSite();
    }

    public HoverSite enterHoverSite(){
        logger().info("Entered Hover Site");
        hovers.click();
        return new HoverSite();
    }
}
