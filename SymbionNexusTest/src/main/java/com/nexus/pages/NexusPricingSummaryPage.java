package com.nexus.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nexus.util.TimeUtil;

public class NexusPricingSummaryPage extends NexusTestBase{
	
	/* Pricing Summary sub-menu selection */
	Actions action = new Actions(driver);
	
	@FindBy(xpath="//a[text()='Supplier Forms']")
	WebElement supplierFormsMenu;
	
	@FindBy(xpath= "//div[text()='New Lines']")
	WebElement newLinesMenuItem;
	
	@FindBy(xpath= "//a[text()='Pricing Summary']")
	WebElement pricingSummaryMenuItem;
	
	/* Search Button Click */
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnSearch")
	WebElement searchBtn;
	
	/* Pricing Form Details*/
	
	@FindBy(id="ctl00_ContentPlaceHolder1_chkCorrectTemplateSelected")
	WebElement correctTemplateSelection;
	
	@FindBy(id= "ctl00_ContentPlaceHolder1_rptFields_ctl01_chkPriceChecked")
	WebElement itemNumberCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl06_chkPriceChecked")
	WebElement wholeSaleTypeCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl07_chkPriceChecked")
	WebElement longDescriptionCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl08_chkPriceChecked")
	WebElement inventoryGroupCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl10_chkPriceChecked")
	WebElement manufacturerCodeCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl11_chkPriceChecked")
	WebElement fridgeItemCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl16_chkPriceChecked")
	WebElement handlingIndicatorCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl19_chkPriceChecked")
	WebElement taxGroupCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl20_chkPriceChecked")
	WebElement gstFreeToPublicCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl21_chkPriceChecked")
	WebElement shortDescriptionCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl21_22_txtValue")
	WebElement shortDescriptionValue;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl22_chkPriceChecked")
	WebElement deliveryClassCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl25_chkPriceChecked")
	WebElement buyingGroupCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl25_27_ddlSelection")
	WebElement buyingGroupValue;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl26_chkPriceChecked")
	WebElement zeroCostValidCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl27_chkPriceChecked")
	WebElement marginCodeCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl28_chkPriceChecked")
	WebElement dosageFormCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl29_chkPriceChecked")
	WebElement preferredCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl30_chkPriceChecked")
	WebElement activeIngredientsCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl31_chkPriceChecked")
	WebElement dangerousGoodsClassCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl32_chkPriceChecked")
	WebElement subRiskCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl33_chkPriceChecked")
	WebElement unShippingNumberCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl34_chkPriceChecked")
	WebElement packagingCodeCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl35_chkPriceChecked")
	WebElement netWeightCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl36_chkPriceChecked")
	WebElement 	concessionalSpiritCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl37_chkPriceChecked")
	WebElement spiritClassCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl38_chkPriceChecked")
	WebElement spiritNetWeightCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl39_chkPriceChecked")
	WebElement spiritStrengthCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl42_chkPriceChecked")
	WebElement CSOReportingCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl43_chkPriceChecked")
	WebElement top1000ProductsCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl44_chkPriceChecked")
	WebElement IMSReportingCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl45_chkPriceChecked")
	WebElement 	retailPriceLabelsCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl46_chkPriceChecked")
	WebElement retailUnitsCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl47_chkPriceChecked")
	WebElement defaultMarkupCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl48_chkPriceChecked")
	WebElement retailPriceOverrideCheck;

	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl49_chkPriceChecked")
	WebElement retailOutletCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl50_chkPriceChecked")
	WebElement InventoryUOMCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl51_chkPriceChecked")
	WebElement pricingUOMCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl52_chkPriceChecked")
	WebElement costingUOMCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl53_chkPriceChecked")
	WebElement purchasingUOMCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl54_chkPriceChecked")
	WebElement productionUOMCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl55_chkPriceChecked")
	WebElement coutingUOMCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl56_chkPriceChecked")
	WebElement packSizeDescriptionCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl56_50_txtValue")
	WebElement packSizeDescriptionValue;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl57_chkPriceChecked")
	WebElement cartonSizeCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl57_21_txtValue")
	WebElement cartonSizeValue;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl58_chkPriceChecked")
	WebElement pricingShelfPackCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl58_53_txtValue")
	WebElement pricingShelfPackValue;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl59_chkPriceChecked")
	WebElement weightCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl60_chkPriceChecked")
	WebElement widthCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl61_chkPriceChecked")
	WebElement unitQtyCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl62_chkPriceChecked")
	WebElement unitsPerLayerCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl63_chkPriceChecked")
	WebElement heightCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl64_chkPriceChecked")
	WebElement depthCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl65_chkPriceChecked")
	WebElement expiryDateTrackCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl66_chkPriceChecked")
	WebElement coreShelfPacksCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl67_chkPriceChecked")
	WebElement availableForIssueCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl68_chkPriceChecked")
	WebElement batchControlCodeCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl69_chkPriceChecked")
	WebElement acquisitionTypeCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl70_chkPriceChecked")
	WebElement commentsCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl71_chkPriceChecked")
	WebElement mnpnCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl72_chkPriceChecked")
	WebElement brandCodeCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl73_chkPriceChecked")
	WebElement brandCategoryCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl74_chkPriceChecked")
	WebElement rrpCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl75_chkPriceChecked")
	WebElement 	supplierForECTurnoverOrdersCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl75_94_ddlSelection")
	WebElement 	supplierForECTurnoverOrdersValue;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl76_chkPriceChecked")
	WebElement wareHouseDetailsCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl76_167_Rpt_ctl01_ddlSupplier")
	WebElement wareHouseSupplierValue;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl77_chkPriceChecked")
	WebElement suppliersCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl77_20_Rpt_ctl01_ddlSupplier")
	WebElement suppliersSelection;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl78_chkPriceChecked")
	WebElement regulatedScheduleCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl79_chkPriceChecked")
	WebElement priceGroupCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl81_chkPriceChecked")
	WebElement onlyNetCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl82_chkPriceChecked")
	WebElement lastPriceOverrideCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl84_chkPriceChecked")
	WebElement keywordCheck;
	

	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl84_132_taMultiLineText")
	WebElement keywordValue;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl85_chkPriceChecked")
	WebElement profileCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl86_chkPriceChecked")
	WebElement shelfPackPickCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl89_chkPriceChecked")
	WebElement barCodeCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl90_chkPriceChecked")
	WebElement replaceForBulkCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl91_chkPriceChecked")
	WebElement EANUsedForEDICheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl92_chkPriceChecked")
	WebElement TUNUsedForEDICheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl93_chkPriceChecked")
	WebElement EDIPOUsingTUNCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl94_chkPriceChecked")
	WebElement 	EuropeanArticleNoCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl95_chkPriceChecked")
	WebElement additionalTUNsCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl96_chkPriceChecked")
	WebElement coreRangesCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl97_chkPriceChecked")
	WebElement forwardChargesCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl104_chkPriceChecked")
	WebElement 	availableForIssueEndDays;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl105_chkPriceChecked")
	WebElement lotTrackingCheck;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_rptFields_ctl109_chkPriceChecked")
	WebElement webPricingSuppressionCodeCheck;
	
