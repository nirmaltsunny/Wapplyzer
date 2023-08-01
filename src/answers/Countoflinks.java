package answers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Countoflinks {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("https://www.yatra.com/");
	}
	@Test
	public void links()
	{
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+links.size());
		
	}

}
