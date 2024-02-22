package com.testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFile {
	
	PageFile pf = new PageFile();
	public String email,password;
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		pf.openBrowser();
		pf.openURL();
	}
	
	@AfterMethod
	public void afterMethod() {
		pf.closeBrowser();
	}
	
   
    @Test 
    public void countEmail() throws InterruptedException
    {

    	pf.gmailLoginTest(email, password);
    	
    //	pf.invalidUser();
    	
    //	pf.invalidPswd();
    	
    	pf.countEmail();
    	pf.trashEmail();
    	pf.readEmail();
    }
    
       
}    