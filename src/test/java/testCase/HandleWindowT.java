package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowT {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)", "");		
		
		WebElement btn = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		btn.click();
		
		for(String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		
		
		WebElement btnWeb = driver.findElement(By.xpath("//a[@href='/java-tutorial.html']//span[@class='nav-drop-title-wrap']"));
		
		btnWeb.click();
		
		WebElement btnSql = driver.findElement(By.xpath("//li[@id='menu-item-4800']//a[contains(text(),'SQL Server')]"));
		btnSql.click();
		
		WebElement choixLesson = driver.findElement(By.xpath("//a[normalize-space()='SQL Server Database']"));
		choixLesson.click();
		
		

	}

}
