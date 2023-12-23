package generic;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Test extends utitly_Method {

	@BeforeSuite
	public void ConnectServer()
	{
		Reporter.log("connection to server",true);
	}
	@BeforeTest
	public void ConnectDatabase()
	{
		Reporter.log("connection to database",true);
	}
	@BeforeClass
	public void open()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	@AfterClass
	public void close()
	{
		driver.quit();
	}
	@AfterTest
	public void disconnectDatabase()
	{
		Reporter.log("disconnection to database",true);
	}
	@AfterSuite
	public void disConnectServer()
	{
		Reporter.log("disconnection to server",true);
	}
	
}
