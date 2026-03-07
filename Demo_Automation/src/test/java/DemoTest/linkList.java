package DemoTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class linkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Sets a 10-second global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://qavbox.github.io/demo/signup/");
		WebElement element = driver.findElement(By.name("sgender"));
	//	element.clear();
		Select dropdown = new Select(element);
	//	dropdown.selectByContainsVisibleText("Male");
	//	dropdown.selectByValue("male");
		dropdown.selectByIndex(2);
		//Check drop have the capablity to check the multi option
		if(dropdown.isMultiple()==true)
		{
			System.out.println("dropdown is multiple");
		}
		else
		{
			System.out.println("dropdoen is not multiple");
		}
		List <WebElement> allDropDownOption = dropdown.getOptions();
		
	for(WebElement el:allDropDownOption)
	{
		System.out.println(el.getText() ); 
	}
	//	driver.close();
	}

}
