package seleniumwithjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
	List<WebElement> row = 	driver.findElements(By.xpath("//table[@id = 'customers']//tbody//tr"));
	int Size = 	row.size();//7
	System.out.println(Size);
	List<WebElement> col = driver.findElements(By.xpath("//table[@id = 'customers']//tbody//tr//th"));
	int size = col.size();//3
	System.out.println(size);
	WebElement single = driver.findElement(By.xpath("//table[@id = 'customers']//tbody//tr[2]//td[1]"));
		String name = single.getText();
		System.out.println(name);	
		
		for(int i=0; i<=Size;i++) {
			for(int j=0;j<=size;j++)
			{
			WebElement Names = 	driver.findElement(By.xpath("//table[@id = 'customers']"));
				String Na = Names.getText();
				System.out.println(Na);
			}
			
			
		}
			
			
			
			
		}
		
		
		
		
		

	}


