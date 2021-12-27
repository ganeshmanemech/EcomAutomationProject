package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.DriverFactory;

public class PaymentPage {
//	@FindBy(name="ppw-instrumentRowSelection")
	@FindBy(xpath="//span[text()='SBI Credit Card']")
	private WebElement SBIcred;
	
	private WebDriverWait wait;
	
	public PaymentPage() {
		PageFactory.initElements(DriverFactory.localdriver.get(), this);
		wait=new WebDriverWait(DriverFactory.localdriver.get(), 20);
	}
	
	public void SBICreditMethod(){

		SBIcred.click();
		
	}
	
	public PaymentPage isPageDisplay() {
		wait.until(ExpectedConditions.visibilityOf(SBIcred));
		return this;
	}


}
