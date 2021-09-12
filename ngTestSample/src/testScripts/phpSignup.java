package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testngmodel.PhpmodelpgHw2;

public class phpSignup {
	
	
	WebDriver driver;
	PhpmodelpgHw2 PM;
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajid\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		PM= new PhpmodelpgHw2(driver);
		 driver.get("https://www.phptravels.net/register");
		 
		 String url= driver.getCurrentUrl();
		 String title = driver.getTitle();
		 System.out.println(url);
		 System.out.println(title);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}
	
	
	
	@AfterTest
	public void endTest() {
		
	driver.quit();
		
		
	}
	
	
	
	@Test
	public void getSignup() throws InterruptedException {
		
		
		

		String firstname= "John";
		String lastname= "Michael";
		String email= "Johnmichael235";
		String password= "John13345";
		String confirmpassword= "John13345";
		String phone="5714570854";
		;	
		
		
		PM.getFirstName().sendKeys(firstname);
		PM.getlastName().sendKeys(lastname);
		PM.getemail().sendKeys(email);
		PM.getpassword().sendKeys(password);
		PM.getconfirmPassword().sendKeys(confirmpassword);
		PM.getmobileNumber().sendKeys(phone);
	    String signup= PM.getsignUp().getText();
	    System.out.println(signup);
		 Thread.sleep(1000);
			
}
}