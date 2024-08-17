package co.edu.unbosque.model;

import java.util.Date;

public class FrutasVerduras extends Producto{

	private Date fechaCosecha;
	private boolean esOrganico;
	
	public FrutasVerduras() {
		// TODO Auto-generated constructor stub
	}

	public FrutasVerduras(Date fechaCosecha, boolean esOrganico) {
		super();
		this.fechaCosecha = fechaCosecha;
		this.esOrganico = esOrganico;
	}

	public FrutasVerduras(int numId, String nombre, String empresa, float precio, int cantidad, Date fechaCosecha,
			boolean esOrganico) {
		super(numId, nombre, empresa, precio, cantidad);
		this.fechaCosecha = fechaCosecha;
		this.esOrganico = esOrganico;
	}

	public FrutasVerduras(int numId, String nombre, String empresa, float precio, int cantidad) {
		super(numId, nombre, empresa, precio, cantidad);
	}

	public Date getFechaCosecha() {
		return fechaCosecha;
	}

	public void setFechaCosecha(Date fechaCosecha) {
		this.fechaCosecha = fechaCosecha;
	}

	public boolean isEsOrganico() {
		return esOrganico;
	}

	public void setEsOrganico(boolean esOrganico) {
		this.esOrganico = esOrganico;
	}
	
	//toString;
}
