package com.delta.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutableClass extends Base {

	public static void main(String[] args) {
		
        getDriver();
		
		getUrl("https://www.facebook.com/");
		
      /*WebElement txtMail=driver.findElement(By.id("email"));
		type(txtMail, "Java");
		
		WebElement txtPwd=driver.findElement(By.name("pass"));
		type(txtPwd, "API");
		
		WebElement login=driver.findElement(By.name("login"));
		b.btnClick(login);
		
		b.quitBrowser();*/		
		
		LogInPage logInPage = new LogInPage();
		
		type(logInPage.getTxtMail(), "Selenium");
		
		type(logInPage.getTxtPwd(), "Java");
		
		btnClick(logInPage.getFbLoginBtn());
		
	}
	
}
