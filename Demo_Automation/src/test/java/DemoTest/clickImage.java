package DemoTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://helpcenter.yola.com/hc/en-us/articles/21532028246172-How-to-set-an-image-click-action");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//img[@alt='Logo']")).click();
		//Switch to the new window/tab
		for(String WindowHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(WindowHandle);
		}
		if(driver.getTitle().equals("Yola - Make a Free Website"))
		{
			System.out.println("Tc pass");
		}
		else
		{
			System.out.println("TC fail");
		}
		driver.quit();
	}

}
