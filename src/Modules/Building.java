package Modules;

import java.util.ArrayList;

public class Building {

	public String name;
	public String libelle;
	public ArrayList<Room> rooms;
	
	public Building(String name, String libelle){
		this.name = name;
		this.libelle = libelle;
		this.rooms = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


}
