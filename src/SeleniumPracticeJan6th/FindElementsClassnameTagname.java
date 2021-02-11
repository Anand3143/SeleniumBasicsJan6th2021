package SeleniumPracticeJan6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsClassnameTagname {
	
	public static void main(String args[])throws Throwable
	{
		
		//finding class name and storing into a integer which having o.of elements
		System.setProperty("webdeiver.chrome.driver", "C:\\Users\\ANAND RAJ\\Desktop.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//classname
		int slider = driver.findElements(By.className("a-carousel-card")).size();
		System.out.println(slider);
		//tagname
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		driver.close();
		
	}

}
