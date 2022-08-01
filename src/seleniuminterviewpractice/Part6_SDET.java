package seleniuminterviewpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part6_SDET {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		List<WebElement> foot = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		int size = foot.size();
		System.out.println(size);
		for(WebElement list: foot) 
		{
			System.out.println(list.getText());
			System.out.println(list.getAttribute("href"));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
