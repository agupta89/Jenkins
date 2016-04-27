package com.Livepro.Proj.Testcases;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.HelperFunction.BrowserFactory;

public class Monster {
	
	
	WebDriver driver = BrowserFactory.StartBrowser("firefox","http://my.monsterindia.com/login.html");
	
	
	@Test
	public void Help_Link() throws Throwable {
					
	try {	
		   // driver.switchTo().alert().dismiss();
			driver.findElement(By.id("username_login")).sendKeys("abhishek.replica@gmail.com");
			driver.findElement(By.id("passwd_temp")).sendKeys("casara1803");
			driver.findElement(By.id("button")).click();
			Thread.sleep(2500);
			driver.findElement(By.xpath("//*[text()='Do not Display Again']")).click();
			driver.findElement(By.xpath("//*[text()='Update Profile']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("edit_resume_section9_open")).click();
			Thread.sleep(1000);
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
			Date date = new Date();
			String date1= dateFormat.format(date);
			Thread.sleep(1000);
			driver.findElement(By.name("title")).clear();
			Thread.sleep(1000);
			driver.findElement(By.name("title")).sendKeys("Abhishek Resume" + "_" + date1);
			driver.findElement(By.linkText("Upload New")).click();
			Thread.sleep(2000);
			BrowserFactory.upload = driver.findElement(By.id("uploadfile"));
			Thread.sleep(2000);
		    BrowserFactory.fileupload();
		    Thread.sleep(1000);
		    driver.findElement(By.id("update")).click();
		    Thread.sleep(5000);
		
		}

	catch(AssertionError e){
		
		
		throw e;

	}
	catch (NoSuchElementException e)
	{
		String Screenshot_path = BrowserFactory.captureScreenshot(driver, "Monster");
	throw e;
	}
	catch(Throwable e){

         String Screenshot_path = BrowserFactory.captureScreenshot(driver, "Monster");
		
	throw e;


	}
	}
		
			
		@After
		public void teardown() throws Exception {
			
			driver.quit();
			
		}
		}