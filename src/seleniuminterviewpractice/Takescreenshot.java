package seleniuminterviewpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		/*TakesScreenshot ts  =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File trg = new java.io.File(".\\shots\\orange1.png");
		FileUtils.copyFile(source, trg);*/
		
		WebElement section = driver.findElement(By.xpath("//div[@id='divLogo']"));
		File src = section.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\shots\\orange1.png");
		FileUtils.copyFile(src, trg);
		
		
		
		
		

	}

}
