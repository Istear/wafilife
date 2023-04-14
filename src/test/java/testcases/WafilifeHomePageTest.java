package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.WafilifeAuthorPage;
import pages.WafilifeHomePage;
import utilities.BaseDriver;
@Test
public class WafilifeHomePageTest extends BaseDriver {
	WafilifeHomePage wafilifeHomePage =  new WafilifeHomePage();
	WafilifeAuthorPage wafilifeAuthorPage = new WafilifeAuthorPage();
	@Test (description = "Test if the site load properly and the author button works properly.")
	public void testSiteLoading() {
		wafilifeHomePage.browserSetup();
		driver.get(wafilifeHomePage.homePageUrl);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wafilifeHomePage.clickOnElement(wafilifeHomePage.homePageLekhokClick);
		WebElement header = driver.findElement(By.xpath(wafilifeAuthorPage.authorPageHeader)) ;
		Assert.assertTrue(header.isDisplayed());
	}
}
