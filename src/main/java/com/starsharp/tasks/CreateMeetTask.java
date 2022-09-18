package com.starsharp.tasks;

import com.starsharp.interactions.FocusElement;
import com.starsharp.interactions.OpenSidebarAction;
import com.starsharp.models.MeetingModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;

import static com.starsharp.userinterfaces.DashboardPage.BUTTON_SIDEBAR;
import static com.starsharp.userinterfaces.MeetingPage.*;

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
                Check.whether(BUTTON_SIDEBAR.isVisibleFor(actor)).andIfSo(Click.on(BUTTON_SIDEBAR)),
                Click.on(LIST_MEETING.of("Meeting")),
                Click.on(LIST_MEETING.of("Meetings")),
                Click.on(BUTTON_NEW_MEETING),
                Enter.theValue(meetingModel.getMeetingName()).into(INPUT_MEETING_NAME),
                Click.on(SELECT_MEETING_TYPE),
                Click.on(INPUT_LIST),
                Enter.theValue(meetingModel.getMeetingType()).into(INPUT_LIST).thenHit(Keys.ENTER),
                Enter.theValue(meetingModel.getMeetingNumber()).into(INPUT_MEETING_NUMBER),
                Enter.theValue(meetingModel.getStartDate()).into(INPUT_START_DATE),
                SelectFromOptions.byValue(meetingModel.getStarTime()).from(LIST_START_TIME),
                Enter.theValue(meetingModel.getEndDate()).into(INPUT_END_DATE),
                SelectFromOptions.byVisibleText(meetingModel.getEndTime()).from(LIST_END_TIME),
                Click.on(SELECT_LOCATION),
                Click.on(INPUT_LIST),
                Enter.theValue(meetingModel.getLocation()).into(INPUT_LIST).thenHit(Keys.ENTER),
                Click.on(SELECT_UNIT),
                Click.on(INPUT_LIST),
                Enter.theValue(meetingModel.getUnit()).into(INPUT_LIST).thenHit(Keys.ENTER),
                Click.on(SELECT_ORGANIZED_BY),
                Click.on(INPUT_LIST),
                Enter.theValue(meetingModel.getOrganizedBy()).into(INPUT_LIST).thenHit(Keys.ENTER),
                Click.on(SELECT_REPORTER),
                Click.on(INPUT_LIST),
                Enter.theValue(meetingModel.getReporter()).into(INPUT_LIST).thenHit(Keys.ENTER),
                Click.on(SELECT_ATTENDEE_LIST),
                Click.on(INPUT_LIST),
                Enter.theValue(meetingModel.getAttendeeList()).into(INPUT_LIST).thenHit(Keys.ENTER),
                SelectFromOptions.byVisibleText(meetingModel.getAttendeeType()).from(LIST_ATTENDEE_TYPE),
                SelectFromOptions.byVisibleText(meetingModel.getAttendanceStatus()).from(LIST_ATTENDANCE_STATUS),
                Scroll.to(BUTTON_SAVE_MEETING),
                Click.on(BUTTON_SAVE_MEETING)
        );
    }
}