	/* Nexus Check Click Elements*/
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnPreFlightCheck")
	WebElement neXusCheckBtn;
	
	/* Sumbit Button */
	
	@FindBy(id= "ctl00_ContentPlaceHolder1_btnSubmit")
	WebElement sumbitBtn;
	
	/* Logout button */
	@FindBy(id="ctl00_Logout")
	WebElement logOutButton;
	
/*	
	WebElement we = driver.findElement(By.xpath("//a[text()='Supplier Forms']"));
	action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//div[text()='New Lines']"))).click().build().perform();
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Pricing Summary']"))).click().build().perform();
*/
	public NexusPricingSummaryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public NexusPricingCheckSummaryPage pricingSummaryDetails() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		/* Pricing Summary sub-menu actions */
		
		action.moveToElement(supplierFormsMenu).moveToElement(newLinesMenuItem).click().build().perform();
		Thread.sleep(3000);
		action.moveToElement(pricingSummaryMenuItem).click().build().perform();
		Thread.sleep(3000);
		searchBtn.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // This  will scroll down the page by  3000 pixel vertical		
        js.executeScript("window.scrollBy(0,3000)");
		
		/* Process New Line Click on table */
		
		NexusSupplierFormPage test = new NexusSupplierFormPage();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[contains(text(),'"+test.req+"')]/following-sibling::td/a[text()='Process New Line']")).click();
		Thread.sleep(2000);
		
