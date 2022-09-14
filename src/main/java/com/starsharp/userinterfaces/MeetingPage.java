package com.starsharp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingPage extends PageObject {

    public static final Target LIST_MEETING = Target.the("List of meetings").locatedBy("//a[@class='s-sidebar-link']/child::span[text()='{0}']");
    public static final Target BUTTON_NEW_MEETING = Target.the("Add new meeting button ").locatedBy("//span[@class='button-inner'][text()=' New Meeting']");
    public static final Target INPUT_MEETING_NAME = Target.the("Text field to add new meeting").located(By.name("MeetingName"));
    public static final Target SELECT_MEETING_TYPE = Target.the("Drop-down list of meeting type").locatedBy("//span[contains(text(),'General')]");
    public static final Target INPUT_LIST = Target.the("Text field to enter in meeting type ").locatedBy("//div[contains(@style,'block')]//following-sibling::input[starts-with(@class,'select2-input')]");
    public static final Target INPUT_MEETING_NUMBER = Target.the("Text field for entering the meeting number ").located(By.name("MeetingNumber"));
    public static final Target INPUT_START_DATE = Target.the("Text field to enter start date").located(By.name("StartDate"));
    public static final Target INPUT_END_DATE = Target.the("Text field to enter end date").located(By.name("EndDate"));
    public static final Target LIST_START_TIME = Target.the("Drop-down list of start time").locatedBy("(//select[starts-with(@class,'editor s-DateTimeEditor time')])[1]");
    public static final Target LIST_END_TIME = Target.the("Drop-down list of time end date").locatedBy("(//select[starts-with(@class,'editor s-DateTimeEditor time')])[2]");
    public static final Target SELECT_LOCATION = Target.the("Drop-down list of location").locatedBy("(//label[@title='Location']//following::span[@class='select2-chosen'])[1]");
    public static final Target SELECT_UNIT = Target.the("Drop-down list of unit").locatedBy("(//label[@title='Unit']//following::span[@class='select2-chosen'])[1]");
    public static final Target SELECT_ORGANIZED_BY = Target.the("Drop-down list of organized by").locatedBy("(//label[@title='Organized By']//following::span[@class='select2-chosen'])[1]");
    public static final Target SELECT_REPORTER = Target.the("Drop-down list of reporter").locatedBy("(//label[@title='Reporter']//following::span[@class='select2-chosen'])[1]");
    public static final Target SELECT_ATTENDEE_LIST = Target.the("Drop-down list of attendee").locatedBy("//div[contains(@id,'_AttendeeList')]//following::span[@class='select2-chosen']");
    public static final Target LIST_ATTENDEE_TYPE = Target.the("Drop-down list of attendee type").locatedBy("//div[@class='slick-cell l2 r2']/child::select");
    public static final Target LIST_ATTENDANCE_STATUS = Target.the("Drop-down list of attendance status").locatedBy("//div[@class='slick-cell l3 r3']/child::select");
    public static final Target BUTTON_SAVE_MEETING = Target.the("Button to save the meeting").locatedBy("//div[contains(@class,'save-and-close-button')]//child::span");
    public static final Target BUTTON_DELETE_MEETING = Target.the("Button to delete the meeting").locatedBy("//div[@class='tool-button delete-button icon-tool-button']");
    public static final Target BUTTON_CONFIRMS_ELIMINATION = Target.the("Button to confirm the deletion of the meeting").locatedBy("//button[@class='btn btn-primary']");
}
