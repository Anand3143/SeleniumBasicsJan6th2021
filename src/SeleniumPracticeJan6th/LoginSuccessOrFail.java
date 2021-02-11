package SeleniumPracticeJan6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSuccessOrFail {
	
	public static void main(String args[])
	{
		//writing script for login success or fail
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		//verifying url with contains method 
		if(driver.getCurrentUrl().contains("dash"))
		{
			System.out.println("Login Success : ");
		}
		else
		{
			String message = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println("Login Failed : " + message);
		}
		driver.close();
	}

}
