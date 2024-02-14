package com.example.SpringNinja.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class BasicsApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BasicsApplication.class, args);
		System.out.println("Welcome !");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of table \n1)small \n2)long");
		int size=s.nextInt();

		//careating manually object for spring
		Longtable lt= new Longtable();
		ShortTable st= new ShortTable();

		if(size==1){
			System.out.println(st.showDetails());
		}else{
			System.out.println(lt.showDetails());
		}
	}

}
