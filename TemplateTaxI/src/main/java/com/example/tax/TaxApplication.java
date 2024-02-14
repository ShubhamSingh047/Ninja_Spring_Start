package com.example.tax;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class TaxApplication {

	public static void main(String[] args) {
		// Take ClassPathXmlApplicationContext from applicationContext.xml file
//		Scanner s= new Scanner(System.in);
//		System.out.println("Enter the type of tax you want to submit \n1)Property \n2)Income");
//		int n=s.nextInt();
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

		IncomeTax it=(IncomeTax) context.getBean("incomeTax");
		PropertyTax pt=(PropertyTax) context.getBean("propertyTax");
//		if(n==1){
//			System.out.println();
//		}else{
//			System.out.println();
//		}
	}

}
