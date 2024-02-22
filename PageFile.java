package com.testing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;




public class PageFile extends LocatorsFile implements DataFile{
	
	
	public  WebDriver driver;
	public WebElement unread;
	public Actions builder;
	static String attributText;
	
	
	
	
	public void openBrowser() throws IOException, InterruptedException {
		
	    String projectPath = System.getProperty("user.dir");
	    String chromeDriverPath = projectPath + "\\Project_Data\\Drivers\\chromedriver.exe";
	    
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		
		//Setup Driver Property
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
		
		PageFactory.initElements(driver, this);	

	}
	
	public void closeBrowser() {		
		driver.quit();
	}
	
	
	public void openURL() throws InterruptedException 
	{
	
		driver.get(URL);
		Thread.sleep(1000);
	
	}
	
	//======================Test 1==================================================
	
	public void gmailLoginTest(String email, String password) throws InterruptedException 
	{
		
		userNameBox.sendKeys(user2);
	  	nextButton.click();
	 
	  	
	  	Thread.sleep(3000);
		
	  
	 	passwordBox.sendKeys(pass1);
		nextButton1.click();
		
		String msg = driver.findElement(By.xpath("//div[@class=\"VBGMK\"]/div[1]/div[2]/div[2]/span")).getText();
		String gotMsg = "Wrong password. Try again or click Forgot password to reset it.";
		
		if (msg.equals(gotMsg)) {
    	    System.out.println("Password incorrect");
    	} 
		else 
		{
    	    System.out.println("No Error Msg");
    	}

		passwordBox.sendKeys(pass2);
		nextButton1.click();
		
		
	}		
			

		

	
	//========================Test 2===================================================
	
	public void countEmail() throws InterruptedException
	{	
		String totalEmail = mail.getText();
		System.out.println("Total emails in this page : " + totalEmail);
			
		String allEmail = mail1.getText();
		System.out.println("Total emails in inbox : " +allEmail);
	}
	
	//========================Test 3===================================================
	
	public void trashEmail() throws InterruptedException
	{

		Thread.sleep(1000);
		
		selectEmail.click();
		System.out.println("inbox one email is selected");
		
		Thread.sleep(1000);		
		
		if(driver.getCurrentUrl().contains("u"))
			System.out.println("Your email is open");
		Thread.sleep(1000);
		
		deleteBtn.click();
		System.out.println("email Deleted");
		
		Thread.sleep(1000);
		
		 String inbox = driver.findElement(By.xpath("//div[@class=\"bsU\"]")).getText();
	     System.out.println("Now total emails in inbox are :"+inbox);
	     
	     Thread.sleep(1000);
		   
	     WebElement searchTrash = driver.findElement(By.xpath("//input[@name=\"q\"]"));
	     searchTrash.sendKeys("in:trash");
	     searchTrash.sendKeys(Keys.ENTER);
	     
	     trashSelect.click();
	     
	     Thread.sleep(1000);
	     
	     System.out.println("email selected from trash");
	    
	     Thread.sleep(1000);
	           
	     
	     moveBtn.click();
	     
	     System.out.println("move clicked");
	     
	     inboxSelect.click();
	     
	     System.out.println("moved to inbox");
	     
	     String inbox1 = driver.findElement(By.xpath("//div[@class=\"bsU\"]")).getText();
	    System.out.println("Now total emails in inbox are :"+inbox1);  
		
	}
	
	//=====================Test 4=================================
	
	public void readEmail() throws InterruptedException 
	{
		againSelectEmail.click();
		System.out.println("inbox one email is selected");

	
		unreadBTN.click();
		
		Thread.sleep(3000);
		
		
		String msg1 = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div/div[3]/div[4]/div/div/div[2]/span/span[1]")).getText();
		String gotMsg1 = "Conversation marked as unread.";
		
		if (msg1.equals(gotMsg1)) {
    	    System.out.println("Email Marked as unread - Verified");
    	} 
		else 
		{
    	    System.out.println("Not Verified");
    	}

		
		againSelectEmail2.click();
		System.out.println("Same Email selected ");
		
		driver.navigate().back();
		
		System.out.println("Now Email is read ");
		
		
		
		
		
		
	
		
		
	}
	

}	
