package SeleniumPracticeJan6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {
	
	public static void main(String args[])throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("http://amazon.com");
		//driver.manage().window().maximize();
		//Thread.sleep(3000);
		//driver.findElement(By.className("landscape-image")).click();
		//CSS Selector.....tag&class
		//driver.findElement(By.cssSelector("img.landscape-image")).click();
		//tag&attribute
		//driver.findElement(By.cssSelector("img[class=landscape-image]")).click();
		
		//Thread.sleep(2000);
		//driver.close();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//tag&id
		//driver.findElement(By.cssSelector("#email")).sendKeys("raj");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("raj");
		//tag&class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("raj");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("anand");
		
		//tag&attribute
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("ananraj");
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("raja");
		
		//tag&class&attribute
		driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("banglore");
		
		Thread.sleep(2000);
		driver.close();
	}

}
