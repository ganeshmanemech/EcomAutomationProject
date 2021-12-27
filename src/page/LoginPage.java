package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.DriverFactory;

public class LoginPage {
	
	@FindBy(id="ap_email")
	private WebElement login;
	@FindBy(id="continue")
	private WebElement contin;
	@FindBy(id="ap_password")
	private WebElement password;
	@FindBy(id="signInSubmit")
	private WebElement signin;
	
	private WebDriverWait wait;
	
	public LoginPage() {
		PageFactory.initElements(DriverFactory.localdriver.get(), this);
		wait=new WebDriverWait(DriverFactory.localdriver.get(), 20);
	}
	
	public WelcomePage LoginMethod(String user, String pass){
		login.sendKeys(user);
		contin.click();
		password.sendKeys(pass);
		signin.click();
		return new WelcomePage();
	}
	
	public LoginPage isPageDisplay() {
		wait.until(ExpectedConditions.visibilityOf(signin));
		return this;
	}

}
