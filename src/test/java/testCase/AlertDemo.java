package testCase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {

		// Open Browser
		WebDriver driver = new ChromeDriver();
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Maximaize Navigatordriver
		driver.manage().window().maximize();
		// Delecte All Cookies
		driver.manage().deleteAllCookies();
		// Open URL Application
		driver.get("https://demoqa.com/alerts");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)", "");

		WebElement btnClick = driver.findElement(By.id("alertButton"));
		btnClick.click();

		// Accept Alert
		driver.switchTo().alert().accept();
		String titlePage = driver.getTitle();
		System.out.println(titlePage);
		//driver.quit();
	}

}
