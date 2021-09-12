package seleniumtEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// setting up the properties for browser 
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajid\\Downloads\\chromedriver.exe");
		
	// create a object of the webdriver class and open up the browser 

WebDriver driver = new ChromeDriver();

		
	// navigate to the url

 driver.get("https://login.yahoo.com/account/create");
 
 String url= driver.getCurrentUrl();
 String title = driver.getTitle();
 System.out.println(url);
 System.out.println(title);
 
  
 
 
WebElement firstNameText=driver.findElement(By.id("usernamereg-firstName"));
WebElement lastName=driver.findElement(By.id("usernamereg-lastName"));
WebElement email=driver.findElement(By.id("usernamereg-yid"));

WebElement password=  driver.findElement(By.id("usernamereg-password"));
WebElement phone=	driver.findElement(By.id("uusernamereg-phone"));
WebElement day= driver.findElement(By.id("usernamereg-day"));
WebElement year=	driver.findElement(By.id("usernamereg-year"));
	
	
	
	
	//drop down
	
	WebElement ccd= driver.findElement(By.name("shortCountryCode"));
	WebElement month= driver.findElement(By.id("usernamereg-month"));
	
	
	//submit button
	
	driver.findElement(By.name("signup"));
	
	firstNameText.sendKeys("Jessica");
	 lastName.sendKeys("Paul");
	 email.sendKeys("michael.jordan1265");
	 password.sendKeys("Jessica749");
     phone.sendKeys("5714570189");
     day.sendKeys("28");
     year. sendKeys("1990");
		
//drop down
     Select ccd

	driver.findElement(By.name("shortCountryCode"));
	driver.findElement(By.id("usernamereg-month"));
	
	
	//submit button
	
	driver.findElement(By.name("signup"));
		
	
	
	
}

	
	}

