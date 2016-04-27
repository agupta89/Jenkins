package com.Livepro.Proj.Testcases;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.HelperFunction.BrowserFactory;

public class Naukri {
	
	
	WebDriver driver = BrowserFactory.StartBrowser("firefox","https://login.naukri.com/nLogin/Login.php");
	
	
	@Test
	public void Help_Link() throws Throwable {
					
	try {		
			driver.findElement(By.id("emailTxt")).sendKeys("abhishek.replica@gmail.com");
			driver.findElement(By.id("pwd1")).sendKeys("casara1803");
			driver.findElement(By.name("Login")).click();
			Thread.sleep(2500);
			driver.findElement(By.xpath(".//*[@class='w205']")).click();
			driver.findElement(By.id("uploadLink")).click();
			BrowserFactory.upload = driver.findElement(By.id("attachCV"));
			Thread.sleep(2000);
			BrowserFactory.fileupload();		    Thread.sleep(1000);
		    driver.findElement(By.xpath(".//*[@class='w85bt fl']")).click();
		    Thread.sleep(5000);
		    String conmsg = driver.findElement(By.id("confirmMessage")).getText();
		    String Expmsg = "Your naukri profile has been updated with your uploaded resume";
		    Assert.assertEquals("Meesage not found", Expmsg, conmsg);
		
		}

	catch(AssertionError e){
		String Screenshot_path = BrowserFactory.captureScreenshot(driver, "Naukri");
		throw e;

	}
	catch (NoSuchElementException e)
	{
		String Screenshot_path = BrowserFactory.captureScreenshot(driver, "Naukri");
	throw e;
	}
	catch(Throwable e){

        String Screenshot_path = BrowserFactory.captureScreenshot(driver, "Naukri");
		
	throw e;


	}
	}
		
			
		@After
		public void teardown() throws Exception {
			
			driver.quit();
			
		}
		}