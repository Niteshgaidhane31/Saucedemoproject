package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
	
	@FindBy (xpath="//button[@id='react-burger-menu-btn']")private WebElement menu;
	@FindBy (xpath="//button[@id='react-burger-cross-btn']")private WebElement closeMenu;
	@FindBy (xpath="//select[@data-test='product_sort_container']")private WebElement sort;
	@FindBy (xpath="//a[@class='shopping_cart_link']")private WebElement cartPage;
	@FindBy (xpath="//div[text()='Sauce Labs Backpack']")private WebElement selectProduct;
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement addToCartProduct;
	@FindBy (xpath="//a[text()='Twitter']")private WebElement twitter;
	@FindBy (xpath="//a[text()='Facebook']")private WebElement faceBook;
	@FindBy (xpath="//a[text()='LinkedIn']")private WebElement linkedIn;
	
	public SwagLabHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMenu() {
		menu.click();
	}
	public void clickOnMenuClose() {
		closeMenu.click();
	}
	public void clickOnSort() {
		sort.click();
	}
	public void clickOncart() {
		cartPage.click();
	}
	
	
	

}
