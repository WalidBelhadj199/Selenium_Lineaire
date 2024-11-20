package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownList {



    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");

       
        WebElement multiSelectMenu = driver.findElement(By.id("cars"));

        // Create a Select object
        Select multiSelect = new Select(multiSelectMenu);

        // Check if the select element supports multiple selections
        if (multiSelect.isMultiple()) {
            
            int indices[]  = {0,1, 2, 3};

            
            for (int i : indices) {
                
            	multiSelect.selectByIndex(i);
       
        
        	}

            
            
            
            
            // Optionally, deselect an option
          //  multiSelect.deselectByIndex(2); // Deselect the third option
        }
    }

}
