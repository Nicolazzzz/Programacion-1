package co.edu.unbosque.view;

public class ViewFacade {

	private Consola con;
	private VentanaPrincipal principal;

	public ViewFacade() {
		principal = new VentanaPrincipal();
		con = new Consola();
	}

	public Consola getCon() {
		return con;
	}

	public void setCon(Consola con) {
		this.con = con;
	}

	public VentanaPrincipal getPrincipal() {
		return principal;
	}

	public void setPrincipal(VentanaPrincipal principal) {
		this.principal = principal;
	}

}
