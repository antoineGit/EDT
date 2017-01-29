package Modules;

import java.util.ArrayList;

public class Course {

	public Employee teacherRef;
	public ArrayList<Group> groups;
	
	public Course(Employee emp, ArrayList<Group> gp){
		this.groups = new ArrayList<>();
		this.teacherRef = emp;
		
	}
	
	public Course(Employee emp){
		this.groups = new ArrayList<>();
		this.teacherRef = emp;
	}
}
