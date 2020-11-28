package com.opensourcecms.demo.s1.certification.tasks.common;

import com.opensourcecms.demo.s1.certification.userInterfaces.Menu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToMenuOption implements Task {

    //private Target menuOption;

    //public GoToMenuOption(Target menuOption){
    //  this.menuOption = menuOption;
//    }

    @Override
    @Step("{0} go to application page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(Menu.ICON_POSTS));

        //Click.on(Menu.OPTION_POSTS),
        //Click.on(Menu.OPTION_ADD_NEW_POST2));
    }

    public static GoToMenuOption theMenuOption() {
        return instrumented(GoToMenuOption.class);
    }
}