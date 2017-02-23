package Modules;

import java.util.ArrayList;

public class Semester {

	public Semester(ArrayList<Course> disciplines) {
		super();
		this.disciplines = disciplines;
		
	}
	
	public Semester() {
		super();
		this.disciplines = new ArrayList<>();
		
	}
	public ArrayList<Course> disciplines;
	
}
