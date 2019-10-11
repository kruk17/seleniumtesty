package testy.testsUsingCucumber.withoutFramework;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {


    @Before
    public void before(){

        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }
}
