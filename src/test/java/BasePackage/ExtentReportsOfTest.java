package BasePackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsOfTest {
	public static ExtentReports getReport() {
		String reportFilePath = System.getProperty("user.dir") + "/target/Reports";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportFilePath);
		reporter.config().setReportName("Web Test Report");
		reporter.config().setDocumentTitle("Test Report");
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vijay Bist");
		extent.setSystemInfo("Environment","QA");
		
		return extent;
		
	}

}
