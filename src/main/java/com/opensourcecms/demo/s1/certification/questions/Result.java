package com.opensourcecms.demo.s1.certification.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;


public class Result implements Question<Boolean> {

        public Target Element;
        public String Search;

    public Result(Target element, String search) {

        Element = element;
        Search = search;
    }
    @Step("{0} Posts in the record table is visible")
    @Override
    public Boolean answeredBy(Actor actor) {

        return Element.of(Search).resolveFor(actor).isVisible();

    }

    public static Result isVisible(Target element, String search) {

        return new Result(element, search);
    }


}
