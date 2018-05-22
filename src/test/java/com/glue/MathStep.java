package com.glue;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MathStep {

	int sum = 0;
	
    @Given("^a list of numbers$")
    public void add_number(DataTable numberList) throws Throwable {
    		List<List<String>> data = numberList.raw();

    		for(int i = 0; i < data.size(); i++) {
    			sum += Integer.parseInt(data.get(i).get(0));
    		}
    		
        Assert.assertEquals(true, true);
    }

    @When("^I summarize them$")
    public void sum_numbers() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should get \"(.*?)\"$")
    public void verify_answer(int x) throws Throwable {
        Assert.assertEquals(sum, x);
    }
}
