package Ejercicio2;
import java.util.Date;

public class ProductoFrescos extends Producto {
	private Date fechaEnvasado; 
	private String PaisOrigen; 
	
	public ProductoFrescos() {
		super();
		fechaEnvasado = "1/1/1900";
		PaisOrigen = "Desconocido";
	}

	public ProductoFrescos(Date fechaCaducidad, int NumLote, Date fechaEnvasado,String PaisOrigen) {
		super(fechaCaducidad, NumLote);
		this.fechaEnvasado=fechaEnvasado; 
		this.PaisOrigen=PaisOrigen;
		// TODO Auto-generated constructor stub
	}

	public Date getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(Date fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return PaisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		PaisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "Producto Fresco: " + super.toString() + ", fechaEnvasado = " + fechaEnvasado + ", PaisOrigen = " + PaisOrigen;
	}
}
