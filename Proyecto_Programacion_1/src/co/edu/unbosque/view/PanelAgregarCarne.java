package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAgregarCarne extends JPanel {

	JTextField numId, nombre, empresa, precio, cantidad, atributoPropio1, atributoPropio2, atributoPropio3;
	JButton volver, agregar;

	public PanelAgregarCarne() {

		setSize(1280, 720);
		setLayout(null);
		setVisible(true);
		
		

	}

	public JTextField getNumId() {
		return numId;
	}

	public void setNumId(JTextField numId) {
		this.numId = numId;
	}

	public JTextField getNombre() {
		return nombre;
	}

	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}

	public JTextField getEmpresa() {
		return empresa;
	}

	public void setEmpresa(JTextField empresa) {
		this.empresa = empresa;
	}

	public JTextField getPrecio() {
		return precio;
	}

	public void setPrecio(JTextField precio) {
		this.precio = precio;
	}

	public JTextField getCantidad() {
		return cantidad;
	}

	public void setCantidad(JTextField cantidad) {
		this.cantidad = cantidad;
	}

	public JTextField getAtributoPropio1() {
		return atributoPropio1;
	}

	public void setAtributoPropio1(JTextField atributoPropio1) {
		this.atributoPropio1 = atributoPropio1;
	}

	public JTextField getAtributoPropio2() {
		return atributoPropio2;
	}

	public void setAtributoPropio2(JTextField atributoPropio2) {
		this.atributoPropio2 = atributoPropio2;
	}

	public JTextField getAtributoPropio3() {
		return atributoPropio3;
	}

	public void setAtributoPropio3(JTextField atributoPropio3) {
		this.atributoPropio3 = atributoPropio3;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

}
