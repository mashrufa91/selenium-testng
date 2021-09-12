package seleniumHW2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumHW2ModelPg.automodelpg;


public class automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sajid\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		automodelpg auto= new automodelpg(driver);
		
		
		 driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		 
		 String url= driver.getCurrentUrl();
		 String title = driver.getTitle();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 System.out.println(url);
		 System.out.println(title);
		 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		auto.getspecials().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String url2= driver.getCurrentUrl();
		 String title2 = driver.getTitle();
		Thread.sleep(1000);
		 System.out.println(url2);
		 System.out.println(title2);
		 
		 driver.get(url);
		 
		 auto.getnewproducts().click();
		 
		 String url3= driver.getCurrentUrl();
		 String title3 = driver.getTitle();
		Thread.sleep(1000);
		 System.out.println(url3);
		 System.out.println(title3);
		 driver.get(url);
		 
		 auto.getbestsellers().click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		 String url4= driver.getCurrentUrl();
		 String title4 = driver.getTitle();
		Thread.sleep(1000);
		 System.out.println(url4);
		 System.out.println(title4);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(url);
		 
		 auto.getourstores().click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String url5= driver.getCurrentUrl();
		String title5= driver.getTitle();
		Thread.sleep(1000);
		 System.out.println(url5);
		 System.out.println(title5);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(url);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		 auto.getcontactus().click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String url6= driver.getCurrentUrl();
		String title6= driver.getTitle();
		Thread.sleep(1000);
		 System.out.println(url6);
		 System.out.println(title6);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(url);
		
		 auto.gettermsncond().click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String url7= driver.getCurrentUrl();
		String title7= driver.getTitle();
		Thread.sleep(1000);
		 System.out.println(url7);
		 System.out.println(title7);
		 driver.get(url);
		 
		 auto.getaboutUs().click();
		 String url8= driver.getCurrentUrl();
		String title8= driver.getTitle();
		Thread.sleep(1000);
		 System.out.println(url8);
		 System.out.println(title8);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(url);
		 	 
		 
		 auto.getsitemap().click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String url9= driver.getCurrentUrl();
		String title9= driver.getTitle();
		Thread.sleep(1000);
		 System.out.println(url9);
		 System.out.println(title9);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(url); 
		 
		driver.quit(); 
		
		
	}

}
