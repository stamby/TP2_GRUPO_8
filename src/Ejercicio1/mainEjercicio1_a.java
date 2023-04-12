package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio1_a {
	public static void main (String[] args) {
		Profesor p1 = new Profesor ("Pepino",24,"Suplente de Geografia",0);
		Profesor p2 = new Profesor("Pepito",36,"Suplente de Geologia",12);
		Profesor p3 = new Profesor("Bartolo",48,"Titular de Matematica",24);
		Profesor p4 = new Profesor("Teresa",60,"Titular de Lengua",36);
		Profesor p5 = new Profesor("Leocadia",72,"Titular de Fisicoquimica",48);

		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		
		profesores.add(p1);
		profesores.add(p1);
		profesores.add(p2);
		profesores.add(p3);
		profesores.add(p4);
		profesores.add(p5);
		
		Iterator<Profesor> it = profesores.iterator();
		
		while (it.hasNext()) {
			Profesor profesor = it.next();
			System.out.println(profesor.toString());
		}
		
	}

}
