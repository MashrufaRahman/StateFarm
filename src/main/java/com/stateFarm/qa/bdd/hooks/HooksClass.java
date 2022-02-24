package com.stateFarm.qa.bdd.hooks;


import com.stateFarm.qa.bdd.steps.BaseClass;
import com.stateFarm.qa.bdd.utilities.ConsoleLogger;


public class HooksClass {
//	@Before
	public void initiating() {
		ConsoleLogger.log("Initiating BDD tests");
		BaseClass.initDriver();
	}

//	@After
	public void tearUp() {
		BaseClass.driver.quit();
	}
}
