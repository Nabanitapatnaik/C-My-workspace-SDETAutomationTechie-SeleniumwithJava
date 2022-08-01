package seleniumwithjava;


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

public class Screenshots {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.novatesoft.io/");
		driver.manage().window().maximize();
		
		//Full Page
	/*TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File trg = new File(".\\Screenshots\\homepage.html");
	FileUtils.copyFile(src, trg);*/
		
		//Portion of Page
		WebElement portion = driver.findElement(By.xpath("//header/div[@id='navbar']/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
		File src = portion.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\logo.html");
		FileUtils.copyFile(src, trg);
	}

}
