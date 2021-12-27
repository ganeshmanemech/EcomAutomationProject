package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.DriverFactory;

public class PuzzlePage {
	
	@FindBy(xpath="//div[contains(@class,'a-section octopus-pc-category-card-v2-category')]")
	private WebElement jagsoSel;
	
	@FindBy(xpath="//div[contains(@class,'a-section octopus-pc-item-hue-shield octopus-pc-item-image-background-v3')]")
	private WebElement imagmking;
	
	private WebDriverWait wait;
	
	public PuzzlePage() {
		PageFactory.initElements(DriverFactory.localdriver.get(), this);
		wait=new WebDriverWait(DriverFactory.localdriver.get(), 20);
	}
	
	public BuyPage puzzelAddmthd(){
		jagsoSel.click();
		imagmking.click();
		return new BuyPage();
	}
	
	public PuzzlePage isPageDisplay() {
		wait.until(ExpectedConditions.visibilityOf(imagmking));
		return this;
	}

}
