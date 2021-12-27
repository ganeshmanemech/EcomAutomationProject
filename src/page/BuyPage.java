package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.DriverFactory;

public class BuyPage {
	@FindBy(id="add-to-cart-button")
	private WebElement AddCart;
	
	@FindBy(id="nav-cart-count")
	private WebElement NevigetCart;
	
	private WebDriverWait wait;
	
	public BuyPage() {
		PageFactory.initElements(DriverFactory.localdriver.get(), this);
		wait=new WebDriverWait(DriverFactory.localdriver.get(), 20);
	}
	
	public CartPage cartMethod(){
		AddCart.click();
		NevigetCart.click();
		return new CartPage();
	}
	
	public BuyPage isPageDisplay() {
		wait.until(ExpectedConditions.visibilityOf(AddCart));
		return this;
	}


}
