package testCase;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// Open Browser
		WebDriver driver = new ChromeDriver();

		// Maximize Navigator
		driver.manage().window().maximize();

		// Vider le cache
		driver.manage().deleteAllCookies();

		// open URL Application
		driver.get("https://demoqa.com/buttons");

		// Instanciation de la Class Actions
		Actions actions = new Actions(driver);

		// Instanciation Class WebDriverWait
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20)); //
		// j'ai pas appliquéL'explicit wait

		
		// Click on Button DoubleClick
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", btnDoubleClick);
        
		actions.doubleClick(btnDoubleClick).build().perform();

		
		
		// Verifier Expected result and Actual result
		String expectedResult = "You have done a double click";
		WebElement msg = driver.findElement(By.id("doubleClickMessage"));
		String actualResult = msg.getText();

		Assertions.assertTrue(expectedResult.contains(actualResult));// with assertTrue
		System.out.println("passed");

		Assertions.assertEquals(expectedResult, actualResult); // with assertEquals
		System.out.println("Identique");


	}

}
