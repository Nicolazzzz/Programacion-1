package co.edu.unbosque.model;

public class Panaderia extends Producto{

	private boolean esLibreGluten;
	private boolean esIntegral;
	private boolean esLibreLevadura;
	
	public Panaderia() {
		// TODO Auto-generated constructor stub
	}

	public Panaderia(boolean esLibreGluten, boolean esIntegral, boolean esLibreLevadura) {
		super();
		this.esLibreGluten = esLibreGluten;
		this.esIntegral = esIntegral;
		this.esLibreLevadura = esLibreLevadura;
	}

	public Panaderia(int numId, String nombre, String empresa, float precio, int cantidad, boolean esLibreGluten,
			boolean esIntegral, boolean esLibreLevadura) {
		super(numId, nombre, empresa, precio, cantidad);
		this.esLibreGluten = esLibreGluten;
		this.esIntegral = esIntegral;
		this.esLibreLevadura = esLibreLevadura;
	}

	public Panaderia(int numId, String nombre, String empresa, float precio, int cantidad) {
		super(numId, nombre, empresa, precio, cantidad);
	}

	public boolean isEsLibreGluten() {
		return esLibreGluten;
	}

	public void setEsLibreGluten(boolean esLibreGluten) {
		this.esLibreGluten = esLibreGluten;
	}

	public boolean isEsIntegral() {
		return esIntegral;
	}

	public void setEsIntegral(boolean esIntegral) {
		this.esIntegral = esIntegral;
	}

	public boolean isEsLibreLevadura() {
		return esLibreLevadura;
	}

	public void setEsLibreLevadura(boolean esLibreLevadura) {
		this.esLibreLevadura = esLibreLevadura;
	}
	
	//toString
	
	
	
	
}
