package com.pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pageLocators.RegisterLocators;
import com.util.CommonUtils;

public class RegisterActions {
	 public static String regEmail = null;
	RegisterLocators locators = new RegisterLocators();
	
	public RegisterActions(WebDriver driver) {
		PageFactory.initElements(driver, locators);
	}
	
		public void accountIconClick() throws InterruptedException {
			Thread.sleep(5000);
		locators.AccountBtn.click();
		
	}
	
	public void loginClick() {
		locators.logInButton.click();
	}
	
	public void goRegPage() throws InterruptedException {
		Thread.sleep(5000);
		locators.goRegButton.click();
	}
	
	public void emailEnter(String userEmail) {
		regEmail = CommonUtils.getRandomNum()+userEmail;
		locators.emailText.sendKeys(regEmail);
		
		
	}
	
	public void passwordEnter(String pwd) {
		locators.passwordText.sendKeys(pwd);
	}
	
	public void repeatPwdText(String rpwd) {
		locators.repeatPasswordText.sendKeys(rpwd);
	}
	
	public void selectSecQues(String secQuestion) {
		locators.securityQuestion.click();
//		Select select = new Select(locators.securityQuestion);
//		select.selectByVisibleText(secQuestion);
		locators.securityQuestion.sendKeys(secQuestion);
		locators.secques.click();
		
		
		
	}
	
	public void selectsecAns(String answer) {
		locators.securityAnswer.sendKeys(answer);
	}
	
	public void clickReg() {
		locators.regButton.click();
	}
	
	public String getLoginHeading() {
		String headingText = locators.LoginHeading.getText();
		return headingText;
	}
	
	

}
