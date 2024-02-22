package com.testing;

public interface DataFile {

	String projectPath = System.getProperty("user.dir");
	Xls_Reader 	d = new Xls_Reader(projectPath + "\\Project_Data\\Selenium_jar\\testData.xlsx");
	
	public String URL = d.getCellData("URL", 1, 1);
	
	
	public String user1 = d.getCellData("UserData", 1, 2);
	public String user2 = d.getCellData("UserData", 1, 3);
	
	public String pass1 = d.getCellData("UserData", 2, 2);
	public String pass2 = d.getCellData("UserData", 2, 3);
	
	
	
}