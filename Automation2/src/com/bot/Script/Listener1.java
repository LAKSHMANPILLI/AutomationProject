package com.bot.Script;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String res=result.getName();

		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreanShot1/"+res+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
			
		}
		driver.close();
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	

}
