package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelEntrada extends JPanel {
	JLabel imagenBackground, imagenProducto;
	JTextField numId, nombre, empresa, precio, cantidad, atributoPropio1, atributoPropio2, atributoPropio3;
	JButton btnVolver, btnAgregar, btnFileChooser;

	public PanelEntrada() {

		setSize(1280, 720);
		setLayout(null);
		setVisible(true);

		numId = new JTextField("ID");
		numId.setBounds(100, 100, 100, 50);
		numId.setOpaque(true);

		nombre = new JTextField("NAME");
		nombre.setBounds(100, 150, 100, 50);
		nombre.setOpaque(true);

		empresa = new JTextField("EMPRESA");
		empresa.setBounds(100, 200, 100, 50);
		empresa.setOpaque(true);

		precio = new JTextField("PRECIO");
		precio.setBounds(100, 250, 100, 50);
		precio.setOpaque(true);

		cantidad = new JTextField("CANTIDAD");
		cantidad.setBounds(100, 300, 100, 50);
		cantidad.setOpaque(true);

		atributoPropio1 = new JTextField("PROPIO1");
		atributoPropio1.setBounds(100, 350, 100, 50);
		atributoPropio1.setOpaque(true);

		atributoPropio2 = new JTextField("PROPIO2");
		atributoPropio2.setBounds(100, 400, 100, 50);
		atributoPropio2.setOpaque(true);

		atributoPropio3 = new JTextField("PROPIO3");
		atributoPropio3.setBounds(100, 450, 100, 50);
		atributoPropio3.setOpaque(true);

		btnVolver = new JButton("volver");
		btnVolver.setBounds(500, 400, 100, 100);
		btnVolver.setOpaque(true);
		btnVolver.setActionCommand("VOLVERDEADD");

		btnAgregar = new JButton("agregar");
		btnAgregar.setBounds(500, 500, 100, 100);
		btnAgregar.setOpaque(true);
		btnAgregar.setActionCommand("AGREGARPRODUCTO");

		btnFileChooser = new JButton("importar");
		btnFileChooser.setBounds(800, 510, 150, 150);
		btnFileChooser.setOpaque(true);
		btnFileChooser.setActionCommand("IMAGEN");

		imagenProducto = new JLabel();
		imagenProducto.setBounds(500, 200, 360, 280);
		imagenProducto.setVisible(true);

		add(numId);
		add(nombre);
		add(empresa);
		add(precio);
		add(cantidad);
		add(atributoPropio1);
		add(atributoPropio2);
		add(atributoPropio3);
		add(btnAgregar);
		add(btnVolver);
		add(btnFileChooser);
		add(imagenProducto);
	}

	public JLabel getImagenBackground() {
		return imagenBackground;
	}

	public void setImagenBackground(JLabel imagenBackground) {
		this.imagenBackground = imagenBackground;
	}

	public JLabel getImagenProducto() {
		return imagenProducto;
	}

	public void setImagenProducto(JLabel imagenProducto) {
		this.imagenProducto = imagenProducto;
	}

	public JButton getBtnFileChooser() {
		return btnFileChooser;
	}

	public void setBtnFileChooser(JButton btnFileChooser) {
		this.btnFileChooser = btnFileChooser;
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

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

}
