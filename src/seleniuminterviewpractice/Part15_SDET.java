package seleniuminterviewpractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part15_SDET {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();
		String win = driver.getWindowHandle();
		System.out.println(win);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windows= driver.getWindowHandles();
		System.out.println(windows);
		Iterator <String> it = windows.iterator();
		String parentid = it.next();
		String childit = it.next();
		driver.switchTo().window(childit);
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
