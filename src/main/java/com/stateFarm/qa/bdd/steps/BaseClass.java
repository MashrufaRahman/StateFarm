package com.stateFarm.qa.bdd.steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.stateFarm.qa.bdd.commons.CommonMethods;
import com.stateFarm.qa.bdd.objects.MainPage;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static CommonMethods cm;
	public static MainPage mainPage;
	
     @Before
	public static void initDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.statefarm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		initClasses();
	}
    
	public static void initClasses() {
		cm = new CommonMethods();
		mainPage = new MainPage(driver);

	}

}
