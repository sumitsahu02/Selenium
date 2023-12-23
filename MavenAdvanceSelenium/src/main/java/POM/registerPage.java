package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerPage extends BasePage {

	
	public registerPage(WebDriver driver) {
		super(driver);
	
	}

	@FindBy(id = "gender-male")
	private WebElement genderlink;

	public WebElement getGenderlink() {
		return genderlink;
	} 
	
	@FindBy(id = "FirstName")
   private	WebElement firstnamelink;

	public WebElement getFirstnamelink() {
		return firstnamelink;
	}
	
	@FindBy(id = "LastName")
	private WebElement lastnamelink;

	public WebElement getLastnamelink() {
		return lastnamelink;
	}
	
	@FindBy(id = "Email")
	private WebElement emaillink;

	public WebElement getEmaillink() {
		return emaillink;
	}
	@FindBy(id = "Password")
	private WebElement passwordlink;

	public WebElement getPasswordlink() {
		return passwordlink;
	}
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpasswordlink;

	public WebElement getConfirmpasswordlink() {
		return confirmpasswordlink;
	}
	@FindBy(id = "register-button")
	private WebElement registerbuttonlink;

	public WebElement getRegisterbuttonlink() {
		return registerbuttonlink;
	}
}
