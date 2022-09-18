package com.starsharp.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.starsharp.userinterfaces.DashboardPage.BUTTON_SIDEBAR;

public class OpenSidebarAction implements Interaction {

    public static OpenSidebarAction openSidebar() {
        return new OpenSidebarAction();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (BUTTON_SIDEBAR.isVisibleFor(actor)) {
            actor.attemptsTo(
                    Click.on(BUTTON_SIDEBAR)
            );
        }
    }
}
