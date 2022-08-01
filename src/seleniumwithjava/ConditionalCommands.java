package seleniumwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
	WebElement selected = 	driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
System.out.println(selected.isDisplayed());
System.out.println(selected.isSelected());
System.out.println(selected.isEnabled());
	}

}
