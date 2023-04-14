package Ejercicio2;
import java.util.Date;

public class ProductoRefrigerados extends Producto{
	private String codigoOrganismo;

	//Constructores
	
	public ProductoRefrigerados() {
		super();
		codigoOrganismo = "0";
	}

	public ProductoRefrigerados(String fechaCaducidad, int NumLote,String codigoOrganismo) {
		super(fechaCaducidad, NumLote);
		this.codigoOrganismo= codigoOrganismo;
	}

	//Getters y setters 
	public String getCodigoOrganismo() {
		return codigoOrganismo;
	}

	public void setCodigoOrganismo(String codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}

	@Override
	public String toString() {
		return "Producto Refrigerado: " + super.toString() + ", codigoOrganismo = " + codigoOrganismo;
	} 
}
