package com.HelperFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	static WebDriver driver;
	public static WebElement upload;
	
	public static WebDriver StartBrowser(String BrowserName, String URL){
		
		if(BrowserName.equalsIgnoreCase("firefox")){
			
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		return driver;
	}
	
	
	public static void fileupload (){
		
		upload.sendKeys("E:\\Important Doc\\AbhishekResume.docx");
	}
	
	

}
