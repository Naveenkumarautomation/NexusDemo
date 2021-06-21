package com.nexus.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nexus.util.TimeUtil;

public class NexusSupplierFormPage extends NexusTestBase {
	
	static String req;
	
	/* Basic Info Elements*/
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_drpNewProductOrReplacement")
	WebElement productSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_drpProductMarket")
	WebElement productMarketSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_txtProductDesc")
	WebElement productDesc;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_ddDrugSchedule")
	WebElement drugSchedule;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_ddSpecialDrug")
	WebElement RegSchedule;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_drpPbs")
	WebElement pbsSelectionSupplier;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_txtStartPrice")
	WebElement startPrice;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_txtWholesaleDiscount")
	WebElement warehouseAllowance;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_ddGSTCode")
	WebElement gstCode;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_txtMinPurchaseQty")
	WebElement minPurchaseQty;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_ddFridgeCode")
	WebElement fridgeCode;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_txtRRP")
	WebElement rrpValue;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_drpExpiry")
	WebElement expirySelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupBasicInfo_ddUnitOfMeasure")
	WebElement unitOfMeasureSelection;
	
	/* Unit/Measure Elements*/
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnMeasure")
	WebElement unitOrMeasureTab;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupMeasurementUnitPack_txtSupProductNo")
	WebElement supplierProdNumber;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupMeasurementUnitPack_txtEAN")
	WebElement eanNumber;
	
	/* Hazard Elements*/
	@FindBy(id="ctl00_ContentPlaceHolder1_btnHazard")
	WebElement hazardTab;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupHazard_drpIsHazardous")
	WebElement hazardItemSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupHazard_chkAuthMsg")
	WebElement chkAuthCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupHazard_drpConsessionalSpirit")
	WebElement concessionalSpiritSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupHazard_drpIsCytotoxic")
	WebElement cytotoxicItemSelection;
	
	/* Forecast Elements*/
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnForecast")
	WebElement foreCastTab;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupForecast_txtAvailabilityDate")
	WebElement productAvailabilityDate;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupForecast_txtForecastSA")
	WebElement avgPerMonth;
	
	/* RangeDetails Elements*/
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnRangeDeals")
	WebElement rangeDetailsTab;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_SupRangeDeals_drpParticipateInRangeDeals")
	WebElement participateInAvailableRangeDeals;
	
	/*Submit Product to Symbion Button Element*/
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnSubmitToSymbion")
	WebElement submitProductToSymbion;
	
	/* Symbion Status submission message */

	
	@FindBy(xpath="(//table)[7]/tbody/tr/td[1]")
	WebElement newProductLineStatus;
	
	/* Logout button */
	@FindBy(id="ctl00_Logout")
	WebElement logOutButton;
	
	
	public NexusSupplierFormPage() {
		PageFactory.initElements(driver, this);
	}
	
		
	public NexusNewLineSummaryPage supplierDetails() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		/* Basic Info Actions*/
		Select New_Replacement = new Select(productSelection);
		New_Replacement.selectByVisibleText("New Product");
		Thread.sleep(2000);
		Select prodMarketSupplier = new Select(productMarketSelection);
		prodMarketSupplier.selectByVisibleText("Pharmacy");
		Thread.sleep(2000);
		productDesc.sendKeys("Hetero Injection");
		Thread.sleep(2000);
		Select drugSch = new Select(drugSchedule);
		drugSch.selectByVisibleText("X - None");
		Thread.sleep(2000);
		Select regSch = new Select(RegSchedule);
		regSch.selectByVisibleText("None - Not applicable");
		Thread.sleep(2000);
		Select pbsCheck = new Select(pbsSelectionSupplier);
		pbsCheck.selectByVisibleText("No");
		Thread.sleep(2000);
		startPrice.sendKeys("150");
		Thread.sleep(2000);
		warehouseAllowance.sendKeys("5");
		Thread.sleep(2000);
		Select gstSelection = new Select(gstCode);
		gstSelection.selectByVisibleText("2 - Always GST Free");
		Thread.sleep(2000);
		minPurchaseQty.sendKeys("10");
		Thread.sleep(2000);
		Select fridgeCodeSelection = new Select(fridgeCode);
		fridgeCodeSelection.selectByVisibleText("N - No Temp Control");
		Thread.sleep(2000);
		rrpValue.sendKeys("175");
		Thread.sleep(2000);
		Select expiry = new Select(expirySelection);
		expiry.selectByVisibleText("No");
		Thread.sleep(2000);
		Select unitOfMeasure = new Select(unitOfMeasureSelection);
		unitOfMeasure.selectByVisibleText("EA - Each");
		Thread.sleep(2000);
		
		/* Unit/Measure Actions*/
		unitOrMeasureTab.click();
		Thread.sleep(5000);
		supplierProdNumber.sendKeys("HET744");
		Thread.sleep(2000);
		eanNumber.sendKeys(prop.getProperty("EAN"));
		Thread.sleep(2000);
		
		/* Hazard Actions*/
		hazardTab.click();
		Thread.sleep(5000);
		Select isHazardItem = new Select(hazardItemSelection);
		isHazardItem.selectByVisibleText("No");
		Thread.sleep(2000);
		chkAuthCheck.click();
		Thread.sleep(2000);
		Select isConcessionalSpirit  = new Select(concessionalSpiritSelection);
		isConcessionalSpirit.selectByVisibleText("No");
		Thread.sleep(2000);
		Select isCytotoxicItem = new Select(cytotoxicItemSelection);
		isCytotoxicItem.selectByVisibleText("No");
		Thread.sleep(2000);
		
		/* Forecast Elements*/
		foreCastTab.click();
		Thread.sleep(5000);
		productAvailabilityDate.sendKeys("11/06/2021");
		Thread.sleep(2000);
		avgPerMonth.sendKeys("100");
		Thread.sleep(2000);
		
		/* Range Details Elements*/
		rangeDetailsTab.click();
		Thread.sleep(5000);
		Select participateInAvailableRangeDealsSelection = new Select(participateInAvailableRangeDeals);
		participateInAvailableRangeDealsSelection.selectByVisibleText("No");
		Thread.sleep(2000);
		
		/*Submit Product to Symbion Button Action*/
		
		submitProductToSymbion.click();
		
		Thread.sleep(10000);
		
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		String[] alertTextArr = alertText.split(" has been");
		req= alertTextArr[0];
		System.out.println(alertTextArr[0]);
		
		System.out.println("Pop up message After sumbisson to Symbion: "+alertText);
		
		Thread.sleep(3000);

		alert.accept();/* Clicking Ok on Popup*/
		Thread.sleep(2000);
		
		/* Symbion Status submission message display */
		
		String statusMessage = newProductLineStatus.getText();
		System.out.println("Status After sumbisson to Symbion: "+statusMessage);

		/* Logout button action */
		
		logOutButton.click();
		
		Thread.sleep(2000);
		
		alert.accept();
		
		Thread.sleep(2000);
		
		return new NexusNewLineSummaryPage();

	}

}
