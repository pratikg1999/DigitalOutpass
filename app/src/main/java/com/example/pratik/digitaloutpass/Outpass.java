package com.example.pratik.digitaloutpass;

import java.util.Date;

public class Outpass {
    private static int curId = 0;
    private int id;
    String personName;
    String to;
    String from;
    Date leaveDate;
    Date returnDate;

    public Outpass() {


    }

    public Outpass(String personName, String to, String from, Date leaveDate, Date returnDate) {
        this.id = curId++;
        this.personName = personName;
        this.to = to;
        this.from = from;
        this.leaveDate = leaveDate;
        this.returnDate = returnDate;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }


    public int getId() {
        return id;
    }

    public String getPersonName() {
        return personName;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }
}