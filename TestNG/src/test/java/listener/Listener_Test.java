package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Test implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getName()+"test case is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(result.getName()+" test case is success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("the name of the testcase failure is:"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("the name of the testcase skipped is:"+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("the name of the test case is failed because of timeout is:"+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("ready to start");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("execution is finished");
		
	}
	
	

}
