package pages;

import org.openqa.selenium.By;

public class WafilifeAuthorPage extends BasePage {
	public String authorPageUrl = "https://www.wafilife.com/cat/books/author/";
	public String authorPageTwoUrl = "https://www.wafilife.com/cat/books/author/page/2/";
	public String authorPageHeader = "//h1[contains(text(),'লেখক')]";
	public By authorPageNextPage = By.xpath("//a[contains(text(),'→')]");
	public By backToAuthorPage = By.xpath("//a[@href='/cat/books/author/' and text()='ক্লিক করুন']");
	public By authorPageAuthorName = By.xpath("//h3[contains(text(),'Dr. Ahsanul Haque')]");
	public By authorPageBookName = By.xpath("//a[contains(text(),'Easy Bangla For Foregners')]");
	public By authorPageOrderButton = By.xpath("//button[text()='অর্ডার করুন']");
	public By authorPageCompleteOrderButton = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");
	
	public By checkOutName = By.xpath("//input[@id='billing_first_name']");
	public By checkOutNumber = By.xpath("//input[@id='billing_phone']");
	public By checkOutAltnum = By.xpath("//input[@id='billing_alternative_phone']");
	public By checkOutEmail = By.xpath("//input[@id='billing_email']");
	public By checkOutBillingStateDrpdwnClick = By.xpath("//span[@id='select2-billing_state-container']");
	public By checkOutBillingStateDrpdwn = By.xpath("//input[@class='select2-search__field']");
	public By checkOutBillingAreaDrpdwn = By.xpath("//select[@id='billing_area']");
	public By checkOutBillingAddressOne = By.xpath("//textarea[@id='billing_address_1']");
	public By checkOutOrderComment = By.xpath("//textarea[@id='order_comments']");
	
	

}
