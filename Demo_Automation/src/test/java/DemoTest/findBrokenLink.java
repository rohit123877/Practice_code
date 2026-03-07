package DemoTest;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findBrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
		//inistlize chrome driver
		WebDriver driver = new ChromeDriver();
		// open the url
		driver.get("http://www.deadlinkcity.com/");
		//Add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Maximize screen
		driver.manage().window().maximize();
		//find hyper links craete an list
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		int rescode = 200;
		int brokenlinkcount = 0;
		//	System.out.println("Total link " +linkList.size());
		//	Print total available links
		System.out.println("Total link on page " + linkList.size());
		//uing for loop capture each url
		for(WebElement element:linkList)
		{
			String url = element.getAttribute("href");
			try {
				URL urlink = new URL (url);
				//open url using http conection
				HttpURLConnection huc = (HttpURLConnection) urlink.openConnection();
				//send req to the the link
				huc.setRequestMethod("HEAD");
				//connect 
				huc.connect();
				//check res code
				rescode = huc.getResponseCode();
				if(rescode >=400)
				{
					System.out.println("This is broken link" + rescode);
					brokenlinkcount ++;

				}
			} catch (MalformedURLException e) {
				// TODO: handle exception
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("Total broken link " + brokenlinkcount);
		driver.quit();
	}
}

