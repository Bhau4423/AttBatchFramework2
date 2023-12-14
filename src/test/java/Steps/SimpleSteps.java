package Steps;

import io.cucumber.java.en.*;

public class SimpleSteps {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("This is When statement");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("This is When statement");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("This is When statement");
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("This is When statement");
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("This is When statement");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("This is When statement");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("This is When statement");  
	}

}
