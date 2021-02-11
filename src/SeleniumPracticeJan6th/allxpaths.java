package SeleniumPracticeJan6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allxpaths {
	
	public static void main(String args[])throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//absolute xpath
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("Mi TV 100 cm");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]")).click();
		//Thread.sleep(2000);
		
		//relative xpath
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mi TV 100 cm");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Thread.sleep(2000);
		
		//xpath using or
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='fiels-keywords1']")).sendKeys("mi tvs");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button1' or @type='submit']")).click();
		
	
		//xpath using and
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']")).sendKeys("laptops");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type='submit']")).click();
		
		
		//xpath using contains
		//driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("toys");
		//driver.findElement(By.xpath("//input[contains(@id,'nav-search')]")).click();
		
		
		//xpath using starts-with
		//driver.findElement(By.xpath("//input[starts-with(@id,'twota')]")).sendKeys("mobile phones");
		//driver.findElement(By.xpath("//input[starts-with(@id,'nav-')]")).click();
		
		//xpath using text()
		driver.findElement(By.xpath("//a[contains(text(),'Today')]")).click();
		//driver.findElement(By.xpath("")).click();
		
		
		//xpath using chained 
		//driver.findElement(By.xpath("//form[@id='nav-search-bar-form']")).sendKeys("bed carts");
		//WebElement searchbox = driver.findElement(By.xpath("//form[@id='nav-search-bar-form']//input[@type='text']"));
		//searchbox.click();
		//searchbox.sendKeys("bed carts");
		//driver.findElement(By.xpath("//span[@id='nav-search-submit-text']//input[@type='submit']")).click();
		
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
