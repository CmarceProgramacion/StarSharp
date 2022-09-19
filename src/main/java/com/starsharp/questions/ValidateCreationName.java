package com.starsharp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.starsharp.userinterfaces.DashboardPage.INPUT_SEARCH_NAME;
import static com.starsharp.userinterfaces.DashboardPage.LABEL_ELEMENT_NAME;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidateCreationName implements Question<Boolean> {
    private String meetingName;

    public ValidateCreationName(String meetingName) {
        this.meetingName = meetingName;
    }

    public static ValidateCreationName verify(String meetingName) {
        return new ValidateCreationName(meetingName);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(meetingName).into(INPUT_SEARCH_NAME).thenHit(Keys.ENTER)
        );

        return LABEL_ELEMENT_NAME.of(meetingName).isVisibleFor(actor);
    }
}
