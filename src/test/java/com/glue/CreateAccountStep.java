package com.glue;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CreateAccountStep {

    @When("^I have no account$")
    public void sum_numbers() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should see the create account page$")
    public void verify_answer() throws Throwable {
        Assert.assertEquals(true, true);
    }
//    
//    
//    List<List<String>> data;
//    @Given("^I have two numbers$")
//    public void getNumbers(DataTable numberList) throws Throwable {
//    		data = numberList.raw();    		
//        Assert.assertEquals(true, true);
//    }
//
//    @When("^I subtract the second number from the first$")
//    public void substract_numbers() throws Throwable {
//    		
//    		difference = Integer.parseInt(data.get(0).get(0)) - Integer.parseInt(data.get(1).get(0));
//    	
//        Assert.assertEquals(true, true);
//    }
//
//    @Then("^I should get the number \"(.*?)\"$")
//    public void subtraction_answer(int x) throws Throwable {
//        Assert.assertEquals(difference, x);
//    }
//    
    
}
