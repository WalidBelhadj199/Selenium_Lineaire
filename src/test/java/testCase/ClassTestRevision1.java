package testCase;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTestRevision1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
            
		WebElement btn = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		
		btn.click();
		
		
		 for (String handle : driver.getWindowHandles()) {
             
                 driver.switchTo().window(handle);
             
             }
		
		WebElement btnTest = driver.findElement(By.xpath("//a[@href='/software-testing.html']//span[@class='nav-drop-title-wrap']//span[@class='dropdown-nav-toggle']//span[@class='kadence-svg-iconset svg-baseline']//*[name()='svg']"));
		btnTest.click();
		
		WebElement btncucumber = driver.findElement(By.xpath("//li[@id='menu-item-4571']//a[contains(text(),'Cucumber')]"));
		btncucumber.click();
		
		//body
		WebElement btnless1 = driver.findElement(By.xpath("//a[@title='What is Cucumber Testing Tool? Complete Introduction']//strong[contains(text(),'Tutorial')]"));
		btnless1.click();
		driver.close();
		

	}

}
