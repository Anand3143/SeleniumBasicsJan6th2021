package SeleniumPracticeJan6th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebelement {

	public static void main(String args[])throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		//get collection of links in a page which are under html tag a
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("no.of links are in the page : " + links.size());
		Thread.sleep(3000);
		
		
		for (int i=0; i<links.size(); i++)
		{
			//get each link text
			String linkname = links.get(i).getText();
			//get each link url
			String linkurl =links.get(i).getAttribute("herf");
			
			System.out.println("link text name : " + linkname + " " + " link text url" + linkurl);
			
			
		}
		driver.close();
	}
}
