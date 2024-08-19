package co.edu.unbosque.model;

/**
 * La clase Juguete representa un producto que es un juguete, heredando de la
 * clase Producto. Incluye atributos adicionales como la edad mínima recomendada
 * y el número de jugadores.
 */
public class Juguete extends Producto {

	private int edadMinima;
	private int numJugadores;

	/**
	 * Constructor vacio de la clase Juguete.
	 */
	public Juguete() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor que inicializa la clase Juguete con la edad mínima recomendada y
	 * el número de jugadores.
	 *
	 * @param edadMinima   La edad mínima recomendada para usar el juguete.
	 * @param numJugadores El número de jugadores para los que está diseñado el
	 *                     juguete.
	 */
	public Juguete(int edadMinima, int numJugadores) {
		super();
		this.edadMinima = edadMinima;
		this.numJugadores = numJugadores;
	}

	/**
	 * Constructor que inicializa todos los atributos de la clase Juguete,
	 * incluyendo los heredados.
	 *
	 * @param numId        El número de identificación del producto.
	 * @param nombre       El nombre del producto.
	 * @param empresa      El nombre de la empresa que produce el producto.
	 * @param precio       El precio del producto.
	 * @param cantidad     La cantidad disponible del producto.
	 * @param edadMinima   La edad mínima recomendada para usar el juguete.
	 * @param numJugadores El número de jugadores para los que está diseñado el
	 *                     juguete.
	 */
	public Juguete(long numId, String nombre, String empresa, float precio, int cantidad, int edadMinima,
			int numJugadores) {
		super(numId, nombre, empresa, precio, cantidad);
		this.edadMinima = edadMinima;
		this.numJugadores = numJugadores;
	}

	/**
	 * Constructor que inicializa todos los atributos heredados de la clase
	 * Producto, sin especificar la edad mínima ni el número de jugadores.
	 *
	 * @param numId    El número de identificación del producto.
	 * @param nombre   El nombre del producto.
	 * @param empresa  El nombre de la empresa que produce el producto.
	 * @param precio   El precio del producto.
	 * @param cantidad La cantidad disponible del producto.
	 */
	public Juguete(long numId, String nombre, String empresa, float precio, int cantidad) {
		super(numId, nombre, empresa, precio, cantidad);
	}

	/**
	 * Obtiene la edad mínima recomendada para usar el juguete.
	 *
	 * @return La edad mínima recomendada.
	 */
	public int getEdadMinima() {
		return edadMinima;
	}

	/**
	 * Establece la edad mínima recomendada para usar el juguete.
	 *
	 * @param edadMinima La edad mínima recomendada a establecer.
	 */
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	/**
	 * Obtiene el número de jugadores para los que está diseñado el juguete.
	 *
	 * @return El número de jugadores.
	 */
	public int getNumJugadores() {
		return numJugadores;
	}

	/**
	 * Establece el número de jugadores para los que está diseñado el juguete.
	 *
	 * @param numJugadores El número de jugadores a establecer.
	 */
	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}

	/**
	 * Devuelve una representación en cadena de la información del juguete,
	 * incluyendo los atributos heredados, la edad mínima recomendada y el número de
	 * jugadores.
	 *
	 * @return Una cadena con la información del producto.
	 */
	@Override
	public String toString() {
		return super.toString() + "\nEdad mínima: " + edadMinima + "\nNúmero de jugadores: " + numJugadores;
	}
}
