package com.opensourcecms.demo.s1.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/addposts.feature",
        glue = "com.opensourcecms.demo.s1.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class AddPosts {
}
