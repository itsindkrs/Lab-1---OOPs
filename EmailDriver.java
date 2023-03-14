package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredServiceImpl;

public class EmailDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String fname = sc.next();
		System.out.println("Enter Last name");
		String lname = sc.next();
		Employee e1 = new Employee(fname, lname);
		Employee e2 = new Employee();
		e2.setFirstname(fname);
		e2.setLastname(lname);
		CredServiceImpl cs = new CredServiceImpl();
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		System.out.println("Enter Choice");
		int choice = sc.nextInt();
		String genemial = "";
		String genpass = "";
		switch (choice) {
		case 1:
			genemial = cs.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "Tech");
			break;
		case 2:
			genemial = cs.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "Admin");
			break;
		case 3:
			genemial = cs.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "HR");
		case 4:
			genemial = cs.generateEmailId(e1.getFirstname().toLowerCase(), e1.getLastname().toLowerCase(), "Legal");
			break;
		default:
			System.out.println("Please enter valid choice");
		}
		genpass = cs.generatePassword();
		e1.setEmail(genemial);
		e1.setPassword(genpass);

		cs.showDetails(e1);
	}
};
