package edu.mu;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to CS3330");
		int x =5;
		int y = 2;
		System.out.println("Some string " + (x + y));
		
		System.out.println(x++); // 5 POST ++ --> 6
		System.out.println(x); // Now it is 6
		
		// 1/29/2025
		
		/*
		
		java.util.Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		String firstname = input.next();
		String lastname = input.next();
		input.nextLine();
		String bio = input.nextLine();
		
		System.out.println("First Name: " + firstname + " Lastname: " + lastname + " Age: " + age);
		System.out.println("Bio: " + bio);
		
		*/
		
		// Import from a file
		Scanner fileInput = null;
		try {
			fileInput = new Scanner(new FileInputStream("./files/secret.txt"));
			//System.out.println(fileInput.next());
			//System.out.println(fileInput.next());
			//System.out.println(fileInput.nextLine());
			while(fileInput.hasNextLine()) {
				System.out.println(fileInput.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}