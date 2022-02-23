package com.stateFarm.qa.bdd.setUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.stateFarm.qa.bdd.commons.CommonMethods;
import com.stateFarm.qa.bdd.objects.MainPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static CommonMethods commonMethods;
	public static MainPage mainPage;

	public static void initDriver() {
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.statefarm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		initClasses();

	}

	public static void initClasses() {
		commonMethods = new CommonMethods();
		mainPage = new MainPage(driver);

	}

}
