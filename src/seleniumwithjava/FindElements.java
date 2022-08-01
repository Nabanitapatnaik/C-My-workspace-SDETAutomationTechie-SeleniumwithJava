package seleniumwithjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.novatesoft.io/");
List<WebElement> multiple= driver.findElements(By.xpath("//div[@class='claFooter pt-40 pb-70 ']"));
System.out.println(multiple.size());
for(WebElement types:multiple)
{
	System.out.println(types.getText());
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
