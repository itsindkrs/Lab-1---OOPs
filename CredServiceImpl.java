package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredServiceImpl implements CredService {

	@Override
	public String generateEmailId(String firstname, String lastname, String dept) {

		return firstname + lastname + "@" + dept + ".gl.com";
	}

	@Override
	public String generatePassword() {

		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String splchars = "!@#$%^&*()";

		String combined = caps + lower + nums + splchars;
		String mypass = "";
		Random random = new Random();

		for (int i = 0; i < 8; i++) {
			mypass = mypass + String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		return mypass;
	}

	@Override
	public void showDetails(Employee e1) {
		System.out.println("Employee First Name is " + e1.getFirstname());
		System.out.println("Employee Last Name is " + e1.getLastname());
		System.out.println("Employee Email is " + e1.getEmail());
		System.out.println("Employee Password is " + e1.getPassword());
	}

}
