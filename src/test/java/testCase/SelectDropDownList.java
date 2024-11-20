package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/select-menu");

		WebElement selectMenu = driver.findElement(By.id("oldSelectMenu"));

		Select dropDownList = new Select(selectMenu);

		// Select by index
		// dropDownList.selectByIndex(3);

		// Select by values
		// dropDownList.selectByValue("4");

		// Select by visible text

		dropDownList.selectByVisibleText("White");

		driver.quit();

	}

}
