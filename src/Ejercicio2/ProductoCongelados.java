package Ejercicio2;
import java.util.Date;

public class ProductoCongelados extends Producto{
	private float Temperatura;

	//Constructores
	public ProductoCongelados() {
		super();
		Temperatura = 0;
	}
	
	public ProductoCongelados(String fechaCaducidad, int NumLote, float Temperatura) {
		super(fechaCaducidad, NumLote);
		this.Temperatura=Temperatura;
	}

	//Getters y setters 
	public float getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(float temperatura) {
		Temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "ProductoCongelados: " + super.toString() + ", Temperatura = " + Temperatura;
	} 
}
