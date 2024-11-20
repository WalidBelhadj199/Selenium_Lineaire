package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipsDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/tool-tips/");
		
		
		WebElement btnHoverTome = driver.findElement(By.id("toolTipButton"));
		 String toolTipText = btnHoverTome.getText();
		
		if ( toolTipText.equals("Hover me to see")) {
			
			System.out.println("Pass : Tooltip machting expected values ");
			
		}
		else {
			System.out.println(" faild :Tooltip is not machting expected values");
		}
		
		driver.quit();
		
		

	}

}
