package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import testngmodel.automodelpg;

public class automationTsng {

WebDriver driver;
automodelpg auto;

@BeforeMethod
public void getbeforeEachTest() {
	
driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");	
	
};



@BeforeTest

public void setupTest() throws InterruptedException {
	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajid\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
			
		auto= new automodelpg(driver);
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		 
		 String url= driver.getCurrentUrl();
		 String title = driver.getTitle();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 System.out.println(url);
		 System.out.println(title);
		 
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
	
}

@AfterTest

public void EndTest() {

	driver.quit();
	
}


@Test (priority=0)	
public void getspecial() {

auto.getspecials().click();
String exepectedResult = "http://automationpractice.com/index.php?controller=prices-drop"; 

String actualResult = driver.getCurrentUrl();

Assert.assertEquals(exepectedResult, actualResult);
}


@Test(priority=1)
public void getnewproducts() {
auto.getnewproducts().click(); 	
String exepectedResult = "http://automationpractice.com/index.php?controller=new-products";
String actualResult = driver.getCurrentUrl();

Assert.assertEquals(exepectedResult, actualResult);
}
	

	
@Test(priority=2)
public void getbestSellers() {

auto.getbestsellers().click();
String exepectedResult = "http://automationpractice.com/index.php?controller=best-sales";
String actualResult = driver.getCurrentUrl();

Assert.assertEquals(exepectedResult, actualResult);
}	

@Test(priority=3)
public void getourStores() {
auto.getourstores();
String exepectedResult = "http://automationpractice.com/index.php?controller=authentication&back=my-account";	
String actualResult = driver.getCurrentUrl();
Assert.assertEquals(exepectedResult, actualResult);
}

@Test (priority=4)
public void getContactus() {
auto.getcontactus().click();	
String exepectedResult = "Contact us - My Store";
String actualResult = driver.getTitle();

Assert.assertEquals(exepectedResult, actualResult);	
}
@Test (priority=5)
public void getTermsandCondition() {

auto.gettermsncond().click();
String exepectedResult = "Terms and conditions of use - My Store";
String actualResult = driver.getTitle();

Assert.assertEquals(exepectedResult, actualResult);		
	
}
	
@Test (priority=6)
public void getaboutUs() {

auto.getaboutUs().click();	
String exepectedResult = "http://automationpractice.com/index.php?id_cms=4&controller=cms";
String actualResult = driver.getCurrentUrl();

Assert.assertEquals(exepectedResult, actualResult);		
}	
@Test (priority=7)
public void getSiteMap() {
	
auto.getsitemap().click();
String exepectedResult = "Sitemap - My Store";
String actualResult = driver.getTitle();

Assert.assertEquals(exepectedResult, actualResult);		

}
}
