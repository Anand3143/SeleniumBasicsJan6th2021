package SeleniumPracticeJan6th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaExpression1 {
	public static void main(String args[])throws Throwable
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://w3schools.com");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		Thread.sleep(5000);
		driver.close();
		
			
	}

}
