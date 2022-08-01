package seleniumwithjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.techlistic.com/p/demo-selenium-practice.html"); //URL1
driver.navigate().to("https://www.programiz.com/java-programming/constructors");//URL2
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();
//driver.close();
driver.quit();
		
		
		
		
		
		
		
		

	}

}
