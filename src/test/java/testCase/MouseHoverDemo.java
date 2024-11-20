package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class MouseHoverDemo {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/menu/");

         WebElement menu2 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", menu2);
		

		
        Actions actions = new Actions(driver);
		
		actions.moveToElement(menu2).perform();
		
		WebElement menuSubSub = driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"));
		
		actions.moveToElement(menuSubSub).perform();
		



	}

}
