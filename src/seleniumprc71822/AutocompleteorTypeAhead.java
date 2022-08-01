package seleniumprc71822;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutocompleteorTypeAhead {
public static void main(String[] args) throws InterruptedException
	{WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		driver.manage().window().maximize();
		WebElement plug = driver.findElement(By.id("autocomplete"));
		plug.click();
		plug.clear();
		Thread.sleep(2000);
		plug.sendKeys("Bahr");
		String txt;
		
		do
		{
			plug.sendKeys(Keys.ARROW_DOWN);
		txt = 	plug.getAttribute("value");
			if(txt.equalsIgnoreCase("Bahr"))
			{
				plug.sendKeys(Keys.ENTER);
				
			}while(!txt.isEmpty());
			
			
		}while(!txt.isEmpty());

	}

}
