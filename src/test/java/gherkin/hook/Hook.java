package gherkin.hook;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;
import java.net.MalformedURLException;


public class Hook {

    public static Scenario scenario;

    public Hook() throws MalformedURLException {

    }

    @Before
    public void beforeScenario(Scenario sc) throws IOException {
        Hook.scenario = sc;
        System.out.println("Casos de teste: "+sc.getName());

    }

    @After
    public void afterScenario(Scenario sc){

    System.out.println(scenario.isFailed());

    }
}

