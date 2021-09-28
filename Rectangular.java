package Modelo;

public class Rectangular extends Forma {
	
	protected int longitudBase;
	protected int longitudAltura;
	
	public Rectangular(String nombre, int posicionCentro, int longitudBase, int longitudAltura) {
		
		super(nombre, posicionCentro);
		
		this.longitudBase = longitudBase;
		this.longitudAltura = longitudAltura;
	}
	
	public double obtenerArea() {
		
		return longitudBase * longitudAltura;
	}
}
