package Modules;

import java.util.ArrayList;

public class Group {

	private ArrayList<Student> students;
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	private String name;
	private int level;
	private int capacity;
	
	public Group(String name, int level, int cap){
		this.students = new ArrayList<>();
		this.level = level;
		this.capacity = cap;
		this.name = name;
	}
	
}
