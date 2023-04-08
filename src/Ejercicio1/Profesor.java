package Ejercicio1;

public class Profesor extends Empleado {
	private String cargo;
	private int antiguedadDocente;
	
	Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setCargo(cargo);
		this.setAntiguedadDocente(antiguedadDocente);
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setAntiguedadDocente(String antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	
	@Override
	public String toString() {
		return "Profesor ID=" + id
				+ ", NOMBRE=" + nombre
				+ ", EDAD=" + edad
				+ ", CARGO=" + cargo
				+ ", ANTIGUEDAD_DOCENTE=" + antiguedadDocente;
	}

	@Override
	public boolean equals(Profesor p) {
		return (this.nombre == p.nombre
				&& this.edad == p.edad
				&& this.cargo == p.cargo
				&& this.antiguedadDocente == p.antiguedadDocente);
	}
}
