package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/buttons");
driver.manage().window().maximize();
WebElement  button = driver.findElement(By.xpath("//button[.='Right Click Me']"));
Actions act = new Actions(driver);
act.contextClick(button).perform();
	}

}
