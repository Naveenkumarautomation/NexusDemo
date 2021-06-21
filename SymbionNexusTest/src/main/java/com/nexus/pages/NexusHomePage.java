package com.nexus.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nexus.util.TimeUtil;

public class NexusHomePage extends NexusTestBase{
	
	@FindBy(xpath="(//a[text()= 'New Line Submission'])[2]")
	WebElement newLineSubmission;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnSubmit")
	WebElement continueClick;
	
	
	public NexusHomePage() {
		PageFactory.initElements(driver, this);
	}
	
		
	public NexusSupplierFormPage newLineSubmissionClick() throws InterruptedException {
		newLineSubmission.click();
		Thread.sleep(2000);
		continueClick.click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		return new NexusSupplierFormPage();
	}

}
