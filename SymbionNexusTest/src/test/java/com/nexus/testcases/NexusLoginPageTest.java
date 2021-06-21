package com.nexus.testcases;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nexus.pages.NexusHomePage;
import com.nexus.pages.NexusLoginPage;
import com.nexus.pages.NexusTestBase;

public class NexusLoginPageTest extends NexusTestBase{
	
	public static NexusLoginPage loginPage;
	NexusHomePage homePage;
		
	public NexusLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		loginPage = new NexusLoginPage();
		
	}
	
	@Test(enabled=false)
	public void loginTest() throws InterruptedException {
				
		homePage = loginPage.loginSupplier(prop.getProperty("usernamesupplier"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
