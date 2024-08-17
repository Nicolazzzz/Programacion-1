package co.edu.unbosque.model;

public class Juguete extends Producto {

	private int edadMinima;
	private int numJugadores;

	public Juguete() {
		// TODO Auto-generated constructor stub
	}

	public Juguete(int edadMinima, int numJugadores) {
		super();
		this.edadMinima = edadMinima;
		this.numJugadores = numJugadores;
	}

	public Juguete(int numId, String nombre, String empresa, float precio, int cantidad, int edadMinima,
			int numJugadores) {
		super(numId, nombre, empresa, precio, cantidad);
		this.edadMinima = edadMinima;
		this.numJugadores = numJugadores;
	}

	public Juguete(int numId, String nombre, String empresa, float precio, int cantidad) {
		super(numId, nombre, empresa, precio, cantidad);
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public int getNumJugadores() {
		return numJugadores;
	}

	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEdad mínima: " + edadMinima + "\nNúmero de jugadores=" + numJugadores;
	}

}
