package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolderDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/tool-tips/");
		
		WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));
		
		String textPlaceHolder = placeHolder.getAttribute("placeholder");
		
		System.out.println("The Place Holder is " + textPlaceHolder);
		
		
		
		
		
		
		
		

	}

}
