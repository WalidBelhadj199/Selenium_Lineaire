package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/slider/");
		
		
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,500)", "");
		
		Actions actions = new Actions (driver);
		
		actions.moveToElement(slider, 45, 0).perform(); // deplacer le slider
		
		slider.click();
		
		//driver.quit();
			
		
		
		
		
		
		

	}

}
