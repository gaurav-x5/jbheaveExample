package com.jbehave.exampleJbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class IncreaseSteps {
    private int counter;
    private int previousValue;

    @Given("a counter")
    public void aCounter() {
    }

    @Given("the counter has any integral value")
    public void counterHasAnyIntegralValue() {
        counter = new Random().nextInt();
        previousValue = counter;
    }

    @When("the user increases the counter")
    public void increasesTheCounter() {
        counter++;
    }

    @When("the user decreases the counter")
    public void decreasesTheCounter() {
        counter--;
    }


    @Then("the value of the counter must be 1 greater than previous value")
    public void theValueOfTheCounterMustBe1Greater() {
        assertTrue(1 == counter - previousValue);
    }

    @Then("the value of the counter must be 1 lower than previous value")
    public void theValueOfTheCounterMustBe1Lower() {
        assertTrue(-1 == counter - previousValue);
    }
}