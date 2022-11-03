package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {

	@FindBy (xpath="//input[@id='user-name']")private WebElement userId;
	@FindBy (xpath="//input[@id='password']")private WebElement password;
	@FindBy (xpath="//input[@id='login-button']")private WebElement logIn;
	@FindBy (xpath="//h3[@data-test='error']")private WebElement errorMsg;
	
	public SwagLabLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUserId(String user) {
		userId.sendKeys(user);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLogin() {
		logIn.click();
	}
	public String getErrormsg() {
		String error1=errorMsg.getText();
         return error1;
	}

}
