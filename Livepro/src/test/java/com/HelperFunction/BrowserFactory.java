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
		
		upload.sendKeys("/var/lib/jenkins/workspace/Test Project/Livepro/Resume/AbhishekResume.docx");
	}
	
	public static String captureScreenshot(WebDriver driver, String screenShotName) throws IOException
	    {
		
		try {
			
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcepath = ts.getScreenshotAs(OutputType.FILE);
		String dest = "/var/lib/jenkins/workspace/Test Project/Livepro/screenshots/" + screenShotName + ".png";  //location for images
	    File destination = new File(dest);
	    FileUtils.copyFile(sourcepath,destination);
	    return dest;
		}
		catch (Exception e)
		{
			System.out.println("Exception Taking screenshot" + e.getMessage());
			return e.getMessage();
		}
		
	}
	
	

}
