package SauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

	

	WebDriver driver;

	
	public InventoryPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getBackPackText() {
		
		WebElement x= driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		
		return x;
		
	}	

	
public WebElement getSauceBackPrice() {
		
		WebElement x= driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/div"));
		return x;
		
	}	

public WebElement getBackpackToCart() {
	
	WebElement x= driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
	
	return x;
	
}	
	
	
	
public WebElement getLightText() {
	
	WebElement x= driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
	
	return x;
	
}	

public WebElement getLightPrice() {
	
	WebElement x= driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/div"));
	return x;
	
}	
	
public WebElement getLightToCart() {
	
	WebElement x= driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div[2]/div[3]/button"));
	
	return x;
	
}	
	

public WebElement getCart() {
	
	WebElement x= driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));
	
	return x;
	
}	


}
