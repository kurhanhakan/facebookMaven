package com.facebook.testbase;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.facebook.utils.CommonMethods;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// printing logs to the console
		System.out.println("Test Starting: " + result.getName());

		// creating test logs into ExtentReports
		BaseClass.test = BaseClass.report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// output logs to the console
		System.out.println("Test Passed: " + result.getName());

		// output test logs into ExtentReports
		BaseClass.test.pass("Test Case Passed: " + result.getName());

		// this method grabs the screenshot taken and saved at a location and adds it to
		// the report
		try {
			BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("passed/" + result.getName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		// output logs to the console
		System.out.println("Test Failed: " + result.getName());

		// output test logs into ExtentReports
		BaseClass.test.fail("Test Case Failed: " + result.getName());

		// this method grabs the screenshot taken and saved at a location and adds it to
		// the report
		try {
			BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("failed/" + result.getName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
