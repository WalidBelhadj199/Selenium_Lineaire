package testCase;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/droppable");

		WebElement dragMe = driver.findElement(By.id("draggable"));
		WebElement dropMe = driver.findElement(By.id("droppable"));

		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,700)", "");
		
		Actions actions = new Actions(driver);

		actions.dragAndDrop(dragMe, dropMe).perform();

		// Verify text changed into dropped!
		String textTarget =   dropMe.getText();
		if (textTarget.equals("Dropped!")) {
			System.out.println("Pass: Source is dropped to target as expected");
		}
		else {
			System.out.println("Fail: Source could not be dropped to target as expected");
		}


		






	}

}
