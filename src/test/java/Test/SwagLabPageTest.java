package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import pojo.Browser;
import pom.SwagLabLoginPage;
import utility.ExtentReport;
import utility.Paramaterization;
import utility.SwagLabPageElement;
@Listeners(utility.Listners.class)
public class SwagLabPageTest extends SwagLabPageElement {
	ExtentReports reports;
	ExtentTest test;
	
	
	@BeforeMethod
	public void configueReports() {
		reports=ExtentReport.getReports();
	}
	@BeforeMethod
	public void launchApplication() {
		driver=Browser.openChromeBrowser();		
	}
	@Test
	public void SwagLabLoginTest() throws EncryptedDocumentException, IOException {
		SwagLabLoginPage swagLabLoginPage=new SwagLabLoginPage(driver);
		swagLabLoginPage.enterUserId(Paramaterization.getExcelSheetData(0, 0, "Credentials"));
		swagLabLoginPage.enterPassword(Paramaterization.getExcelSheetData(1, 0, "Credentials"));
		swagLabLoginPage.clickOnLogin();
		String expectedUrl="https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
	}
	
    @AfterMethod
      public void addResults(ITestResult results) {
    	if(results.getStatus()==ITestResult.SUCCESS)
    	{
    		test.log(Status.PASS, results.getName());
    	}
    	else if (results.getStatus()==ITestResult.FAILURE)
    	{
    		test.log(Status.FAIL, results.getName());
    	}
    	else
    	{
    		test.log(Status.SKIP, results.getName());
    	}
    }
	
     @AfterTest
     public void flushReport() {
    	reports.flush();
}
}
