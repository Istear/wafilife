package pages;

import static utilities.BaseDriver.driver;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.qameta.allure.Allure;

public class BasePage {
	public void browserSetup(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void wirteTex(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
	}
	
	public void scrollToElemnt(By loactor) {
		WebElement el = getElement(loactor);
		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("arguments[0].scrollIntoView();", el);
	}
	
	public void selectDropDown(By locator, int index) {
		//WebElement el = getElement(locator);
		Select drpDownSelect = new Select (driver.findElement(locator));
		drpDownSelect.selectByIndex(index);
	}
	
	public void searchByValue(By locator, String text){
        wirteTex(locator, text);
        getElement(locator).sendKeys(Keys.ARROW_DOWN);
        getElement(locator).sendKeys(Keys.ENTER);
    }
	
}
