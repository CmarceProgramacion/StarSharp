package com.starsharp.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateUnitMeetingStepDefinitions {


    @Given("that I access the StartSharp platform with {string} and {string}")
    public void thatIAccessTheStartSharpPlatformWithAnd(String user, String password) {

    }

    @When("I create a business unit {string} and {string}")
    public void iCreateABusinessUnitAnd(String nameUnit, String parentUnit) {

    }

    @Then("I verify the successful creation of the business unit")
    public void iVerifyTheSuccessfulCreationOfTheBusinessUnit(DataTable unitData) {

    }

    @When("I create the meeting")
    public void iCreateTheMeeting(DataTable formData) {

    }

    @Then("I verify the successful creation of the meeting {string}")
    public void iVerifyTheSuccessfulCreationOfTheMeeting(String meetingName) {

    }


}
