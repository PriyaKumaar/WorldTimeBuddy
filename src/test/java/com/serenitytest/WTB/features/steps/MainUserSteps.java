package com.serenitytest.WTB.features.steps;

import java.io.IOException;
import com.serenitytest.WTB.features.pages.FacebookSigin;
import com.serenitytest.WTB.features.pages.HomePage;
import com.serenitytest.WTB.features.pages.MoveToDate;
import com.serenitytest.WTB.features.pages.SearchForLocation;

import net.thucydides.core.annotations.Step;

public class MainUserSteps {

	HomePage homePage;
	SearchForLocation locationsearch;
	MoveToDate search;
	FacebookSigin createAccount;
	//EventClass event;

	@Step
	public void openHomepage() {
		homePage.open();
	}

	@Step
	public void Sigin() throws InterruptedException {
		createAccount.signIn();
	}

	@Step
	public void FacebookRegistration() throws InterruptedException, IOException {
		createAccount.UserRegistration();
	}
		@Step
	public void login() {
		createAccount.login();
	}

	@Step
	public void SelectDate() throws InterruptedException {
		search.selectDate();
	}
	@Step
	public void AssertDate() throws InterruptedException {
		search.Textassertion();
	}
	@Step
	public void Selectforlocation() throws InterruptedException {
		locationsearch.searchlocation("Chennai");
	}
	@Step
	public void Selectforlocationassertion() throws InterruptedException {
		locationsearch.Textassertion();
	}
	
}