package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Items {
	
	private WebDriverWait wait;
	
	
	@FindBy(xpath = "(//div[contains(@class,'_3XX_A')])[1]")
	private WebElement firstItem;
	
	public Items(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));	
		
	}
	
	public void selectFirstItem() {
		wait.until(ExpectedConditions.visibilityOf(firstItem));
		firstItem.click();
		
	}	
	

}
