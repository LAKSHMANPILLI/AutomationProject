package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	@FindBy(id="username")
	private WebElement untbx;      //declaration
    @FindBy(name="pwd")
    private WebElement pwtbx;
    @FindBy(xpath="//div[text()='Login ']")
    private WebElement lgbtn;
    public LoginPage2(WebDriver driver) {
		
    }
	public void loginpage(WebDriver driver ) {
    	PageFactory.initElements(driver,this);
    }
    public void setLogin(String un,String pwd) {
    	untbx.sendKeys(un);
    	pwtbx.sendKeys(pwd);
    	lgbtn.click();
    }
}
