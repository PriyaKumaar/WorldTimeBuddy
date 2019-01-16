package com.serenitytest.WTB.features.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MoveToDate extends PageObject {
	
	@FindBy(xpath = "//*[@id=\"toolbar-default\"]/span[5]/span/span[1]/span ")
	WebElementFacade moveToNextdate;

	@FindBy(xpath="//*[@id=\"toolbar-default\"]/span[5]/span/span[1]/span")
	
	WebElementFacade DateAssert;
	
	public void selectDate() throws InterruptedException
	
	{
		Actions builder = new Actions(getDriver());
		builder.moveToElement(moveToNextdate).click().perform();
	}
	public void Textassertion() {
		assertEquals("Jan 14", DateAssert.getText());
	}

}
		
		



