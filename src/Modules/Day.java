package Modules;

import java.io.StreamTokenizer;
import java.util.ArrayList;

public class Day {

	public int day;
	public int startHour = 8*60 + 30;
	public ArrayList<Hour> hours;
	public int pause = 15;
	public int duree = 105;
	public int nbPlageHoraire = 7;
	public int endHour ;
	
	public Day(int day){
		this.hours = new ArrayList<>();
		for(int i=0; i<nbPlageHoraire ; i++)
			this.hours.add(null);
		this.endHour = startHour + nbPlageHoraire*duree;
		this.day = day;
	}
	
	public Day(int day, int start, int duree, int pause, int nbPlageHoraire){
		this.hours = new ArrayList<>();
		for(int i=0; i<nbPlageHoraire ; i++)
			this.hours.add(null);
		this.day = day;
		this.duree = duree;
		this.pause = pause;
		this.startHour = start;
		this.nbPlageHoraire = nbPlageHoraire;
		this.endHour = startHour + nbPlageHoraire*duree;
	}

	public int getStartHour() {
		return startHour;
	}

	public void setStartHour(int startHour) {
		this.startHour = startHour;
	}

	public ArrayList<Hour> getHours() {
		return hours;
	}

	public void setHours(ArrayList<Hour> hours) {
		this.hours = hours;
	}

	public int getPause() {
		return pause;
	}

	public void setPause(int pause) {
		this.pause = pause;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getNbPlageHoraire() {
		return nbPlageHoraire;
	}

	public void setNbPlageHoraire(int nbPlageHoraire) {
		this.nbPlageHoraire = nbPlageHoraire;
	}

	public int getEndHour() {
		return endHour;
	}

	public void setEndHour(int endHour) {
		this.endHour = endHour;
	}
	
	
	
	
}