		/* Pricing Form actions */
		
		correctTemplateSelection.click();
		Thread.sleep(2000);
		
		itemNumberCheck.click();
		Thread.sleep(1000);
		wholeSaleTypeCheck.click();
		Thread.sleep(1000);
		longDescriptionCheck.click();
		Thread.sleep(1000);
		inventoryGroupCheck.click();
		Thread.sleep(1000);
		manufacturerCodeCheck.click();
		Thread.sleep(1000);
		fridgeItemCheck.click();
		Thread.sleep(1000);
		handlingIndicatorCheck.click();
		Thread.sleep(1000);
		taxGroupCheck.click();
		Thread.sleep(1000);
		gstFreeToPublicCheck.click();
		Thread.sleep(1000);
		shortDescriptionCheck.click();
		Thread.sleep(1000);
		shortDescriptionValue.sendKeys("Hetero Products");
		Thread.sleep(1000);
		deliveryClassCheck.click();
		Thread.sleep(1000);
		buyingGroupCheck.click();
		Thread.sleep(1000);
		Select buying_group = new Select(buyingGroupValue);
		buying_group.selectByVisibleText(prop.getProperty("buyinggroup"));
		Thread.sleep(1000);
		zeroCostValidCheck.click();
		Thread.sleep(1000);
		marginCodeCheck.click();
		Thread.sleep(1000);
		dosageFormCheck.click();
		Thread.sleep(1000);
		preferredCheck.click();
		Thread.sleep(1000);
		activeIngredientsCheck.click();
		Thread.sleep(1000);
		dangerousGoodsClassCheck.click();
		Thread.sleep(1000);
		subRiskCheck.click();
		Thread.sleep(1000);
		unShippingNumberCheck.click();
		Thread.sleep(1000);
		packagingCodeCheck.click();
		Thread.sleep(1000);
		netWeightCheck.click();
		Thread.sleep(1000);
		concessionalSpiritCheck.click();
		Thread.sleep(1000);
		spiritClassCheck.click();
		Thread.sleep(1000);
		spiritNetWeightCheck.click();
		Thread.sleep(1000);
		spiritStrengthCheck.click();
		Thread.sleep(1000);
		CSOReportingCheck.click();
		Thread.sleep(1000);
		top1000ProductsCheck.click();
		Thread.sleep(1000);
		IMSReportingCheck.click();
		Thread.sleep(1000);
		retailPriceLabelsCheck.click();
		Thread.sleep(1000);
		retailUnitsCheck.click();
		Thread.sleep(1000);
		defaultMarkupCheck.click();
		Thread.sleep(1000);
		retailPriceOverrideCheck.click();
		Thread.sleep(1000);
		retailOutletCheck.click();
		Thread.sleep(1000);
		InventoryUOMCheck.click();
		Thread.sleep(1000);
		pricingUOMCheck.click();
		Thread.sleep(1000);
		costingUOMCheck.click();
		Thread.sleep(1000);
		purchasingUOMCheck.click();
		Thread.sleep(1000);
		productionUOMCheck.click();
		Thread.sleep(1000);
		coutingUOMCheck.click();
		Thread.sleep(1000);
		packSizeDescriptionCheck.click();
		Thread.sleep(1000);
		packSizeDescriptionValue.sendKeys("EA");
		Thread.sleep(1000);
		cartonSizeCheck.click();
		Thread.sleep(1000);
		cartonSizeValue.sendKeys(prop.getProperty("cartonSize"));
		Thread.sleep(1000);
		pricingShelfPackCheck.click();
		Thread.sleep(1000);
		pricingShelfPackValue.sendKeys(prop.getProperty("pricingShelfPack"));
		Thread.sleep(1000);
		weightCheck.click();
		Thread.sleep(1000);
		widthCheck.click();
		Thread.sleep(1000);
		unitQtyCheck.click();
		Thread.sleep(1000);
		unitsPerLayerCheck.click();
		Thread.sleep(1000);
		heightCheck.click();
		Thread.sleep(1000);
		depthCheck.click();
		Thread.sleep(1000);
		expiryDateTrackCheck.click();
		Thread.sleep(1000);
		coreShelfPacksCheck.click();
		Thread.sleep(1000);
		availableForIssueCheck.click();
		Thread.sleep(1000);
		batchControlCodeCheck.click();
		Thread.sleep(1000);
		acquisitionTypeCheck.click();
		Thread.sleep(1000);
		commentsCheck.click();
		Thread.sleep(1000);
		mnpnCheck.click();
		Thread.sleep(1000);
		brandCodeCheck.click();
		Thread.sleep(1000);
		brandCategoryCheck.click();
		Thread.sleep(1000);
		rrpCheck.click();
		Thread.sleep(1000);
		supplierForECTurnoverOrdersCheck.click();
		Thread.sleep(1000);
		Select supplier_ECTurnover_Order = new Select(supplierForECTurnoverOrdersValue);
		supplier_ECTurnover_Order.selectByVisibleText(prop.getProperty("supplierForECTurnoverOrders"));
		Thread.sleep(1000);
		wareHouseDetailsCheck.click();
		Thread.sleep(1000);
		Select warehouse_supplier = new Select(wareHouseSupplierValue);
		warehouse_supplier.selectByVisibleText(prop.getProperty("warehouseSupplier"));
		Thread.sleep(1000);
		suppliersCheck.click();
		Thread.sleep(1000);
		Select supplier_selection = new Select(suppliersSelection);
		supplier_selection.selectByVisibleText(prop.getProperty("suppliers"));
		Thread.sleep(1000);
		regulatedScheduleCheck.click();
		Thread.sleep(1000);
		priceGroupCheck.click();
		Thread.sleep(1000);
		onlyNetCheck.click();
		Thread.sleep(1000);
		lastPriceOverrideCheck.click();
		Thread.sleep(1000);		
		keywordCheck.click();
		Thread.sleep(1000);
		keywordValue.sendKeys("Verification");
		Thread.sleep(1000);
		profileCheck.click();
		Thread.sleep(1000);
		shelfPackPickCheck.click();
		Thread.sleep(1000);
		barCodeCheck.click();
		Thread.sleep(1000);
		replaceForBulkCheck.click();
		Thread.sleep(1000);
		EANUsedForEDICheck.click();
		Thread.sleep(1000);
		TUNUsedForEDICheck.click();
		Thread.sleep(1000);
		EDIPOUsingTUNCheck.click();
		Thread.sleep(1000);
		EuropeanArticleNoCheck.click();
		Thread.sleep(1000);
		additionalTUNsCheck.click();
		Thread.sleep(1000);
		coreRangesCheck.click();
		Thread.sleep(1000);
		forwardChargesCheck.click();
		Thread.sleep(1000);
		availableForIssueEndDays.click();
		Thread.sleep(1000);
		lotTrackingCheck.click();
		Thread.sleep(1000);
		webPricingSuppressionCodeCheck.click();
		Thread.sleep(2000);
		
		neXusCheckBtn.click();
		Thread.sleep(5000);
		
		sumbitBtn.click();
		Thread.sleep(10000);
		
		Alert pricingAlert = driver.switchTo().alert();
	
		String pricingAlertText = pricingAlert.getText();
/*		String[] alertTextArr = alertText.split(" has been");
		bar= alertTextArr[0];
		System.out.println(alertTextArr[0]);
*/		
		System.out.println("Pop up message After sumbisson to Pricing : "+pricingAlertText);
		
		Thread.sleep(3000);

		pricingAlert.accept();/* Clicking Ok on Popup*/
		Thread.sleep(2000);
		
		/* Logout button action */
		
		logOutButton.click();
		
		Thread.sleep(2000);
		
		pricingAlert.accept();
		
		Thread.sleep(2000);
		
		return new NexusPricingCheckSummaryPage();
	}
	
}
