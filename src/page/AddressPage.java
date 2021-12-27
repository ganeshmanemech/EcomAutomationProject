package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.DriverFactory;

public class AddressPage {
	@FindBy(xpath="//a[contains(@data-action,'page-spinner-show')]")
	private WebElement addAddere;
	
	private WebDriverWait wait;
	
	public AddressPage() {
		PageFactory.initElements(DriverFactory.localdriver.get(), this);
		wait=new WebDriverWait(DriverFactory.localdriver.get(), 20);
	}
	
	public PaymentPage addereMethod(){
		addAddere.click();
		return new PaymentPage();
	}
	
	public AddressPage isPageDisplay() {
		wait.until(ExpectedConditions.visibilityOf(addAddere));
		return this;
	}


}
