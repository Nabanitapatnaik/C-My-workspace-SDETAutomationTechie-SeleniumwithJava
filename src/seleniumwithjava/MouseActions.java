package seleniumwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.novatesoft.io/");
		driver.manage().window().maximize();
	
	//WebElement ele = 	driver.findElement(By.linkText("Why Novatesoft"));
	//act.doubleClick(ele).build().perform();
	//act.contextClick(ele).build().perform();
		WebElement link = driver.findElement(By.linkText("IT Services"));
		Actions act  = new Actions(driver);
		act.moveToElement(link).build().perform();
		driver.findElement(By.linkText("Alliances")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
