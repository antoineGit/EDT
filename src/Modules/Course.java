package Modules;

import java.util.ArrayList;

public class Course {

	//public Discipline discipline;
	public Employee teacherRef;
	public ArrayList<Group> groups;
	
	public Course(String name,Employee emp, ArrayList<Group> gp){
		this.groups = new ArrayList<>();
		//this.name = name;
		this.teacherRef = emp;
		
	}
	
	public Course(String name, Employee emp){
		this.groups = new ArrayList<>();
		this.teacherRef = emp;
		//this.name = name;
	}
}
