package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#google_vignette");
driver.manage().window().maximize();
driver.findElement(By.id("iFrame")).click();
driver.switchTo().frame("globalSqa");
driver.findElement(By.id("current_filter")).click();

driver.switchTo().frame(3);
driver.findElement(By.id("aswift_3")).click();



}

}
