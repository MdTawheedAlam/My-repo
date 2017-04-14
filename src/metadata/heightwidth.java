package metadata;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class heightwidth {
	@Test
	public void heightwid()
	{
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath(".//*[@id='hplogo']")).getSize();
		Dimension dimentions=driver.findElement(By.xpath(".//*[@id='hplogo']")).getSize();
		System.out.println("Logo width :"+dimentions.width);
		System.out.println("Logo Height :"+dimentions.height);
		WebElement element= driver.findElement(By.xpath(".//*[@id='hplogo']"));
		System.out.println(element.getCssValue("font-size"));
		System.out.println(element.getCssValue("font-Weight"));
		System.out.println(element.getCssValue("color"));
		System.out.println(element.getCssValue("background-size"));
		driver.close();
	}

}
