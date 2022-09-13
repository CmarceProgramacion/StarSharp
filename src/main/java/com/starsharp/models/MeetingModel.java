package com.starsharp.models;

import java.util.List;

public class MeetingModel {
    private String nameUnit;
    private String parentUnit;
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


    public MeetingModel(List<String> listMeeting) {
        this.nameUnit = listMeeting.get(0);
        this.parentUnit = listMeeting.get(1);
        this.meetingName = listMeeting.get(2);
        this.meetingType = listMeeting.get(3);
        this.meetingNumber = listMeeting.get(4);
        this.startDate = listMeeting.get(5);
        this.starTime = listMeeting.get(6);
        this.endDate = listMeeting.get(7);
        this.endTime = listMeeting.get(8);
        this.location = listMeeting.get(9);
        this.unit = listMeeting.get(10);
        this.organizedBy = listMeeting.get(11);
        this.reporter = listMeeting.get(12);
        this.attendeeList = listMeeting.get(13);
        this.attendeeType = listMeeting.get(14);
        this.attendanceStatus = listMeeting.get(15);
    }

    public String getNameUnit() {
        return nameUnit;
    }

    public void setNameUnit(String nameUnit) {
        this.nameUnit = nameUnit;
    }

    public String getParentUnit() {
        return parentUnit;
    }

    public void setParentUnit(String parentUnit) {
        this.parentUnit = parentUnit;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }

    public String getMeetingNumber() {
        return meetingNumber;
    }

    public void setMeetingNumber(String meetingNumber) {
        this.meetingNumber = meetingNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getOrganizedBy() {
        return organizedBy;
    }

    public void setOrganizedBy(String organizedBy) {
        this.organizedBy = organizedBy;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getAttendeeList() {
        return attendeeList;
    }

    public void setAttendeeList(String attendeeList) {
        this.attendeeList = attendeeList;
    }

    public String getAttendeeType() {
        return attendeeType;
    }

    public void setAttendeeType(String attendeeType) {
        this.attendeeType = attendeeType;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }
}
