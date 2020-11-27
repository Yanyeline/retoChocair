package com.opensourcecms.demo.s1.stepdefinitions;


import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Hook {


    @Before
    public static void before(){
        setTheStage(new OnlineCast());
        theActor("user");

    }
}