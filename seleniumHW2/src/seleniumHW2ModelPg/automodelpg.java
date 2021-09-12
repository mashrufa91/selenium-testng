package seleniumHW2ModelPg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automodelpg {

		

		WebDriver driver;
		//Constructor created
		
		public automodelpg(WebDriver driver) {
			
			this.driver=driver;
			
			
		}
		
	
		
		public WebElement getspecials() {
		
		WebElement x= driver.findElement(By.linkText("Specials"));
		
		return x;
	}	
		
	public WebElement getnewproducts() {
		
		WebElement x= driver.findElement(By.linkText("New products"));
		
		
		return x;
		
		
	}	

	public WebElement getbestsellers() {
		
		WebElement x= driver.findElement(By.linkText("Best sellers"));
		
		return x;
		
	}	

public WebElement getourstores() {
		
		WebElement x= driver.findElement(By.linkText("Our stores"));
		
		return x;

	}

	
public WebElement getcontactus() {
	
	WebElement x= driver.findElement(By.linkText("Contact us"));
	
	return x;

}
	
	
public WebElement gettermsncond() {
	
	WebElement x= driver.findElement(By.linkText("Terms and conditions of use"));
	
	return x;

}
	
public WebElement getaboutUs() {
	
	WebElement x= driver.findElement(By.linkText("About us"));
	
	return x;

}


public WebElement getsitemap() {
	
	WebElement x= driver.findElement(By.linkText("Sitemap"));
	
	return x;

	
	
	

}

}
	

	
	
	
	
	
	
	


