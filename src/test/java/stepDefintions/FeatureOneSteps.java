package stepDefintions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FirstPage;

import java.net.MalformedURLException;

public class FeatureOneSteps extends Base {
    FirstPage firstPage;
    @Given("This is step one")
    public void thisIsStepOne() {
    }

    @And("This is step two")
    public void thisIsStepTwo() {
    }

    @When("This is step three")
    public void thisIsStepThree() {
    }

    @Then("This is step four")
    public void thisIsStepFour() {
    }
}

