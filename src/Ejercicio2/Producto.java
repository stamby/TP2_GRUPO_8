package Ejercicio2;
import java.util.Date;

public class Producto {
	private Date fechaCaducidad; 
	private int NumLote;
	
	public Producto () {
		fechaCaducidad = "1/1/1900";
		NumLote = 0;
	}
	
	//Constructores
	public Producto (Date fechaCaducidad, int NumLote) {
		this.fechaCaducidad = fechaCaducidad; 
		this.NumLote=NumLote;	
	}
	
	//Getters y setters 
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNumLote() {
		return NumLote;
	}
	public void setNumLote(int numLote) {
		NumLote = numLote;
	}

	@Override
	public String toString() {
		return "fechaCaducidad = " + fechaCaducidad + ", NumLote = " + NumLote;
	}
}
