package DemoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handeldatepicker {

	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver","C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
		// TODO Auto-generated method stub
		String expectedDay = "2";
		String expectedYear = "2029";
		String expecetdMonth = "June";
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		WebElement datePicker = driver.findElement(By.id("datepicker1"));
		datePicker.click();
		while(true)
		{
			String calanderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderYear =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(calanderMonth.equals(expecetdMonth) && calenderYear.equals(expectedYear))
			{
				List <WebElement> dayList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				for(WebElement e:dayList)
				{
					String calenderDay = e.getText();
					if(calenderDay.equals(expectedDay))
					{
						e.click();
						break;
					}
				}
				break;

			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}

		}

	}
}
