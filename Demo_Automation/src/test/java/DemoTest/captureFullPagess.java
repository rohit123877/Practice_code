package DemoTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class captureFullPagess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//driver .get("http://uitestingplayground.com/alerts");
		driver.get("http://uitestingplayground.com/classattr");
		driver.manage().window().maximize();
		//		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		//		File src =  screenshot.getScreenshotAs(OutputType.FILE);
		//		File des = new File("C:\\Demo\\Demo_Automation\\screenshot\\fullpage.png");
		//		FileUtils.copyFile(src, des);

		//		WebElement  select = driver.findElement(By.xpath("//div[@class='container']"));
		//		File src = select.getScreenshotAs(OutputType.FILE);
		//		File des = new File ("C:\\Demo\\Demo_Automation\\screenshot\\seleectd.png");
		//		FileUtils.copyFile(src, des);
		WebElement button = driver.findElement(By.xpath("//button[@class='btn class1 btn-success btn-test']"));
		File src =  button.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Demo\\Demo_Automation\\screenshot\\eleemet.png");
		FileUtils.copyFile(src, des);

driver.quit();
	}

}
