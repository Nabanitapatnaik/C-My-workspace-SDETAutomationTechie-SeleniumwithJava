package seleniuminterviewpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part31_SDET {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\naban\\OneDrive\\Desktop\\Interview Prep\\Agile Scrum for Testers.docx");
driver.findElement(By.xpath("(//span[@class='action-cta'])[1]")).click();
	}

}
