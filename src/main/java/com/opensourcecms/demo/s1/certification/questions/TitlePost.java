package com.opensourcecms.demo.s1.certification.questions;

import com.opensourcecms.demo.s1.certification.userInterfaces.Post;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class TitlePost implements Question<String> {

    @Step("{0} Posts created")
    @Override
    public String answeredBy(Actor actor) {

        return Text.of(Post.NAME_POST).viewedBy(actor).asString();
    }

    public static TitlePost is() {

        return new TitlePost();
    }


}
