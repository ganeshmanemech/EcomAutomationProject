package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedFn implements IInvokedMethodListener {

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		//DriverFactory.localdriver.get().quit();
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumJava\\chromedriver.exe");
		DriverFactory.localdriver.set(new ChromeDriver());
		DriverFactory.localdriver.get().manage().window().maximize();
		DriverFactory.localdriver.get().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		DriverFactory.localdriver.get().get("https://www.amazon.in/ref=nav_logo");
		
	}
	

}
