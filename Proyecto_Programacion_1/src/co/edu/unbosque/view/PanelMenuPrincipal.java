package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;

/**
 * PanelMenuPrincipal es un panel de la interfaz gráfica que representa el menú
 * principal de la aplicación. Contiene botones para acceder a diferentes
 * secciones del sistema.
 * 
 * @author SANTIAGO GRANADOS y MARIO RODRIGUEZ
 * @version 1.0
 */
public class PanelMenuPrincipal extends JPanel {

	private JLabel imagenPpal;
	private JButton btnCarne, btnFrutaV, btnJuguete, btnPan;

	/**
	 * Constructor de PanelMenuPrincipal. Inicializa el panel con una imagen de
	 * fondo y botones para las distintas secciones del sistema.
	 */
	public PanelMenuPrincipal() {

		setLayout(null);
		setSize(1280, 720);
		setVisible(true);

		imagenPpal = new JLabel();
		ImageIcon imagen1 = new ImageIcon("src/media/ventanaPrincipalExito2.png");
		Image redimensionado = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenPpal.setIcon(new ImageIcon(redimensionado));
		imagenPpal.setBounds(0, 0, 1280, 720);

		btnCarne = new JButton("carnes");
		btnCarne.setBounds(482, 378, 140, 100);
		btnCarne.setOpaque(false);
		btnCarne.setActionCommand("CARNEFRIA");

		btnFrutaV = new JButton("frutaV");
		btnFrutaV.setBounds(634, 378, 155, 100);
		btnFrutaV.setOpaque(false);
		btnFrutaV.setActionCommand("FRUTAVERDURA");

		btnJuguete = new JButton("juguetes");
		btnJuguete.setBounds(485, 504, 140, 90);
		btnJuguete.setOpaque(false);
		btnJuguete.setActionCommand("JUGUETE");

		btnPan = new JButton("pan");
		btnPan.setBounds(634, 504, 155, 92);
		btnPan.setOpaque(false);
		btnPan.setActionCommand("PAN");

		add(imagenPpal);
		add(btnCarne);
		add(btnFrutaV);
		add(btnJuguete);
		add(btnPan);

	}

	/**
	 * Obtiene la etiqueta de imagen de fondo del panel.
	 * 
	 * @return La etiqueta de imagen de fondo.
	 */
	public JLabel getImagenPpal() {
		return imagenPpal;
	}

	/**
	 * Establece la etiqueta de imagen de fondo del panel.
	 * 
	 * @param imagenPpal La nueva etiqueta de imagen de fondo.
	 */
	public void setImagenPpal(JLabel imagenPpal) {
		this.imagenPpal = imagenPpal;
	}

	/**
	 * Obtiene el botón de "carnes" del panel.
	 * 
	 * @return El botón de "carnes".
	 */
	public JButton getBtnCarne() {
		return btnCarne;
	}

	/**
	 * Establece el botón de "carnes" del panel.
	 * 
	 * @param btnCarne El nuevo botón de "carnes".
	 */
	public void setBtnCarne(JButton btnCarne) {
		this.btnCarne = btnCarne;
	}

	/**
	 * Obtiene el botón de "fruta y verdura" del panel.
	 * 
	 * @return El botón de "fruta y verdura".
	 */
	public JButton getBtnFrutaV() {
		return btnFrutaV;
	}

	/**
	 * Establece el botón de "fruta y verdura" del panel.
	 * 
	 * @param btnFrutaV El nuevo botón de "fruta y verdura".
	 */
	public void setBtnFrutaV(JButton btnFrutaV) {
		this.btnFrutaV = btnFrutaV;
	}

	/**
	 * Obtiene el botón de "juguetes" del panel.
	 * 
	 * @return El botón de "juguetes".
	 */
	public JButton getBtnJuguete() {
		return btnJuguete;
	}

	/**
	 * Establece el botón de "juguetes" del panel.
	 * 
	 * @param btnJuguete El nuevo botón de "juguetes".
	 */
	public void setBtnJuguete(JButton btnJuguete) {
		this.btnJuguete = btnJuguete;
	}

	/**
	 * Obtiene el botón de "pan" del panel.
	 * 
	 * @return El botón de "pan".
	 */
	public JButton getBtnPan() {
		return btnPan;
	}

	/**
	 * Establece el botón de "pan" del panel.
	 * 
	 * @param btnPan El nuevo botón de "pan".
	 */
	public void setBtnPan(JButton btnPan) {
		this.btnPan = btnPan;
	}

}
