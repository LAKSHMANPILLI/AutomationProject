package com.actitime.Script;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.Fields;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class DemoScreanShot {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\L\\eclipse-workspace\\Automation2\\driver2\\chromedriver.exe");
	}
	@Test
	public void SCreanSot1() throws IOException
	{
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot t=(TakesScreenshot) driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		
		File des=new File("ScreanShot1\\ss.png");
	     FileUtils.copyFile(src, des);
	     driver.close();
	}

}
