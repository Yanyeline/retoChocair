package com.opensourcecms.demo.s1.stepdefinitions;

import com.opensourcecms.demo.s1.certification.questions.TitlePost;
import com.opensourcecms.demo.s1.certification.tasks.common.GoToMenuOption;
import com.opensourcecms.demo.s1.certification.tasks.posts.CreatePosts;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class AddPosts {

    @Given("^user can Add new posts$")
    public void user_can_Add_new_posts() {
        theActorInTheSpotlight().wasAbleTo(GoToMenuOption.theMenuOption());

    }

    @When("^user enter all fields$")
    public void user_enter_all_fields(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(CreatePosts.fillFields(data));
    }

    @Then("^user registers new post (.*)$")
    public void user_registers_new_post(String titlePost) {
        theActorInTheSpotlight().should(seeThat(TitlePost.is(), equalTo(titlePost)));

    }

}
