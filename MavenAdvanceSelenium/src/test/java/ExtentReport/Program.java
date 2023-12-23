package ExtentReport;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Program {

	@Test
	public void report() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		String source = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter esp=new ExtentSparkReporter("ExtendReport//attachedreport.html");
		
		ExtentReports er=new ExtentReports();
		
		er.attachReporter(esp);
		
		ExtentTest test = er.createTest("Program");
		
		test.log(Status.INFO,"test case attached with an extent report");
		
		test.addScreenCaptureFromBase64String(source);
		er.flush();
	}
}
