package seleniumwithjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.novatesoft.io/");
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		int S = tags.size();
		System.out.println(S);
	for(WebElement types:tags)
	{
		System.out.println(types.getText());
	String S1 = types.getAttribute("href");
	System.out.println(S1);
		
		
		
	}
		
		
		
		
		
		
		

	}

}
