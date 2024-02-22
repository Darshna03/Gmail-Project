package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {

	//=============== Login Page - Task 1==========================
	
	
	@FindBy(id="identifierId") WebElement userNameBox;
	@FindBy(id ="identifierNext") WebElement nextButton;
	@FindBy(name ="Passwd") WebElement passwordBox;
	@FindBy(id = "passwordNext")WebElement nextButton1;
	
	//================ Count Email  - Task 2=======================
	
	
	@FindBy(xpath= "//div[@class=\"Cr aqJ\"]/div/span/div/span/span[1]/span[2]") WebElement mail;
	
	@FindBy(xpath = "//div[@class=\"Cr aqJ\"]/div/span/div/span/span[2]") WebElement mail1;
	
	//=================Trash email - Task -3==========================
	
	@FindBy(xpath = "//*[@id=\":22\"]/tbody/tr[5]") WebElement selectEmail;
	@FindBy(xpath = "//*[@id=\":4\"]/div[2]/div[1]/div/div[2]/div[3]/div") WebElement deleteBtn;
	
//	@FindBy(xpath = "//input[@name=\"q\"]") WebElement searchTrash;
	@FindBy(xpath = " //div[@class=\"nH\"]/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/div/div[1]/span")WebElement trashSelect;
	@FindBy(xpath = "//div[@class=\"nH\"]/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div[5]/div[1]")WebElement moveBtn;
	
	@FindBy(linkText ="Inbox")  WebElement inboxSelect;
	
	
	//================ReadEmail - Task - 4==============================
	

	@FindBy(xpath = "//*[@id=\":22\"]/tbody/tr[1]") WebElement againSelectEmail;
	@FindBy(xpath = "//div[@class=\"aeH\"]/div[3]/div[1]/div/div[3]/div[1]")WebElement unreadBTN;
	@FindBy(xpath = "//*[@id=\":22\"]/tbody/tr[1]") WebElement againSelectEmail2;
	
	
	

}
