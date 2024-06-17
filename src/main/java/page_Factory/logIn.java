package page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils_Package.utils_Action_Mathod;

public class logIn extends utils_Action_Mathod {
	
	WebDriver driver;
	
	public logIn(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	public WebElement test;
	
	
	
	

}
