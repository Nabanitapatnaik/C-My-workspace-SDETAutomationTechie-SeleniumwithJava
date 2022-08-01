package seleniuminterviewpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part11_SDET {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		//driver.findElement(By.id("vfb-6-0")).click();//checkbox
		//all checkboxes
	/*List <WebElement> checks = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ch: checks) {
			
			ch.click();
			
		}*/
		
		List <WebElement> chec = driver.findElements(By.xpath("//input[@type='checkbox']"));	
		int size = chec.size();
		System.out.println(size);
		/*for(int i=0;i<size;i++)
			
		{
			if(i<2)
			{
				chec.get(i).click();
				
			}
			
		}*/
		for(int i = size-2; i<size;i++)
		{
			chec.get(i).click();
			
		}
		
		
		
		
		

	}

}
