package com.starsharp.stepdefinitions;

import com.starsharp.models.MeetingModel;
import com.starsharp.questions.ValidateCreationName;
import com.starsharp.tasks.CreateBusinessUnitTask;
import com.starsharp.tasks.CreateMeetTask;
import com.starsharp.tasks.DebugPlatformTask;
import com.starsharp.tasks.LoginTask;
import com.starsharp.userinterfaces.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUnitMeetingStepDefinitions {
    private String nameUnitBusiness;
    private String nameMeetingBusiness;

    @Before
    public void intialConfing() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Lucia");
    }


    @Given("that I access the StartSharp platform with {string} and {string}")
    public void thatIAccessTheStartSharpPlatformWithAnd(String user, String password) {
        theActorInTheSpotlight().wasAbleTo(
                Open.browserOn().the(HomePage.class),
                LoginTask.withData(user, password)
        );
    }

    @When("I create meeting with a business unit")
    public void iCreateMeetingWithABusinessUnit(List<List<String>> formData) {
        MeetingModel meetingModel = new MeetingModel(formData.get(0));
        nameUnitBusiness = meetingModel.getNameUnit();
        nameMeetingBusiness = meetingModel.getMeetingName();
        theActorInTheSpotlight().attemptsTo(
                CreateBusinessUnitTask.withData(meetingModel.getNameUnit(), meetingModel.getParentUnit()),
                CreateMeetTask.createMeet(meetingModel)
        );
    }

    @Then("I verify the successful creation of the meeting {string}")
    public void iVerifyTheSuccessfulCreationOfTheMeeting(String meetingName) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateCreationName.verify(meetingName))
        );
    }

    @After
    public void endAutomation() {
        theActorInTheSpotlight().attemptsTo(
                DebugPlatformTask.withData(nameUnitBusiness, nameMeetingBusiness)
        );
        Serenity.getWebdriverManager().closeCurrentDrivers();
    }
}
