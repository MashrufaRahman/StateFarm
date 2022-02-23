package com.stateFarm.qa.bdd.commons;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	public void dropDown(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void clickable(WebElement element) {
		element.click();
	}

	public void sendText(WebElement element, String value) {
		element.sendKeys(value);
	}

	

}
