package SeleniumPracticeJan6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTag {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		String str1 = driver.findElement(By.className("sf-with-ul")).getAttribute("title");
		System.out.println(str1);
		//System.out.println(driver.findElements(By.tagName("spana")).size());;
		Thread.sleep(3000);
		driver.close();
		

	}

}
