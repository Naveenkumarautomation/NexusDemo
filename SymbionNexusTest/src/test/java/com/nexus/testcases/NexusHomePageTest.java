package com.nexus.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nexus.pages.NexusHomePage;
import com.nexus.pages.NexusLoginPage;
import com.nexus.pages.NexusTestBase;

public class NexusHomePageTest extends NexusTestBase {
	
	NexusLoginPage loginPage;
	NexusHomePage homePage;
	
	public NexusHomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		loginPage = new NexusLoginPage();
		homePage = loginPage.loginSupplier(prop.getProperty("usernamesupplier"), prop.getProperty("password"));
}
	
	@Test	
	public void newLineSubmissonSelection() throws InterruptedException {
		homePage.newLineSubmissionClick();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
