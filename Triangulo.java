package Modelo;

public class Triangulo extends Forma {

	private int longitudBase;
	private int longitudAltura;
	
	public Triangulo(String nombre, int posicionCentro, int longitudBase, int longitudAltura) {
		
		super(nombre, posicionCentro);
		
		longitudBase = longitudBase;
		longitudAltura = longitudAltura;
	}
	
	public double obtenerArea() {
		
		return longitudBase * longitudAltura / 2;
	}
}
