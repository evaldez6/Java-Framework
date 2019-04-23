package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/*
 This class will store all the locator and methods to login to gmail
 */

public class LoginPage {

	WebDriver driver;
	
	By usermail = By.xpath("//input[@id='identifierId']");
	By mailpassword = By.xpath("//input[@name='password']");
		
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void typeusermail(String uid) throws Throwable
	{
		Thread.sleep(3000);
		driver.findElement(usermail).sendKeys(uid);
		Thread.sleep(2000);
		driver.findElement(usermail).sendKeys(Keys.ENTER);
	}
	
	public void typepassword(String pw) throws Throwable
	{
		Thread.sleep(3000);
		driver.findElement(mailpassword).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(mailpassword).sendKeys(Keys.ENTER);
	}
	
}
