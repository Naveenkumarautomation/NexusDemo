package com.nexus.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.nexus.util.TimeUtil;

public class NexusTestBase {
	
	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriver driver;
	static String driverPath = "C:\\SeleniumWebDrivers\\ChromeDriver\\ChromeDriver.exe";
	
	public static void Home_Page_Launch() throws IOException, InterruptedException{
		
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\DELL\\git\\NexusDemo\\SymbionNexusTest\\src\\main\\java\\com\\nexus\\config\\Config.Properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser") ;
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		} 
		else { 
			System.out.println("No browser is returned");
		   }

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TimeUtil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get(prop.getProperty("url"));
		Thread.sleep(5000);
		String expectedTitle = "Symbion neXus";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

}
	public static void main(String[] args) throws IOException, InterruptedException 
    { 
		Home_Page_Launch();
    } 
	

}
