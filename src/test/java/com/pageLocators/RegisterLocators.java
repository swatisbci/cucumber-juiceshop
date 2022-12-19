package com.pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterLocators {
	@FindBy(xpath ="//span[text()=' Account ']")
	public WebElement AccountBtn;
	
	@FindBy(id ="navbarLoginButton")
	public WebElement logInButton;
	
	@FindBy(linkText ="Not yet a customer?")
	public WebElement goRegButton;
	
	@FindBy(id ="emailControl")
	public WebElement emailText;
	
	@FindBy(id ="passwordControl")
	public WebElement passwordText;
	
	@FindBy(id ="repeatPasswordControl")
	public WebElement repeatPasswordText;
	
	@FindBy(name ="securityQuestion")
	public WebElement securityQuestion ;
	
	@FindBy(id ="mat-option-7")
	public WebElement secques;
	
	@FindBy(id ="securityAnswerControl")
	public WebElement securityAnswer;
	
	@FindBy(id ="registerButton")
	public WebElement regButton;
	
	@FindBy(xpath ="//h1[text()='Login']")
	public WebElement LoginHeading;
	
	
	
	
	

}
