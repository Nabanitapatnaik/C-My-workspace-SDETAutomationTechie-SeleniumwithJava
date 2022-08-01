package seleniumwithjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automatetestcaseusingwebdriver {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver  =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.name("userName")).sendKeys("mngr415270");
		driver.findElement(By.name("password")).sendKeys("mngr41527011");
		driver.findElement(By.name("submit")).click();
	String Actual = 	driver.getTitle();
	System.out.println("The actual title is :"+Actual);
	String Expected  ="Welcome: Mercury Tours";
	if(Actual.equalsIgnoreCase(Expected))
	{
		System.out.println("The TC is passed");
	}
	
	else
		
	{
		System.out.println("The TC is failed");
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
