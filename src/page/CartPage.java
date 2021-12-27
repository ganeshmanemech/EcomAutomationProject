package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.DriverFactory;

public class CartPage {
	
	@FindBy(name="proceedToRetailCheckout")
	private WebElement processBuy;
	
	private WebDriverWait wait;
	
	public CartPage() {
		PageFactory.initElements(DriverFactory.localdriver.get(), this);
		wait=new WebDriverWait(DriverFactory.localdriver.get(), 20);
	}
	
	public AddressPage Buymethod(){
		processBuy.click();
		return new AddressPage();
	}
	
	public CartPage isPageDisplay() {
		wait.until(ExpectedConditions.visibilityOf(processBuy));
		return this;
	}


}
