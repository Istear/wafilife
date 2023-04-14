package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.WafilifeAuthorPage;
import pages.WafilifeHomePage;
import utilities.BaseDriver;

public class WafilifeAuthorPageTest extends BaseDriver {
	WafilifeHomePage wafilifeHomePage =  new WafilifeHomePage();
	WafilifeAuthorPage wafilifeAuthorPage =  new WafilifeAuthorPage();
	
	
	
	@Test (description = "Test if the scrolling and next page button works properly in author page.")
	public void testAuthorPageScrolling() {
		wafilifeHomePage.browserSetup();
		driver.get(wafilifeAuthorPage.authorPageUrl);
		wafilifeAuthorPage.scrollToElemnt(wafilifeAuthorPage.authorPageNextPage);
		wafilifeAuthorPage.clickOnElement(wafilifeAuthorPage.authorPageNextPage);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test (description = "Test if the Click Korun link works properly.")
	public void testClickLink() {
		wafilifeHomePage.browserSetup();
		driver.get(wafilifeAuthorPage.authorPageTwoUrl);
		wafilifeAuthorPage.clickOnElement(wafilifeAuthorPage.backToAuthorPage);
		WebElement header = driver.findElement(By.xpath(wafilifeAuthorPage.authorPageHeader)) ;
		Assert.assertTrue(header.isDisplayed());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test (description = "Test if all the input in checkout info page working properly.")
	public void testOrderInfoInput() {
		wafilifeHomePage.browserSetup();
		driver.get(wafilifeAuthorPage.authorPageUrl);
		wafilifeAuthorPage.clickOnElement(wafilifeAuthorPage.authorPageAuthorName);
		wafilifeAuthorPage.clickOnElement(wafilifeAuthorPage.authorPageBookName);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wafilifeAuthorPage.clickOnElement(wafilifeAuthorPage.authorPageOrderButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wafilifeAuthorPage.clickOnElement(wafilifeAuthorPage.authorPageCompleteOrderButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wafilifeAuthorPage.wirteTex(wafilifeAuthorPage.checkOutName, "ABC Ahmed");
		wafilifeAuthorPage.wirteTex(wafilifeAuthorPage.checkOutNumber, "11111111111");
		wafilifeAuthorPage.wirteTex(wafilifeAuthorPage.checkOutAltnum, "11111111112");
		wafilifeAuthorPage.wirteTex(wafilifeAuthorPage.checkOutEmail, "abc@email.com");
		wafilifeAuthorPage.clickOnElement(wafilifeAuthorPage.checkOutBillingStateDrpdwnClick);
		wafilifeAuthorPage.searchByValue(wafilifeAuthorPage.checkOutBillingStateDrpdwn, "Dhaka");
		wafilifeAuthorPage.selectDropDown(wafilifeAuthorPage.checkOutBillingAreaDrpdwn, 2);
		wafilifeAuthorPage.wirteTex(wafilifeAuthorPage.checkOutBillingAddressOne, "Merul Badda, Dhaka-1212");
		wafilifeAuthorPage.wirteTex(wafilifeAuthorPage.checkOutOrderComment, "Bhuiyan Bari");
		wafilifeAuthorPage.takeScreenShot("Order Info");
		
	}
}
