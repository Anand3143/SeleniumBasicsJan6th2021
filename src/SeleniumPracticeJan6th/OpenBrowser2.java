package SeleniumPracticeJan6th;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class OpenBrowser2 {
	
	public static void main(String args[])throws Throwable
	{
		HtmlUnitDriver driver = new HtmlUnitDriver();
		String expurl = "http://primusbank.qedgetech.com/";
		//launch url
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		//print title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page : " + title + " and " + "lenght of the title : " + title.length());
		//print url of the page
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page : " + url + " and " + " lenght of the url : " + url.length());
		if(expurl.equalsIgnoreCase(url))
		{
			System.out.println("url is matching : " + expurl + " " + url);
		}
		else
		{
			System.out.println("url is not matching : " + expurl + " " + url);
		}
		//Thread.sleep(5000);
		driver.close();
	}

}
