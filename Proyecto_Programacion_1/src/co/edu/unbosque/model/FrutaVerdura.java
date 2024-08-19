package co.edu.unbosque.model;

import java.util.Date;

/**
 * La clase FrutaVerdura representa un producto que son frutas y verduras,
 * heredando de la clase Producto. Incluye atributos adicionales como la fecha
 * de cosecha y si el producto es orgánico.
 */
public class FrutaVerdura extends Producto {

	private Date fechaCosecha;
	private boolean esOrganico;

	/**
	 * Constructor vacio de la clase FrutaVerdura.
	 */
	public FrutaVerdura() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor que inicializa la clase FrutaVerdura con la fecha de cosecha y la
	 * indicación de si es orgánico.
	 *
	 * @param fechaCosecha La fecha en la que se cosechó la fruta o verdura.
	 * @param esOrganico   Indica si la fruta o verdura es orgánica.
	 */
	public FrutaVerdura(Date fechaCosecha, boolean esOrganico) {
		super();
		this.fechaCosecha = fechaCosecha;
		this.esOrganico = esOrganico;
	}

	/**
	 * Constructor que inicializa todos los atributos de la clase FrutaVerdura,
	 * incluyendo los heredados.
	 *
	 * @param numId        El número de identificación del producto.
	 * @param nombre       El nombre del producto.
	 * @param empresa      El nombre de la empresa que produce el producto.
	 * @param precio       El precio del producto.
	 * @param cantidad     La cantidad disponible del producto.
	 * @param fechaCosecha La fecha en la que se cosechó la fruta o verdura.
	 * @param esOrganico   Indica si la fruta o verdura es orgánica.
	 */
	public FrutaVerdura(long numId, String nombre, String empresa, float precio, int cantidad, Date fechaCosecha,
			boolean esOrganico) {
		super(numId, nombre, empresa, precio, cantidad);
		this.fechaCosecha = fechaCosecha;
		this.esOrganico = esOrganico;
	}

	/**
	 * Constructor que inicializa todos los atributos heredados de la clase
	 * Producto, sin especificar la fecha de cosecha ni si es orgánico.
	 *
	 * @param numId    El número de identificación del producto.
	 * @param nombre   El nombre del producto.
	 * @param empresa  El nombre de la empresa que produce el producto.
	 * @param precio   El precio del producto.
	 * @param cantidad La cantidad disponible del producto.
	 */
	public FrutaVerdura(long numId, String nombre, String empresa, float precio, int cantidad) {
		super(numId, nombre, empresa, precio, cantidad);
	}

	/**
	 * Obtiene la fecha de cosecha de la fruta o verdura.
	 *
	 * @return La fecha de cosecha.
	 */
	public Date getFechaCosecha() {
		return fechaCosecha;
	}

	/**
	 * Establece la fecha de cosecha de la fruta o verdura.
	 *
	 * @param fechaCosecha La fecha de cosecha a establecer.
	 */
	public void setFechaCosecha(Date fechaCosecha) {
		this.fechaCosecha = fechaCosecha;
	}

	/**
	 * Indica si la fruta o verdura es orgánica.
	 *
	 * @return {@code true} si el producto es orgánico, {@code false} en caso
	 *         contrario.
	 */
	public boolean isEsOrganico() {
		return esOrganico;
	}

	/**
	 * Establece si la fruta o verdura es orgánica.
	 *
	 * @param esOrganico {@code true} para indicar que es orgánico, {@code false} en
	 *                   caso contrario.
	 */
	public void setEsOrganico(boolean esOrganico) {
		this.esOrganico = esOrganico;
	}

	/**
	 * Devuelve una representación en cadena de la información de la clase
	 * frutaVerdura, incluyendo los atributos heredados, la fecha de cosecha y si es
	 * orgánico.
	 *
	 * @return Una cadena con la información del producto.
	 */
	@Override
	public String toString() {
		return super.toString() + "\nFecha de cosecha: " + fechaCosecha + "\nEs orgánico: " + esOrganico;
	}
}
