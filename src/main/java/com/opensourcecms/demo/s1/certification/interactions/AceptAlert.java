package com.opensourcecms.demo.s1.certification.interactions;

import com.opensourcecms.demo.s1.certification.tasks.posts.CreatePosts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AceptAlert implements Interaction {

    @Step("{0} Accept pop-up alerts")
    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

    }

    public static AceptAlert onTheBrowser() {
        return instrumented(AceptAlert.class);
    }
}
