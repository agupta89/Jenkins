package com.Livepro.Proj.Testcases;


import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.HelperFunction.BrowserFactory;

public class Shine {
	
	
	WebDriver driver = BrowserFactory.StartBrowser("firefox","http://www.shine.com/myshine/login/");
	
	
	@Test
	public void Help_Link() throws Throwable {
			
		  
		   

				
	try {		
			
			
			driver.findElement(By.id("id_email")).sendKeys("abhishek.replica@gmail.com");
			driver.findElement(By.id("id_password")).sendKeys("casara1803");
			driver.findElement(By.id("btn_login")).click();
			Thread.sleep(2500);
			driver.findElement(By.linkText("Resume")).click();
			/*driver.findElement(By.xpath(".//*[@class='cls_deleteresume']")).click();
			driver.switchTo().frame(driver.findElement(By.name("google_osd_static_frame")));
			driver.findElement(By.id("id_resume_delete")).click();
			driver.findElement(By.xpath(".//*[@value='Ok']")).click(); */
			driver.findElement(By.linkText("Upload new resume")).click();
			BrowserFactory.upload = driver.findElement(By.id("id_file"));
			Thread.sleep(2000);
		    BrowserFactory.fileupload();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath(".//*[@class='submitred resumeupload']")).click();
		    Thread.sleep(5000);
		    String conmsg = driver.findElement(By.id("confirmMessage")).getText();
		    String Expmsg = "Your naukri profile has been updated with your uploaded resume";
		    Assert.assertEquals("Meesage not found", Expmsg, conmsg);
		
		}

	catch(AssertionError e){
		
		throw e;

	}
	catch (NoSuchElementException e)
	{
		
	throw e;
	}
	catch(Throwable e){


		
	throw e;


	}
	}
		
			
		@After
		public void teardown() throws Exception {
			
			driver.quit();
			
		}
		}