package com.opensourcecms.demo.s1.certification.tasks.posts;

import com.opensourcecms.demo.s1.certification.tasks.common.Wait;
import com.opensourcecms.demo.s1.certification.userInterfaces.NewPosts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreatePosts implements Task {

    private List<Map<String, String>> datos;

    public CreatePosts(List<Map<String, String>> datos) {
        this.datos = datos;
    }

    @Step("{0} enter registration data")
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                //   Driver.toFrame(0),
                Wait.Element(NewPosts.ICON_DISABLE_COMPONENTS),
                Click.on(NewPosts.ICON_DISABLE_COMPONENTS),
                Enter.theValue(datos.get(0).get("title")).into(NewPosts.TXT_TITLE),
                Click.on(NewPosts.TXT_BLOCK_PARAGRAPH),
                Enter.theValue(datos.get(0).get("blockParagraph")).into(NewPosts.TXT_COMPLETE_COMPONENT),
                Click.on(NewPosts.OPTION_DOCUMENT),
                //Click.on(NewPosts.BTN_VISIBILITY),
                // Click.on(NewPosts.OPTION_VISIBILITY.of(datos.get(0).get("visibility"))),
                //AceptAlert.onTheBrowser(),
                //Click.on(NewPosts.BTN_VISIBILITY),
                //Click.on(NewPosts.OPTION_PUBLISH),
                //Enter.theValue(datos.get(0).get("day")).into(NewPosts.TXT_DAY),
                //Click.on(NewPosts.DDL_MONTH),
                //Click.on(NewPosts.OPTION_SELECT_MONTH.of(datos.get(0).get("month"))),
                //Enter.theValue(datos.get(0).get("year")).into(NewPosts.TXT_YEAR),
                //Enter.theValue(datos.get(0).get("hour")).into(NewPosts.TXT_HOUR),
                //Enter.theValue(datos.get(0).get("minutes")).into(NewPosts.TXT_MINUTES),
                //Click.on(NewPosts.OPTION_TYPE_TIME.of(datos.get(0).get("typeTime"))),
                //Click.on(NewPosts.OPTION_PUBLISH),
                Click.on(NewPosts.DDL_FORMAT),
                Click.on(NewPosts.OPTION_FORMAT.of(datos.get(0).get("postFormat"))),
                Click.on(NewPosts.DDL_FORMAT),
                Click.on(NewPosts.OPTION_FORMATS.of(datos.get(0).get("format"))),
                Click.on(NewPosts.OPTION_CATEGORIES),
                Click.on(NewPosts.OPTION_ADD_CATEGORIES),
                Scroll.to(NewPosts.TXT_CATEGORY),
                Enter.theValue(datos.get(0).get("category")).into(NewPosts.TXT_CATEGORY),
                Click.on(NewPosts.BTN_NEW_CATEGORY),
                Click.on(NewPosts.OPTION_TAGS),
                Enter.theValue(datos.get(0).get("tag")).into(NewPosts.TXT_NEW_TAG),
                Hit.the(Keys.ENTER).into(NewPosts.TXT_NEW_TAG),
                Click.on(NewPosts.OPTION_EXERPT),
                Enter.theValue(datos.get(0).get("except")).into(NewPosts.TXT_EXERPT),
                Click.on(NewPosts.BTN_PUBLISH),
                Click.on(NewPosts.BTN_PUBLISH2),
                Click.on(NewPosts.BTN_VIEW_POST)

        );
    }


    public static CreatePosts fillFields(List<Map<String, String>> datos) {
        return instrumented(CreatePosts.class, datos);
    }
}
