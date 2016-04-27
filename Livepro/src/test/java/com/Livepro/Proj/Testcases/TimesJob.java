package com.Livepro.Proj.Testcases;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.HelperFunction.BrowserFactory;

public class TimesJob {
	
	
	WebDriver driver = BrowserFactory.StartBrowser("firefox","http://www.timesjobs.com/candidate/login.html");
	
	
	@Test
	public void Help_Link() throws Throwable {
					
	try {		
			driver.findElement(By.id("txtUseName")).sendKeys("abhishek.replica@gmail.com");
			driver.findElement(By.id("j_password")).sendKeys("casara1803");
			driver.findElement(By.id("submitbutton")).click();
			Thread.sleep(2500);
			driver.findElement(By.linkText("Edit Profile")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='resumeWidgetViewId']/header/button")).click();
			BrowserFactory.upload = driver.findElement(By.name("resumeFile"));
			Thread.sleep(2000);
			BrowserFactory.fileupload();
		    Thread.sleep(1000);
		    driver.findElement(By.id("submitbutton")).click();
		    Thread.sleep(5000);
		    
		
		}

	catch(AssertionError e){
		
		throw e;

	}
	catch (NoSuchElementException e)
	{
		String Screenshot_path = BrowserFactory.captureScreenshot(driver, "Timesjob");
	throw e;
	}
	catch(Throwable e){

      String Screenshot_path = BrowserFactory.captureScreenshot(driver, "Timesjob");
		
	throw e;


	}
	}
		
			
		@After
		public void teardown() throws Exception {
			
			driver.quit();
			
		}
		}