package seleniumHW2ModelPg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooCreatepg {
	
	WebDriver driver;
	
	public YahooCreatepg (WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getFirstName (){
		
		
      WebElement x= driver.findElement(By.id("usernamereg-firstName"));
		
		return x;
		
		
	}
	
	
	public WebElement getLastName () {
		
	WebElement x= driver.findElement(By.id ("usernamereg-lastName"));
	return x;
		
		
	}
	
	
	public WebElement getemail () {
		
		WebElement x= driver.findElement(By.id ("usernamereg-yid"));
		return x;
			
			
		}	
public WebElement getdomai () {
		
		WebElement x= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/form/div[1]/div[1]/p"));
		return x;
			
			
		}	
 public WebElement getpassword () {
		
		WebElement x= driver.findElement(By.id ("usernamereg-password"));
		return x;
			
			
		}	
	
public WebElement getmobile () {
	
	WebElement x= driver.findElement(By.name ("phone"));
	return x;
		
		
	}	

public WebElement getMonth () {
	
	WebElement x= driver.findElement(By.id ("usernamereg-month"));
	return x;
		
		
	}	

	
public WebElement getDay () {
	
	WebElement x= driver.findElement(By.id ("usernamereg-day"));
	return x;
		
		
	}	

public WebElement getYear () {
	
	WebElement x= driver.findElement(By.id ("usernamereg-year"));
	return x;
		
		
	}	


public WebElement getGender () {
	
	WebElement x= driver.findElement(By.name ("freeformGender"));
	return x;
		
		
	}	

public WebElement getcontinue () {
	
	WebElement x= driver.findElement(By.id ("reg-submit-button"));
	return x;
		
		
	}	
}
