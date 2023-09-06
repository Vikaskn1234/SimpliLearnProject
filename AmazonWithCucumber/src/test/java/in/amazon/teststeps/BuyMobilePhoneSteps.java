package in.amazon.teststeps;

import java.util.ArrayList;



import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyMobilePhoneSteps extends Driver {
	
	@Given("a user is on landing page")
	public void a_user_is_on_landing_page() {
		//Long Form
//		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
//		String actualTitle=driver.getTitle();
//		Assert.assertEquals(actualTitle, expectedTitle);
//		
		//ShortForm
		Assert.assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	
	}

	@When("he clicks on Mobiles in the navigator bar")
	public void he_clicks_on_mobiles_in_the_navigator_bar() {
		
		landingpage.clickMobiles();
	    
	}

	@When("he hovers the pointer over Mobiles & Accessories")
	public void he_hovers_the_pointer_over_mobiles_accessories() {
		
		allMobileBrands.hoverOverMobileAndAccessories();
	}

	@When("he clicks on Apple in the sub-menu")
	public void he_clicks_on_apple_in_the_sub_menu() {
		
		allMobileBrands.clickApple();
	    
	}

	@When("he clicks on the second available phone")
	public void he_clicks_on_the_second_available_phone() {
		
		applePhones.clickFirstMobile();
	}

	@When("he switches focus on the new tab")
	public void he_switches_focus_on_the_new_tab() {
	    ArrayList<String > tabs=new ArrayList<>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	}

	@When("he clicks on Buy Now button")
	public void he_clicks_on_buy_now_button() {
		
		buyPhone.clickBuynowBtn();
	}

	@Then("he must be able to purchase the mobile phone sucessfully.")
	public void he_must_be_able_to_purchase_the_mobile_phone_sucessfully() {
		
		String expetedText="Sign in";
		String ActalText=signin.getSignInText();
		Assert.assertEquals(ActalText, expetedText);
	}


}
