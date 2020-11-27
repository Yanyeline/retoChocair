package com.opensourcecms.demo.s1.certification.questions;

import com.opensourcecms.demo.s1.certification.userInterfaces.Post;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TitlePost implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {

        return Text.of(Post.NAME_POST).viewedBy(actor).asString();
    }

    public static TitlePost is() {

        return new TitlePost();
    }


}
