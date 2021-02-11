package SeleniumPracticeJan6th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowser {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
	
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANAND RAJ\\Desktop\\chromedriver.exe");
		Thread.sleep(3000);
		WebDriver driver1 = new ChromeDriver();
		//driver.close();
		driver1.quit();
		

	}

}
