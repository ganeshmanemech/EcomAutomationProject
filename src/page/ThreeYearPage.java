package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import common.DriverFactory;

public class ThreeYearPage {
//	@FindBy(xpath="//span[contains(@class,'nav-a-content')]")
//	@FindBy(id="nav-subnav")
//	@FindBy(xpath="//span[contains(@class,'nav-a-content')]")
	@FindBy(xpath="//span[contains(text(),'Puzzles') and @class='nav-a-content']")
	private WebElement clickpuzzles;
	
	private WebDriverWait wait;
	
	public ThreeYearPage() {
		PageFactory.initElements(DriverFactory.localdriver.get(), this);
		wait=new WebDriverWait(DriverFactory.localdriver.get(), 20);
	}
	
	public PuzzlePage nevigetPuzzle(){
		
		clickpuzzles.click();
		return new PuzzlePage();
	}
	
	public ThreeYearPage isPageDisplay() {
		wait.until(ExpectedConditions.visibilityOf(clickpuzzles));
		return this;
	}

}
