 package com.actitime.AGeneric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverCommaLib {
	public static WebDriver driver;
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
     public void maximizeBrowser() {
    	 driver.manage().window().maximize();
     }
	public void Explicit(WebElement aText,String eText) {
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.textToBePresentInElement(aText,eText));
	}
	public void customWaitForElementDisplayed(WebElement element) {
		int i=0;
		while(i<100) {
			try {
				element.isDisplayed();
				break;
			}
			catch(Exception e) {
				i++;
			}
		}
	} 
}
