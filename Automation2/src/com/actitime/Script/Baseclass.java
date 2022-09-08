package com.actitime.Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	static 
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\L\\eclipse-workspace\\Automation2\\driver2\\geckodriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
		driver.close();
		
	}
	@BeforeMethod
	public void login() {
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("login",true);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
	@AfterMethod
	public void logout() throws InterruptedException  {
		Reporter.log("logout",true);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
}
