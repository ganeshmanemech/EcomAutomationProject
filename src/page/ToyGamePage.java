package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.DriverFactory;

public class ToyGamePage {
//	@FindBy(xpath="//img[text()='3-4 years']")
//	@FindBy(xpath="//div[contains(@class,'bxc-grid__image   bxc-grid__image--light')]")
//	@FindBy(xpath="//img[contains(@onload,'window.uet && uet.call && uet(\"af\");')]")
	@FindBy(xpath="//a[contains(@aria-label,'3-4 years')]")
//	@FindBy(id="contentGrid_609453")
	private WebElement threeyrclick;

	
	private WebDriverWait wait;
	
	public ToyGamePage() {
		PageFactory.initElements(DriverFactory.localdriver.get(), this);
		wait=new WebDriverWait(DriverFactory.localdriver.get(), 20);
	}
	
	public ThreeYearPage threeYrMethod(){
		
		threeyrclick.click();
		return new ThreeYearPage();
	}
	
	public ToyGamePage isPageDisplay() {
		wait.until(ExpectedConditions.visibilityOf(threeyrclick));
		return this;
	}

}
