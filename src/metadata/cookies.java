package metadata;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class cookies {

	@Test
	public void cookie()
	{
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie ck:cookies)
		{
			System.out.println(ck);
		}
		driver.close();
	}
}
