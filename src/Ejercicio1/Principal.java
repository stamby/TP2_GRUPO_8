package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
	public static void mainEjercicio1_a() {
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();

		profesores.add(new Profesor(
			"Pepino",
			24,
			"Suplente de Geografia",
			0));

		profesores.add(new Profesor(
			"Pepito",
			36,
			"Suplente de Geologia",
			12));

		profesores.add(new Profesor(
			"Bartolo",
			48,
			"Titular de Matematica",
			24));

		profesores.add(new Profesor(
			"Teresa",
			60,
			"Titular de Lengua",
			36));

		profesores.add(new Profesor(
			"Leocadia",
			72,
			"Titular de Fisicoquímica",
			48));
		}
	
		Iterator<Profesor> it = profesores.iterator();
	
		System.out.println(profesores_it.next());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
