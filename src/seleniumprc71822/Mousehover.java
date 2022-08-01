package seleniumprc71822;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.novatesoft.io/");
		
		Actions act = new Actions(driver);
		WebElement about = driver.findElement(By.linkText("About Us"));
		act.moveToElement(about).build().perform();
		WebElement Purpose = driver.findElement(By.linkText("Our Purpose"));
		Purpose.click();
		
	}

}
