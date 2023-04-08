package Ejercicio1;

public class Empleado {
	private final int id; // Una vez definido, el "id" no se puede modificar.
	private String nombre;
	private int edad;
	
	private static int proximoId = 1000; // Variable est�tica
	
	public static String devuelveProximoId() {
		return "El pr�ximo ID ser� el " + proximoId;
	} // M�todo est�tico

	public Empleado () { 
		this.id = proximoId; // Definida por �nica vez
		this.nombre = "Sin Nombre";
		this.edad = 99;

		proximoId++;
	}
	
	public Empleado (String nombre, int edad) {
		this.id = proximoId;
		this.nombre = nombre;
		this.edad = edad;

		proximoId++;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado ID=" + id + ", NOMBRE=" + nombre + ", EDAD=" + edad;
	} 
	
}
