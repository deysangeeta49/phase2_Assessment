package com.swiggy.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PlaceAnOrder extends Driver {

	@Given("a user is on the home of Swiggy")
	public void a_user_is_on_the_home_of_swiggy() {
		Assert.assertTrue(driver.getTitle()
				.equals("Order food online from India's best food delivery service. Order from restaurants near you"));
	}

	@Given("he is able to enter your delivery location as {string} and hit enter")
	public void he_is_able_to_enter_your_delivery_location_as_and_hit_enter(String string) {

		landingPage.enterLocation("Bangalore");
		landingPage.selectLocation();
		

	}

	@Given("he is able to click on first search result under restaurants")
	public void he_is_able_to_click_on_first_search_result_under_restaurants() {

		items.selectFirstItem();

	}

	@Given("he is able to click on Add button under Top Picks of that restaurant")
	public void he_is_able_to_click_on_add_button_under_top_picks_of_that_restaurant() {
		placeOrder.addItem();

	}

	@Given("he is able to click on Checkout button under Cart")
	public void he_is_able_to_click_on_checkout_button_under_cart() {
		placeOrder.checkOut();
	}

	@Then("he must be able to {string}")
	public void he_must_be_able_to(String string) {
		String expectedErrMsg = string;
		String actualErrMsg = checkOut.getMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);

	}

}
