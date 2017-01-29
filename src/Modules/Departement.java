package Modules;

public class Departement {

	public Departement(String name, String label, Room room, Employee secretary, Employee director) {
		super();
		this.name = name;
		this.label = label;
		this.room = room;
		this.secretary = secretary;
		this.director = director;
	}

	public String name;
	public String label;
	public Room room; //Bureau du département
	public Employee secretary;
	public Employee director;
	
}
