package Modelo;

public class Circulo extends Forma {
	
	private int radio;

	public Circulo(String nombre, int posicionCentro, int radio) {
		
		super(nombre, posicionCentro);
		this.radio = radio;
	}
	
	public double obtenerArea() {
		
		return radio * radio * Math.PI;
	}
}
