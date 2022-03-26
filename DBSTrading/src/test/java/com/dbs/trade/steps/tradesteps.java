package com.dbs.trade.steps;

import org.junit.Assert;

import com.dbs.trade.libs.tradelibs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class tradesteps {
	
	@Steps
	tradelibs trade;
	
	@Given("^Login to dbs trade application$")
	public void login_to_dbs_trade_application() {
		trade.loginApplication();
	}

	@Given("^Click on \"([^\"]*)\" button from alerts section$")
	public void click_on_button_from_alerts_section(String btnName) {
			trade.ClickAButton(btnName);
	}

	@Given("^Enter \"([^\"]*)\" in alert dailog$")
	public void enter_in_alert_dailog(String price) {
		trade.enterAlertPrice(price);
	}

	@When("^Click on \"([^\"]*)\" button$")
	public void click_on_button(String btnName) {
		trade.ClickAButton(btnName);
	}

	@Then("^Validate Alerts tab for new alert$")
	public void validate_Alerts_tab_for_new_alert() {
			trade.validateNewAlert();
	}

	@Given("^Click on \"([^\"]*)\" Tab$")
	public void click_on_Tab(String tabName) {
		trade.clickATab(tabName);
	}

	@Given("^Validate the defaule prise of DBS stock$")
	public void validate_the_defaule_prise_of_DBS_stock() {
			trade.dbsDefaultPrice();
	}

	@When("^Select \"([^\"]*)\" and \"([^\"]*)\" values$")
	public void select_and_values(String orderType, String quantity) {
			trade.enterValues(orderType, quantity);
	}

	@When("^Click on \"([^\"]*)\" button from lower section$")
	public void click_on_button_from_lower_section(String btnName) {
		trade.ClickAButton(btnName);
	}

	@Then("^Validate total number of stocks in profile page$")
	public void validate_total_number_of_stocks_in_profile_page() {
		trade.totalNumberofStocks();
	}

	@Given("^Validate the availability of sell tab$")
	public void validate_the_availability_of_sell_tab() {
			trade.availabilityOfTab();
	}

	@Given("^User should be able to view comments in social tab$")
	public void user_should_be_able_to_view_comments_in_social_tab() {
			trade.validateCommentsInSocialTab();
	}

	@When("^Select \"([^\"]*)\" and \"([^\"]*)\" from lower section for buy$")
	public void select_and_from_lower_section_for_buy(String orderType, String quantity) {
		trade.enterValues(orderType, quantity);
	}

	@Then("^Click on \"([^\"]*)\" Tab from lower section for sell$")
	public void click_on_Tab_from_lower_section_for_sell(String tabName) {
		trade.clickATab(tabName);
		Serenity.setSessionVariable("Operation").to(tabName);
	}

	@Then("^Select \"([^\"]*)\" and \"([^\"]*)\" values from lower section for sell$")
	public void select_and_values_from_lower_section_for_sell(String orderType, String quantity) {
		trade.enterValues(orderType, quantity);
	}

	@Then("^Click on \"([^\"]*)\" button from lower section for sell$")
	public void click_on_button_from_lower_section_for_sell(String btnName) {
		trade.ClickAButton(btnName);
	}
}
