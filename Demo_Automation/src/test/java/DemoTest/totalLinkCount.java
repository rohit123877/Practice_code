package DemoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalLinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("driver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.calculator.net/age-calculator.html");
List <WebElement> linkElements = driver.findElements(By.tagName("a"));
driver.manage().window().maximize();
System.out.println("Total link on webpage " + linkElements.size());
for(WebElement el:linkElements)
{
	System.out.println(el.getText());
}
driver.close();
	}

}
