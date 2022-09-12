package com.starsharp.stepdefinitions;

import com.starsharp.models.MeetingModel;
import com.starsharp.questions.ValidateMessage;
import com.starsharp.tasks.Login;
import com.starsharp.tasks.CreateBusinessUnitTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.Keys;

import static com.starsharp.userinterfaces.DashboardPage.INPUT_SEARCH_BUSINESS_UNIT;
import static com.starsharp.utils.AccessList.URL_PLATFORM;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUnitMeetingStepDefinitions {

    @Before
    public void intialConfing() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Lucia");
    }


    @Given("that I access the StartSharp platform with {string} and {string}")
    public void thatIAccessTheStartSharpPlatformWithAnd(String user, String password) {
        theActorInTheSpotlight().wasAbleTo(
                Open.url(URL_PLATFORM.getUrl()),
                Login.withData(user, password)
        );

    }

    @When("I create a business unit {string} and {string}")
    public void iCreateABusinessUnitAnd(String nameUnit, String parentUnit) {
        System.out.println(nameUnit);
        theActorInTheSpotlight().attemptsTo(
                CreateBusinessUnitTask.withData(nameUnit, parentUnit)
        );
    }

    @Then("I verify the successful creation of the business unit {string}")
    public void iVerifyTheSuccessfulCreationOfTheBusinessUnit(String nameUnit) {

        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(nameUnit).into(INPUT_SEARCH_BUSINESS_UNIT).thenHit(Keys.ENTER)
        );
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateMessage.verify(nameUnit))
        );
    }

    @When("I create the meeting")
    public void iCreateTheMeeting(DataTable formData) {
        MeetingModel meetingModel = new MeetingModel(formData.asList());



    }

    @Then("I verify the successful creation of the meeting {string}")
    public void iVerifyTheSuccessfulCreationOfTheMeeting(String meetingName) {

    }


}
