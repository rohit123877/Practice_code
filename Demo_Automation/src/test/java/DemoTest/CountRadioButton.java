package DemoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-automation-practice.netlify.app/radiobuttons.html");
		driver.manage().window().maximize()	;
		List <WebElement> radioButtonlist = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("The total num radio button " + radioButtonlist.size());
}}