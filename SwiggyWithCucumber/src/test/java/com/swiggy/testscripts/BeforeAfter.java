package com.swiggy.testscripts;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tools {
	@Before
	public void setUp(Scenario scenario) {
		//Logic to open the browser
		Driver.init();
	}

	@After
	public void tearDown() {
		//logic to close the browser
		driver.quit();
	}

}
