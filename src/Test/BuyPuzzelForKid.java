package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.IInvokedFn;
import page.HomePage;

@Listeners(IInvokedFn.class)
public class BuyPuzzelForKid {
	
	@Test
	public void buyProducTest1() {
		HomePage hm=new HomePage();
		hm.clickLogin()
		.LoginMethod("ganeshmanemech@gmail.com", "Chinu@2018")
		.homepage("Hello, Ganesh")
		.threeYrMethod()
		.nevigetPuzzle()
		.puzzelAddmthd()
		.cartMethod()
		.Buymethod()
		.addereMethod()
		.SBICreditMethod();
		
	}
	
	@Test(enabled=false)
	public void buyProducTest2() {
		HomePage hm=new HomePage();
		hm.clickLogin()
		.LoginMethod("ganeshmanemech@gmail.com", "Chinu@2018")
		.homePagetoCart("Hello, Ganesh")
		.Buymethod()
		.addereMethod()
		.SBICreditMethod();
		
	}

}
