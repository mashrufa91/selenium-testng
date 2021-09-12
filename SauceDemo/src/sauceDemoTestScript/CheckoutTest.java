package sauceDemoTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SauceDemoPages.InventoryPage;
import SauceDemoPages.LoginPage;
import SauceDemoPages.checkoutPage;

public class CheckoutTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajid\\Downloads\\chromedriver.exe");
		
		// create a object of the webdriver class and open up the browser 

	WebDriver driver = new ChromeDriver();
	LoginPage lp= new LoginPage(driver);
InventoryPage ivp= new InventoryPage(driver);
		checkoutPage cp = new checkoutPage(driver);	
		// navigate to the url

	 driver.get("https://www.saucedemo.com");
	 
	 String url= driver.getCurrentUrl();
	 String title = driver.getTitle();
	 System.out.println(url);
	 System.out.println(title);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	lp.getUserId().sendKeys("standard_user");
	lp.getpassword().sendKeys("secret_sauce");
	lp.getLoginButton().click();
  String BackPack=  ivp.getBackPackText().getText();
  System.out.println(BackPack);
  String backpackPrice=ivp.getSauceBackPrice().getText();
	System.out.println(backpackPrice);
	ivp.getBackpackToCart().click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 String  BikeLight=ivp.getLightText().getText();
 System.out.println(BikeLight);
 String lightPrice=	ivp.getLightPrice().getText();
 System.out.println(lightPrice);
	ivp.getLightToCart().click();
	Thread.sleep(1000);
	ivp.getCart().click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	cp.getcheckOutPageText().click();
	cp.getFirstName().sendKeys("John");
	cp.getLastName().sendKeys("Keats");
	cp.getPostalCode().sendKeys("22003");
	Thread.sleep(1000);
	cp.getContinueButton().click();
	Thread.sleep(2000);
	cp.getFinishButton().click();
	}

}
