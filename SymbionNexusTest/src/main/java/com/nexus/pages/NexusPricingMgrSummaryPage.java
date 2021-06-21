package com.nexus.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nexus.util.TimeUtil;

public class NexusPricingMgrSummaryPage extends NexusTestBase{
	
	Actions action = new Actions(driver);

	/* Pricing Summary Menu Item elements */
	
	@FindBy(xpath="//a[text()='Supplier Forms']")
	WebElement supplierFormsMenu;
	
	@FindBy(xpath= "//div[text()='New Lines']")
	WebElement newLinesMenuItem;
	
	@FindBy(xpath= "//a[text()='Pricing Summary']")
	WebElement pricingSummaryMenuItem;
	
	/* Search Button Element */
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnSearch")
	WebElement searchBtn;
	
	/* Nexus Check Click Elements*/
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnPreFlightCheck")
	WebElement neXusCheckBtn;
	
	/* Sumbit Button */
	
	@FindBy(id= "ctl00_ContentPlaceHolder1_btnSubmit")
	WebElement sumbitToOrionBtn;
	
	/* Logout button */
	@FindBy(id="ctl00_Logout")
	WebElement logOutButton;
	
	public NexusPricingMgrSummaryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public NexusHomePage pricingMgrSummaryDetails() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		/* Pricing Check Summary sub-menu actions */
		
		action.moveToElement(supplierFormsMenu).moveToElement(newLinesMenuItem).click().build().perform();
		Thread.sleep(3000);
		action.moveToElement(pricingSummaryMenuItem).click().build().perform();
		Thread.sleep(3000);
		searchBtn.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // This  will scroll down the page by  3000 pixel vertical		
        js.executeScript("window.scrollBy(0,3000)");
        
        Thread.sleep(2000);
		
		NexusSupplierFormPage test = new NexusSupplierFormPage();
		
		driver.findElement(By.xpath("//td[contains(text(),'"+test.req+"')]/following-sibling::td/a[text()='Process New Line']")).click();
		Thread.sleep(2000);
		
		neXusCheckBtn.click();
		Thread.sleep(5000);
		
		sumbitToOrionBtn.click();
		Thread.sleep(10000);
		
		/* Alert Handling */
		
		Alert pricingMgrAlert = driver.switchTo().alert();
	
		String pricingMgrAlertText = pricingMgrAlert.getText();
/*		String[] alertTextArr = alertText.split(" has been");
		bar= alertTextArr[0];
		System.out.println(alertTextArr[0]);
*/		
		System.out.println("Pop up message After sumbisson of Pricing to Orion: "+pricingMgrAlertText);
		
		Thread.sleep(3000);

		pricingMgrAlert.accept();/* Clicking Ok on Popup*/
		Thread.sleep(2000);
		
		/* Logout button action */
		
		logOutButton.click();
		
		Thread.sleep(2000);
		
		pricingMgrAlert.accept();
		
		Thread.sleep(2000);
		
		return new NexusHomePage();
	}

}
