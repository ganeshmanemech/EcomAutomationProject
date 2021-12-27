package common;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	public static ThreadLocal<WebDriver> localdriver=new ThreadLocal<>();

}
