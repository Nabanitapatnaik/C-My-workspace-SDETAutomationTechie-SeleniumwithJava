package seleniumprc71822;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//input[@class='cb1-element'])[1]")).click();
List<WebElement> opt = driver.findElements(By.xpath("//input[@class='cb1-element']"));
int size = opt.size();
System.out.println(size);
/*for(WebElement op: opt)
{
	op.click();
	
	
}*/
/*for(WebElement op: opt)
{
	
	String option = op.getAttribute("value");
	if(option.equals("Option 2")||option.equals("Option 3"))
	{
		
		op.click();
	}
	
}*/
for(WebElement op: opt)
{
for(int i=0;i<size;i++)
{
	if(i<2)
		
	{
	op.click();
	
	}
	
}
	
	
	
	

}







	}
	
}