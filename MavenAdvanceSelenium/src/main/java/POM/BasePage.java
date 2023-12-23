package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import generic.utitly_Method;

public class BasePage extends utitly_Method {

	BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
