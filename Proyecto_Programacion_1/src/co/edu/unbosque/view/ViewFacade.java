package co.edu.unbosque.view;

/**
 * La clase ViewFacade actúa como una fachada que encapsula la interacción entre
 * la consola y la interfaz gráfica de usuario (VentanaPrincipal). Proporciona
 * métodos para acceder y modificar ambos componentes.
 * 
 * @author EMMANUEL PINZON
 * @version 1.0
 */
public class ViewFacade {

	private Consola con;
	private VentanaPrincipal principal;

	/**
	 * Crea una instancia de ViewFacade, inicializando la VentanaPrincipal y la
	 * Consola.
	 */
	public ViewFacade() {
		principal = new VentanaPrincipal();
		con = new Consola();
	}

	/**
	 * Obtiene la instancia de Consola asociada a esta fachada.
	 * 
	 * @return La instancia de Consola.
	 */
	public Consola getCon() {
		return con;
	}

	/**
	 * Establece la instancia de Consola para esta fachada.
	 * 
	 * @param con La nueva instancia de Consola.
	 */
	public void setCon(Consola con) {
		this.con = con;
	}

	/**
	 * Obtiene la instancia de VentanaPrincipal asociada a esta fachada.
	 * 
	 * @return La instancia de VentanaPrincipal.
	 */
	public VentanaPrincipal getPrincipal() {
		return principal;
	}

	/**
	 * Establece la instancia de VentanaPrincipal para esta fachada.
	 * 
	 * @param principal La nueva instancia de VentanaPrincipal.
	 */
	public void setPrincipal(VentanaPrincipal principal) {
		this.principal = principal;
	}
}
