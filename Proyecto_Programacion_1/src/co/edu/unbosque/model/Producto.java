package co.edu.unbosque.model;

public class Producto {

	private long numId;
	private String nombre;
	private String empresa;
	private float precio;
	private int cantidad;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(int numId, String nombre, String empresa, float precio, int cantidad) {
		super();
		this.numId = numId;
		this.nombre = nombre;
		this.empresa = empresa;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public long getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [numId=" + numId + ", nombre=" + nombre + ", empresa=" + empresa + ", precio=" + precio
				+ ", cantidad=" + cantidad + "]";
	}

}
