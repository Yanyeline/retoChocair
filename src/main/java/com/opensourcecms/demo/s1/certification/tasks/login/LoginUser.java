package com.opensourcecms.demo.s1.certification.tasks.login;


import com.opensourcecms.demo.s1.certification.userInterfaces.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUser implements Task {
    String _email;
    String _password;

    public LoginUser(String email, String password) {
        _email = email;
        _password = password;
    }

    @Step("{0} login site")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(_email).into(Login.TXT_USER),
                Enter.theValue(_password).into(Login.TXT_PASSWORD),
                Click.on(Login.BTN_LOGIN)
        );
    }

    public static LoginUser fillFields(String email, String password) {
        return instrumented(LoginUser.class, email, password);
    }
}