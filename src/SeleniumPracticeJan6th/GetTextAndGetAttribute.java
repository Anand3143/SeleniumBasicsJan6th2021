package SeleniumPracticeJan6th;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {
	
	public static void main(String args[])throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		String gettext = driver.findElement(By.xpath("//div[contains(text(),'News')]")).getText();
		System.out.println(gettext);
		WebElement getsize = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]"));
		//get the hight and width of the element
		//Dimension dim = getsize.getLocation();
		//System.out.println(dim);
		Dimension dim2 = getsize.getSize();
		System.out.println(dim2.getHeight()+ " " + dim2.getWidth());
		
		String getattribute = driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]")).getAttribute("class");
		System.out.println(getattribute);
		driver.close();
	}

}
