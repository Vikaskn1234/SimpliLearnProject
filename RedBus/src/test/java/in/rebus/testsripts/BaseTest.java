package in.rebus.testsripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	@BeforeTest	
	public void LaunchApplication(){
		ChromeOptions options=new ChromeOptions();
       options.addArguments("--disable-notifications");	
//		1.	Open the browser
		 driver= new ChromeDriver(options);
		 
//		2.	Maximize it
		driver.manage().window().maximize();
		
//		3.	Navigate to https://www.amazon.in/
		driver.get( "https://www.redbus.in/");
		
	}
	
	@AfterTest
	public void CloseBrowser(){
	driver.quit();		
	}
}
