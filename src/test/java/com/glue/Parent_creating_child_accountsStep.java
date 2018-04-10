package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Parent_creating_child_accountsStep {

    @Given("^that I am a logged in parent$")
    public void that_i_am_a_logged_in_parent() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I view the the kid list page$")
    public void i_view_the_kid_list_page() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should see a link to add kid$")
    public void i_should_see_a_link_to_add_kids() throws Throwable {
        Assert.assertEquals(true, true);
    }
    
    @Given("^I click Add Child on the Home Screen$")
    public void that_i_click_add_child_on_home_screen() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I view the the kid list page$")
    public void i_view_the_kid_list_page() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should see a link to add kid$")
    public void i_should_see_a_link_to_add_kids() throws Throwable {
        Assert.assertEquals(true, true);
    }
    
//    
//    Scenario: Successfully Add a Child
//    Given I click Add Child on the Home Screen
//     When I fill out all required fields
//     Then The child should be successfully added
}
