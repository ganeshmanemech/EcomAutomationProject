package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.DriverFactory;

public class WelcomePage {
	@FindBy(id="nav-link-accountList-nav-line-1")
	private WebElement title;
//	@FindBy(xpath="//a[@data-csa-c-id='qh2z5f-a41ewu-glzx4u-xbcpfz']")
//	@FindBy(xpath="//a[contains(@data-csa-c-slot-id,'nav_cs_2')]")
		@FindBy(xpath="//a[contains(@data-csa-c-type,'link')]")	
//	@FindBy(xpath="//a[text()='Toys & Games']")
	private WebElement productclick;

	@FindBy(id="nav-cart-count")
	private WebElement NevigetCart;
	
	private WebDriverWait wait;
	
	public WelcomePage() {
		PageFactory.initElements(DriverFactory.localdriver.get(), this);
		wait=new WebDriverWait(DriverFactory.localdriver.get(), 20);
	}
	
	public ToyGamePage homepage(String name){
		Assert.assertEquals(title.getText(), name,"Welcome msg is notsame");
		productclick.click();
		return new ToyGamePage();
	}
	
	public CartPage homePagetoCart(String name){
		Assert.assertEquals(title.getText(), name,"Welcome msg is notsame");
		NevigetCart.click();
		return new CartPage();
	}
	
	public WelcomePage isPageDisplay() {
		wait.until(ExpectedConditions.visibilityOf(title));
		return this;
	}


}
