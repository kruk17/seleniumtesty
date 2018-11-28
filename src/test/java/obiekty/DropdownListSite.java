package obiekty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownListSite extends ObjectBase {

    @FindBy (css = "//div[@id='content']/div/h3")
    private WebElement mainText;


    @FindBy (id = "dropdown")
    public WebElement dropdown;


    public DropdownListSite clickDropdownList(){
        dropdown.click();
        return this;
    }

    public void selectOptionByValue (WebElement webElement, String value){
        Select select = new Select(webElement);
        select.selectByValue(value);
    }

    public String getFirstSelectedOption (WebElement webElement){
        Select select = new Select(webElement);
        return select.getFirstSelectedOption().getText();
    }

    public void writeAllPossibleOptions(WebElement webElement){
        Select select = new Select(webElement);
        List <WebElement> lista = select.getAllSelectedOptions();
        for(WebElement l : lista){

            logger().info(l.getText());
            System.out.println("VALUE: "+ l.getAttribute("value"));
            System.out.println("OPTION: " + l.getText());
        }
    }


}
