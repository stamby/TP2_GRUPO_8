package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet<Profesor> ListaProfesores = new TreeSet<Profesor>();
		
		Profesor p1 = new Profesor ("Pablo",52,"Suplente de Etica",8);
		Profesor p2 = new Profesor("Marta",61,"Suplente de Matematica",12);
		Profesor p3 = new Profesor("Carmen",36,"Titular de Literatura",10);
		Profesor p4 = new Profesor("Francisco",44,"Titular de Algebra",2);
		Profesor p5 = new Profesor("Carlos",53,"Titular de Geografia",20);
		
		ListaProfesores.add(p1);
		ListaProfesores.add(p2);
		ListaProfesores.add(p3);
		ListaProfesores.add(p4);
		ListaProfesores.add(p5);
		
		Iterator<Profesor> it = ListaProfesores.iterator();
		while (it.hasNext()) {
			Profesor prof = it.next();
			System.out.println(prof.toString());
		}
	}

}
