package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners extends SwagLabPageElement implements ITestListener{
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is succesfull"+ result.getName());
	}
	public void onTsetFailure(ITestResult result) {
		try {
			ScreenShot.takeScreenShot(driver, result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped"+ result.getName());
	}
	public void onTestStart(ITestResult result) {
		System.out.println("Test is satarted"+ result.getName());
	}
}
