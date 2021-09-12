package seleniumHW2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import seleniumHW2ModelPg.YahooCreatepg;


public class YahooLoginTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajid\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		YahooCreatepg Yl= new YahooCreatepg(driver);
		 driver.get("https://login.yahoo.com/account/create");
		 
		 String url= driver.getCurrentUrl();
		 String title = driver.getTitle();
		 System.out.println(url);
		 System.out.println(title);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Yl.getFirstName().sendKeys("John");
		Yl.getLastName().sendKeys("Michael");
		Thread.sleep(1000);
		
		Yl.getemail().sendKeys("johnmichael5473");
		Yl.getpassword().sendKeys("567848hf");
	
		Yl.getmobile().sendKeys("5712225789");
		Yl.getDay().sendKeys("9");
		Thread.sleep(1000);
		
		Yl.getYear().sendKeys("1991");
	WebElement birthmonth= Yl.getMonth();
		Select bm= new Select (birthmonth);
		bm.selectByVisibleText("July");
		String cont =Yl.getcontinue().getText();
		Thread.sleep(1000);
		
		 System.out.println(cont);
		 Thread.sleep(1000);
			
		
		 
		 
		 
		 
		 
	}
	
	
	

}
