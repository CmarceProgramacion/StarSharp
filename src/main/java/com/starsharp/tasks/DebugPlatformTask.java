package com.starsharp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.starsharp.userinterfaces.DashboardPage.*;
import static com.starsharp.userinterfaces.MeetingPage.BUTTON_CONFIRMS_ELIMINATION;
import static com.starsharp.userinterfaces.MeetingPage.BUTTON_DELETE_MEETING;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class DebugPlatformTask implements Task {
    private String nameUnitBusiness;
    private String nameMeetingBusiness;

    public DebugPlatformTask(String nameUnitBusiness, String nameMeetingBusiness) {
        this.nameUnitBusiness = nameUnitBusiness;
        this.nameMeetingBusiness = nameMeetingBusiness;
    }

    public static Performable withData(String nameUnitBusiness, String nameMeetingBusiness) {
        return Tasks.instrumented(DebugPlatformTask.class, nameUnitBusiness, nameMeetingBusiness);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(LABEL_ELEMENT_NAME.of(nameMeetingBusiness)),
                Click.on(BUTTON_DELETE_MEETING),
                Click.on(BUTTON_CONFIRMS_ELIMINATION),
                WaitUntil.the(LABEL_ELEMENT_NAME.of(nameMeetingBusiness), isNotVisible()).forNoMoreThan(4).seconds(),
                Check.whether(BUTTON_SIDEBAR.isVisibleFor(actor)).andIfSo(Click.on(BUTTON_SIDEBAR)),
                Click.on(LIST_ORGANIZATION),
                Click.on(LIST_BUSINESS_UNITS),
                Enter.theValue(nameUnitBusiness).into(INPUT_SEARCH_NAME).thenHit(Keys.ENTER),
                WaitUntil.the(LABEL_ELEMENT_NAME.of(nameUnitBusiness), isClickable()).forNoMoreThan(5).seconds(),
                Click.on(LABEL_ELEMENT_NAME.of(nameUnitBusiness)),
                Click.on(BUTTON_DELETE_MEETING),
                Click.on(BUTTON_CONFIRMS_ELIMINATION),
                WaitUntil.the(LABEL_ELEMENT_NAME.of(nameUnitBusiness), isNotVisible()).forNoMoreThan(5).seconds()
        );
    }
}
