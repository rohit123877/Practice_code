package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("driver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https:\\saucedemo.com");
driver.findElement(By.cssSelector("input#user-name")).sendKeys("performance_glitch_user");
//driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
//driver.findElement(By.cssSelector("input[placeholder=Password")).sendKeys("secret_sauce");
driver.findElement(By.cssSelector("input[type=password")).sendKeys("secret_sauce");
driver.findElement(By.cssSelector("input[value = 'Login']")).click();
String currentWindowHandel  = driver.getWindowHandle();
driver.switchTo().window(currentWindowHandel);
driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
	}
	// single value attribute /input[@placeholder= 'Username' ]
	//Multi valu attributr //input[@placeholder='Username'][@type='text']
	// using and //input[@type='text'and@data-test='username']
	
}
