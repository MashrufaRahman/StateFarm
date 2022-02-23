package com.stateFarm.qa.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='popDropdown']")
	public WebElement product;

	@FindBy(xpath = "//input[@id = 'quote-main-zip-code-input']")
	public WebElement zipcode;

}
