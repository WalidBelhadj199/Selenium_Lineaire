package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBordEvents {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");

		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAdress = driver.findElement(By.id("currentAddress"));
		WebElement permenenteAdress = driver.findElement(By.id("permanentAddress"));
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		
		fullName.sendKeys("Hedia Ghuizaoui");
		email.sendKeys("hedia@gmail.com");
		currentAdress.sendKeys("France");
		
		// Copy paste
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		permenenteAdress.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
		btnSubmit.click();
		driver.quit(); 
		
		

	}

}
