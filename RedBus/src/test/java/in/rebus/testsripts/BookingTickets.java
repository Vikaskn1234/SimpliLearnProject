package in.rebus.testsripts;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import in.redbus.pages.LandingPage;

public class BookingTickets extends BaseTest{

	

	@Test
	public void SearchPlace(){
	LandingPage redbus_Homepage=new LandingPage(driver);
	redbus_Homepage.clickfromPlace("Davanagere");
	redbus_Homepage.clickdestPlace("Banglore");
	redbus_Homepage.clickcalender();
	redbus_Homepage.clickDate();
	redbus_Homepage.ClickSearchBtn();
	}


	
	}
	


