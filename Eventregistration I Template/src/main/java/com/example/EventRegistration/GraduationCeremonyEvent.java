package com.example.EventRegistration;


import java.util.ArrayList;
import java.util.List;

public class GraduationCeremonyEvent implements  CollegeEvent {

    /*
    1. Create the following attributes:
        a. name (initialize it as "Graduation Ceremony".
        b. address (String)
        c. time (String)
        d. date (String)
        e. count (int) (initially 0)
        f. eventAttendees (List of Attendee)
        NOTE: Initialize the address, time and date attributes with some values.
    2. Inject Attendee with attribute name "attendee" with setter injection.
    3. Make this class an implementation of CollegeEvent interface and override the interface methods.
    */
    String name="Graduation Ceremony";
    String address;
    String time;
    String date;
    String count;

    ArrayList<Attendee> eventAttendees;

    Attendee attendee;

    public GraduationCeremonyEvent(){
        eventAttendees=new ArrayList<Attendee>();
    }

    @Override
    public void registerStudent(Attendee user) {
        eventAttendees.add(user);
    }

    @Override
    public List<Attendee> getAllAttendees() {
        return eventAttendees;
    }

    @Override
    public void printEventDetails() {
        System.out.println("The Graduation Ceremony details are as follows:\nVenue: "+address+"\nTime: "+time+
                "\nDate: "+date);
    }

    @Override
    public int getAttendeeCount() {
        return eventAttendees.size();
    }

    public void setAttendee(Attendee attendee) {
        this.attendee = attendee;
    }
}
