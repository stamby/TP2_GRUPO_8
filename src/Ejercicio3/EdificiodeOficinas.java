package Ejercicio3;

public class EdificiodeOficinas extends Edificio{
	private int NumeroOficinas;

	public EdificiodeOficinas(int numeroOficinas) {
		super();
		NumeroOficinas = numeroOficinas;
	}

	public int getNumeroOficinas() {
		return NumeroOficinas;
	}

	public void setNumeroOficinas(int numeroOficinas) {
		NumeroOficinas = numeroOficinas;
	}
    
	EdificiodeOficinas(int oficinas, double superficie){
		super(superficie);
		this.NumeroOficinas = oficinas;
	}

	@Override
	public String toString() {
		return "\nEdificioDeOficinas [NumeroOficinas=" + NumeroOficinas +
				", Superficie del edificio: " + getSuperficie() ;
	}
	
	
}
