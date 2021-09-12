package seleniumHW2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumHW2ModelPg.PhpmodelpgHw2;

public class phpTravel {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajid\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		PhpmodelpgHw2 pm= new PhpmodelpgHw2(driver);
		 driver.get("https://www.phptravels.net/register");
		 
		 String url= driver.getCurrentUrl();
		 String title = driver.getTitle();
		 System.out.println(url);
		 System.out.println(title);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		

		pm.getFirstName().sendKeys("John");
		pm.getlastName().sendKeys("Michael");
		pm.getmobileNumber().sendKeys("5712448418");
		pm.getemail().sendKeys("johnmichael761@gmail.com");
		Thread.sleep(1000);
		pm.getpassword().sendKeys("jmaeall123");
		pm.getconfirmPassword().sendKeys("jmaeall123");
		Thread.sleep(2000);
		String signup= pm.getsignUp().getText();
		System.out.println(signup);
	
		
		// TODO Auto-generated method stub

	}

}
