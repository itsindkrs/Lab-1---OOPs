package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface CredService {
	String generateEmailId(String firstname, String lastname, String dept);

	String generatePassword();

	void showDetails(Employee e1);

}
