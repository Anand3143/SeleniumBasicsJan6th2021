package SeleniumPracticeJan6th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowsers {

	public static void main(String[] args)throws Throwable {
		// opening mulstiple browsers
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.quit();

	}

}
