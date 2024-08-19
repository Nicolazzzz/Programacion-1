package co.edu.unbosque.model;

/**
 * La clase Producto representa un producto genérico con atributos como número
 * de identificación, nombre, empresa, precio y cantidad. Es la clase base para
 * otros tipos de productos específicos(super clase).
 */
public class Producto {

	private long numId;
	private String nombre;
	private String empresa;
	private float precio;
	private int cantidad;

	/**
	 * Constructor vacio de la clase Producto.
	 */
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor que inicializa todos los atributos de la clase Producto.
	 *
	 * @param numId    El número de identificación del producto.
	 * @param nombre   El nombre del producto.
	 * @param empresa  El nombre de la empresa que produce el producto.
	 * @param precio   El precio del producto.
	 * @param cantidad La cantidad disponible del producto.
	 */
	public Producto(long numId, String nombre, String empresa, float precio, int cantidad) {
		super();
		this.numId = numId;
		this.nombre = nombre;
		this.empresa = empresa;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	/**
	 * Obtiene el número de identificación del producto.
	 *
	 * @return El número de identificación del producto.
	 */
	public long getNumId() {
		return numId;
	}

	/**
	 * Establece el número de identificación del producto.
	 *
	 * @param numId El número de identificación a establecer.
	 */
	public void setNumId(long numId) {
		this.numId = numId;
	}

	/**
	 * Obtiene el nombre del producto.
	 *
	 * @return El nombre del producto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del producto.
	 *
	 * @param nombre El nombre del producto a establecer.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el nombre de la empresa que produce el producto.
	 *
	 * @return El nombre de la empresa del producto.
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * Establece el nombre de la empresa que produce el producto.
	 *
	 * @param empresa El nombre de la empresa a establecer.
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	/**
	 * Obtiene el precio del producto.
	 *
	 * @return El precio del producto.
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio del producto.
	 *
	 * @param precio El precio del producto a establecer.
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * Obtiene la cantidad disponible del producto.
	 *
	 * @return La cantidad disponible del producto.
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * Establece la cantidad disponible del producto.
	 *
	 * @param cantidad La cantidad del producto a establecer.
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Devuelve una representación en cadena de la información del producto.
	 *
	 * @return Una cadena con la información del producto.
	 */
	@Override
	public String toString() {
		return "\nNúmero de identificación: " + numId + "\nNombre del producto: " + nombre + "\nEmpresa del producto: "
				+ empresa + "\nPrecio: " + precio + "\nCantidad del producto: " + cantidad;
	}
}
