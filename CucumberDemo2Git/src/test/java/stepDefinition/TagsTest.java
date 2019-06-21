package stepDefinition;

import cucumber.api.java.en.*;

public class TagsTest {
	
	@Given("Test one backgraound")
	public void test_one_backgraound() {
	   System.out.println("Test one backgraound");
	}

	@When("Test two background")
	public void test_two_background() {
		System.out.println("Test two background"); 
	}

	@Then("Test three background")
	public void test_three_background() {
		System.out.println("Test three background");
	}

	@Given("It is a smoke first step")
	public void it_is_a_smoke_first_step() {
		System.out.println("It is a smoke first step");
	}

	@When("It is a smoke second step")
	public void it_is_a_smoke_second_step() {
		System.out.println("It is a smoke second step");
	}

	@Then("It is a smoke third step")
	public void it_is_a_smoke_third_step() {
		System.out.println("It is a smoke third step");
	}

	@Given("It is a regression first step")
	public void it_is_a_regression_first_step() {
		System.out.println("It is a regression first step");
	}

	@When("It is a regression second step")
	public void it_is_a_regression_second_step() {
		System.out.println("It is a regression second step");
	}

	@Then("It is a regression third step")
	public void it_is_a_regression_third_step() {
		System.out.println("It is a regression third step");
	}


}
