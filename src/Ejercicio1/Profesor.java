package Ejercicio1;

public class Profesor extends Empleado {
	private String cargo;
	private int antiguedadDocente;
	
	Profesor() {
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
