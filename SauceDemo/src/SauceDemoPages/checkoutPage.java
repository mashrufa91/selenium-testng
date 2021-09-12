package SauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutPage {
	
	
	WebDriver driver;
	
	public checkoutPage(WebDriver driver) {
		
		this.driver= driver;
		
	}
	
public WebElement getcheckOutPageText() {
		
		WebElement x= driver.findElement(By.linkText("CHECKOUT"));
		
		return x;
		
	}	

public WebElement getFirstName() {
	
	WebElement x= driver.findElement(By.id("first-name"));
	
	return x;
	
}	

public WebElement getLastName() {
	
	WebElement x= driver.findElement(By.id("last-name"));
	
	return x;
	
	
}

public WebElement getPostalCode() {
	
	WebElement x= driver.findElement(By.id("postal-code"));
	
	return x;
}

public WebElement getContinueButton() {
	
	WebElement x= driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input"));
	
	return x;
}

public WebElement getFinishButton() {
	
	WebElement x= driver.findElement(By.linkText("FINISH"));
	
	return x;
}


}
