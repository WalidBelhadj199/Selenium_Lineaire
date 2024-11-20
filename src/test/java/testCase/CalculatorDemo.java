package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorDemo {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://juliemr.github.io/protractor-demo/");
		
		driver.findElement(By.xpath("//input[@ng-model='first']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@ng-model='second']")).sendKeys("4");
		
		driver.findElement(By.id("gobutton")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		
//		Pattern pattern = Pattern.compile("\\d+");
//		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
//		
//		WebElement result = driver.findElement(By.tagName("h2"));
//		System.out.println("The result is: "+result.getText());
		
		driver.quit();
		
		

	}

}

}

}
