package seleniumwithjava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		//Total number of rows
		List<WebElement> Rows = driver.findElements(By.xpath("//table//tbody//tr"));
	int rowsize = 	Rows.size();
	System.out.println("Total number of rows are:"+rowsize);
	
	//Total number of columns
	List<WebElement> Columns = driver.findElements(By.xpath("//table//thead//tr//th"));
	int colsize = Columns.size();	
	System.out.println("Total number of columns are:"+colsize);	
	
List<WebElement> sum =	driver.findElements(By.xpath("//table//tr//td"));
System.out.println("total data:"+sum.size());
		
	//Retrieve specific row/columndata	
	WebElement Emp = driver.findElement(By.xpath("//table//tr[1]//td[4]"));
	String empname = 	Emp.getText();
	System.out.println("Employee name :"+empname);
	
	
	//Retrieve all the data
	/*
	for(int r=1; r<rowsize;r++)
	{
		for(int c=1; r<colsize;c++)
		
		{
			WebElement Total = driver.findElement(By.xpath("//table//tr["+r+"]//td["+c+"]"));
		String	TT = Total.getText();
	
			System.out.println(TT);
		}
		
		
		
		
		
		
	}*/
	
	for(int i=1;i<=rowsize;i++) {
        System.out.println(i);
        System.out.println(driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[2]//parent::tr"+"  ")).getText());  

    }
	}
	
		
		
		
		
		
		
		

	}


