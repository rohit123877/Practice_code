package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class mouseClick {
public static void main(String [] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Static.html");
	WebElement source = driver.findElement(By.xpath("//img[@id='angular']"));
	WebElement destination = driver.findElement(By.xpath("//div[@id='droparea']"));
	Actions act = new Actions(driver);
	act.dragAndDrop(source, destination).build().perform();
	System.out.println("one element dop on destination");
	WebElement source2 = driver.findElement(By.xpath("//img[@id='mongo']"));

	WebElement destination2 = driver.findElement(By.xpath("//div[@id='droparea']"));
	act.dragAndDrop(source2, destination2).build().perform();
	System.out.println("Location 2 moved successfully");
	WebElement source3 = driver.findElement(By.xpath("//img[@id='node']"));
	WebElement destination3 = driver.findElement(By.xpath("//div[@id='droparea']"));
	act.dragAndDrop(source3, destination3).build().getClass();
	System.out.println("Destination 3 move");
	
	driver.quit();
}
}
