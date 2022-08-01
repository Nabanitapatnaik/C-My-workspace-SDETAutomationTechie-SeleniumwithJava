package seleniumwithjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextandGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		//How to get the text written over an element
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		Thread.sleep(1000);
		WebElement text = driver.findElement(By.linkText("Forgot your password?"));
		//System.out.println(text.getText());
		System.out.println(text.getCssValue("background-color"));
		//WebElement identity = driver.findElement(By.id("btnLogin"));
		//System.out.println(identity.getAttribute("value"));
		
		

	}

}
