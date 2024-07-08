package com.screenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerscreenshot extends BaseTest implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		//Screenshots(result.getTestName()+".jpg");
		Screenshots(result.getMethod().getMethodName()+".jpg");
	}

	
	
	
	
}
