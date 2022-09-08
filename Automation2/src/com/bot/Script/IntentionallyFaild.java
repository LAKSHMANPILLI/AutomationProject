package com.bot.Script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.bot.Script.Listener1.class)
public class IntentionallyFaild extends BaseClass {
	@Test
	public void CreateCostumer() throws InterruptedException  {
		Reporter.log("CreateCostumer",true);
		Thread.sleep(1000);
		Assert.fail();
	}
}
