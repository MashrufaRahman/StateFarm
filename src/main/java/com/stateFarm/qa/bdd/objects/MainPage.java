package com.stateFarm.qa.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stateFarm.qa.bdd.commons.CommonMethods;

public class MainPage {
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//select[@id='popDropdown']")
	public WebElement product;
	//Auto

//	@FindBy(xpath = "//input[@id = 'quote-main-zip-code-input']")
//	public WebElement zipcode;
	
	public void productMethod(CommonMethods cm) {
		cm.dropDown(product, "Homeowners");
	}
	

}
