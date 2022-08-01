package seleniumprc71822;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/?tag=admarketus-20&ref=pd_sl_891cde2614d010a3cba3d673d87744681a674c3bc71e88977b586da0&mfadid=adm");

List<WebElement> links = driver.findElements(By.tagName("a"));
System.out.println(links.size());

for (WebElement link: links)
{
	
	System.out.println(link.getText());
	System.out.println(link.getAttribute("href"));
	
}






	}

}
