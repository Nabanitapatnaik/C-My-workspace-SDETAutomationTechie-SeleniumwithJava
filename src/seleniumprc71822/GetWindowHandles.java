package seleniumprc71822;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//getWhindowHandle
		
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	String winID = driver.getWindowHandle();
	System.out.println(winID);	
	//getWhindowHandles
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
Set<String>	wins = driver.getWindowHandles();
System.out.println(wins);		

//switch windows
Iterator<String> it = wins.iterator();
String parent = it.next();
String child = it.next();
System.out.println(parent);
System.out.println(child);	
driver.switchTo().window(child);
		
		

	}

}
