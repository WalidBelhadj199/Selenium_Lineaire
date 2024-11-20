package testCase;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/browser-windows");
		
		//Store and print the name of the first window
		
		String handle = driver.getWindowHandle();
		System.out.println("The first name of window is"+ " "+handle);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)", "");
		
		WebElement btnnewwindowmessage = driver.findElement(By.id("messageWindowButton"));
		
		btnnewwindowmessage.click();
		
		//store and print the name of  windows
		Set<String> handles = driver.getWindowHandles();
		
		System.out.println("The windows name are"+handles);
		
		// Pass a window handle to other handle
		
		for (String  handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			System.out.println(handle1);
		}
		 driver.close();  // Le driver s'applique sur la derniére fenetres
		
		
		
		
		
		
	}

}
