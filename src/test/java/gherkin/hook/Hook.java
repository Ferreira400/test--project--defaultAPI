package gherkin.hook;



import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import java.net.MalformedURLException;


public class Hook {

    public static Scenario scenario;

    public Hook() throws MalformedURLException {

    }

    @Before
    public void beforeScenario(Scenario sc){
        Hook.scenario = sc;

    }

    @After
    public void afterScenario(Scenario sc){


    }
}

