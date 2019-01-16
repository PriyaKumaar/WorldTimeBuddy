package com.serenitytest.WTB.features.pages;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FacebookSigin extends PageObject {

	@FindBy(xpath = "//*[@id=\"tab_signin\"]/span")
	WebElementFacade Signin;

	@FindBy(xpath = "//*[@id=\"tabs-func\"]/li[1]/div/a[1]")
	WebElementFacade Facebook;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElementFacade Email;

	@FindBy(xpath = "//*[@id=\"pass\"]")
	WebElementFacade Password;
	
	@FindBy(xpath = "//*[@id=\"loginbutton\"]")
	WebElementFacade login;

	@FindBy(id = "logoutbutton")
	WebElementFacade logout;
	

	public void signIn() throws InterruptedException {
		Actions builder = new Actions(getDriver());
		builder.moveToElement(Signin).click().perform(); //Facebook Functionality
		waitForVisibility(Facebook);
		Facebook.click();
		System.out.println("Success");
		
	}

	private void waitForVisibility(WebElement element) throws Error { //Method to wait for the visibility of the element
		new WebDriverWait(getDriver(), 60000000).until(ExpectedConditions.visibilityOf(element));
	}

	public void UserRegistration() throws IOException, InterruptedException {
	
		Email.sendKeys("83452589");
		Password.sendKeys("Test123!@#");
		
	}
		

	public void login() {  //Login functionality 
	Actions action = new Actions(getDriver()); 
	action.moveToElement(login).perform(); 
	waitForVisibility(login); 
	action.moveToElement(login).click().perform(); }
	 

}