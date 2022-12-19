package com.pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageLocators.LoginLocators;

public class LoginActions {
	LoginLocators locators2 = new LoginLocators();
	public LoginActions(WebDriver driver) {
		PageFactory.initElements(driver, locators2);
	}
	
	public void enterEmail(String userName) throws InterruptedException {
		Thread.sleep(2000);
		locators2.emailTextBox.sendKeys(RegisterActions.regEmail);
	}
	
	public void enterPassword(String password) {
		locators2.passwordTextBox.sendKeys(password);
	}
	
	public void clickLogin() {
		locators2.loginButton.click();
	}
	
	public String verifyAddCart() {
		String text = locators2.cartIcon.getAttribute("aria-label");
		return text;
	}

}
