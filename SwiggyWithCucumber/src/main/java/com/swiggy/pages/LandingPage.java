package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	private WebDriverWait wait;
	
	@FindBy(id="location")
	private WebElement locationBox;
	
	@FindBy(xpath ="//a[contains(@class,'_3iFC5')]")
	private WebElement findFood;
	
	@FindBy(xpath ="//span[contains(@class ,'_2W-T9')]")
	private WebElement locationSuggestion;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));	
		
	}
	
	public void enterLocation(String city) {
		wait.until(ExpectedConditions.visibilityOf(locationBox));
		locationBox.sendKeys(city);
		
		}
	public void selectLocation() {
		wait.until(ExpectedConditions.visibilityOf(locationSuggestion));
		locationSuggestion.click();
	}
	public void continuebtn() {
		findFood.click();
	}

}
