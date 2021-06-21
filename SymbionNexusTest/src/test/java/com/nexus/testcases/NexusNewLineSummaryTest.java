package com.nexus.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nexus.pages.NexusHomePage;
import com.nexus.pages.NexusLoginPage;
import com.nexus.pages.NexusNewLineSummaryPage;
import com.nexus.pages.NexusSupplierFormPage;
import com.nexus.pages.NexusTestBase;

public class NexusNewLineSummaryTest extends NexusTestBase{
	
	NexusLoginPage loginPage;
	NexusHomePage homePage;
	NexusSupplierFormPage supplierForm;
	NexusNewLineSummaryPage newLineSummary;
	
	public NexusNewLineSummaryTest() {
		super();
	}
	
		
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		
}
		
	@Test
	public void newLineSummary() throws InterruptedException {
		loginPage = new NexusLoginPage();
		homePage = loginPage.loginSupplier(prop.getProperty("usernamesupplier"), prop.getProperty("password"));
		homePage.newLineSubmissionClick();
		Thread.sleep(2000);
		supplierForm = new NexusSupplierFormPage();
		supplierForm.supplierDetails(); 
		Thread.sleep(2000);
		homePage = loginPage.loginSupplier(prop.getProperty("usernameminniemerch"), prop.getProperty("password"));
		Thread.sleep(2000);
		newLineSummary = new NexusNewLineSummaryPage();
		newLineSummary.merchantProductDetails();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
