package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplePhones {
	

	@FindBy(xpath="(//div[contains(@class, 'card-container')])[2]")
	private WebElement firstMobiles;
	public ApplePhones(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickFirstMobile()
	{
		firstMobiles.click();
	}

}
