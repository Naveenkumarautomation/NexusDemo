package com.nexus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NexusLoginPage extends NexusTestBase {
	
	@FindBy(id="ctl00_ContentPlaceHolder1_logInMain_UserName")
	WebElement username;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_logInMain_Password")
	WebElement password;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_logInMain_LoginButton")
	WebElement loginBtn;
	
	public NexusLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
		
	public NexusHomePage loginSupplier(String un, String pwd) throws InterruptedException {
		username.sendKeys(un);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		return new NexusHomePage();
	}

}
