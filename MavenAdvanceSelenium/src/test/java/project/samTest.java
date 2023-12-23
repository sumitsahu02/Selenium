package project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class samTest {

	@Test
	public void testcase()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void testcase1() 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	@Test
	public void testcase2()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
	
}
