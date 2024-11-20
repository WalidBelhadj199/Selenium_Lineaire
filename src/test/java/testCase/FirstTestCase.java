package testCase;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Open Browser
		WebDriver driver = new ChromeDriver();
		
		//Maiximize Navigator
		driver.manage().window().maximize();
		
		//Open URL Application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Fill Name
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
			
		//Fill Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//Fill Submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
