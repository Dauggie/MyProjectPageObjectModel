package com.tests.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import com.tests.utils.RetryTest;

public class CustomListener implements ITestListener , IAnnotationTransformer{

	@Override
	public void onTestStart(ITestResult result) {
		String start = result.getName();
		System.out.println("Test : "+start +" started");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String success = result.getName();
		System.out.println("Test : "+success +" Succesfully Completed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String fail = result.getName();
		System.out.println("Test : "+fail +" Failed");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String skip = result.getName();
		System.out.println("Test : "+skip +" Skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("INITIALIZING : "+context.getName().toUpperCase() + "!!!");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("TERMINATING : "+context.getName().toUpperCase() + "!!!");

	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(RetryTest.class);
		
	}

}
