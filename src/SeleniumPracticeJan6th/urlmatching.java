package SeleniumPracticeJan6th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlmatching {
	
	public static void main(String args[])throws Throwable
	{
		//write a program to match url starting characters, actual to expected
		WebDriver driver = new ChromeDriver();
		String expurl = "http";
		//launch url
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		if(expurl.startsWith(url))
		{
			System.out.println("URL is matching : ");
		}
		else
		{
			System.out.println("URL is not matching : " + url);
		}
		driver.close();
	}

}
