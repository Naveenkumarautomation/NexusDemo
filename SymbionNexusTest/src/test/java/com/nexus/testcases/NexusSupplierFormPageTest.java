package com.nexus.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nexus.pages.NexusHomePage;
import com.nexus.pages.NexusLoginPage;
import com.nexus.pages.NexusSupplierFormPage;
import com.nexus.pages.NexusTestBase;

public class NexusSupplierFormPageTest extends NexusTestBase{
	
	NexusLoginPage loginPage;
	NexusHomePage homePage;
	NexusSupplierFormPage supplierForm;
	
	public NexusSupplierFormPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		loginPage = new NexusLoginPage();
		homePage = loginPage.loginSupplier(prop.getProperty("usernamesupplier"), prop.getProperty("password"));
		supplierForm = new NexusSupplierFormPage();
}
		
	@Test(enabled=false)
	public void newLineSubmissonSelection() throws InterruptedException {
		homePage.newLineSubmissionClick();
		Thread.sleep(2000);
		supplierForm.supplierDetails();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
