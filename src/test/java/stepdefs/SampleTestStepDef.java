package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SampleTestStepDef {

    @Given("I hit sample web application")
    public void launchApplication(){
        System.out.println("launching in check");
    }

    @Then("I verify sample test")
    public void verifyTest(){
        System.out.println("verifying");
    }
}
