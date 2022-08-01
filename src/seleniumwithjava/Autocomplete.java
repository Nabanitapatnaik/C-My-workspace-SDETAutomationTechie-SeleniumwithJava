package seleniumwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {

	public static void main(String[] args) {
//click, clear, sendkeys(KeysDown), sendkeys(KeysEnter)
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.twoplugs.com/newsearchserviceneed");
	driver.manage().window().maximize();
	driver.findElement(By.id("autocomplete")).click();
	driver.findElement(By.id("autocomplete")).clear();
	WebElement City  = driver.findElement(By.id("autocomplete"));
		City.sendKeys("Bel");
		String txt;
		do
		{
			City.sendKeys(Keys.ARROW_DOWN);
			txt = City.getAttribute("value");
			if(txt.equalsIgnoreCase("Belgium"))
			{
				City.sendKeys(Keys.ENTER);
				
				
			}
			
			
			
			
			
		}while(!txt.isEmpty());
		
		
		
		
		

	}

}
