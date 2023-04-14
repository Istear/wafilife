package pages;

import org.openqa.selenium.By;

public class WafilifeHomePage extends BasePage {
	public String homePageUrl = "https://www.wafilife.com/";
	public By homePageLekhokClick = By.xpath("//span[@class='menu-label-level-0' and text()='লেখক']");
}
