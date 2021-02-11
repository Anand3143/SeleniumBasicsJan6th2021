package SeleniumPracticeJan6th;

import java.util.Set;

import org.apache.maven.model.Parent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args)throws Throwable {
		// opening multiple windows
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		//storing parent id into one string
		String str1 = driver.getWindowHandle();
		System.out.println(str1);
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.partialLinkText("Privac")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
		Set<String> strall = driver.getWindowHandles();
		System.out.println(strall);
		for(String each : strall)
		{
			String ptitle = driver.switchTo().window(each).getTitle();
			System.out.println(ptitle);
		}
		//driver.switchTo().window(Parent);
		Thread.sleep(4000);
		driver.quit();
	}

}
