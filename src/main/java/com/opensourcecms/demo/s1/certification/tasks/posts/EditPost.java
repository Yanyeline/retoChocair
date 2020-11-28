package com.opensourcecms.demo.s1.certification.tasks.posts;

import com.opensourcecms.demo.s1.certification.interactions.AceptAlert;
import com.opensourcecms.demo.s1.certification.tasks.common.Wait;
import com.opensourcecms.demo.s1.certification.userInterfaces.AllPosts;
import com.opensourcecms.demo.s1.certification.userInterfaces.EditPosts;
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

public class EditPost implements Task {

    private List<Map<String, String>> datos;

    public EditPost(List<Map<String, String>> datos) {
        this.datos = datos;
    }

    @Step("{0} Fill fields to edit posts")
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(Menu.OPTION_ALL_POST),
                Wait.Element(AllPosts.TBL_POSTS),
                MoveMouse.to(AllPosts.TBL_POSTS),
                Click.on(AllPosts.OPTION_EDIT),
                Wait.Element(EditPosts.ICON_DISABLE_COMPONENTS),
                Click.on(EditPosts.ICON_DISABLE_COMPONENTS),
                Enter.theValue(datos.get(0).get("title")).into(EditPosts.TXT_TITLE),
                Click.on(EditPosts.BTN_ADD_BLOCK),
                Click.on(EditPosts.BTN_ADD_BLOCK_PARAGRAPH),

                Click.on(EditPosts.OPTION_DOCUMENT),

                //Click.on(EditPosts.BTN_VISIBILITY),
                //Click.on(EditPosts.OPTION_VISIBILITY.of(datos.get(0).get("visibility"))),
                //AceptAlert.onTheBrowser(),
                //Click.on(EditPosts.BTN_VISIBILITY),

                Click.on(EditPosts.OPTION_PUBLISH),
                Enter.theValue(datos.get(0).get("day")).into(EditPosts.TXT_DAY),
                Click.on(EditPosts.DDL_MONTH),
                Click.on(EditPosts.OPTION_SELECT_MONTH.of(datos.get(0).get("month"))),
                Enter.theValue(datos.get(0).get("year")).into(EditPosts.TXT_YEAR),
                Enter.theValue(datos.get(0).get("hour")).into(EditPosts.TXT_HOUR),
                Enter.theValue(datos.get(0).get("minutes")).into(EditPosts.TXT_MINUTES),
                Click.on(EditPosts.OPTION_TYPE_TIME.of(datos.get(0).get("typeTime"))),
                Click.on(EditPosts.OPTION_PUBLISH),
                Click.on(EditPosts.DDL_FORMAT),
                Click.on(EditPosts.OPTION_FORMAT.of(datos.get(0).get("postFormat"))),
                Click.on(EditPosts.DDL_FORMAT),
                Click.on(EditPosts.OPTION_FORMATS.of(datos.get(0).get("format"))),
                Click.on(NewPosts.OPTION_CATEGORIES),
                Click.on(EditPosts.OPTION_ADD_CATEGORIES),
                Scroll.to(EditPosts.TXT_CATEGORY),
                Enter.theValue(datos.get(0).get("category")).into(EditPosts.TXT_CATEGORY),
                Click.on(EditPosts.BTN_NEW_CATEGORY),
                Click.on(NewPosts.OPTION_TAGS),
                Enter.theValue(datos.get(0).get("tag")).into(EditPosts.TXT_NEW_TAG),
                Hit.the(Keys.ENTER).into(EditPosts.TXT_NEW_TAG),
                Click.on(NewPosts.OPTION_EXERPT),
                Enter.theValue(datos.get(0).get("except")).into(EditPosts.TXT_EXERPT),
                //Click.on(EditPosts.TXT_BLOCK_PARAGRAPH),
                //Enter.theValue(datos.get(0).get("blockParagraph")).into(EditPosts.TXT_COMPLETE_COMPONENT),
                Click.on(EditPosts.BTN_PUBLISH),
               // Click.on(EditPosts.BTN_PUBLISH2),
                Click.on(EditPosts.BTN_VIEW_POST)


        );
    }


    public static EditPost fillFields(List<Map<String, String>> datos) {
        return instrumented(EditPost.class, datos);
    }
}
