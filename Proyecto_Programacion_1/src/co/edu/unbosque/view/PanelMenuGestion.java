package co.edu.unbosque.view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
*
* @author SANTIAGO GRANADOS y MARIO RODRIGUEZ
* @version 1.0
* 
* 
* */

/**
 * PanelMenuGestion es un panel de la interfaz gráfica que representa el menú de
 * gestión para el sistema. Contiene botones para agregar, mostrar, actualizar,
 * eliminar productos, y volver al menú principal. Además, incluye imágenes de
 * fondo específicas para cada tipo de producto.
 */

public class PanelMenuGestion extends JPanel {

	private JLabel imagenCarne, imagenFV, imagenJuguete, imagenPan;
	private JButton btnAgregar, btnMostrar, btnActualizar, btnEliminar, btnVolver;

	/**
	 * Constructor de PanelMenuGestion. Inicializa el panel con botones para las
	 * acciones de gestión y con imágenes de fondo específicas para cada tipo de
	 * producto.
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

	/**
	 * Obtiene la etiqueta de imagen para el tipo de producto "carne".
	 * 
	 * @return La etiqueta de imagen para "carne".
	 */
	public JLabel getImagenCarne() {
		return imagenCarne;
	}

	/**
	 * Establece la etiqueta de imagen para el tipo de producto "carne".
	 * 
	 * @param imagenCarne La nueva etiqueta de imagen para "carne".
	 */
	public void setImagenCarne(JLabel imagenCarne) {
		this.imagenCarne = imagenCarne;
	}

	/**
	 * Obtiene la etiqueta de imagen para el tipo de producto "fruta y verdura".
	 * 
	 * @return La etiqueta de imagen para "fruta y verdura".
	 */
	public JLabel getImagenFV() {
		return imagenFV;
	}

	/**
	 * Establece la etiqueta de imagen para el tipo de producto "fruta y verdura".
	 * 
	 * @param imagenFV La nueva etiqueta de imagen para "fruta y verdura".
	 */
	public void setImagenFV(JLabel imagenFV) {
		this.imagenFV = imagenFV;
	}

	/**
	 * Obtiene la etiqueta de imagen para el tipo de producto "juguete".
	 * 
	 * @return La etiqueta de imagen para "juguete".
	 */
	public JLabel getImagenJuguete() {
		return imagenJuguete;
	}

	/**
	 * Establece la etiqueta de imagen para el tipo de producto "juguete".
	 * 
	 * @param imagenJuguete La nueva etiqueta de imagen para "juguete".
	 */
	public void setImagenJuguete(JLabel imagenJuguete) {
		this.imagenJuguete = imagenJuguete;
	}

	/**
	 * Obtiene la etiqueta de imagen para el tipo de producto "pan".
	 * 
	 * @return La etiqueta de imagen para "pan".
	 */
	public JLabel getImagenPan() {
		return imagenPan;
	}

	/**
	 * Establece la etiqueta de imagen para el tipo de producto "pan".
	 * 
	 * @param imagenPan La nueva etiqueta de imagen para "pan".
	 */
	public void setImagenPan(JLabel imagenPan) {
		this.imagenPan = imagenPan;
	}

	/**
	 * Obtiene el botón de "agregar" del panel.
	 * 
	 * @return El botón de "agregar".
	 */
	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	/**
	 * Establece el botón de "agregar" del panel.
	 * 
	 * @param btnAgregar El nuevo botón de "agregar".
	 */
	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	/**
	 * Obtiene el botón de "mostrar" del panel.
	 * 
	 * @return El botón de "mostrar".
	 */
	public JButton getBtnMostrar() {
		return btnMostrar;
	}

	/**
	 * Establece el botón de "mostrar" del panel.
	 * 
	 * @param btnMostrar El nuevo botón de "mostrar".
	 */
	public void setBtnMostrar(JButton btnMostrar) {
		this.btnMostrar = btnMostrar;
	}

	/**
	 * Obtiene el botón de "actualizar" del panel.
	 * 
	 * @return El botón de "actualizar".
	 */
	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	/**
	 * Establece el botón de "actualizar" del panel.
	 * 
	 * @param btnActualizar El nuevo botón de "actualizar".
	 */
	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	/**
	 * Obtiene el botón de "eliminar" del panel.
	 * 
	 * @return El botón de "eliminar".
	 */
	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	/**
	 * Establece el botón de "eliminar" del panel.
	 * 
	 * @param btnEliminar El nuevo botón de "eliminar".
	 */
	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	/**
	 * Obtiene el botón de "volver" del panel.
	 * 
	 * @return El botón de "volver".
	 */
	public JButton getBtnVolver() {
		return btnVolver;
	}

	/**
	 * Establece el botón de "volver" del panel.
	 * 
	 * @param btnVolver El nuevo botón de "volver".
	 */
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

}