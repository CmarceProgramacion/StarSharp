package com.starsharp.models;

import java.util.List;

public class MeetingModel {
    private String meetingName;
    private String meetingType;
    private String meetingNumber;
    private String startDate;
    private String starTime;
    private String endDate;
    private String endTime;
    private String location;
    private String unit;
    private String organizedBy;
    private String reporter;
    private String attendeeList;
    private String attendeeType;
    private String attendanceStatus;


    public MeetingModel(List<String> listMeeting ) {
        this.meetingName = listMeeting.get(0);
        this.meetingType = listMeeting.get(1);
        this.meetingNumber = listMeeting.get(2);
        this.startDate = listMeeting.get(3);
        this.starTime = listMeeting.get(4);
        this.endDate = listMeeting.get(5);
        this.endTime = listMeeting.get(6);
        this.location = listMeeting.get(7);
        this.unit = listMeeting.get(8);
        this.organizedBy = listMeeting.get(9);
        this.reporter = listMeeting.get(10);
        this.attendeeList = listMeeting.get(11);
        this.attendeeType = listMeeting.get(12);
        this.attendanceStatus = listMeeting.get(13);
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }

    public void setMeetingNumber(String meetingNumber) {
        this.meetingNumber = meetingNumber;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setOrganizedBy(String organizedBy) {
        this.organizedBy = organizedBy;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public void setAttendeeList(String attendeeList) {
        this.attendeeList = attendeeList;
    }

    public void setAttendeeType(String attendeeType) {
        this.attendeeType = attendeeType;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public String getMeetingNumber() {
        return meetingNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getStarTime() {
        return starTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getLocation() {
        return location;
    }

    public String getUnit() {
        return unit;
    }

    public String getOrganizedBy() {
        return organizedBy;
    }

    public String getReporter() {
        return reporter;
    }

    public String getAttendeeList() {
        return attendeeList;
    }

    public String getAttendeeType() {
        return attendeeType;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }
}
