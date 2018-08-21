package com.glue;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class NavigationSteps {
	
    @Given("^I open the app$")
    public void add_number() throws Throwable {
    	Assert.assertEquals(true, true);
    }
}
