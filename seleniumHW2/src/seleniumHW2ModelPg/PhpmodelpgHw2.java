package seleniumHW2ModelPg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhpmodelpgHw2 {
	

		WebDriver driver;
		//Constructor created
		
		public PhpmodelpgHw2(WebDriver driver) {
			
			this.driver=driver;
			
			
			
		}
		
	
		
		public WebElement getFirstName() {
		
		WebElement x= driver.findElement(By.name("firstname"));
		
		return x;
	}	
		
	public WebElement getlastName() {
		
		WebElement x= driver.findElement(By.name("lastname"));
		
		return x;
		
	}	

	public WebElement getmobileNumber() {
		
		WebElement x= driver.findElement(By.name("phone"));
		
		return x;
		
	}	

public WebElement getemail() {
		
		WebElement x= driver.findElement(By.name("email"));
		
		return x;

	}

	
public WebElement getpassword() {
	
	WebElement x= driver.findElement(By.name("password"));
	
	return x;

}
	
	
public WebElement getconfirmPassword() {
	
	WebElement x= driver.findElement(By.name("confirmpassword"));
	
	return x;

}
	
public WebElement getsignUp() {
	
	WebElement x= driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[2]/div/form/div[8]/button"));
	
	return x;

}
}
	
