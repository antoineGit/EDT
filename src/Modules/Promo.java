package Modules;

public class Promo {

	//public Year year;
	public Semester s1;
	public Semester s2;
	public int capacity;
	public int level; 
	public String name;
	public String libelle;
	public Departement dep;
	
	//TO-DO : Alternance/Classique
	public Promo(String name, String libelle, Departement dep, int lvl, int cap, Semester s1, Semester s2){
		this.name = name;
		this.libelle = libelle;
		this.dep = dep;
		this.level = lvl;
		this.capacity = cap;
		this.s1 = s1;
		this.s2 = s2;
		
	}
}
