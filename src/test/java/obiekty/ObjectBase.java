package obiekty;

import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

import static manager.DriverManager.getDriver;

public abstract class ObjectBase {


   private Logger logger  = Logger.getLogger(this.getClass().getName());

    public ObjectBase (){
        PageFactory.initElements(getDriver(),this);
    }

    protected Logger logger() {
        return logger;
    }


}
