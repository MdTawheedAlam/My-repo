package metadata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class Download {
	WebDriver driver;
	public File f;
	public FileInputStream FI=null;
	Properties prop = new Properties();
	@Test
	public void load() throws IOException, FileNotFoundException, InterruptedException
	{
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain");
	profile.setPreference("browser.download.folderList", 2);
	profile.setPreference("browser.download.dir", "C:/Users/user123/Downloads");
	
	//profile.setPreference("plainjs.disabled", true);
		
		driver=new FirefoxDriver(profile);
	     f = new File (System.getProperty("user.dir")+"/src/config.properties");
	     FI = new FileInputStream(f);
	     prop.load(FI);
	     driver.get(prop.getProperty("url"));
	     driver.manage().window().maximize();
		 driver.findElement(By.xpath(".//*[@id='textbox']")).sendKeys("this is for demo purpose");
		  driver.findElement(By.xpath(".//*[@id='textbox']"));
		 boolean b = driver.findElement(By.xpath(".//*[@id='create']")).isEnabled();
		 if (b==true)
		 {
	     driver.findElement(By.xpath(".//*[@id='create']")).click();
	     driver.findElement(By.xpath(".//*[@id='link-to-download']")).click();
	     
		 }
		 else
		 {
	    	 System.out.println("Enjoy maadi");
		 }
		 
	     
	}
	

}
