package Modules;

public class Departement {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public Employee getSecretary() {
		return secretary;
	}
	public void setSecretary(Employee secretary) {
		this.secretary = secretary;
	}
	public Employee getDirector() {
		return director;
	}
	public void setDirector(Employee director) {
		this.director = director;
	}
	public Departement(String name, String label, Room room, Employee secretary, Employee director) {
		super();
		this.name = name;
		this.label = label;
		this.room = room;
		this.secretary = secretary;
		this.director = director;
	}

	private String name;
	private String label;
	private Room room; //Bureau du département
	private Employee secretary;
	private Employee director;
	
}
