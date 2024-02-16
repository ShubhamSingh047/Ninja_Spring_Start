package com.example.Vaccination;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class VaccinationApplication {

    public static void main(String[] args) {

        /*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

		 Tasks:
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch vaccine and User type choice.
		3. Get the required bean from context.
		4. Get the appointment details form user
		5. Display the appointment details
		6. Run the loop again to book for another user or else exit.
		 */
        Scanner s= new Scanner(System.in);
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
        String vaccine="";
        String member="";
       while (true) {
           System.out.println("Welcome to the Vaccination Application\nPlease choose your vaccine preference:" +
                   "\n1.Covid\n2.Polio\n3.Typhoid");
           int n = s.nextInt();
           switch (n) {
               case 1 -> {
                   vaccine = "Covid";
               }
               case 2 -> {
                   vaccine = "Polio";
               }
               case 3 -> {
                   vaccine = "Typhoid";
               }
               default -> {
                   System.out.println("Invalid entry !");
                   return;
               }
           }
           System.out.println("Whom do you want to vaccinate" +
                   "\n1.Father\n2.Mother\n3.Self\n4.Spouse\n5.Exit");
           int n2 = s.nextInt();
           switch (n2) {
               case 1 -> {
                   member = "father";
               }
               case 2 -> {
                   member = "mother";
               }
               case 3 -> {
                   member = "self";
               }
               case 4 -> {
                   member = "spouse";
               }
               case 5 -> {
                   System.out.println("Exiting..");
                   return;
               }
               default -> {
                   System.out.println("Invalid entry..");
                   return;
               }
           }
               User user=(User)context.getBean("fatherCovid");
               Vaccine vaccines=(Vaccine)context.getBean(vaccine);
               TimeAndLocation timeAndLocation= (TimeAndLocation) context.getBean("timeAndLocation");
           if(user.IsVaccinated()){
               System.out.println("user is already vaccinated");
           }else {
               System.out.println("Please Enter " + member + " details:");
               s.nextLine();
               System.out.print("name:");
               String name = s.nextLine();
               System.out.print("age: ");
               int age = s.nextInt();
               s.nextLine();
               System.out.print("Appointment date (YYYY-MM-DD): ");
               String date = s.nextLine();
               System.out.print("Appointment time (HH:MM AM/PM): ");
               String time = s.nextLine();
               System.out.print("Appointment location: ");
               String location = s.nextLine();
               timeAndLocation.setDetails(time, date, location);
               user.setUserDetails(name, age, timeAndLocation);
               user.setAppointment();

           }

           System.out.println("Do you want to register for Someone Else\n1.Yes\n2.No");
           int choice = s.nextInt();
           if (choice == 2) {
               break;
           }
       }
       s.close();
       }
    }