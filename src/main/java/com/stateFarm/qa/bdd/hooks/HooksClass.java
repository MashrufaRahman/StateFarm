package com.stateFarm.qa.bdd.hooks;

import com.stateFarm.qa.bdd.setUp.BaseClass;
import com.stateFarm.qa.bdd.utilities.ConsoleLogger;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {
	@Before
	public void initiating() {
		ConsoleLogger.log("Initiating BDD tests");
		BaseClass.initDriver();
	}

	@After
	public void tearUp() {
		BaseClass.driver.quit();
	}
}
