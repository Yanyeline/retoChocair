package com.opensourcecms.demo.s1.stepdefinitions;

import com.opensourcecms.demo.s1.certification.questions.Result;
import com.opensourcecms.demo.s1.certification.questions.TitlePost;
import com.opensourcecms.demo.s1.certification.tasks.common.GoToMenuOption;
import com.opensourcecms.demo.s1.certification.tasks.posts.*;

import com.opensourcecms.demo.s1.certification.userInterfaces.AllPosts;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class EditPosts {

    @Given("^user can edit posts quickly$")
    public void user_can_edit_posts_quickly() {
        theActorInTheSpotlight().wasAbleTo(GoToMenuOption.theMenuOption());

    }

    @When("^user enters all fields to update quickly$")
    public void user_enters_all_fields_to_update_quickly(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(EditQuickPosts.fillFields(data));
    }

    @Then("^user updates post (.*) quickly$")
    public void user_updates_post_quickly(String search) {
        theActorInTheSpotlight().should(seeThat(Result.isVisible(AllPosts.TBL_POST, search)));
    }


    @Given("^user can edit posts$")
    public void user_can_edit_posts() {
        theActorInTheSpotlight().wasAbleTo(GoToMenuOption.theMenuOption());
    }

    @When("^user enter all fields to update$")
    public void user_enter_all_fields_to_update(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(EditPost.fillFields(data));
    }

    @Then("^user modifies post (.*)$")
    public void user_modifies_post(String titlePost) {
        theActorInTheSpotlight().should(seeThat(TitlePost.is(), equalTo(titlePost)));
    }


}
