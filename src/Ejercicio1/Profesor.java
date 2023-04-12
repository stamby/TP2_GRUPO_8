package Ejercicio1;

public class Profesor extends Empleado  implements Comparable<Profesor>{
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + antiguedadDocente;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
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

	@Override
	public int compareTo(Profesor o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
