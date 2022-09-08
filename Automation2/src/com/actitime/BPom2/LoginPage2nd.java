 package com.actitime.BPom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.AGeneric.Baseclasss22;

public class LoginPage2nd extends Baseclasss22{
	@FindBy(id="username")
	private  WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgBtn;
	
	public LoginPage2nd(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void setLogin(String un, String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgBtn.click();
		
	}

	
}
