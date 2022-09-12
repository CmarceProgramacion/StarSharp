package com.starsharp.tasks;

import com.starsharp.models.MeetingModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;
import net.serenitybdd.screenplay.ui.Select;

public class CreateMeetTask implements Task {
    private MeetingModel meetingModel;

    public CreateMeetTask(MeetingModel meetingModel) {
        this.meetingModel = meetingModel;
    }

    public static Performable createMeet(MeetingModel meetingModel) {
        return Tasks.instrumented(CreateMeetTask.class, meetingModel);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("").from()

        );

    }
}
