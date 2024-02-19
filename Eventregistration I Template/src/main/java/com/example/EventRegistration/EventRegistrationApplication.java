package com.example.EventRegistration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.util.Scanner;


@SpringBootApplication
public class EventRegistrationApplication {

	public static void main(String[] args) {
		// Import scanner and take ClassPathXmlApplicationContext.

		System.out.println("Welcome to the Graduation Ceremony Registration Application");
		// Take the college event bean from the application context.
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

		CollegeEvent event = (CollegeEvent)context.getBean("event");
		// Print the event details.
		Scanner scanner=new Scanner(System.in);
		while (true) {
			System.out.println("Do you want to register for the ceremony\n1. Yes\n2. No");
			int input = scanner.nextInt();
			if (input == 1) {
				/*
				 1. Take attendee details from the console.
				 2. Get studentAttendee bean from context and set the attendee details
				 3. Register the attendee for the event.
				 4. Print the registration confirmation.
				 */
				Attendee student=(Attendee) context.getBean("student");
				scanner.nextLine();
				System.out.println("Please enter your name");
				String name=scanner.nextLine();
				System.out.println("Please enter your department");
				String department=scanner.nextLine();
				System.out.println("In which year you pass out");
				int batch=scanner.nextInt();
				student.setAttendeeDetails(name,department,batch);
				event.setAttendee(student);
				event.registerStudent(student);
				student.printRegistrationConfirmation();

			} else if(input == 2) {
				break;
			} else {
				System.out.println("Invalid Choice");
				return;
			}
		}

		// Get the number of attendees and print along with the statement below
		System.out.println("No. of attendees registered are: " + event.getAttendeeCount());
		System.out.println("The list of attendees are: \n");
		for(int i=0; i< event.getAttendeeCount(); i++) {
			String refernceId=event.getAllAttendees().get(i).toString();
			refernceId=refernceId.substring(refernceId.indexOf("@"));
			System.out.println(event.getAllAttendees().get(i).getAttendeeName()+" Reference id: "+refernceId);
		}
		// Print all the attendee names with their reference ids as given in the sample output..

	}

}
