package in.amazon.teststeps;

import org.openqa.selenium.chrome.ChromeDriver;

import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;

public class Driver extends Tools {
	protected static LandingPage landingpage;
	protected static AllMobileBrands allMobileBrands;
	protected static ApplePhones applePhones;
	protected static BuyPhone buyPhone;
	protected static SignIn signin;
	public static void init()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		landingpage=new LandingPage(driver);
		allMobileBrands=new AllMobileBrands(driver);
		applePhones =new ApplePhones (driver);
		buyPhone =new BuyPhone (driver);
		signin=new SignIn(driver);
	}


}
