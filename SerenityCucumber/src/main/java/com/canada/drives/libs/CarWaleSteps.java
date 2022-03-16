package com.canada.drives.libs;

import net.thucydides.core.annotations.Step;
import pages.HomePage;


public class CarWaleSteps {
		
	HomePage home;
	
	@Step("Navigating to Carwale.com website HomePage")
	public void navigate(String url) {	
			home.openBaseUrl(url);
	}

	@Step("Select Car Type")
	public void selectCarType() {
		home.selectCarType();
	}

	@Step("Select Car Model")
	public void selectCarModel(int model) {
		home.selectCarModel(model);
		
	}

	@Step("Sort cars by Price")
	public void sortByPrice() {
		home.sortByPrice();
		
	}

	@Step("Navigating to Carwale.com website HomePage")
	public void selectfavorites(int totalcars, int carModel) {
		home.selectfavorites(totalcars,carModel);
		
	}

	@Step("pick a Car from list")
	public void pickACar(int carType) {
		home.pickACar(carType);
		
	}

	@Step("Check out a car")
	public void carCheckOut() {
		home.carCheckOut();
		
	}

	@Step("Calculate delivery address")
	public void calculateDeliveryAddress() {
		home.calculateDeliveryAddress();
		
	}

	@Step("Select Warrenty")
	public void selectWarrenty(int months) {
		home.selectWarrenty(months);
		
	}

}
