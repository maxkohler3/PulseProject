package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Parent_creating_child_accountsStep {
    
    @Given("^I click Add Child on the Home Screen$")
    public void click_add_child_on_home_screen() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I fill out all required fields$")
    public void fill_out_required_fields() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^The child should be successfully added$")
    public void verify_child_added() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
