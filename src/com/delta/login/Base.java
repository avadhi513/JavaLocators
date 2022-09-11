package com.delta.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\JavaLocators\\driver\\chromedriver.exe");
	
	driver=new ChromeDriver();
	return driver;
	
	}
	
	public static void getUrl(String txt) {
		driver.get(txt);
}
	
	public static void type(WebElement element,String txt) {
		element.sendKeys(txt);

	}
	
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	public static void quitBrowser() {
		driver.quit();

	}
}