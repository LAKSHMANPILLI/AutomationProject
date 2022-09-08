package com.actitime.AGeneric;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.BPom2.EnterTimeTrackpage;
import com.actitime.BPom2.LoginPage2nd;

public class Baseclasss22 {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\L\\eclipse-workspace\\Automation2\\driver2\\chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		Reporter.log("Openbrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterTest
	public void closebrowser() {
		Reporter.log("closebrowser",true);
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login",true);/*
		//driver.get("https://demo.actitime.com/login.do");
		FileLib2nd f=new FileLib2nd();
		String url = f.getPropertyData("Url" );
		String un = f.getPropertyData("Username");
		String pw = f.getPropertyData("Password");
		driver.get(url);
		*/
		LoginPage2nd l=new LoginPage2nd(driver);
		FileLib2nd f=new FileLib2nd();
		driver.get(f.getPropertyData("Url"));
		l.setLogin(f.getPropertyData("Username"),f.getPropertyData("Password"));
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		//driver.findElement(By.xpath("//a[text()='Logout']")).click();
		EnterTimeTrackpage e=new EnterTimeTrackpage(driver);
		e.setLOgout();
	//driver.close();
	}

}
