package Ejercicio1;

public class Profesor extends Empleado {
	private String cargo;
	private int antiguedadDocente;
	
	public Profesor() {
		super();
	}
	
	public Profesor(String nombre, int edad, String cargo, int antiguedadDocente) {
		super(nombre, edad);
		this.setCargo(cargo);
		this.setAntiguedadDocente(antiguedadDocente);
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setAntiguedadDocente(int antiguedadDocente2) {
		this.antiguedadDocente = antiguedadDocente2;
	}
	
	@Override
	public String toString() {
		return "Profesor " 
				+ super.toString()
				+ ", CARGO=" + cargo
				+ ", ANTIGUEDAD_DOCENTE=" + antiguedadDocente;
	}
}
