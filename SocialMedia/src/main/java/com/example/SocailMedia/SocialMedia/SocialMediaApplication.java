package com.example.SocailMedia.SocialMedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class SocialMediaApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Scanner s = new Scanner(System.in);
		PostList postList=(PostList) context.getBean("simplePostList");
		System.out.println("Social Media Application Started !");
		for(;true;) {

			System.out.println("1)Make new Post \n2)Show All Post \n3)Exit");
			int choice = s.nextInt();
			switch (choice){
				case 1:
					Post post=(Post)context.getBean("simplePost");
					s.nextLine();
					System.out.print("Enter new Post :");
					String poststr=s.nextLine();
					post.setMessage(poststr);
					postList.setPost(post);
					break;
				case 2:
//					------------this case is not working---------------

					System.out.println("size of arrayList "+postList.size());
					for(int i=0; i< postList.size(); i++){
						System.out.println(i+") "+postList.getPost(i).getPost());
					}
					break;
				case 3:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid Entry");
					break;
			}

			System.out.println("If i want to run application again: \n1)Yes \n2)No");
			int res=s.nextInt();
			if(res==2)return;

		}

    }

}
