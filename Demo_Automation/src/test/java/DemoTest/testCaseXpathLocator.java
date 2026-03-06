package DemoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCaseXpathLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https:\\saucedemo.com");
	
	//driver.FindElement(by.tagNAme
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	
	driver.findElement(By.name("login-button")).click();
	
	//Swutch to product page
			String windHandel = driver.getWindowHandle();
			driver.switchTo().window(windHandel);
		//	driver.findElement(By.linkText("Sauce Labs Backpack")).click();
			//driver.findElement(By.partialLinkText(" Backpack")).click();
					//ELements
			List <WebElement> elementList = driver.findElements(By.partialLinkText(" Sauce "));
			System.out.println("Element size" + elementList.size());
	}

}
