package com.actitime.BPom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListpage2 {
	//@FindBy(id="container_tasks")
	//private WebElement taskbtn;
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addnewbtn;
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newcust;
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name' and @class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement EntercustName;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement CustDscript;
	@FindBy(xpath = "//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCust;
	@FindBy(xpath = "//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement projectcust;
	@FindBy(xpath = "//div[text()='Create Customer' and @class='components_button_label']")
	private WebElement CreateCust;
	@FindBy(xpath = "(//div[@class='editButton'])[16]/..")
	private  WebElement ActualCustCreated;
	public TaskListpage2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}
	public WebElement getNewcust() {
		return newcust;
	}
	public WebElement getEntercustName() {
		return EntercustName;
	}
	public WebElement getCustDscript() {
		return CustDscript;
	}
	public WebElement getSelectCust() {
		return selectCust;
	}
	public WebElement getProjectcust() {
		return projectcust;
	}
	public WebElement getCreateCust() {
		return CreateCust;
	}
	public WebElement getActualCustCreated() {
		return ActualCustCreated;
	}
	
	
}
