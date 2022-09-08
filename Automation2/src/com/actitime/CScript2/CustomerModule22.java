package com.actitime.CScript2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners; 
import org.testng.annotations.Test;

import com.actitime.AGeneric.Baseclasss22;
import com.actitime.AGeneric.FileLib2nd;
import com.actitime.AGeneric.WebdriverCommaLib;
import com.actitime.BPom2.EnterTimeTrackpage;
import com.actitime.BPom2.TaskListpage2;
@Listeners(com.actitime.AGeneric.Listenerimplementation.class)
public class CustomerModule22 extends Baseclasss22{
	@Test
    public void testcreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
   	 Reporter.log("testcreateCustomer",true);
   	//driver.manage().window().setSize(new Dimension(1920, 1000));
   	 
   	 EnterTimeTrackpage e=new EnterTimeTrackpage(driver);
   	 Thread.sleep(9000);
   	 e.clickOnTaskTab();
   	 TaskListpage2 t=new TaskListpage2(driver);
   	 t.getAddnewbtn().click();
   	 t.getNewcust().click();
   	 FileLib2nd f=new FileLib2nd();
   	 String custName=f.getExelData("Sheet1", 1,2);
   	 String custdesc = f.getExelData("Sheet1", 1, 3);
   	 t.getEntercustName().sendKeys(custName);
   	 t.getCustDscript().sendKeys(custdesc);
   	 t.getSelectCust().click();
   	 t.getProjectcust().click();
   	 t.getCreateCust().click();
   	Thread.sleep(3000);
   	// WebDriverWait w=new WebDriverWait(driver, 10);
   	 //w.until(ExpectedConditions.textToBePresentInElement(t.getActualCustCreated(),custName));
   	// w.Explicit( t.getActualCustCreated(),custdesc);
   	 String actualCustText = t.getActualCustCreated().getText();
   	 Assert.assertEquals(actualCustText, custName);
   	 f.setExelData("Sheet1", 1, 4,"passd");
   	 
   	 
	}
}
