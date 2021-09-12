package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testngmodel.YahooCreatepg;


public class yahooTstng {
	
WebDriver driver;
YahooCreatepg Yl;


@BeforeTest
	
	public void setupTest() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajid\\Downloads\\chromedriver.exe");
	 driver = new ChromeDriver();	
	 Yl=new YahooCreatepg(driver);
	 driver.get("https://login.yahoo.com/account/create");
	 
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






@Test	
public void validateLoginElements() throws InterruptedException {
	
	String firstname= "John";
	String lastname= "Michael";
	String email= "Johnmichael235";
	String password= "John13345";
	String phone="5714570854";
	String day="9";
	
	Yl.getFirstName().sendKeys(firstname);
	Yl.getLastName().sendKeys(lastname);
	Yl.getemail().sendKeys(email);
    Yl.getpassword().sendKeys(password);
	Yl.getmobile().sendKeys(phone);
	Yl.getDay().sendKeys(day);
	Thread.sleep(1000);
	
	Yl.getYear().sendKeys("1991");
WebElement birthmonth= Yl.getMonth();
	Select bm= new Select (birthmonth);
	bm.selectByVisibleText("July");
	String signup =Yl.getcontinue().getText();
	Thread.sleep(1000);
	
	 System.out.println(signup);
	 Thread.sleep(1000);
		
	
	
}
	
	
	
	

}
