package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainmethod2 {
	static {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\L\\eclipse-workspace\\Automation2\\driver2\\chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		loginpage l=new loginpage(driver);
		l.setuser("admin","manager");
	}
	
}
