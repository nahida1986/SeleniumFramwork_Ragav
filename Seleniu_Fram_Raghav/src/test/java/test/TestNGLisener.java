package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGLisener implements ITestListener {

	public static WebDriver driver = null;
	public void onTestStart(ITestResult result) {
		System.out.println( "****Test Start : "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*****Test Success : "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		 System.out.println("*****Test Failure : "+result.getName());
		
		 
		
	}

	public void onTestSkipped(ITestResult result) {
		 System.out.println("****Test Skipped : "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		//TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		 System.out.println("*****Test Finish : "+context.getName());
		
	}
	
	//public void takeScrenShort(WebDriver driver, String methodName) {
		
	//}

}
