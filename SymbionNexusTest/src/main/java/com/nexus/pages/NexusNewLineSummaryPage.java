package com.nexus.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nexus.util.TimeUtil;


public class NexusNewLineSummaryPage extends NexusTestBase{
	
		
	/* New Line Summary link Element*/

	@FindBy(xpath="(//a[contains(text(), 'New Line Summary')])[2]")
	WebElement newLineSummaryLink;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnSearch")
	WebElement searchExistingProductsBtn;
	

/*	
	@FindBy(xpath="(//table)[7]/tbody/tr[2]/td[12]//a[text()='Merch Form']")
	WebElement newProductLineStatus;
*/	
	/* Product Details Elements */
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_chkApplicableBranches_6")
	WebElement applicableBranchSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_drpProductMarket")
	WebElement productMarketMerchSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_txtManufacturerCode")
	WebElement manufacturerCode;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_drpOnlyNet")
	WebElement onlyNetSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_drpProfBook")
	WebElement profBookSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_drpHospBook")
	WebElement hospBookSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_drpDefenceBook")
	WebElement defenceBookSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_drpInventoryGroup")
	WebElement inventoryGroupSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_drpPbs")
	WebElement pbsSelectionMerch;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_drpCatmanGroup")
	WebElement catmanGroupSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_drpProductLine")
	WebElement productLineSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_txtRetailUnit")
	WebElement retailUnit;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_drpRetailCategory")
	WebElement retailCategorySelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_drpShelPackPick")
	WebElement shelfPackPickSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merProductDetails_drpAcqType")
	WebElement acqTypeSelection;
	
	/* Hazardous Details Elements */
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnHazadousDetails")
	WebElement hazardousDetailsTab;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merHazardousDetails_drpCDItem")
	WebElement cdItemSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_merHazardousDetails_drpPackingGroup")
	WebElement packagingGroupSelection;
	
	/* Forecasting Elements */
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnForecast")
	WebElement forecastingTab;

	@FindBy(id="ctl00_ContentPlaceHolder1_Forecasts_rptGroups_ctl01_BranchGroup_rptBranches_ctl01_txtAverage")
	WebElement supplierAvg;
	
	/* Core Shelf Pack Elements */
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnCoreShelfPack")
	WebElement coreShelfPackTab;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_CoreShelfPack_ddlCustGroup")
	WebElement custGroup;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_CoreShelfPack_txtCspQty")
	WebElement cspQty;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_CoreShelfPack_btnAdd")
	WebElement addBtn;
	
	/* Accept Product Details Elements*/
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnSaveAndAccept")
	WebElement acceptProductDetails;
	
	/* Minnimerch Status submission message */
	
	@FindBy(xpath="//*[text()[normalize-space() = 'Product Line Status History']]//parent::fieldset//tr/td[1]")
	WebElement minniemerchStatus;
	
	/* Logout button */
	@FindBy(id="ctl00_Logout")
	WebElement logOutButton;
	
	
	public NexusNewLineSummaryPage() {
		PageFactory.initElements(driver, this);
	}
	
		
	public NexusPricingSummaryPage merchantProductDetails() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		newLineSummaryLink.click();
		Thread.sleep(2000);
		searchExistingProductsBtn.click();
		Thread.sleep(2000);
/*		newProductLineStatus.click();*/
		
		NexusSupplierFormPage test = new NexusSupplierFormPage();
		
		driver.findElement(By.xpath("//td[text()='"+test.req+"']/following-sibling::td//div/a[text()='Merch Form']")).click();
		
		Thread.sleep(2000);
		
		/*Product details actions*/
		
		applicableBranchSelection.click();
		Thread.sleep(5000);
		Select prodMarketMerch = new Select(productMarketMerchSelection);
		prodMarketMerch.selectByVisibleText("Pharmacy");
		Thread.sleep(2000);
		manufacturerCode.sendKeys("BAL");
		Thread.sleep(2000);
		Select only_Net = new Select(onlyNetSelection);
		only_Net.selectByVisibleText("No");
		Thread.sleep(2000);
		Select prof_Book = new Select(profBookSelection);
		prof_Book.selectByVisibleText("No");
		Thread.sleep(2000);
		Select hosp_Book = new Select(hospBookSelection);
		hosp_Book.selectByVisibleText("No");
		Thread.sleep(2000);
		Select defence_Book = new Select(defenceBookSelection);
		defence_Book.selectByVisibleText("No");
		Thread.sleep(2000);
		Select inventory_category = new Select(inventoryGroupSelection);
		inventory_category.selectByVisibleText("2 - OTC");
		Thread.sleep(5000);
		Select pbs_merch = new Select(pbsSelectionMerch);
		pbs_merch.selectByVisibleText("No");
		Thread.sleep(2000);
		Select catman_group = new Select(catmanGroupSelection);
		catman_group.selectByVisibleText("0207B - Value Pack");
		Thread.sleep(5000);
		Select product_Line = new Select(productLineSelection);
		product_Line.selectByVisibleText("0213 - Accessories");
		Thread.sleep(2000);
		retailUnit.sendKeys("50");
		Thread.sleep(2000);
		Select retail_category = new Select(retailCategorySelection);
		retail_category.selectByVisibleText("3 - Open Seller");
		Thread.sleep(2000);
		Select shelfPackPick = new Select(shelfPackPickSelection);
		shelfPackPick.selectByVisibleText("No");
		Thread.sleep(2000);
		Select acq_type = new Select(acqTypeSelection);
		acq_type.selectByVisibleText("I - Purchase Indent");
		Thread.sleep(2000);
		
		/*Hazardous details actions*/
		hazardousDetailsTab.click();
		Thread.sleep(5000);
		Select cd_item = new Select(cdItemSelection);
		cd_item.selectByVisibleText("No");
		Thread.sleep(2000);
		Select packaging_group = new Select(packagingGroupSelection);
		packaging_group.selectByVisibleText("0 - None");
		Thread.sleep(2000);
		
		/* Forecasting Actions */
		forecastingTab.click();
		Thread.sleep(5000);
/*		supplierAvg.sendKeys("100");
		Thread.sleep(2000);
*/		
		/* Core Shelf Pack Actions */
		coreShelfPackTab.click();
		Thread.sleep(5000);
		Select cust_group = new Select(custGroup);
		cust_group.selectByVisibleText("HALLHOSP");
		Thread.sleep(2000);
		cspQty.sendKeys("50");
		Thread.sleep(2000);
		addBtn.click();
		Thread.sleep(2000);
		
		/* Accept Product Details Actions*/
		acceptProductDetails.click();
		Thread.sleep(5000);
		
		String productLineStatusMessage = minniemerchStatus.getText();
		System.out.println("Status After minniemerch submisson : "+productLineStatusMessage);
		Thread.sleep(2000);
		
		/* Logout button action */
		
		logOutButton.click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		Thread.sleep(2000);
		
		return new NexusPricingSummaryPage();
		
}

}
