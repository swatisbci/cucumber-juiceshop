package com.stepDefinations;

import org.testng.Assert;

import com.pageActions.RegisterActions;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef extends BaseClass {
	 RegisterActions actions = null;
	
	@BeforeAll
	public  static void beforeAll() {
		createDriver();
//		actions = new Page1Actions(driver);
	}
	
	@Given("open browser and enter the URL.")
	public void open_browser_and_enter_the_url() {
		actions = new RegisterActions(driver);
		
		driver.get("https://juice-shop.herokuapp.com/#/search");
	    
	}

	@When("user click on account link and click on login")
	public void user_click_on_account_link_and_click_on_login() throws InterruptedException {
		Thread.sleep(5000);
		actions.accountIconClick();
		actions.loginClick();
	   
	    
	}

	@When("click on not yet a customer")
	public void click_on_not_yet_a_customer() throws InterruptedException {
		Thread.sleep(5000);
		actions.goRegPage();
	   
	    
	}

	@When("enters {string}, {string}, {string}, {string}, {string}")
	public void enters_email_password_repeat_password_security_question_answer(String email, String pwd, String rPwd, String secQuestion, String answer) {
	    actions.emailEnter(email);
	    actions.passwordEnter(pwd);
	    actions.repeatPwdText(rPwd);
	    actions.selectSecQues(secQuestion);
	    
	    actions.selectsecAns(answer);
	    
	}

	@When("click on Register")
	public void click_on_register() throws InterruptedException {
	    Thread.sleep(2000);
	    actions.clickReg();
	}

	@Then("user should be able to see login screen")
	public void user_should_be_able_to_see_login_screen() {
	  String actualText=  actions.getLoginHeading();
	  System.out.println(actualText);
	  Assert.assertEquals(actualText, "Login");
	}
	
	
}
