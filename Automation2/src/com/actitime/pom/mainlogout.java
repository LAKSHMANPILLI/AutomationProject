package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.pom.LoginPage2;
import com.actitime.pom.loginpage;
import com.actitime.pom.logoutpage3;

public class mainlogout {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\L\\eclipse-workspace\\Automation2\\driver2\\chromedriver.exe");
		}
		@Test
		public void main() throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			loginpage l=new loginpage(driver);
			l.setuser("admin","manager");
			Thread.sleep(3000);
			logoutpage3 h=new logoutpage3(driver);
			
		
			h.setlogout();
			driver.close();
		}

}
