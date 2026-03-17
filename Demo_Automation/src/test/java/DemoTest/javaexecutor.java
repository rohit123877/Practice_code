package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
JavascriptExecutor js = (JavascriptExecutor) driver;
//Enter text in the field
js.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').value='Date';");

//Click on button 
WebElement element = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));

js.executeScript("arguments[0].click();", element);
//refresh browser 
js.executeScript("history.go(0)");
	}

}
