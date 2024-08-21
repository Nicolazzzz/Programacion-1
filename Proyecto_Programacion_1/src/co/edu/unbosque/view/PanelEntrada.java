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

/**
 * PanelEntrada es un panel de la interfaz gráfica que permite la entrada de
 * datos para productos. Incluye campos de texto para ingresar información del
 * producto, botones para agregar, actualizar, importar imágenes y volver, así
 * como etiquetas de imagen para mostrar detalles adicionales según el tipo de
 * producto.
 */
public class PanelEntrada extends JPanel {
	private JLabel imagenBackground, imagenProducto, imagenAgregarC, imagenAgregarV, imagenAgregarJ, imagenAgregarP;
	private JTextField numId, nombre, empresa, precio, cantidad, atributoPropio1, atributoPropio2, atributoPropio3;
	private JButton btnVolver, btnAgregar, btnJFileChooser, btnActualizar;

	/**
	 * Constructor de la clase PanelEntrada. Inicializa y configura todos los
	 * componentes gráficos del panel, incluyendo campos de texto, botones y
	 * etiquetas de imagen, así como las propiedades del panel.
	 */
	public PanelEntrada() {

		// **Creación y configuración del borde para los componentes**
		Border border = BorderFactory.createLineBorder(Color.BLACK, 3);

		// **Configuración básica del panel**
		setSize(1280, 720);
		setLayout(null);
		setVisible(true);

		// **Inicialización y configuración de campos de texto (JTextField)**
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

		// **Inicialización y configuración de botones (JButton)**
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

		// **Inicialización y configuración de etiquetas de imagen (JLabel)**
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

		// **Agregando todos los componentes al panel**
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

	/**
	 * Obtiene el botón de actualización.
	 *
	 * @return el botón btnActualizar.
	 */
	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	/**
	 * Establece el botón de actualización.
	 *
	 * @param btnActualizar el botón btnActualizar a establecer.
	 */
	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	/**
	 * Obtiene la etiqueta de la imagen de fondo.
	 *
	 * @return la etiqueta imagenBackground.
	 */
	public JLabel getImagenBackground() {
		return imagenBackground;
	}

	/**
	 * Establece la etiqueta de la imagen de fondo.
	 *
	 * @param imagenBackground la etiqueta imagenBackground a establecer.
	 */
	public void setImagenBackground(JLabel imagenBackground) {
		this.imagenBackground = imagenBackground;
	}

	/**
	 * Obtiene la etiqueta de la imagen del producto.
	 *
	 * @return la etiqueta imagenProducto.
	 */
	public JLabel getImagenProducto() {
		return imagenProducto;
	}

	/**
	 * Establece la etiqueta de la imagen del producto.
	 *
	 * @param imagenProducto la etiqueta imagenProducto a establecer.
	 */
	public void setImagenProducto(JLabel imagenProducto) {
		this.imagenProducto = imagenProducto;
	}

	/**
	 * Obtiene la etiqueta de la imagen para agregar tipo C.
	 *
	 * @return la etiqueta imagenAgregarC.
	 */
	public JLabel getImagenAgregarC() {
		return imagenAgregarC;
	}

	/**
	 * Establece la etiqueta de la imagen para agregar tipo C.
	 *
	 * @param imagenAgregarC la etiqueta imagenAgregarC a establecer.
	 */
	public void setImagenAgregarC(JLabel imagenAgregarC) {
		this.imagenAgregarC = imagenAgregarC;
	}

	/**
	 * Obtiene la etiqueta de la imagen para agregar tipo V.
	 *
	 * @return la etiqueta imagenAgregarV.
	 */
	public JLabel getImagenAgregarV() {
		return imagenAgregarV;
	}

	/**
	 * Establece la etiqueta de la imagen para agregar tipo V.
	 *
	 * @param imagenAgregarV la etiqueta imagenAgregarV a establecer.
	 */
	public void setImagenAgregarV(JLabel imagenAgregarV) {
		this.imagenAgregarV = imagenAgregarV;
	}

	/**
	 * Obtiene la etiqueta de la imagen para agregar tipo J.
	 *
	 * @return la etiqueta imagenAgregarJ.
	 */
	public JLabel getImagenAgregarJ() {
		return imagenAgregarJ;
	}

	/**
	 * Establece la etiqueta de la imagen para agregar tipo J.
	 *
	 * @param imagenAgregarJ la etiqueta imagenAgregarJ a establecer.
	 */
	public void setImagenAgregarJ(JLabel imagenAgregarJ) {
		this.imagenAgregarJ = imagenAgregarJ;
	}

	/**
	 * Obtiene la etiqueta de la imagen para agregar tipo P.
	 *
	 * @return la etiqueta imagenAgregarP.
	 */
	public JLabel getImagenAgregarP() {
		return imagenAgregarP;
	}

	/**
	 * Establece la etiqueta de la imagen para agregar tipo P.
	 *
	 * @param imagenAgregarP la etiqueta imagenAgregarP a establecer.
	 */
	public void setImagenAgregarP(JLabel imagenAgregarP) {
		this.imagenAgregarP = imagenAgregarP;
	}

	/**
	 * Obtiene el campo de texto para el número de identificación.
	 *
	 * @return el campo de texto numId.
	 */
	public JTextField getNumId() {
		return numId;
	}

	/**
	 * Establece el campo de texto para el número de identificación.
	 *
	 * @param numId el campo de texto numId a establecer.
	 */
	public void setNumId(JTextField numId) {
		this.numId = numId;
	}

	/**
	 * Obtiene el campo de texto para el nombre.
	 *
	 * @return el campo de texto nombre.
	 */
	public JTextField getNombre() {
		return nombre;
	}

	/**
	 * Establece el campo de texto para el nombre.
	 *
	 * @param nombre el campo de texto nombre a establecer.
	 */
	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el campo de texto para la empresa.
	 *
	 * @return el campo de texto empresa.
	 */
	public JTextField getEmpresa() {
		return empresa;
	}

	/**
	 * Establece el campo de texto para la empresa.
	 *
	 * @param empresa el campo de texto empresa a establecer.
	 */
	public void setEmpresa(JTextField empresa) {
		this.empresa = empresa;
	}

	/**
	 * Obtiene el campo de texto para el precio.
	 *
	 * @return el campo de texto precio.
	 */
	public JTextField getPrecio() {
		return precio;
	}

	/**
	 * Establece el campo de texto para el precio.
	 *
	 * @param precio el campo de texto precio a establecer.
	 */
	public void setPrecio(JTextField precio) {
		this.precio = precio;
	}

	/**
	 * Obtiene el campo de texto para la cantidad.
	 *
	 * @return el campo de texto cantidad.
	 */
	public JTextField getCantidad() {
		return cantidad;
	}

	/**
	 * Establece el campo de texto para la cantidad.
	 *
	 * @param cantidad el campo de texto cantidad a establecer.
	 */
	public void setCantidad(JTextField cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Obtiene el campo de texto para el primer atributo propio.
	 *
	 * @return el campo de texto atributoPropio1.
	 */
	public JTextField getAtributoPropio1() {
		return atributoPropio1;
	}

	/**
	 * Establece el campo de texto para el primer atributo propio.
	 *
	 * @param atributoPropio1 el campo de texto atributoPropio1 a establecer.
	 */
	public void setAtributoPropio1(JTextField atributoPropio1) {
		this.atributoPropio1 = atributoPropio1;
	}

	/**
	 * Obtiene el campo de texto para el segundo atributo propio.
	 *
	 * @return el campo de texto atributoPropio2.
	 */
	public JTextField getAtributoPropio2() {
		return atributoPropio2;
	}

	/**
	 * Establece el campo de texto para el segundo atributo propio.
	 *
	 * @param atributoPropio2 el campo de texto atributoPropio2 a establecer.
	 */
	public void setAtributoPropio2(JTextField atributoPropio2) {
		this.atributoPropio2 = atributoPropio2;
	}

	/**
	 * Obtiene el campo de texto para el tercer atributo propio.
	 *
	 * @return el campo de texto atributoPropio3.
	 */
	public JTextField getAtributoPropio3() {
		return atributoPropio3;
	}

	/**
	 * Establece el campo de texto para el tercer atributo propio.
	 *
	 * @param atributoPropio3 el campo de texto atributoPropio3 a establecer.
	 */
	public void setAtributoPropio3(JTextField atributoPropio3) {
		this.atributoPropio3 = atributoPropio3;
	}

	/**
	 * Obtiene el botón de volver.
	 *
	 * @return el botón btnVolver.
	 */
	public JButton getBtnVolver() {
		return btnVolver;
	}

	/**
	 * Establece el botón de volver.
	 *
	 * @param btnVolver el botón btnVolver a establecer.
	 */
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	/**
	 * Obtiene el botón de agregar.
	 *
	 * @return el botón btnAgregar.
	 */
	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	/**
	 * Establece el botón de agregar.
	 *
	 * @param btnAgregar el botón btnAgregar a establecer.
	 */
	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	/**
	 * Obtiene el botón para abrir el JFileChooser.
	 *
	 * @return el botón btnJFileChooser.
	 */
	public JButton getBtnJFileChooser() {
		return btnJFileChooser;
	}

	/**
	 * Establece el botón para abrir el JFileChooser.
	 *
	 * @param btnJFileChooser el botón btnJFileChooser a establecer.
	 */
	public void setBtnJFileChooser(JButton btnJFileChooser) {
		this.btnJFileChooser = btnJFileChooser;
	}

}
