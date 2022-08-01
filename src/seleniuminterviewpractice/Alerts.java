package seleniuminterviewpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Javascript alert
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alertwindow  = driver.switchTo().alert();
		alertwindow.sendKeys("Yes");
		driver.switchTo().alert().accept();
				
		
		
		
		
		
	}

}
