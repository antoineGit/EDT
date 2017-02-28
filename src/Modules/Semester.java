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
	private ArrayList<Course> disciplines;
	public ArrayList<Course> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(ArrayList<Course> disciplines) {
		this.disciplines = disciplines;
	}
	
	public void addDiscipline(Course c){
		this.disciplines.add(c);
	}
	
}
