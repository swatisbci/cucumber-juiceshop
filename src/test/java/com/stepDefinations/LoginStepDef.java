package com.stepDefinations;

import com.pageActions.RegisterActions;

import org.testng.Assert;

import com.pageActions.LoginActions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseClass {
	LoginActions actions = null;
	
	@When("user enters {string}, {string}")
	public void user_enters_email_password(String userName, String password) throws InterruptedException {
		actions = new LoginActions(driver);
	    Thread.sleep(2000);
	    actions.enterEmail(userName);
	    actions.enterPassword(password);
	}

	@When("click on log button")
	public void click_on_log_button() {
		actions.clickLogin();
	   
	}

	@Then("user should be able to see home page")
	public void user_should_be_able_to_see_home_page() {
		String actualText=  actions.verifyAddCart();
		  System.out.println(actualText);
		  Assert.assertEquals(actualText, "Show the shopping cart");
	}


}
