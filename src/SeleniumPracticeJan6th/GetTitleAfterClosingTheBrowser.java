package SeleniumPracticeJan6th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAfterClosingTheBrowser {
	
	public static void main(String args[])throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		driver.close();
		try{
		String gettitle = driver.getTitle();
		throw new Exception(" " + gettitle);
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		
		
	}

}
