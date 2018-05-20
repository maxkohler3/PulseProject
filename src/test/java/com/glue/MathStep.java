package com.glue;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import java.util.List;

public class MathStep {
    
	private List<List<String>> data = new List<List<String>>;
	List<int> list = new List<int> ();  
	
    @Given("^a list of numbers$")
    public void add_number(DataTable numberList) throws Throwable {
    		numberList.asList(int);
    		List<List<String>> data = numberList.raw();
        Assert.assertEquals(true, true);
    }
//
//    When I summarize them
//    Then should I get 4770
    @When("^I summarize them$")
    public void sum_numbers() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should get$")
    public void verify_answer(DataTable result) throws Throwable {
        Assert.assertEquals(true, true);
    }
}
