package in.redbus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	     @FindBy(id="src")
		private WebElement fromPlace;
		
		@FindBy(id="dest")
		private WebElement destPlace;
		
		@FindBy(id="onwardCal")
		private WebElement calenderClick;
		
		@FindBy(css="#onwardCal > div > div.sc-jzJRlG.dPBSOp > div > div > div:nth-child(3) > div:nth-child(6) > span > div:nth-child(1)")
		private WebElement DateClick;

		@FindBy(xpath="//button[contains(@id, 'search_button')]")
		private WebElement SearchBtnClick;	
		

	public  LandingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}


	public void clickfromPlace(String string) {
		fromPlace.sendKeys(string);
	}
	public void clickdestPlace(String text) {
		destPlace.sendKeys(text);
	}
	public void clickcalender() {
		calenderClick.click();
	}

	public void clickDate() {
		DateClick.click();
	}

	public void ClickSearchBtn() {
		SearchBtnClick.click();
	}

	}
	
	


