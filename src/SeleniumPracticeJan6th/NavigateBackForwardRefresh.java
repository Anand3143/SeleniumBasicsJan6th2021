package SeleniumPracticeJan6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackForwardRefresh {
	
	public static void main(String args[])throws Throwable
	{
		//practicing on navigate to, back, forward and refresh methods
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
	}

}
