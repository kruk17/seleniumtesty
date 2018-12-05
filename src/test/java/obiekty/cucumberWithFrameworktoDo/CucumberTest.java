package obiekty.cucumberWithFrameworktoDo;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import testy.TestBase;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/",plugin = {"pretty","html:out"})
public class CucumberTest extends TestBase  {

    @Test
    public void test(){
        System.out.println("start");
    }







}
