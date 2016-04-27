package com.Livepro.Proj.pages;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {
	
	WebDriver driver;

	
	public CommonPage(WebDriver ldriver) {
		
		
		this.driver = ldriver;
	}
	
	@FindBy(how=How.ID,using="")
	@CacheLookup
	WebElement login;

}
