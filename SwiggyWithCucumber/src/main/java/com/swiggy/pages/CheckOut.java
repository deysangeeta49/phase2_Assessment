package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOut {
	private WebDriverWait wait;
	
	@FindBy(xpath = "//div[contains(@class,'_2axtv')]")
	private WebElement msg;
	
	public CheckOut(WebDriver driver){
		PageFactory.initElements (driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		}
	public String getMsg() {
		wait.until(ExpectedConditions.visibilityOf(msg));
		String message = msg.getText();
		return message;
		
				
	}
}
