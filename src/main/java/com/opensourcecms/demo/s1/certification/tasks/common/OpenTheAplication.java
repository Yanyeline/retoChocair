package com.opensourcecms.demo.s1.certification.tasks.common;

import com.opensourcecms.demo.s1.certification.userInterfaces.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheAplication implements Task {

    Login login;

    @Step("{0} opens the web site")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(login)
        );
    }


}
