package seleniuminterviewpractice;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestLogger {
	public static WebDriver driver;
	public static Logger logger;
  @Test
 public void m1() {
}
  {
  
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		logger = Logger.getLogger("InitialProject");
		PropertyConfigurator.configure("Log4Jproperties");
	    driver.get("https://www.javatpoint.com/");
		logger.info("URL is displayed");
  
  }
}
