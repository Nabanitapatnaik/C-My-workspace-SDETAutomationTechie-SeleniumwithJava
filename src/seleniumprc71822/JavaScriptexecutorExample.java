package seleniumprc71822;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptexecutorExample {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		
		/*JavascriptExecutor js = (	JavascriptExecutor )driver;
		js.executeScript("document.getElementbyId(txtUsername).value ='js123' ");*/
		
	List<WebElement> elements= driver.findElements(By.tagName("a"));
	List finallist  =new ArrayList();
	for(WebElement element: elements)
	{
		if(element.getAttribute("href")!=null)
		{
			finallist.add(element);
			
		}
	}
		return;
		
		
		
		
	
		
		
		
		
		
		

	}

}
