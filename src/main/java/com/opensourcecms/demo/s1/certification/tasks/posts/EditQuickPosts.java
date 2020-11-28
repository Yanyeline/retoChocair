package com.opensourcecms.demo.s1.certification.tasks.posts;

import com.opensourcecms.demo.s1.certification.tasks.common.Wait;
import com.opensourcecms.demo.s1.certification.userInterfaces.AllPosts;
import com.opensourcecms.demo.s1.certification.userInterfaces.Menu;
import com.opensourcecms.demo.s1.certification.userInterfaces.NewPosts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EditQuickPosts implements Task {

    private List<Map<String, String>> datos;

    public EditQuickPosts(List<Map<String, String>> datos) {
        this.datos = datos;
    }

    @Step("{0} Fill fields to edit posts quicly")
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(Menu.OPTION_ALL_POST),
                Wait.Element(AllPosts.TBL_POSTS),
                MoveMouse.to(AllPosts.TBL_POSTS),
                Click.on(AllPosts.OPTION_QUICK_EDIT),
                Enter.theValue(datos.get(0).get("title")).into(AllPosts.TXT_TITLE),
                Enter.theValue(datos.get(0).get("slug")).into(AllPosts.TXT_SLUG),
                Click.on(AllPosts.DDL_MONTH),
                Click.on(AllPosts.OPTION_MONTH.of(datos.get(0).get("month"))),
                Enter.theValue(datos.get(0).get("day")).into(AllPosts.TXT_DAY),
                Enter.theValue(datos.get(0).get("year")).into(AllPosts.TXT_YEAR),
                Enter.theValue(datos.get(0).get("hour")).into(AllPosts.TXT_HOUR),
                Enter.theValue(datos.get(0).get("minutes")).into(AllPosts.TXT_MINUTES),
                Enter.theValue(datos.get(0).get("password")).into(AllPosts.TXT_PASSWORD),
                Click.on(AllPosts.CHK_CATEGORY),
                Enter.theValue(datos.get(0).get("tag")).into(AllPosts.TXT_TAGS),
                Click.on(AllPosts.DDL_STATUS),
                Click.on(AllPosts.OPTION_STATUS.of(datos.get(0).get("status"))),

                Click.on(AllPosts.CHK_STYCKY),
                Click.on(AllPosts.BTN_UPDATE)

        );
    }


    public static EditQuickPosts fillFields(List<Map<String, String>> datos) {
        return instrumented(EditQuickPosts.class, datos);
    }
}
