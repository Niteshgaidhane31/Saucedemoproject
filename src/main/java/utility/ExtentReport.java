package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static ExtentReports getReports() {
		ExtentSparkReporter sparkReport=new ExtentSparkReporter("ExtentReport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(sparkReport);
		extent.setSystemInfo("ReportedBy","Nitesh");
		extent.setSystemInfo("TestType", "Regression");
	
		return extent;
		
	}

}
