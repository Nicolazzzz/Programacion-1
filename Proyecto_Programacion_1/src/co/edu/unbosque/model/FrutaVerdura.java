package co.edu.unbosque.model;

import java.util.Date;

public class FrutaVerdura extends Producto {

	private Date fechaCosecha;
	private boolean esOrganico;

	public FrutaVerdura() {
		// TODO Auto-generated constructor stub
	}

	public FrutaVerdura(Date fechaCosecha, boolean esOrganico) {
		super();
		this.fechaCosecha = fechaCosecha;
		this.esOrganico = esOrganico;
	}

	public FrutaVerdura(int numId, String nombre, String empresa, float precio, int cantidad, Date fechaCosecha,
			boolean esOrganico) {
		super(numId, nombre, empresa, precio, cantidad);
		this.fechaCosecha = fechaCosecha;
		this.esOrganico = esOrganico;
	}

	public FrutaVerdura(int numId, String nombre, String empresa, float precio, int cantidad) {
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

	@Override
	public String toString() {
		return super.toString() + "\nFecha de cosecha: " + fechaCosecha + "\nEs organico: " + esOrganico;
	}

}
