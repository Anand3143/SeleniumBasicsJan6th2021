package SeleniumPracticeJan6th;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);

	}

}
