package seleniumwithjava;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
//String win = driver.getWindowHandle();
//System.out.println(win);		
driver.findElement(By.linkText("OrangeHRM, Inc")).click();
Set<String> wins = driver.getWindowHandles();		
System.out.println(wins);	
Iterator<String>it = wins.iterator();
String Parent = it.next();
String Child = it.next();
System.out.println(Parent);
System.out.println(Child);		
driver.switchTo().window(Parent);
System.out.println(driver.getTitle());



	}

}
