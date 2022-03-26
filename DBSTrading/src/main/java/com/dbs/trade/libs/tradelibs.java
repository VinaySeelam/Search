package com.dbs.trade.libs;

import com.dbs.trade.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class tradelibs {

	HomePage home;

	@Step("Click on a Button")
	public void ClickAButton(String btnName) {
		home.ClickAButton(btnName);

	}

	@Step("Enter Alert Price")
	public void enterAlertPrice(String price) {

		home.enterAlertPrice(price);
	}

	@Step("Validating new alert created by user")
	public void validateNewAlert() {

		home.validateNewAlert();

	}

	@Step("Click on a TAB")
	public void clickATab(String tabName) {

		home.clickATab(tabName);
	}

	@Step("Validate the defaule price of DBS stock")
	public void dbsDefaultPrice() {

		home.dbsDefaultPrice();
	}

	@Step("Provide ordertype and quantity")
	public void enterValues(String orderType, String quantity) {

		home.enterValues(orderType, quantity);
	}

	@Step("validate total number of stocks")
	public void totalNumberofStocks() {

		home.totalNumberofStocks();
	}

	@Step("validate the availablity of tab")
	public void availabilityOfTab() {

		home.availabilityOfTab();
	}

	@Step("Validate the comments in social app")
	public void validateCommentsInSocialTab() {

		home.validateCommentsInSocialTab();
	}

	@Step("Login Application")
	public void loginApplication() {
		home.loginApplication();
		
	}

}
