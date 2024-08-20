package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMenuGestion extends JPanel {

	private JLabel imagenCarne, imagenFV, imagenJuguete, imagenPan;
	JButton btnAgregar, btnMostrar, btnActualizar, btnEliminar, btnVolver;

	/*
	 * @author SANTIAGO GRANADOS y MARIO RODRIGUEZ
	 * 
	 * @version 1.0
	 */

	public PanelMenuGestion() {

		setLayout(null);
		setVisible(true);
		setSize(1280, 720);

		btnAgregar = new JButton("agregar");
		btnAgregar.setBounds(483, 270, 140, 130);
		btnAgregar.setOpaque(false);
		btnAgregar.setActionCommand("AGREGAR");

		btnMostrar = new JButton("mostrar");
		btnMostrar.setBounds(640, 270, 170, 130);
		btnMostrar.setOpaque(false);
		btnMostrar.setActionCommand("MOSTRAR");

		btnActualizar = new JButton("actualizar");
		btnActualizar.setBounds(483, 400, 140, 130);
		btnActualizar.setOpaque(false);
		btnActualizar.setActionCommand("ACTUALIZAR");

		btnEliminar = new JButton("eliminar");
		btnEliminar.setBounds(640, 400, 170, 130);
		btnEliminar.setOpaque(false);
		btnEliminar.setActionCommand("ELIMINAR");

		btnVolver = new JButton("volver");
		btnVolver.setBounds(570, 530, 160, 125);
		btnVolver.setOpaque(false);
		btnVolver.setActionCommand("VOLVER");

		imagenCarne = new JLabel();
		ImageIcon imagenCarnea = new ImageIcon("src/media/MenuAcciones.png");
		Image redimensionado = imagenCarnea.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenCarne.setIcon(new ImageIcon(redimensionado));
		imagenCarne.setVisible(false);
		imagenCarne.setBounds(0, 0, 1280, 720);

		imagenFV = new JLabel();
		ImageIcon imagenFVa = new ImageIcon("src/media/MenuAcciones2.png");
		Image redimensionado2 = imagenFVa.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenFV.setIcon(new ImageIcon(redimensionado2));
		imagenFV.setVisible(false);
		imagenFV.setBounds(0, 0, 1280, 720);

		imagenJuguete = new JLabel();
		ImageIcon imagenJuguetea = new ImageIcon("src/media/MenuAcciones3.png");
		Image redimensionado3 = imagenJuguetea.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenJuguete.setIcon(new ImageIcon(redimensionado3));
		imagenJuguete.setVisible(false);
		imagenJuguete.setBounds(0, 0, 1280, 720);

		imagenPan = new JLabel();
		ImageIcon imagenPana = new ImageIcon("src/media/MenuAcciones4.png");
		Image redimensionado4 = imagenPana.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenPan.setIcon(new ImageIcon(redimensionado4));
		imagenPan.setVisible(false);
		imagenPan.setBounds(0, 0, 1280, 720);

		add(imagenCarne);
		add(imagenFV);
		add(imagenJuguete);
		add(imagenPan);
		add(btnAgregar);
		add(btnMostrar);
		add(btnActualizar);
		add(btnEliminar);
		add(btnVolver);

	}

	public JLabel getImagenCarne() {
		return imagenCarne;
	}

	public void setImagenCarne(JLabel imagenCarne) {
		this.imagenCarne = imagenCarne;
	}

	public JLabel getImagenFV() {
		return imagenFV;
	}

	public void setImagenFV(JLabel imagenFV) {
		this.imagenFV = imagenFV;
	}

	public JLabel getImagenJuguete() {
		return imagenJuguete;
	}

	public void setImagenJuguete(JLabel imagenJuguete) {
		this.imagenJuguete = imagenJuguete;
	}

	public JLabel getImagenPan() {
		return imagenPan;
	}

	public void setImagenPan(JLabel imagenPan) {
		this.imagenPan = imagenPan;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public JButton getBtnMostrar() {
		return btnMostrar;
	}

	public void setBtnMostrar(JButton btnMostrar) {
		this.btnMostrar = btnMostrar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

}
