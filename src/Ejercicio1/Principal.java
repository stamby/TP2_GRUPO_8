package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
	
	public static void mainEjercicio1_a() {
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		
		for (int i = 0; i < 5; i++) {
			profesores.add(new Profesor());
		}
		
		profesores[0].setNombre("Pepino");
		profesores[1].setNombre("Pepito");
		profesores[2].setNombre("Bartolo");
		profesores[3].setNombre("Teresa");
		profesores[4].setNombre("Leocadia");
		
		profesores[0].setEdad(24);
		profesores[1].setEdad(36);
		profesores[2].setEdad(48);
		profesores[3].setEdad(64);
		profesores[4].setEdad(72);
		
		profesores[0].setCargo("Suplente de Geografía");
		profesores[1].setCargo("Suplente de Geología");
		profesores[2].setCargo("Titular de Matemática");
		profesores[3].setCargo("Titular de Lengua");
		profesores[4].setCargo("Titular de Fisicoquímica");

		profesores[0].setAntiguedadDocente(0);
		profesores[1].setAntiguedadDocente(12);
		profesores[2].setAntiguedadDocente(24);
		profesores[3].setAntiguedadDocente(36);
		profesores[4].setAntiguedadDocente(48);

		Iterator<String> it = profesores.iterator();
		
		System.out.println(it.next());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
