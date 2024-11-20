package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {
		
		
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				driver.manage().window().maximize();
				
				driver.manage().deleteAllCookies();
				// Open URL Application
		
		        driver.get("https://www.rediff.com/");
		        
				// Switching to Frame  // entrer au frame
		        driver.switchTo().frame("moneyiframe");
				WebElement option = driver.findElement(By.id("nseindex"));
				String value = option.getText();
				
				System.out.println("The value " +value);

				//sortir de frame
		       driver.switchTo().defaultContent();
		        
		       String text = driver.getTitle();
		       System.out.println(text);
		       
		        driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
