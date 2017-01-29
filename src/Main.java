
import java.util.ArrayList;

import Modules.*;

public class Main {

	public static void main(String[] args){
		Year y1 = new Year(2016, 2017);
		Week w1 = new Week();
		Week w2 = new Week();
		ArrayList<Week> arrWeek = new ArrayList<>();
		arrWeek.add(w2);
		arrWeek.add(w1);
		
		Building build = new Building("P", "Paris");
		Room roomMido = new Room(build, 032, 50);
		Employee dir = new Employee();
		Employee sec = dir;
		Departement dep = new Departement("MIDO","Math Info Decision Org", roomMido, dir, sec);

		Course d1 = new Course(dir);
		Course d2 = new Course(dir);
		ArrayList<Course> arrCourses = new ArrayList<>();
		arrCourses.add(d1);
		arrCourses.add(d2);
		

		Semester s1 = new Semester(arrCourses, arrWeek);
		Semester s2 = new Semester(arrCourses, arrWeek);
		
		Promo us = new Promo("MIAGE Info","Maths Info App Gestion Entre", dep ,3,40, s1, s2 );
		Promo them = new Promo("MIAGE Math","Maths Info App Gestion Entre", dep,3,40, s1, s2);
	
		Student moi = new Student("Antoine", "Auer", null, us);
		Student toi = new Student("Vincent", "Fritsch", null, us);
		Group g1 = new Group("Group 1", 1, 50);
		g1.students.add(moi);
		g1.students.add(toi);
		Group g2 = new Group("Group 2", 2, 50);
		g2.students.add(moi);
		g2.students.add(toi);
		
		ArrayList<Group> classe = new ArrayList<>();
		classe.add(g1);
		classe.add(g2);
		
		Course c1 = new Course(sec,classe);
		Course c2 = new Course(dir, classe);
	
	
	
	
	}
}
