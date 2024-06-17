package Utils_Package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utils_Action_Mathod {
	
	WebDriver driver;
	
	public utils_Action_Mathod(WebDriver driver) {
		this.driver=driver;
	}
	
	public void waitForElementClickable(WebElement element) {
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForElementVisibility(WebElement element) {
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForElementInvisibility(WebElement element) {
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public void clickButton(WebElement element) {
		
		element.click();
	}

}
