package SeleniumPracticeJan6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		//switch to frame
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dst = driver.findElement(By.xpath("//div[@id='droppable']"));
		ac.clickAndHold(source).moveToElement(dst).release().perform();
		Thread.sleep(3000);
		//come out of the frame
		driver.switchTo().defaultContent();
		ac.moveToElement(driver.findElement(By.linkText("Tabs"))).click().perform();
		
		Thread.sleep(5000);
		
		
		driver.close();
	}

}
