package co.edu.unbosque.view;

import java.awt.Color;

import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/*
 *
 * @author SANTIAGO GRANADOS y MARIO RODRIGUEZ
 * @version 1.0
 * 
 * 
 * */

public class PanelEntrada extends JPanel {
	private JLabel imagenBackground, imagenProducto, imagenAgregarC, imagenAgregarV, imagenAgregarJ, imagenAgregarP;
	private JTextField numId, nombre, empresa, precio, cantidad, atributoPropio1, atributoPropio2, atributoPropio3;
	private JButton btnVolver, btnAgregar, btnJFileChooser, btnActualizar;

	public PanelEntrada() {

		Border border = BorderFactory.createLineBorder(Color.BLACK, 3);

		setSize(1280, 720);
		setLayout(null);
		setVisible(true);

		numId = new JTextField();
		numId.setBounds(35, 275, 160, 55);
		numId.setOpaque(true);

		nombre = new JTextField();
		nombre.setBounds(35, 370, 225, 55);
		nombre.setOpaque(true);

		empresa = new JTextField();
		empresa.setBounds(35, 460, 230, 55);
		empresa.setOpaque(true);

		precio = new JTextField();
		precio.setBounds(35, 545, 200, 55);
		precio.setOpaque(true);

		cantidad = new JTextField();
		cantidad.setBounds(35, 625, 235, 45);
		cantidad.setOpaque(true);

		atributoPropio1 = new JTextField();
		atributoPropio1.setBounds(320, 275, 330, 55);
		atributoPropio1.setOpaque(true);

		atributoPropio2 = new JTextField();
		atributoPropio2.setBounds(320, 370, 225, 55);
		atributoPropio2.setOpaque(true);

		atributoPropio3 = new JTextField();
		atributoPropio3.setBounds(320, 460, 230, 55);
		atributoPropio3.setOpaque(true);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(1080, 515, 138, 130);
		btnVolver.setOpaque(false);
		btnVolver.setActionCommand("VOLVERDEADD");
		btnVolver.setBackground(new Color(255, 217, 47));
		btnVolver.setBorder(border);

		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(930, 515, 130, 130);
		btnAgregar.setOpaque(true);
		btnAgregar.setActionCommand("AGREGARPRODUCTO");
		btnAgregar.setBackground(new Color(255, 217, 47));
		btnAgregar.setBorder(border);

		btnJFileChooser = new JButton("Importar imágen");
		btnJFileChooser.setBounds(720, 510, 190, 135);
		btnJFileChooser.setOpaque(false);
		btnJFileChooser.setActionCommand("IMAGEN");
		btnJFileChooser.setBackground(new Color(255, 217, 47));
		btnJFileChooser.setBorder(border);

		btnActualizar = new JButton("Actualizar");
		btnActualizar.setOpaque(true);
		btnActualizar.setBounds(310, 530, 320, 100);
		btnActualizar.setActionCommand("UPDATE");
		btnActualizar.setBackground(Color.DARK_GRAY);
		btnActualizar.setForeground(Color.WHITE);
		btnActualizar.setBorder(border);

		imagenProducto = new JLabel();
		imagenProducto.setVisible(false);
		imagenProducto.setBounds(790, 205, 380, 260);
		imagenProducto.setBorder(border);

		imagenAgregarC = new JLabel();
		ImageIcon imagenAgregarCa = new ImageIcon("src/media/AgregarCF.png");
		Image redimensionado = imagenAgregarCa.getImage().getScaledInstance(1280, 705, Image.SCALE_SMOOTH);
		imagenAgregarC.setIcon(new ImageIcon(redimensionado));
		imagenAgregarC.setVisible(false);
		imagenAgregarC.setBounds(0, 0, 1280, 705);

		imagenAgregarV = new JLabel();
		ImageIcon imagenAgregarVe = new ImageIcon("src/media/AgregarFV.png");
		Image redimensionadoV = imagenAgregarVe.getImage().getScaledInstance(1280, 705, Image.SCALE_SMOOTH);
		imagenAgregarV.setIcon(new ImageIcon(redimensionadoV));
		imagenAgregarV.setVisible(false);
		imagenAgregarV.setBounds(0, 0, 1280, 705);

		imagenAgregarJ = new JLabel();
		ImageIcon imagenAgregarJu = new ImageIcon("src/media/AgregarJG.png");
		Image redimensionadoJ = imagenAgregarJu.getImage().getScaledInstance(1280, 705, Image.SCALE_SMOOTH);
		imagenAgregarJ.setIcon(new ImageIcon(redimensionadoJ));
		imagenAgregarJ.setVisible(false);
		imagenAgregarJ.setBounds(0, 4, 1280, 705);

		imagenAgregarP = new JLabel();
		ImageIcon imagenAgregarPa = new ImageIcon("src/media/AgregarPA.png");
		Image redimensionadoP = imagenAgregarPa.getImage().getScaledInstance(1280, 705, Image.SCALE_SMOOTH);
		imagenAgregarP.setIcon(new ImageIcon(redimensionadoP));
		imagenAgregarP.setVisible(false);
		imagenAgregarP.setBounds(-4, -2, 1280, 705);

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
		add(btnJFileChooser);
		add(btnActualizar);
		add(imagenProducto);
		add(btnAgregar);
		add(imagenAgregarC);
		add(imagenAgregarV);
		add(imagenAgregarJ);
		add(imagenAgregarP);
		add(btnVolver);
		add(btnJFileChooser);
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
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

	public JLabel getImagenAgregarC() {
		return imagenAgregarC;
	}

	public void setImagenAgregarC(JLabel imagenAgregarC) {
		this.imagenAgregarC = imagenAgregarC;
	}

	public JLabel getImagenAgregarV() {
		return imagenAgregarV;
	}

	public void setImagenAgregarV(JLabel imagenAgregarV) {
		this.imagenAgregarV = imagenAgregarV;
	}

	public JLabel getImagenAgregarJ() {
		return imagenAgregarJ;
	}

	public void setImagenAgregarJ(JLabel imagenAgregarJ) {
		this.imagenAgregarJ = imagenAgregarJ;
	}

	public JLabel getImagenAgregarP() {
		return imagenAgregarP;
	}

	public void setImagenAgregarP(JLabel imagenAgregarP) {
		this.imagenAgregarP = imagenAgregarP;
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

	public JButton getBtnJFileChooser() {
		return btnJFileChooser;
	}

	public void setBtnJFileChooser(JButton btnJFileChooser) {
		this.btnJFileChooser = btnJFileChooser;
	}
}
