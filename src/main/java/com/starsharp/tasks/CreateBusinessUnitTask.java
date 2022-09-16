package com.starsharp.tasks;

import com.starsharp.interactions.OpenSidebarAction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static com.starsharp.userinterfaces.DashboardPage.*;


public class CreateBusinessUnitTask implements Task {

    private String nameUnit;
    private String parentUnit;

    public CreateBusinessUnitTask(String nameUnit, String parentUnit) {
        this.nameUnit = nameUnit;
        this.parentUnit = parentUnit;

    }

    public static Performable withData(String nameUnit, String parentUnit) {
        return Tasks.instrumented(CreateBusinessUnitTask.class, nameUnit, parentUnit);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OpenSidebarAction.openSidebar(),
                Click.on(LIST_ORGANIZATION),
                Click.on(LIST_BUSINESS_UNITS),
                Click.on(BUTTON_NEW_BUSINESS_UNITS),
                Enter.theValue(nameUnit).into(INPUT_NAME_BUSINESS_UNITS),
                Click.on(SELECT_PARENT_UNIT),
                Click.on(INPUT_PARENT_UNIT),
                Enter.theValue(parentUnit).into(INPUT_PARENT_UNIT).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE),
                Enter.theValue(nameUnit).into(INPUT_SEARCH_NAME).thenHit(Keys.ENTER),
                Ensure.that(LABEL_ELEMENT_NAME.of(nameUnit)).isDisplayed()
        );
    }
}
