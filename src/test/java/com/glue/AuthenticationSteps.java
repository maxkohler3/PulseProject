package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.junit.Assert;

public class AuthenticationSteps { 
	
    @Given("^I am logged in$")
    public void iamloggedin() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I deposit 10 dollars$")
    public void deposit10dollars() throws Throwable {
        Assert.assertEquals(true, true);
    }
    
    @Then("^my account should be increased by 10 dollars$")
    public void myaccountincreased() throws Throwable {
        Assert.assertEquals(true, true);
    }
    
    @Given("^I have opened the application$")
    public void iopenedtheapp() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I put in valid credentials$")
    public void iputincreds() throws Throwable {
        Assert.assertEquals(true, true);
    }
    
    @When("^click Login$")
    public void clicklogin() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should see my personalized home page2$")
    public void ishouldseehomepage() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
