package co.edu.unbosque.model;

/**
 * @author NICOLAS ABRIL
 * @version 1.0
 * 
 * La clase Panaderia representa un producto de panadería, heredando de la clase
 * Producto. Incluye atributos adicionales para especificar si el producto es
 * libre de gluten, integral y libre de levadura.
 */
public class Panaderia extends Producto {

	private boolean esLibreGluten;
	private boolean esIntegral;
	private boolean esLibreLevadura;

	/**
	 * Constructor vacio de la clase Panaderia.
	 */
	public Panaderia() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor que inicializa la clase Panaderia con las características
	 * específicas del producto.
	 *
	 * @param esLibreGluten   Indica si el producto es libre de gluten.
	 * @param esIntegral      Indica si el producto es integral.
	 * @param esLibreLevadura Indica si el producto es libre de levadura.
	 */
	public Panaderia(boolean esLibreGluten, boolean esIntegral, boolean esLibreLevadura) {
		super();
		this.esLibreGluten = esLibreGluten;
		this.esIntegral = esIntegral;
		this.esLibreLevadura = esLibreLevadura;
	}

	/**
	 * Constructor que inicializa todos los atributos de la clase Panaderia,
	 * incluyendo los heredados.
	 *
	 * @param numId           El número de identificación del producto.
	 * @param nombre          El nombre del producto.
	 * @param empresa         El nombre de la empresa que produce el producto.
	 * @param precio          El precio del producto.
	 * @param cantidad        La cantidad disponible del producto.
	 * @param esLibreGluten   Indica si el producto es libre de gluten.
	 * @param esIntegral      Indica si el producto es integral.
	 * @param esLibreLevadura Indica si el producto es libre de levadura.
	 */
	public Panaderia(long numId, String nombre, String empresa, float precio, int cantidad, boolean esLibreGluten,
			boolean esIntegral, boolean esLibreLevadura) {
		super(numId, nombre, empresa, precio, cantidad);
		this.esLibreGluten = esLibreGluten;
		this.esIntegral = esIntegral;
		this.esLibreLevadura = esLibreLevadura;
	}

	/**
	 * Constructor que inicializa todos los atributos heredados de la clase
	 * Producto, sin especificar las características de panadería.
	 *
	 * @param numId    El número de identificación del producto.
	 * @param nombre   El nombre del producto.
	 * @param empresa  El nombre de la empresa que produce el producto.
	 * @param precio   El precio del producto.
	 * @param cantidad La cantidad disponible del producto.
	 */
	public Panaderia(long numId, String nombre, String empresa, float precio, int cantidad) {
		super(numId, nombre, empresa, precio, cantidad);
	}

	/**
	 * Indica si el producto es libre de gluten.
	 *
	 * @return {@code true} si el producto es libre de gluten, {@code false} en caso
	 *         contrario.
	 */
	public boolean isEsLibreGluten() {
		return esLibreGluten;
	}

	/**
	 * Establece si el producto es libre de gluten.
	 *
	 * @param esLibreGluten {@code true} para indicar que el producto es libre de
	 *                      gluten, {@code false} en caso contrario.
	 */
	public void setEsLibreGluten(boolean esLibreGluten) {
		this.esLibreGluten = esLibreGluten;
	}

	/**
	 * Indica si el producto es integral.
	 *
	 * @return {@code true} si el producto es integral, {@code false} en caso
	 *         contrario.
	 */
	public boolean isEsIntegral() {
		return esIntegral;
	}

	/**
	 * Establece si el producto es integral.
	 *
	 * @param esIntegral {@code true} para indicar que el producto es integral,
	 *                   {@code false} en caso contrario.
	 */
	public void setEsIntegral(boolean esIntegral) {
		this.esIntegral = esIntegral;
	}

	/**
	 * Indica si el producto es libre de levadura.
	 *
	 * @return {@code true} si el producto es libre de levadura, {@code false} en
	 *         caso contrario.
	 */
	public boolean isEsLibreLevadura() {
		return esLibreLevadura;
	}

	/**
	 * Establece si el producto es libre de levadura.
	 *
	 * @param esLibreLevadura {@code true} para indicar que el producto es libre de
	 *                        levadura, {@code false} en caso contrario.
	 */
	public void setEsLibreLevadura(boolean esLibreLevadura) {
		this.esLibreLevadura = esLibreLevadura;
	}

	/**
	 * Devuelve una representación en cadena de la información del producto de
	 * panadería, incluyendo los atributos heredados, si es libre de gluten, si es
	 * integral y si es libre de levadura.
	 *
	 * @return Una cadena con la información del producto.
	 */
	@Override
	public String toString() {
		return super.toString() + "\nEs libre de glúten: " + esLibreGluten + "\nEs pan integral: " + esIntegral
				+ "\nEs libre de levaduras: " + esLibreLevadura;
	}
}
