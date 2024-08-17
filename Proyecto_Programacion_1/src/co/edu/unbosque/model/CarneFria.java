package co.edu.unbosque.model;

public class CarneFria extends Producto {

	private String animalOrigen;

	public CarneFria() {
		// TODO Auto-generated constructor stub
	}

	public CarneFria(String animalOrigen) {
		super();
		this.animalOrigen = animalOrigen;
	}

	public CarneFria(int numId, String nombre, String empresa, float precio, int cantidad, String animalOrigen) {
		super(numId, nombre, empresa, precio, cantidad);
		this.animalOrigen = animalOrigen;
	}

	public CarneFria(int numId, String nombre, String empresa, float precio, int cantidad) {
		super(numId, nombre, empresa, precio, cantidad);
	}

	public String getAnimalOrigen() {
		return animalOrigen;
	}

	public void setAnimalOrigen(String animalOrigen) {
		this.animalOrigen = animalOrigen;
	}

	@Override
	public String toString() {
		return super.toString() + "CarnesFrias [animalOrigen=" + animalOrigen + "]";
	}

}
