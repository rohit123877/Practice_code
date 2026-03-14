package DemoTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handelAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://uitestingplayground.com/alerts");
		/*driver.findElement(By.xpath("//button[@id='alertButton']")).click();
driver.switchTo().alert().accept();

		// rejeect the allert
		driver.findElement(By.id("confirmButton")).click();
		Alert firstAleart = driver.switchTo().alert();
		firstAleart.dismiss();
		Alert secondAlert = driver.switchTo().alert();
		secondAlert.accept();*/
		// 1. Trigger the first alert
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();

		// 2. Handle First Alert
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert firstAlert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("First Alert Text: " + firstAlert.getText());
		firstAlert.dismiss(); // This cancels the first one

		// 3. HANDLE THE SECOND ALERT (The "Click OK" one)
		// We must wait again because the second alert takes a moment to appear
		Alert secondAlert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Second Alert Text: " + secondAlert.getText());
		secondAlert.accept(); // This clicks OK on the second one
	}

}
