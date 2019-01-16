package com.serenitytest.WTB.features.pages;

import static org.junit.Assert.assertEquals;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchForLocation extends PageObject {

	@FindBy(xpath = "//*[@id=\"location\"]")
	WebElementFacade location;

	@FindBy(xpath = "//*[@id=\"locations\"]/div[3]/div[5]/div[3]/div[1]/b")
	WebElementFacade Text;

	public void searchlocation(String values) {

			 typeInto(location, values);
			 location.click();	 
	}
	
	public void Textassertion() {
		assertEquals("Singapore", Text.getText());
	}

}