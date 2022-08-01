package seleniuminterviewpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part8_SEDET {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		Select drop = new Select(driver.findElement(By.id("input-country")));
		drop.selectByVisibleText("Albania");
		//System.out.println(driver.findElement(By.id("Albania")).isSelected());

	}

}
