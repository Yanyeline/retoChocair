package com.opensourcecms.demo.s1.certification.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class PageTitle implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {

        return BrowseTheWeb.as(actor).getTitle();

    }

    public static PageTitle is() {
        return new PageTitle();
    }


}
