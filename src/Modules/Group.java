package Modules;

import java.util.ArrayList;

public class Group {

	public ArrayList<Student> students;
	public String name;
	public int level;
	public int capacity;
	
	public Group(String name, int level, int cap){
		this.students = new ArrayList<>();
		this.level = level;
		this.capacity = cap;
		this.name = name;
	}
	
	
}
