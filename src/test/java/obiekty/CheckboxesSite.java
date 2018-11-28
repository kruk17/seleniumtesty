package obiekty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static manager.DriverManager.getDriver;

public class CheckboxesSite extends ObjectBase{

    @FindBy (xpath = "//form[@id='checkboxes']/input[1]")
    private WebElement checkbox1;

    @FindBy (xpath = "//form[@id='checkboxes']/input[2]")
    private WebElement checkbox2;

    @FindBy (xpath = "//div[@id='content']/div/h3")
    private WebElement mainText;

   /* public CheckboxesSite(){
        PageFactory.initElements(getDriver(),this);
    } */



    public CheckboxesSite clickFirstCheckbox(){
        checkbox1.click();
        return this;
    }

    public boolean isFirstCheckboxSelected(){
        return checkbox1.isSelected();
    }

    public CheckboxesSite clickSecondCheckbox(){
        checkbox2.click();
        return this;
    }

    public boolean isSecondCheckboxSelected(){
        return checkbox2.isSelected();
    }

    public String getTextFromSite(){
        return mainText.getText();
    }







}
