package Ejercicio3;

public class Edificio {
    
	private double Superficie;
	
	Edificio(){
		this.Superficie = 0;
	}
	
	public double getSuperficie() {
		return Superficie;
	}

	public void setSuperficie(double superficie) {
		Superficie = superficie;
	}

	Edificio(double superficie){
		this.Superficie = superficie;
		}

	@Override
	public String toString() {
		return "Edificio [Superficie=" + Superficie + "]";
	}

}
