package com.pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartLocators {
	
	@FindBy(xpath ="//div[text()=' Apple Juice (1000ml) ']/../../..//button[@aria-label='Add to Basket']")
	public WebElement addToBasket_1;
	
	@FindBy(xpath ="//button[@aria-label='Add to Basket']")
	public WebElement addToBasket_2;

}
