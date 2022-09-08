package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage3 {


	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logotbx;

	public logoutpage3(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void loginpage(WebDriver driver ) {
		PageFactory.initElements(driver,this);
	}
	public void setlogout()
	{
		logotbx.click();

	}

}


