package seleniumprc71822;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		/*Select drop = new Select(driver.findElement(By.id("select-demo")));
	drop.selectByVisibleText("Monday");*/
	WebElement search = 	driver.findElement(By.id("select-demo"));
	System.out.println(search.isSelected());
	System.out.println(search.isDisplayed());
	System.out.println(search.isEnabled());	
		
		
		
		
		

	}

}
