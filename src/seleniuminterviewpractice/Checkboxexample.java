package seleniuminterviewpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxexample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
	List<WebElement> check = 	driver.findElements(By.xpath("//input[@class='cb1-element']"));
	//check.get(3).click();
	int S = check.size();
	System.out.println(S);
	for(WebElement El:check)
	{
		
		El.click();
	}
	

	}

}
