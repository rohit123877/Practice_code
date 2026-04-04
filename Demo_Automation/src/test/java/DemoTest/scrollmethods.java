package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//driver.get("https://www.calculator.net/");
driver.get("https://www.stepcampus.in/playground");
driver.manage().window().maximize();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement element = driver.findElement(By.cssSelector("body > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(10) > div:nth-child(1)"));
js.executeScript("arguments[0].scrollIntoView(true);", element);
//scroll by pixeel
//js.executeScript("window.scrollBy(0, 500)");
//Scroll untill the element not visisble 
//WebElement elemet = driver.findElement(By.linkText("Due Date Calculator"));
//js.executeScript("arguments[0].scrollIntoView();",elemet);
//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//WebElement elemet = driver.findElement(By.xpath("//label[@class='text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70'][contains(.,'Horizontal Scroll')]"));
//js.executeScript("arrguments [0].scrollToView();", elemet);
WebElement element2 = driver.findElement(By.xpath("//div[@class='p-6'][contains(.,'Card 12')]"));
js.executeScript("arguments [0].scrollIntoView();",element2);
element2.click();
	}

}
