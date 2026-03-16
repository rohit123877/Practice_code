package DemoTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class imlicitwait {
	public static void main (String [] args)
	{
		System.setProperty("driver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Stopwatch watch = null;
		try {

			watch = Stopwatch.createStarted();
			driver.findElement(By.xpath("webelemet")).click();
		}
		catch (Exception e) {
			watch.stop();
			System.out.println("print " +e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "Seconds");
		}
		// TODO: handle exception
driver.close()
;	}

}

