package com.actitime.Script;

import org.testng.Assert;


import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.Script.Listener.class)

public class costumerModule extends Baseclass {
	@Test
	public void CreateCostumer() throws InterruptedException  {
		Reporter.log("CreateCostumer",true);
		Thread.sleep(2000);
		Assert.fail();
	}

}
