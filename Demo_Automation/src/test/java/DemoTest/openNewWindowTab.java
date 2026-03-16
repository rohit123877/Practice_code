package DemoTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class openNewWindowTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Get the url of first page " +driver.getTitle());
	//	driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/login/");
		System.out.println( ""+driver.getTitle());
		Set <String> windowHandle = driver.getWindowHandles();
		List <String> handle = new ArrayList <String>();
		handle.addAll(handle);
		driver.close();
		driver.switchTo().window(handle.get(0));
		System.out.println("get url " +driver.getTitle());
		
	







	}

}
