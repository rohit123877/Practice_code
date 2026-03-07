package DemoTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findBrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "C:\\Demo\\Demo_Automation\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("\"http://www.deadlinkcity.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.manage().window().maximize();
	
	 List <WebElement> linklist = driver.findElements(By.tagName("a"));
	 int rescode = 200;
	 int brokenLinkCnt=0;
	 System.out.println("Total number of links one this page" +linklist.size());
	 for(WebElement element:linklist)
	 {
		 String url = element.getAttribute("href");
	try {
		URL urllink = new URL(url);
		HttpsURLConnection huc = (HttpsURLConnection) urllink.openConnection();
		huc.connect();
		huc.setRequestMethod("HEAD");
		rescode = huc.getResponseCode();
		if(rescode>=400)
		{
			System.out.println("This is an inavalid link " + brokenLinkCnt );
			brokenLinkCnt ++;
		}
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		
	} catch (Exception e) {
		// TODO Auto-generated catch block

	}
	System.out.println("total broken " + brokenLinkCnt);
	}	}}