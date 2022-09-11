package com.delta.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends Base {

	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(id="email")
	private WebElement txtMail;
	
	@FindBy(id="pass")
	private WebElement txtPwd;
	
	@FindBy(xpath="//button[@name ='login']")
	private WebElement fbLoginBtn;

	// right click - generate getters and setters
	
	public WebElement getTxtMail() {
		return txtMail;
	}

	public WebElement getTxtPwd() {
		return txtPwd;
	}

	public WebElement getFbLoginBtn() {
		return fbLoginBtn;
	}

}
