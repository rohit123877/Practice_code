package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.rediff.com/");
driver.manage().window().maximize();
driver.switchTo().frame("moneyiframe");
String nsevalue = driver.findElement(By.id("bseindex")).getText();
System.out.println("nsevalue" +nsevalue);
driver.quit();
	}

}
