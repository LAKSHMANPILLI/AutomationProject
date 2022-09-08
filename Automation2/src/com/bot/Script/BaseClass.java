package com.bot.Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	static 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\L\\eclipse-workspace\\Automation2\\driver2\\chromedriver.exe");
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
		driver.get("https://demo-chatbot2go.enterprisebot.co/signin");
		Reporter.log("login",true);
		driver.findElement(By.xpath("//*[@id=\"initialEmailId\"]")).sendKeys("suraj+tester@enterprisebot.org");
		driver.findElement(By.xpath("//*[@id=\"eStatusNextId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"passwordFieldId\"]")).sendKeys("E13_Tester");
		driver.findElement(By.xpath("//*[@id=\"SignInId\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[5]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"entityListDiv\"]/div[2]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"intent-header-name\"]")).sendKeys("Lakshman_25/08/22");
		//driver.findElement(By.xpath("//*[@id=\"entityListDiv\"]/div[3]/div/ul/ul/li[11]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"reference-value0\"]")).sendKeys("cloths");
		driver.findElement(By.xpath("//*[@id=\"entity-save-btn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"accountOptionsBtnId\"]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdown-item1\"]/p")).click();
	}
	@AfterMethod
	public void logout() throws InterruptedException  {
		Reporter.log("logout",true);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
}



