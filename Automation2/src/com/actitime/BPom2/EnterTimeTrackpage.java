package com.actitime.BPom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.AGeneric.Baseclasss22;

public class EnterTimeTrackpage  {
	
	
	@FindBy(id="logoutLink")
	private WebElement logotbx;
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskTab;
	

	public EnterTimeTrackpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnTaskTab() {
		taskTab.click();
		
	}
	public void setLOgout() {
		logotbx.click();
		
	}
	
}