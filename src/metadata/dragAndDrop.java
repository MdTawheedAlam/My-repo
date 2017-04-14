package metadata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragAndDrop {
	@Test
	public void dragdrop() throws InterruptedException
	{
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		WebElement drag= driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement drop= driver.findElement(By.xpath(".//*[@id='droppable']"));
		act.dragAndDrop(drag, drop).build().perform();
		driver.close();
	}
	

}
