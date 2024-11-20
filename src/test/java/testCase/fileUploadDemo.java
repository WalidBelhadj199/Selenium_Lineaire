package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadDemo {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.guru99.com/test/upload/");

		WebElement uploadfile = driver.findElement(By.id("uploadfile_0"));
		
		uploadfile.sendKeys("C:\\Users\\OLFA\\Desktop\\summer.jpg");
		
		// cocher la case
		driver.findElement(By.id("terms")).click();
		
		//submit
		WebElement btnSubmit = driver.findElement(By.id("submitbutton"));
		btnSubmit.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
