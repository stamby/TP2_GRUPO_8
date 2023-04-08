package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
	
	public static void mainEjercicio1_a() {
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();

		profesores.add(new Profesor(
			"Pepino",
			24,
			"Suplente de Geografía",
			0));

		profesores.add(new Profesor(
			"Pepito",
			36,
			"Suplente de Geología",
			12));

		profesores.add(new Profesor(
			"Bartolo",
			48,
			"Titular de Matemática",
			24));

		profesores.add(new Profesor(
			"Teresa",
			"Titular de Lengua",
			36));

		profesores.add(new Profesor(
			"Leocadia",
			60,
			"Titular de Fisicoquímica",
			48));
		}

		Iterator<String> it = profesores.iterator();
		
		System.out.println(it.next());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
