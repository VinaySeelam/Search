package com.canada.drives.steps;

import org.junit.Assert;

import com.canada.drives.libs.CarWaleSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NewCarSteps {
	
	@Steps
	CarWaleSteps car;
	
	
	@Given("^User accessing CanadaDrives \"([^\"]*)\"$")
	public void user_accessing_CanadaDrives(String url) {
		car.navigate(url);
	}

	@Given("^Select Ontario Province$")
	public void select_Ontario_Province() {
		car.selectCarType();
	}

	@When("^Filter RAM (\\d+) vehicles using Make/Model filter$")
	public void filter_RAM_vehicles_using_Make_Model_filter(int model) {
		car.selectCarModel(model);
	}

	@When("^Sort by Price Low to High$")
	public void sort_by_Price_Low_to_High() {
		car.sortByPrice();
	}

	@When("^Favourite (\\d+) RAM (\\d+) vehicles$")
	public void favourite_RAM_vehicles(int totalcars, int carModel) {
		car.selectfavorites(totalcars,carModel);
	}

	@When("^Pick an available RAM (\\d+) vehicle$")
	public void pick_an_available_RAM_vehicle(int carType) {
		car.pickACar(carType);
	}

	@Then("^Click on Get Started$")
	public void click_on_Get_Started() {
		car.carCheckOut();
	}

	@Then("^In Calculate delivery, Enter Toronto Address$")
	public void in_Calculate_delivery_Enter_Toronto_Address() {
		car.calculateDeliveryAddress();
	}

	@Then("^Select (\\d+) Months warranty$")
	public void select_Months_warranty(int months) {
		car.selectWarrenty(months);
	}
	
	


}
