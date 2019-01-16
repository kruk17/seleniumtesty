package testy.testsUsingCucumber.withoutFramework;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/testy/testsUsingCucumber/withoutFramework/",plugin = {"pretty","html:out"})
public class CucumberTest {



}
