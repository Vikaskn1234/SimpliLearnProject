package in.amazon.teststeps;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class VerifyErrorMessageSteps  extends Driver{
	
	
	@Given("a user is in landing page")
	public void a_user_is_in_landing_page() {
	    
	}

	@When("he hover the pointer over Hello Sign-in menu")
	public void he_hover_the_pointer_over_hello_sign_in_menu() {
		
		landingpage.hoverOverHelloSignInMenu();
	}

	@When("he clicks on Sign-in button in the sub menu")
	public void he_clicks_on_sign_in_button_in_the_sub_menu() {
		
		landingpage.clickSignInBtn();
	}

	@When("he enters invalid email address in the Email text-box")
	public void he_enters_invalid_email_address_in_the_email_text_box() {
		
		signin.enterEmail("batsman554466@gmail.com");
	}

	@When("he clicks on continue button")
	public void he_clicks_on_continue_button() {
		
		signin.clickcontinueBtn();
	}

	@Then("he must see the error message-{string}")
	public void he_must_see_the_error_message(String string) {
		
		String expectedErrMsg="We cannot find an account with that email address";
		String actualErrmsg=signin.getErrMsg();
		Assert.assertEquals(actualErrmsg, expectedErrMsg);
		
		
	}
	
	@When("he enters an invalid email address {string} in the Email text box")
	public void he_enters_an_invalid_email_address_in_the_email_text_box(String string) {
	    signin.enterEmail(string);
	}

}
