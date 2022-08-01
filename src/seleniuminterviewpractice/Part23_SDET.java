package seleniuminterviewpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part23_SDET {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.novatesoft.io/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement its = driver.findElement(By.linkText("IT Services"));
		act.moveToElement(its).build().perform();
		driver.findElement(By.linkText("Coporate Outsourcing")).click();

	}

}
