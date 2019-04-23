package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	By createmessage = By.xpath("//div[@class='z0']/div[@role='button']");
	By to = By.xpath("//textarea[@name='to']");
	By subject = By.xpath("//input[@placeholder='Subject']");
	By bodymessage = By.xpath("//div[@aria-label='Message Body']");
	By attachfile = By.xpath("//input[@name='Filedata']");
	By clicksend = By.xpath("//div[text()='Send']");
	By readmessage = By.xpath("//div[@class = 'y6']/span[contains(., 'test subject')]");
	By labelbutton = By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]"
			+ "/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"
			+ "/div[1]/div[1]/div[4]/div[2]/div[1]");
	By createnewlabel = By.xpath("//div[contains(text(),'Create new')] ");
	By labelname = By.xpath("//input[@class='xx']");
	By labelbuttonok = By.xpath("//button[@name='ok']");
	By inboxlabel = By.xpath("//a[@title='Inbox']");
	By starredlabel = By.xpath("//a[@title='Starred']");
	By snoozedlabel = By.xpath("//a[@title='Snoozed']");
	By sentlabel = By.xpath("//a[@title='Sent']");
	By draftslabel = By.xpath("//a[@title='Drafts']");
	By testlabellabel = By.xpath("//a[@title='TestLabel']");
	
	String scDir = System.getProperty("user.dir");
	String imagedir = scDir + "\\src\\test\\resources\\testimage.jpg";
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void create_new_message() throws Throwable
	{
		Thread.sleep(12000);
		driver.findElement(createmessage).click();
	}
	
	public void fill_in_message(String tomail, String subjectmail, String bodymail) 
			throws Throwable
	{
		Thread.sleep(2000);
		driver.findElement(to).sendKeys(tomail);
		Thread.sleep(3000);
		driver.findElement(subject).sendKeys(subjectmail);
		Thread.sleep(3000);
		driver.findElement(bodymessage).sendKeys(bodymail);
	}
	
	public void attachfile() throws Throwable
	{
		Thread.sleep(4000);
		driver.findElement(attachfile).sendKeys(imagedir);
	}
	
	public void sendmessage() throws Throwable
	{
		Thread.sleep(4000);
		driver.findElement(clicksend).click();
	}
	
	public void readmessage() throws Throwable
	{
		Thread.sleep(5000);
		driver.findElement(readmessage).click();
	}
	
	public void createlabel() throws Throwable
	{
		Thread.sleep(4000);
		driver.findElement(labelbutton).click();
		
		Thread.sleep(4000);
		driver.findElement(createnewlabel).click();
		
		Thread.sleep(4000);
		driver.findElement(labelname).sendKeys("TestLabel");
		
		Thread.sleep(4000);
		driver.findElement(labelbuttonok).click();
		
	}
	
	public void labelnavigation() throws Throwable
	{
		
		Thread.sleep(8000);
		driver.findElement(inboxlabel).click();
		
		Thread.sleep(8000);
		driver.findElement(starredlabel).click();
		
		Thread.sleep(8000);
		driver.findElement(snoozedlabel).click();
		
		Thread.sleep(8000);
		driver.findElement(sentlabel).click();
		
		Thread.sleep(8000);
		driver.findElement(draftslabel).click();
		
		Thread.sleep(8000);
		driver.findElement(testlabellabel).click();
		
		Thread.sleep(8000);
		
	}

}
