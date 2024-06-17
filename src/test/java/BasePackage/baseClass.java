package BasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		Properties prt = new Properties();
		String propertyFilePath = System.getProperty("user.dir")
				+ "/src/main/java/GlobalResourcesFile/BasicDataInput.properties";
		FileInputStream fl = new FileInputStream(propertyFilePath);
		prt.load(fl);
		String browserName = prt.getProperty("Browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {

		} else if (browserName.equalsIgnoreCase("edge")) {

		} else if (browserName.equalsIgnoreCase("safari")) {

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}

	@BeforeMethod
	public void openWebsite() throws IOException {
		Properties prt = new Properties();
		String propertyFilePath = System.getProperty("user.dir")
				+ "/src/main/java/GlobalResourcesFile/BasicDataInput.properties";
		FileInputStream fl = new FileInputStream(propertyFilePath);
		prt.load(fl);
		String url = prt.getProperty("url");
		driver = initializeDriver();
		driver.get(url);
	}
	
	@AfterMethod
	public void closewebsite() {
		driver.close();
	}

}
