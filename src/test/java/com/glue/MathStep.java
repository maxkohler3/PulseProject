package com.glue;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MathStep {

	int sum = 0;
	int difference = 0;
	
    @Given("^a list of numbers$")
    public void add_number(DataTable numberList) throws Throwable {
    		List<List<String>> data = numberList.raw();

    		for(int i = 0; i < data.size(); i++) {
    			sum += Integer.parseInt(data.get(i).get(0));
    		}
    		
        Assert.assertEquals(true, true);
    }

    @When("^I add them$")
    public void sum_numbers() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should get \"(.*?)\"$")
    public void verify_answer(int x) throws Throwable {
        Assert.assertEquals(sum, x);
    }
    
    
    List<List<String>> data;
    @Given("^I have two numbers$")
    public void getNumbers(DataTable numberList) throws Throwable {
    		data = numberList.raw();    		
        Assert.assertEquals(true, true);
    }

    @When("^I subtract the second number from the first$")
    public void substract_numbers() throws Throwable {
    		
    		difference = Integer.parseInt(data.get(0).get(0)) - Integer.parseInt(data.get(1).get(0));
    	
        Assert.assertEquals(true, true);
    }

    @Then("^I should get the number \"(.*?)\"$")
    public void subtraction_answer(int x) throws Throwable {
        Assert.assertEquals(difference, x);
    }
    
    
//    Given I have two numbers
//    | 10 |
//    | 3  |
//  When I subtract the second number from the first
//  Then I should get the number "7"
}
