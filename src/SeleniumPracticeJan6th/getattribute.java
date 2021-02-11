package SeleniumPracticeJan6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
		String getattri = driver.findElement(By.className("_6WQwDJ")).getAttribute("href");
		System.out.println(getattri);

		Thread.sleep(5000);
		driver.close();
	}

}
