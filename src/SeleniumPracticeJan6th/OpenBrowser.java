package SeleniumPracticeJan6th;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static void main(String args[])throws Throwable
	{
		//create object for browser class
		ChromeDriver driver = new ChromeDriver();
		//lauch url
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuId")).clear();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).clear();
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]/img[1]"));
		logout.click();
		String gtitle = driver.getTitle();
		System.out.println(gtitle);
		String gurl = driver.getCurrentUrl();
		System.out.println(gurl);
		String gscode = driver.getPageSource();
		System.out.println(gscode);
		//driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]/img[1]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
