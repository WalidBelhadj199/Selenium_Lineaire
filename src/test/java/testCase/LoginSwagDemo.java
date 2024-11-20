package testCase;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Assertions;




public class LoginSwagDemo {

	public static void main(String[] args) {
		
		//Open Navigator
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Maximize Navigator
		driver.manage().window().maximize();
		
		//Delete Cookies
		driver.manage().deleteAllCookies();
		
		//Open URL
		driver.get("https://www.saucedemo.com/");
		
		//Fill username
		WebElement champName = driver.findElement(By.id("user-name"));
		champName.clear();
		champName.sendKeys("standard_user");
		
		//Fill password
		WebElement champPassword = driver.findElement(By.id("password"));
		champPassword.clear();
		champPassword.sendKeys("secret_sauce");
		
		// Click submit without Explicit Wait
		//driver.findElement(By.id("login-button")).click();
		
		// Click submit with Explicit Wait

		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement btnLogin= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login-button")));
		btnLogin.click();
		
		// Verificat Expected result with actual resulat
		String text = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		
		Assertions.assertTrue(text.contains("Products"));
		Assertions.assertEquals(text, "nProductsull");
		
		// Print screnn message
		System.out.println("Login Successfly");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static WebDriverWait WebDriverWait(WebDriver driver, Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

}
