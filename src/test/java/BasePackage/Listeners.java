package BasePackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;



public class Listeners extends baseClass implements ITestListener {
	ExtentReports extent= ExtentReportsOfTest.getReport();
	ExtentTest test;
	
	  @Override
	    public void onTestStart(ITestResult result) {
		  test= extent.createTest(result.getMethod().getMethodName());
	        
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // Code to execute on test success
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        // Code to execute on test failure
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        // Code to execute on test skipped
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        // Code to execute on test failure but within success percentage
	    }

	    @Override
	    public void onTestFailedWithTimeout(ITestResult result) {
	        // Code to execute on test failure with timeout
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        // Code to execute before any test method starts
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();
	    }

}
