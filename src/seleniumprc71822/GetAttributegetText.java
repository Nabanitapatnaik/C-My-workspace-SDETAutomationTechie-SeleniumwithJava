package seleniumprc71822;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributegetText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		WebElement login = driver.findElement(By.linkText("Forgot your password?"));
System.out.println(login.getText());
System.out.println(login.getAttribute("href"));
WebElement submit = driver.findElement(By.name("Submit"));
System.out.println(submit.getAttribute("value"));
	}

}
