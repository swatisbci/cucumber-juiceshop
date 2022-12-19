package com.pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	@FindBy(id ="email")
	public WebElement emailTextBox;
	
	@FindBy(id ="password")
	public WebElement passwordTextBox;
	
	@FindBy(id ="loginButton")
	public WebElement loginButton;
	
	@FindBy(xpath ="//button[@aria-label='Show the shopping cart']")
	public WebElement cartIcon;

}
