package com.opensourcecms.demo.s1.certification.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;


public class PageTitle implements Question<String> {

    @Step("{0} Title of the pages")
    @Override
    public String answeredBy(Actor actor) {

        return BrowseTheWeb.as(actor).getTitle();

    }

    public static PageTitle is() {
        return new PageTitle();
    }


}
