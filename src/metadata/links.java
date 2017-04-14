package metadata;


import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class links {
	@Test
	public void man()
	{
		String link = null;
		int linkcount= 0;
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://www.makemytrip.com");
		java.util.List<WebElement> alllinkwebpage = driver.findElements(By.tagName("a")); 
		System.out.println("Total no.s of links:"+alllinkwebpage.size());
		linkcount=alllinkwebpage.size();
		System.out.println("List of links avaialable ");
		for(int i=0;i<linkcount;i++)
		{
			//if(alllinkwebpage.get(i).getAttribute("href").contains(""))
			//{
			link = alllinkwebpage.get(i).getAttribute("href");
			System.out.println(link);
			}
	
		}
		//driver.close();
		
	}
	 

