package TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.registerPage;
import generic.Base_Test;
import generic.Read_Excel;

public class registerTest extends Base_Test {

	@DataProvider(name="ram")
	public static Object[][] excel() throws Throwable
	{
		return Read_Excel.fetchExcel();
		
	}
	
	@Test(dataProvider = "ram")
	public void testcase(String s1,String s2,String s3,String s4,String s5)
	{
		registerPage r=new registerPage(driver);
		driver.findElement(By.linkText("Register")).click();
		r.getGenderlink().click();
		r.getFirstnamelink().sendKeys(s1);
		r.getLastnamelink().sendKeys(s2);
		r.getEmaillink().sendKeys(s3);
		r.getPasswordlink().sendKeys(s4);
		r.getConfirmpasswordlink().sendKeys(s5);
		r.getRegisterbuttonlink().click();
	}
}
