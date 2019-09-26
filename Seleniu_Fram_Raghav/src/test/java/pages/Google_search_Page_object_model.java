package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_search_Page_object_model {
	WebDriver driver = null;
	@FindBy(name= "q")
	WebElement test_search;
	
	@FindBy(xpath ="//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")
	WebElement button_search;
	
	@FindBy(linkText = "Images")
   WebElement imag;
	
	
	public Google_search_Page_object_model(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setTestinSearchBox(String text) {
		test_search.sendKeys(text);
		
	}
	
	public void clickButton () {
	button_search.sendKeys(Keys.RETURN);
	}
	
	public void linkClick () {
		imag.click();
		}

}
