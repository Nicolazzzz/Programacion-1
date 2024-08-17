package co.edu.unbosque.model;

public class CarnesFrias extends Producto{

	private String animalOrigen;
	
	public CarnesFrias() {
		// TODO Auto-generated constructor stub
	}

	public CarnesFrias(String animalOrigen) {
		super();
		this.animalOrigen = animalOrigen;
	}

	public CarnesFrias(int numId, String nombre, String empresa, float precio, int cantidad, String animalOrigen) {
		super(numId, nombre, empresa, precio, cantidad);
		this.animalOrigen = animalOrigen;
	}

	public CarnesFrias(int numId, String nombre, String empresa, float precio, int cantidad) {
		super(numId, nombre, empresa, precio, cantidad);
	}

	public String getAnimalOrigen() {
		return animalOrigen;
	}

	public void setAnimalOrigen(String animalOrigen) {
		this.animalOrigen = animalOrigen;
	}
	
	//toString
}
