package Modules;

import java.sql.Date;

public class Student {

	public Student(String firstName, String lastName, Date birthDate, Promo promo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.promo = promo;
	}
	
	public String firstName;
	public String lastName;
	public Date birthDate;
	public Promo promo;
	
	

	
}
