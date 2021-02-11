package SeleniumPracticeJan6th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooklogin {

	public static void main(String[] args) throws Throwable{
		// write a script for crating acount in facebook using select class
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANAND RAJ\\Desktop\\chromedriver.exe");
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		
		
		Thread.sleep(1000);
//	
//		driver.findElement(By.cssSelector("input#")).sendKeys("Shankar");
		//driver.findElement(By.xpath("//div[@id='reg_form_box']//descendant::input[@name='firstname']")).sendKeys("Shankar");
//		JavascriptExecutor javascriptExecutor=((JavascriptExecutor)driver);
//		javascriptExecutor.executeScript("document.getElementById('u_1k_b').value='Shankar';");
		//driver.findElement(By.xpath("//input[@id='u_h_b']")).sendKeys("hmm");
		/*WebElement username = driver.findElement(By.xpath("//input[@id='u_h_b']"));
		username.click();
		username.sendKeys("Anand");
		WebElement lastname = driver.findElement(By.xpath("//div[@class='placeholder']/following-sibling::input[@id='u_h_d']"));
		lastname.click();
		lastname.sendKeys("Raj");
		WebElement mobilenumber = driver.findElement(By.xpath("//div[@id='u_h_f']/descendant::input"));
		mobilenumber.click();
		mobilenumber.sendKeys("9989350790");
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'passw')]"));
		password.click();
		password.sendKeys("uuhhff");*/
		//use select class
		Select date = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		date.selectByIndex(4);;
		System.out.println(date.getFirstSelectedOption().getText());
		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByIndex(8);
		System.out.println(month.getFirstSelectedOption().getText());
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByValue("1993");
		System.out.println(year.getFirstSelectedOption().getText());
		boolean value = year.isMultiple();
		System.out.println("list box is single or multiple: " +value);
		List<WebElement> list = year.getOptions();
		System.out.println("no.of items in listbox: " +list.size());
		String indyear = "2021";
		for(int i=0;i<list.size();i++)
		{
			String itemname = list.get(i).getText();
			System.out.println(itemname);
			list.get(i).click();
			if(indyear.equalsIgnoreCase(itemname))
			{
				System.out.println("item found : " +itemname);
				break;
			}
			else
			{
				System.out.println("item not found : " +itemname);
			}
		}
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
