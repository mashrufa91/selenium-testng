package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testngmodel.PhpmodelpgHw2;


public class phptsng {
	
	WebDriver driver;
	PhpmodelpgHw2 PM;
	
@BeforeTest
	
	public void setupTest() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajid\\Downloads\\chromedriver.exe");
	 driver = new ChromeDriver();	
	 PM=new PhpmodelpgHw2 (driver);
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
public void endtest() {
	

	driver.quit();
	
}

@Test  (priority=0)
public void enablefirstname() {
	
	boolean x= PM.getFirstName().isEnabled();
	Assert.assertTrue(x);

}
@Test  (priority=1)
	public void enablelastname() {
			
	boolean x= PM.getlastName().isEnabled();
	
	Assert.assertTrue(x);

}
    
      

@Test  (priority=2)
public void enableemail() {
	boolean x=PM.getemail().isEnabled();
	

	Assert.assertTrue(x);


}

@Test (priority=3)
public void enablepassword() {	

	boolean x=PM.getpassword().isEnabled();
	Assert.assertTrue(x);

}
@Test (priority=4)
public void enableconfirmpassword() {
	boolean x=PM.getconfirmPassword().isEnabled();
	
	Assert.assertTrue(x);
}

@Test (priority=5)
public void enablemobileNumber() {
	
	boolean x=PM.getmobileNumber().isEnabled();
	Assert.assertTrue(x);
}
@Test (priority=6)
public void enablesignup() {
	
	boolean x=PM.getsignUp().isEnabled();
	Assert.assertTrue(x);
}



}
	

