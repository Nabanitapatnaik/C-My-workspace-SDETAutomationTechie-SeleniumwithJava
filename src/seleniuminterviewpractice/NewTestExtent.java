package seleniuminterviewpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestExtent {
	ExtentReports reports;
	@BeforeTest
	public void configextent()
	{
		
	
	String path = 	System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter reporter  = new ExtentSparkReporter (path);
		reporter.config().setReportName("InitialResults");
		reporter.config().setDocumentTitle("Results");
		 reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Tester", "Nabanita");
		
		
		
	}
	
	
@Test
	public void initial()
	{
	 reports.createTest("Demo1");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://ec2-44-230-141-105.us-west-2.compute.amazonaws.com/myportal/");
		System.out.println(driver.getTitle());
		reports.flush();
		
		
		
		
		
	}
	
	
	
	
}

