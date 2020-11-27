package com.opensourcecms.demo.s1.stepdefinitions;

import com.opensourcecms.demo.s1.certification.questions.PageTitle;
import com.opensourcecms.demo.s1.certification.tasks.common.OpenTheAplication;
import com.opensourcecms.demo.s1.certification.tasks.login.LoginUser;
import com.opensourcecms.demo.s1.certification.userInterfaces.Login;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class LoginStepDefinition {

    @Steps
    OpenTheAplication openTheAplication;

    @Given("^user is on the login page$")
    public void user_is_on_the_login_page() {

        theActorInTheSpotlight().attemptsTo(Open.browserOn(new  Login()));
        //theActorInTheSpotlight().wasAbleTo(openTheAplication);
    }

    @When("^user enter user (.*) and Password (.*)$")
    public void user_enter_user_and_Password(String user, String password) {
        theActorInTheSpotlight().attemptsTo(LoginUser.fillFields(user, password));
    }

    @Then("^user go to the (.*) page$")
    public void user_go_to_the_page(String namePage) {
        theActorInTheSpotlight().should(seeThat(PageTitle.is(), equalTo(namePage)));
    }

}
