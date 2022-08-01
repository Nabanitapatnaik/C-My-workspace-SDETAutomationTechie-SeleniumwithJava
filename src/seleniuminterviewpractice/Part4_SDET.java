package seleniuminterviewpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part4_SDET {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		WebElement el = driver.findElement(By.id("small-searchterms"));
		System.out.println(el.isDisplayed());
		System.out.println(el.isEnabled());
		WebElement male = driver.findElement(By.id("gender-male"));
		male.click();
		System.out.println(male.isSelected());
		
		
		
		
		
		

	}

}
