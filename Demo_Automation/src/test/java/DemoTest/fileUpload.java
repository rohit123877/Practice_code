package DemoTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileUpload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.drover", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		//	driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Rohit sharma");
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Actions  act = new Actions(driver);
		act.moveToElement(button).click(button).build().perform();
		// craete robot methos
		Robot rb = new Robot();
		rb.delay(4000);
		//Copy file to clicpboard
		StringSelection ss = new StringSelection("C:\\Users\\Rohit sharma\\Downloads\\My Resume.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//Perform ctr + v action 
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);


		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
}