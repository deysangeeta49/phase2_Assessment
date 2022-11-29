package com.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import com.swiggy.pages.CheckOut;
import com.swiggy.pages.Items;
import com.swiggy.pages.LandingPage;
import com.swiggy.pages.PlaceOrder;

public class Driver extends Tools{
	
	protected static LandingPage landingPage;
	protected static Items items;
	protected static PlaceOrder placeOrder;
	protected static CheckOut checkOut;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver = new ChromeDriver();
		//maximize it
		driver.manage().window().maximize();
		
		//navigate to the application
		driver.get("https://swiggy.com/");
		landingPage = new LandingPage(driver);
		items = new Items(driver);
		placeOrder = new PlaceOrder(driver);
		checkOut= new CheckOut(driver);

	}
}
