package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.DriverFactory;

public class HomePage {
	@FindBy(id="nav-link-accountList-nav-line-1")
	private WebElement signin;
	@FindBy(id="glow-ingress-line1")
	private WebElement hello;
			
	private WebDriverWait wait;
			
	public HomePage() {
		PageFactory.initElements(DriverFactory.localdriver.get(), this);
		wait=new WebDriverWait(DriverFactory.localdriver.get(), 20);
	}
	
	public LoginPage clickLogin(){
		Assert.assertEquals(hello.isDisplayed(), true,"Hello is avialable on screen");
		signin.click();
		return new LoginPage();
	}
	
	public HomePage isPageDisplay() {
		wait.until(ExpectedConditions.visibilityOf(signin));
		return this;
	}

}










