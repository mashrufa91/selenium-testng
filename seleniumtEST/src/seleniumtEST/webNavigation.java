package seleniumtEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webNavigation {

	public static void main(String[] args) {System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajid\\Downloads\\chromedriver.exe");
	
// create a object of the webdriver class and open up the browser 

WebDriver driver = new ChromeDriver();
	
// navigate to the url
		
driver.get("https://login.yahoo.com/account/create");
	}

}
