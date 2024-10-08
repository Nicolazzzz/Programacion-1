/**
 * @author MARIO RODRIGUEZ
 * @version 1.0
 * 
 * Paquete que contiene las clases relacionadas con el control de la aplicación 
 * y en este paquete se maneja la logica de el aplicativo.
 */
package co.edu.unbosque.controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import co.edu.unbosque.model.CarneFria;
import co.edu.unbosque.model.FrutaVerdura;
import co.edu.unbosque.model.Juguete;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.Panaderia;
import co.edu.unbosque.view.ViewFacade;

/**
 * 
 * @author MARIO RODRIGUEZ
 * @version 1.0
 * 
 *          Clase que controla la interacción y logica entre la vista y el
 *          modelo en la aplicación. Implementa la interfaz
 *          {@link java.awt.event.ActionListener} para manejar eventos de
 *          acciones en la interfaz gráfica.
 */
public class Controlador implements ActionListener {

	private ModelFacade mf;
	private ViewFacade vf;

	// Variables necesarias para ejecutar el programa
	private int index = 0;
	private boolean carne = false;
	private boolean frutaV = false;
	private boolean juguete = false;
	private boolean pan = false;
	private boolean newCarne = false;
	private boolean newFrutaV = false;
	private boolean newJuguete = false;
	private boolean newPan = false;

	/**
	 * Constructor que inicializa el controlador, Modelfacade, ViewFacade y muestra
	 * el menú principal.
	 */
	public Controlador() {
		mf = new ModelFacade();
		vf = new ViewFacade();
		vf.getPrincipal().mostrarPanelMenuPrincipal();
		vf.getCon().mostrarMensajeEmergente("Bienvenido a almacenes exito!");
		asignarLectores();
	}

	/**
	 * Asigna los ActionListeners a los botones de los paneles de la vista. Esto
	 * permite que el controlador maneje los eventos de acción generados por la
	 * interfaz gráfica.
	 */
	public void asignarLectores() {
		// Asigna listeners a los botones del menú principal
		vf.getPrincipal().getMenuPpal().getBtnCarne().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getBtnCarne().setActionCommand("CARNEFRIA");

		vf.getPrincipal().getMenuPpal().getBtnFrutaV().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getBtnFrutaV().setActionCommand("FRUTAVERDURA");

		vf.getPrincipal().getMenuPpal().getBtnJuguete().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getBtnJuguete().setActionCommand("JUGUETE");

		vf.getPrincipal().getMenuPpal().getBtnPan().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getBtnPan().setActionCommand("PAN");

		// Asigna listeners a los botones del menú de gestión
		vf.getPrincipal().getMenuGestion().getBtnAgregar().addActionListener(this);
		vf.getPrincipal().getMenuGestion().getBtnAgregar().setActionCommand("AGREGAR");

		vf.getPrincipal().getMenuGestion().getBtnMostrar().addActionListener(this);
		vf.getPrincipal().getMenuGestion().getBtnMostrar().setActionCommand("MOSTRAR");

		vf.getPrincipal().getMenuGestion().getBtnActualizar().addActionListener(this);
		vf.getPrincipal().getMenuGestion().getBtnActualizar().setActionCommand("ACTUALIZAR");

		vf.getPrincipal().getMenuGestion().getBtnEliminar().addActionListener(this);
		vf.getPrincipal().getMenuGestion().getBtnEliminar().setActionCommand("ELIMINAR");

		vf.getPrincipal().getMenuGestion().getBtnVolver().addActionListener(this);
		vf.getPrincipal().getMenuGestion().getBtnVolver().setActionCommand("VOLVER");

		// Asigna listeners a los botones del panel de agregar
		vf.getPrincipal().getPanelEntrada().getBtnAgregar().addActionListener(this);
		vf.getPrincipal().getPanelEntrada().getBtnAgregar().setActionCommand("AGREGARPRODUCTO");

		vf.getPrincipal().getPanelEntrada().getBtnVolver().addActionListener(this);
		vf.getPrincipal().getPanelEntrada().getBtnVolver().setActionCommand("VOLVERDEADD");

		vf.getPrincipal().getPanelEntrada().getBtnJFileChooser().addActionListener(this);
		vf.getPrincipal().getPanelEntrada().getBtnJFileChooser().setActionCommand("IMAGEN");

		vf.getPrincipal().getPanelEntrada().getBtnActualizar().addActionListener(this);
		vf.getPrincipal().getPanelEntrada().getBtnActualizar().setActionCommand("UPDATE");
	}

	/**
	 * Método que maneja los eventos de acción generados por los componentes de la
	 * interfaz gráfica. Este método se encarga de actualizar la interfaz de usuario
	 * dependiendo del componente seleccionado en el menú principal o en otros
	 * paneles, y ajusta la configuración y visibilidad de varios componentes
	 * gráficos según la sección que el usuario desea administrar.
	 *
	 * @param e El evento de acción que se produjo.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {

		// Maneja la selección de "Carne Fría" desde el menú principal
		case "CARNEFRIA":
			// Cambia el título de la ventana para indicar que se está administrando "Carnes
			// Frías"
			vf.getPrincipal().setTitle("ADMINISTRANDO CARNES FRIAS");

			// Configura la visibilidad de las imágenes de fondo según el tipo de producto
			// seleccionado
			vf.getPrincipal().getPanelEntrada().getImagenAgregarC().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarV().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarJ().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarP().setVisible(false);

			// Ajusta las imágenes específicas del menú de gestión para mostrar la sección
			// "Carne Fría"
			vf.getPrincipal().getMenuGestion().getImagenCarne().setVisible(true);
			vf.getPrincipal().getMenuGestion().getImagenFV().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenJuguete().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPan().setVisible(false);

			// Configura los campos de atributos propios visibles y no visibles para "Carne
			// Fría"
			vf.getPrincipal().getPanelEntrada().getAtributoPropio1().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getAtributoPropio2().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getAtributoPropio3().setVisible(false);

			// Muestra el panel del menú de gestión donde se realizarán las operaciones CRUD
			// para "Carne Fría"
			vf.getPrincipal().mostrarPanelMenuGestion();

			// Ajusta las variables booleanas para indicar que se está gestionando "Carne
			// Fría"
			carne = true;
			frutaV = false;
			juguete = false;
			pan = false;
			break;

		// Maneja la selección de "Fruta y Verdura" desde el menú principal
		case "FRUTAVERDURA":
			// Cambia el título de la ventana para indicar que se está administrando "Frutas
			// y Verduras"
			vf.getPrincipal().setTitle("ADMINISTRANDO FRUTAS Y VERDURAS");

			// Configura la visibilidad de las imágenes de fondo según el tipo de producto
			// seleccionado
			vf.getPrincipal().getPanelEntrada().getImagenAgregarC().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarV().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarJ().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarP().setVisible(false);

			// Ajusta las imágenes específicas del menú de gestión para mostrar la sección
			// "Fruta y Verdura"
			vf.getPrincipal().getMenuGestion().getImagenCarne().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenFV().setVisible(true);
			vf.getPrincipal().getMenuGestion().getImagenJuguete().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPan().setVisible(false);

			// Configura los campos de atributos propios visibles para "Fruta y Verdura"
			// En este caso, muestra dos campos para atributos específicos como fecha de
			// cosecha y orgánico
			vf.getPrincipal().getPanelEntrada().getAtributoPropio1().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getAtributoPropio2().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getAtributoPropio3().setVisible(false);

			// Define los textos predeterminados para los campos de atributos propios
			vf.getPrincipal().getPanelEntrada().getAtributoPropio1().setText("dd/mm/yyyy");
			vf.getPrincipal().getPanelEntrada().getAtributoPropio2().setText("Si / No");

			// Muestra el panel del menú de gestión donde se realizarán las operaciones CRUD
			// para "Fruta y Verdura"
			vf.getPrincipal().mostrarPanelMenuGestion();

			// Ajusta las variables booleanas para indicar que se está gestionando "Fruta y
			// Verdura"
			carne = false;
			frutaV = true;
			juguete = false;
			pan = false;
			break;

		// Maneja la selección de "Juguete" desde el menú principal
		case "JUGUETE":
			// Cambia el título de la ventana para indicar que se está administrando
			// "Juguetes"
			vf.getPrincipal().setTitle("ADMINISTRANDO JUGUETES");

			// Configura la visibilidad de las imágenes de fondo según el tipo de producto
			// seleccionado
			vf.getPrincipal().getPanelEntrada().getImagenAgregarC().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarV().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarJ().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarP().setVisible(false);

			// Ajusta las imágenes específicas del menú de gestión para mostrar la sección
			// "Juguete"
			vf.getPrincipal().getMenuGestion().getImagenCarne().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenFV().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenJuguete().setVisible(true);
			vf.getPrincipal().getMenuGestion().getImagenPan().setVisible(false);

			// Configura los campos de atributos propios visibles para "Juguete"
			// Muestra dos campos para atributos específicos de juguetes, como edad
			// recomendada y tipo de juguete
			vf.getPrincipal().getPanelEntrada().getAtributoPropio1().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getAtributoPropio2().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getAtributoPropio3().setVisible(false);

			// Muestra el panel del menú de gestión donde se realizarán las operaciones CRUD
			// para "Juguete"
			vf.getPrincipal().mostrarPanelMenuGestion();

			// Ajusta las variables booleanas para indicar que se está gestionando "Juguete"
			carne = false;
			frutaV = false;
			juguete = true;
			pan = false;
			break;

		// Maneja la selección de "Panadería" desde el menú principal
		case "PAN":
			// Cambia el título de la ventana para indicar que se está administrando
			// "Panadería"
			vf.getPrincipal().setTitle("ADMINISTRANDO PANADERIA");

			// Configura la visibilidad de las imágenes de fondo según el tipo de producto
			// seleccionado
			vf.getPrincipal().getPanelEntrada().getImagenAgregarC().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarV().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarJ().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenAgregarP().setVisible(true);

			// Ajusta las imágenes específicas del menú de gestión para mostrar la sección
			// "Panadería"
			vf.getPrincipal().getMenuGestion().getImagenCarne().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenFV().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenJuguete().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPan().setVisible(true);

			// Configura los campos de atributos propios visibles para "Panadería"
			// Muestra tres campos para atributos específicos de panadería, como sin gluten,
			// integral y sin azúcar
			vf.getPrincipal().getPanelEntrada().getAtributoPropio1().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getAtributoPropio2().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getAtributoPropio3().setVisible(true);

			// Define los textos predeterminados para los campos de atributos propios
			vf.getPrincipal().getPanelEntrada().getAtributoPropio1().setText("Si / No");
			vf.getPrincipal().getPanelEntrada().getAtributoPropio2().setText("Si / No");
			vf.getPrincipal().getPanelEntrada().getAtributoPropio3().setText("Si / No");

			// Muestra el panel del menú de gestión donde se realizarán las operaciones CRUD
			// para "Panadería"
			vf.getPrincipal().mostrarPanelMenuGestion();

			// Ajusta las variables booleanas para indicar que se está gestionando
			// "Panadería"
			carne = false;
			frutaV = false;
			juguete = false;
			pan = true;
			break;

		/**
		 * Método que maneja los eventos de acción relacionados con la gestión de
		 * productos en la interfaz gráfica, tales como agregar, mostrar y actualizar
		 * elementos en la base de datos.
		 *
		 * @param e El evento de acción que se produjo.
		 */

		// Maneja la acción de "Agregar" un nuevo producto al inventario
		case "AGREGAR":
			// Oculta el botón de "Actualizar" ya que estamos en modo de agregación
			vf.getPrincipal().getPanelEntrada().getBtnActualizar().setVisible(false);

			// Determina qué tipo de producto se va a agregar basado en la sección
			// seleccionada
			if (carne) {
				// Cambia el título de la ventana para indicar que se está agregando un nuevo
				// producto de "Carnes Frías"
				vf.getPrincipal().setTitle("AGREGANDO CARNES FRIAS");
				// Muestra el panel de agregación para ingresar los datos del nuevo producto
				vf.getPrincipal().mostrarPanelEntrada();
			}
			if (frutaV) {
				// Cambia el título de la ventana para indicar que se está agregando un nuevo
				// producto de "Frutas y Verduras"
				vf.getPrincipal().setTitle("AGREGANDO FRUTAS Y VERDURAS");
				// Muestra el panel de agregación para ingresar los datos del nuevo producto
				vf.getPrincipal().mostrarPanelEntrada();
			}
			if (juguete) {
				// Cambia el título de la ventana para indicar que se está agregando un nuevo
				// "Juguete"
				vf.getPrincipal().setTitle("AGREGANDO JUGUETES");
				// Muestra el panel de agregación para ingresar los datos del nuevo producto
				vf.getPrincipal().mostrarPanelEntrada();
			}
			if (pan) {
				// Cambia el título de la ventana para indicar que se está agregando un nuevo
				// producto en "Panadería"
				vf.getPrincipal().setTitle("AGREGANDO EN PANADERIA");
				// Muestra el panel de agregación para ingresar los datos del nuevo producto
				vf.getPrincipal().mostrarPanelEntrada();
			}
			break;

		// Maneja la acción de "Mostrar" la lista de productos almacenados
		case "MOSTRAR":
			// Verifica la sección seleccionada y muestra el listado correspondiente
			if (carne) {
				// Muestra la lista de "Carnes Frías" en la interfaz
				vf.getCon().mostrarListado(mf.getCarneFriaDAO().mostrar());
			}
			if (frutaV) {
				// Muestra la lista de "Frutas y Verduras" en la interfaz
				vf.getCon().mostrarListado(mf.getFrutaVerduraDAO().mostrar());
			}
			if (juguete) {
				// Muestra la lista de "Juguetes" en la interfaz
				vf.getCon().mostrarListado(mf.getJugueteDAO().mostrar());
			}
			if (pan) {
				// Muestra la lista de productos en "Panadería" en la interfaz
				vf.getCon().mostrarListado(mf.getPanaderiaDAO().mostrar());
			}
			break;

		// Maneja la acción de "Actualizar" un producto existente en la base de datos
		case "ACTUALIZAR":
			try {
				// Verifica si la sección seleccionada es "Carnes Frías"
				if (carne) {
					// Cambia el título de la ventana para indicar que se está actualizando un
					// producto en "Carnes Frías"
					vf.getPrincipal().setTitle("ACTUALIZANDO CARNES FRIAS");
					// Solicita al usuario que ingrese la posición del producto que desea actualizar
					index = Integer.parseInt(vf.getCon().leerEntradaEmergente("Ingrese la posición a actualizar: "));
					// Verifica si el índice ingresado es válido
					if (mf.getCarneFriaDAO().checkearIndex(index - 1).equals("s")) {
						// Oculta el botón de "Agregar" y muestra el botón de "Actualizar" para editar
						// el producto
						vf.getPrincipal().getPanelEntrada().getBtnAgregar().setVisible(false);
						vf.getPrincipal().getPanelEntrada().getBtnActualizar().setVisible(true);
						// Muestra el panel de actualización con los datos del producto seleccionado
						vf.getPrincipal().mostrarPanelEntrada();
						// Ajusta las variables booleanas para indicar que se está actualizando un
						// producto de "Carnes Frías"
						newCarne = true;
						newFrutaV = false;
						newJuguete = false;
						newPan = false;
					} else {
						// Muestra un mensaje de alerta si el índice ingresado no es válido
						vf.getCon().mostrarAlerta("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");
					}
				}

				// Verifica si la sección seleccionada es "Frutas y Verduras"
				if (frutaV) {
					// Configura los campos de atributos propios para "Frutas y Verduras"
					vf.getPrincipal().getPanelEntrada().getAtributoPropio1().setText("dd/mm/yyyy");
					vf.getPrincipal().getPanelEntrada().getAtributoPropio2().setText("Si / No");
					// Cambia el título de la ventana para indicar que se está actualizando un
					// producto en "Frutas y Verduras"
					vf.getPrincipal().setTitle("ACTUALIZANDO FRUTAS Y VEGETALES");
					// Solicita al usuario que ingrese la posición del producto que desea actualizar
					index = Integer.parseInt(vf.getCon().leerEntradaEmergente("Ingrese la posición a actualizar: "));
					// Verifica si el índice ingresado es válido
					if (mf.getFrutaVerduraDAO().checkearIndex(index - 1).equals("s")) {
						// Oculta el botón de "Agregar" y muestra el botón de "Actualizar" para editar
						// el producto
						vf.getPrincipal().getPanelEntrada().getBtnAgregar().setVisible(false);
						vf.getPrincipal().getPanelEntrada().getBtnActualizar().setVisible(true);
						// Muestra el panel de actualización con los datos del producto seleccionado
						vf.getPrincipal().mostrarPanelEntrada();
						// Ajusta las variables booleanas para indicar que se está actualizando un
						// producto de "Frutas y Verduras"
						newCarne = false;
						newFrutaV = true;
						newJuguete = false;
						newPan = false;
					} else {
						// Muestra un mensaje de alerta si el índice ingresado no es válido
						vf.getCon().mostrarAlerta("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");
					}
				}

				// Verifica si la sección seleccionada es "Juguetes"
				if (juguete) {
					// Cambia el título de la ventana para indicar que se está actualizando un
					// producto en "Juguetes"
					vf.getPrincipal().setTitle("ACTUALIZANDO JUGUETES");
					// Solicita al usuario que ingrese la posición del producto que desea actualizar
					index = Integer.parseInt(vf.getCon().leerEntradaEmergente("Ingrese la posición a actualizar: "));
					// Verifica si el índice ingresado es válido
					if (mf.getJugueteDAO().checkearIndex(index - 1).equals("s")) {
						// Oculta el botón de "Agregar" y muestra el botón de "Actualizar" para editar
						// el producto
						vf.getPrincipal().getPanelEntrada().getBtnAgregar().setVisible(false);
						vf.getPrincipal().getPanelEntrada().getBtnActualizar().setVisible(true);
						// Muestra el panel de actualización con los datos del producto seleccionado
						vf.getPrincipal().mostrarPanelEntrada();
						// Ajusta las variables booleanas para indicar que se está actualizando un
						// producto de "Juguetes"
						newCarne = false;
						newFrutaV = false;
						newJuguete = true;
						newPan = false;
					} else {
						// Muestra un mensaje de alerta si el índice ingresado no es válido
						vf.getCon().mostrarAlerta("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");
					}
				}

				if (pan == true) {
					vf.getPrincipal().getPanelEntrada().getAtributoPropio1().setText("Si / No");
					vf.getPrincipal().getPanelEntrada().getAtributoPropio2().setText("Si / No");
					vf.getPrincipal().getPanelEntrada().getAtributoPropio3().setText("Si / No");
					vf.getPrincipal().setTitle("ACTUALIZANDO PANADERIA");
					index = Integer.parseInt(vf.getCon().leerEntradaEmergente("Ingrese la posición a actualizar: "));
					if (mf.getPanaderiaDAO().checkearIndex(index - 1).equals("s")) {
						vf.getPrincipal().getPanelEntrada().getBtnAgregar().setVisible(false);
						vf.getPrincipal().getPanelEntrada().getBtnActualizar().setVisible(true);
						vf.getPrincipal().mostrarPanelEntrada();
						newCarne = false;
						newFrutaV = false;
						newJuguete = false;
						newPan = true;

					} else {
						vf.getCon().mostrarAlerta("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");

					}
				}
			} catch (NumberFormatException j) {
				vf.getCon().mostrarError("Verifique el formato de los datos ingresados");
			}
			break;
		/**
		 * Permite eliminar un producto de la base de datos según la categoría
		 * seleccionada y el nombre del producto ingresado por el usuario.
		 */
		case "ELIMINAR":
			// Código para manejar la acción de eliminar un producto...
			if (carne == true) {
				String delete = vf.getCon().leerInputEliminar("Ingrese el nombre del producto a eliminar: ");
				vf.getCon().mostrarAlerta(mf.getCarneFriaDAO().eliminarPorNombre(delete));
			}
			if (frutaV == true) {
				String delete1 = vf.getCon().leerInputEliminar("Ingrese el nombre del producto a eliminar: ");
				vf.getCon().mostrarAlerta(mf.getFrutaVerduraDAO().eliminarPorNombre(delete1));
			}
			if (juguete == true) {
				String delete2 = vf.getCon().leerInputEliminar("Ingrese el nombre del producto a eliminar: ");
				vf.getCon().mostrarAlerta(mf.getJugueteDAO().eliminarPorNombre(delete2));
			}

			if (pan == true) {
				String delete3 = vf.getCon().leerInputEliminar("Ingrese el nombre del producto a eliminar: ");
				vf.getCon().mostrarAlerta(mf.getPanaderiaDAO().eliminarPorNombre(delete3));
			}
			break;

		/**
		 * Retorna al menú principal y limpia la interfaz.
		 */
		case "VOLVER":
			// Código para manejar la acción de volver al menú principal...
			vf.getPrincipal().setTitle("MENU PRINCIPAL");
			vf.getPrincipal().getPanelEntrada().getImagenProducto().setIcon(null);
			vf.getPrincipal().mostrarPanelMenuPrincipal();
			break;

		// PANEL ENTRADA
		/**
		 * Retorna desde el panel de agregación al menú de gestión de la categoría
		 * seleccionada.
		 */
		case "VOLVERDEADD":
			// Código para manejar la acción de volver desde el panel de agregación...
			vf.getPrincipal().getPanelEntrada().getBtnAgregar().setVisible(true);
			vf.getPrincipal().getPanelEntrada().getBtnActualizar().setVisible(false);
			vf.getPrincipal().getPanelEntrada().getImagenProducto().setIcon(null);

			/**
			 * Cambia el título de la ventana según la categoría seleccionada y muestra el
			 * panel de menú de gestión correspondiente.
			 * 
			 * Si la categoría es "Carne Fría", establece el título como "ADMINISTRANDO
			 * CARNES FRIAS".
			 * 
			 */
			if (carne == true) {
				vf.getPrincipal().setTitle("ADMINISTRANDO CARNES FRIAS");
				vf.getPrincipal().mostrarPanelMenuGestion();
			}
			/**
			 * * Si la categoría es "Fruta y Verdura", establece el título como
			 * "ADMINISTRANDO FRUTAS Y VERDURAS".
			 */

			if (frutaV == true) {
				vf.getPrincipal().setTitle("ADMINISTRANDO FRUTAS Y VERDURAS");
				vf.getPrincipal().mostrarPanelMenuGestion();

			}
			/**
			 * * Si la categoría es "Juguete", establece el título como "ADMINISTRANDO
			 * JUGUETES".
			 */

			if (juguete == true) {
				vf.getPrincipal().setTitle("ADMINISTRANDO JUGUETES");
				vf.getPrincipal().mostrarPanelMenuGestion();

			}
			/*
			 * Si la categoría es "Panadería", establece el título como
			 * "ADMINISTRANDO PANADERIA".
			 */
			if (pan == true) {
				vf.getPrincipal().setTitle("ADMINISTRANDO PANADERIA");
				vf.getPrincipal().mostrarPanelMenuGestion();

			}
			/**
			 * Limpia los campos de entrada en el panel de entrada de datos para preparar el
			 * formulario para la introducción de un nuevo producto. Se vacían los
			 * siguientes campos: - Número de ID - Nombre del producto - Empresa productora
			 * - Precio - Cantidad - Atributos propios (dependiendo de la categoría)
			 */
			vf.getPrincipal().getPanelEntrada().getNumId().setText("");
			vf.getPrincipal().getPanelEntrada().getNombre().setText("");
			vf.getPrincipal().getPanelEntrada().getEmpresa().setText("");
			vf.getPrincipal().getPanelEntrada().getPrecio().setText("");
			vf.getPrincipal().getPanelEntrada().getCantidad().setText("");
			vf.getPrincipal().getPanelEntrada().getAtributoPropio1().setText("");
			vf.getPrincipal().getPanelEntrada().getAtributoPropio2().setText("");
			vf.getPrincipal().getPanelEntrada().getAtributoPropio3().setText("");
			break;
		/**
		 * Maneja la creación de productos en función de la categoría seleccionada
		 * (Carne Fría, Fruta y Verdura, Juguete). Extrae los datos del formulario de
		 * entrada, crea el objeto correspondiente y lo guarda en la base de datos.
		 * Muestra un mensaje de éxito o error en la interfaz gráfica.
		 */
		case "AGREGARPRODUCTO":

			try {
				/**
				 * Si la categoría seleccionada es "Carne Fría", extrae los datos del formulario
				 * y crea un objeto `CarneFria`. Guarda el objeto en la base de datos mediante
				 * el DAO correspondiente y muestra un mensaje de éxito.
				 */
				if (carne == true) {
					long numId = Long.parseLong(vf.getPrincipal().getPanelEntrada().getNumId().getText());

					String nombre = vf.getPrincipal().getPanelEntrada().getNombre().getText();

					String empresa = vf.getPrincipal().getPanelEntrada().getEmpresa().getText();

					float precio = Float.parseFloat(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

					int cantidad = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidad().getText());

					String animalOrigen = vf.getPrincipal().getPanelEntrada().getAtributoPropio1().getText();

					mf.getCarneFriaDAO().crear(new CarneFria(numId, nombre, empresa, precio, cantidad, animalOrigen));
					vf.getCon().mostrarMensajeEmergente("Producto creado exitosamente");

				}
				/**
				 * Si la categoría seleccionada es "Fruta y Verdura", extrae los datos del
				 * formulario y crea un objeto `FrutaVerdura`. Realiza un análisis adicional
				 * para el atributo `cosecha` (que debe ser una fecha) y si es orgánico. Guarda
				 * el objeto en la base de datos mediante el DAO correspondiente. Muestra un
				 * mensaje de éxito o error en caso de fallo en el análisis de la fecha.
				 */
				if (frutaV == true) {

					try {
						long numId1 = Long.parseLong(vf.getPrincipal().getPanelEntrada().getNumId().getText());

						String nombre1 = vf.getPrincipal().getPanelEntrada().getNombre().getText();

						String empresa1 = vf.getPrincipal().getPanelEntrada().getEmpresa().getText();

						float precio1 = Float.parseFloat(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

						int cantidad1 = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidad().getText());

						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						String date = vf.getPrincipal().getPanelEntrada().getAtributoPropio1().getText();
						Date cosecha;
						cosecha = sdf.parse(date);

						String organico = (vf.getPrincipal().getPanelEntrada().getAtributoPropio2().getText());
						boolean esOrganico = vf.getCon().leerBoolean(organico);

						mf.getFrutaVerduraDAO().crear(
								new FrutaVerdura(numId1, nombre1, empresa1, precio1, cantidad1, cosecha, esOrganico));
						vf.getCon().mostrarMensajeEmergente("Producto creado exitosamente");

					} catch (ParseException e1) {
						vf.getCon().mostrarError("Formato de fecha no válido, ingrese dd/MM/yyyy");
					}

				}
				/**
				 * Si la categoría seleccionada es "Juguete", extrae los datos del formulario y
				 * crea un objeto `Juguete`. Guarda el objeto en la base de datos mediante el
				 * DAO correspondiente y muestra un mensaje de éxito.
				 */
				if (juguete == true) {
					long numId2 = Long.parseLong(vf.getPrincipal().getPanelEntrada().getNumId().getText());

					String nombre2 = vf.getPrincipal().getPanelEntrada().getNombre().getText();

					String empresa2 = vf.getPrincipal().getPanelEntrada().getEmpresa().getText();

					float precio2 = Float.parseFloat(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

					int cantidad2 = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidad().getText());

					int edadMinima = Integer
							.parseInt(vf.getPrincipal().getPanelEntrada().getAtributoPropio1().getText());

					int numeroJugadores = Integer
							.parseInt(vf.getPrincipal().getPanelEntrada().getAtributoPropio2().getText());

					mf.getJugueteDAO().crear(
							new Juguete(numId2, nombre2, empresa2, precio2, cantidad2, edadMinima, numeroJugadores));
					vf.getCon().mostrarMensajeEmergente("Producto creado exitosamente");

				}
				/**
				 * Si la categoría seleccionada es "Panadería", extrae los datos del formulario
				 * y crea un objeto `Panaderia`. Guarda el objeto en la base de datos mediante
				 * el DAO correspondiente y muestra un mensaje de éxito. Si ocurre un error de
				 * formato al convertir los datos numéricos, muestra un mensaje de error.
				 */
				if (pan == true) {

					long numId3 = Long.parseLong(vf.getPrincipal().getPanelEntrada().getNumId().getText());

					String nombre3 = vf.getPrincipal().getPanelEntrada().getNombre().getText();

					String empresa3 = vf.getPrincipal().getPanelEntrada().getEmpresa().getText();

					float precio3 = Float.parseFloat(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

					int cantidad3 = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidad().getText());
					// Convertir atributos booleanos (libre de gluten, integral, libre de levadura)
					String lGluten = (vf.getPrincipal().getPanelEntrada().getAtributoPropio1().getText());
					boolean esLibreGluten = vf.getCon().leerBoolean(lGluten);

					String integral = (vf.getPrincipal().getPanelEntrada().getAtributoPropio2().getText());
					boolean esIntegral = vf.getCon().leerBoolean(integral);

					String lLevadura = (vf.getPrincipal().getPanelEntrada().getAtributoPropio3().getText());
					boolean esLibreLevadura = vf.getCon().leerBoolean(lLevadura);
					// Crear el objeto Panaderia y guardarlo en la base de datos
					mf.getPanaderiaDAO().crear(new Panaderia(numId3, nombre3, empresa3, precio3, cantidad3,
							esLibreGluten, esIntegral, esLibreLevadura));
					// Mostrar mensaje de éxito en la interfaz gráfica
					vf.getCon().mostrarMensajeEmergente("Producto creado exitosamente");
				}

			} catch (NumberFormatException i) {
				// Mostrar mensaje de error si ocurre una excepción de formato de número
				vf.getCon().mostrarError("Verifique el formato de los datos ingresados");
			}
			break;
		/**
		 * permite actualizar productos en diferentes categorías como "Carne Fría",
		 * "Fruta y Verdura", "Juguetes" y "Panadería"
		 */
		case "UPDATE":

			try {
				if (carne == true && newCarne == true) {

					long numId = Long.parseLong(vf.getPrincipal().getPanelEntrada().getNumId().getText());

					String nombre = vf.getPrincipal().getPanelEntrada().getNombre().getText();

					String empresa = vf.getPrincipal().getPanelEntrada().getEmpresa().getText();

					float precio = Float.parseFloat(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

					int cantidad = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidad().getText());

					String animalOrigen = vf.getPrincipal().getPanelEntrada().getAtributoPropio1().getText();

					mf.getCarneFriaDAO().actualizar(index - 1,
							new CarneFria(numId, nombre, empresa, precio, cantidad, animalOrigen));
					vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");
				}

				if (frutaV == true && newFrutaV == true) {
					try {
						long numId1 = Long.parseLong(vf.getPrincipal().getPanelEntrada().getNumId().getText());

						String nombre1 = vf.getPrincipal().getPanelEntrada().getNombre().getText();

						String empresa1 = vf.getPrincipal().getPanelEntrada().getEmpresa().getText();

						float precio1 = Float.parseFloat(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

						int cantidad1 = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidad().getText());

						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						String date = vf.getPrincipal().getPanelEntrada().getAtributoPropio1().getText();
						Date cosecha;
						cosecha = sdf.parse(date);

						String organico = (vf.getPrincipal().getPanelEntrada().getAtributoPropio2().getText());
						boolean esOrganico = vf.getCon().leerBoolean(organico);
						vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");

						mf.getFrutaVerduraDAO().actualizar(index - 1,
								new FrutaVerdura(numId1, nombre1, empresa1, precio1, cantidad1, cosecha, esOrganico));
					} catch (ParseException e1) {
						vf.getCon().mostrarError("Formato de fecha no válido, ingrese dd/MM/yyyy");
					}
				}

				if (juguete == true && newJuguete == true) {

					long numId2 = Long.parseLong(vf.getPrincipal().getPanelEntrada().getNumId().getText());

					String nombre2 = vf.getPrincipal().getPanelEntrada().getNombre().getText();

					String empresa2 = vf.getPrincipal().getPanelEntrada().getEmpresa().getText();

					float precio2 = Float.parseFloat(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

					int cantidad2 = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidad().getText());

					int edadMinima = Integer
							.parseInt(vf.getPrincipal().getPanelEntrada().getAtributoPropio1().getText());

					int numeroJugadores = Integer
							.parseInt(vf.getPrincipal().getPanelEntrada().getAtributoPropio2().getText());

					mf.getJugueteDAO().actualizar(index - 1,
							new Juguete(numId2, nombre2, empresa2, precio2, cantidad2, edadMinima, numeroJugadores));
					vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");

				}

				if (pan == true && newPan == true) {

					long numId3 = Long.parseLong(vf.getPrincipal().getPanelEntrada().getNumId().getText());

					String nombre3 = vf.getPrincipal().getPanelEntrada().getNombre().getText();

					String empresa3 = vf.getPrincipal().getPanelEntrada().getEmpresa().getText();

					float precio3 = Float.parseFloat(vf.getPrincipal().getPanelEntrada().getPrecio().getText());

					int cantidad3 = Integer.parseInt(vf.getPrincipal().getPanelEntrada().getCantidad().getText());

					String lGluten = (vf.getPrincipal().getPanelEntrada().getAtributoPropio1().getText());
					boolean esLibreGluten = vf.getCon().leerBoolean(lGluten);

					String integral = (vf.getPrincipal().getPanelEntrada().getAtributoPropio2().getText());
					boolean esIntegral = vf.getCon().leerBoolean(integral);

					String lLevadura = (vf.getPrincipal().getPanelEntrada().getAtributoPropio3().getText());
					boolean esLibreLevadura = vf.getCon().leerBoolean(lLevadura);

					mf.getPanaderiaDAO().actualizar(index - 1, new Panaderia(numId3, nombre3, empresa3, precio3,
							cantidad3, esLibreGluten, esIntegral, esLibreLevadura));
					vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");

				}
			} catch (

			NumberFormatException f) {
				/**
				 * manejar errores en la conversión de texto a números y se muestra un mensaje
				 * de error.
				 **/
				vf.getCon().mostrarError("Verifique el formato de los datos ingresados");

			}

			break;
		/**
		 * maneja la selección y visualización de imágenes en el formulario de entrada.
		 **/
		case "IMAGEN":
			vf.getPrincipal().getPanelEntrada().getImagenProducto().setVisible(true);

			ejecutarFileChooser();

			break;

		}

	}

	/**
	 * El método ejecutarFileChooser se encarga de abrir un selector de archivos
	 * para que el usuario pueda elegir una imagen. La imagen seleccionada se
	 * redimensiona y se muestra en el panel de entrada.
	 * 
	 * Selector de Archivos (JFileChooser) Abre un diálogo para que el usuario
	 * seleccione una imagen en formato JPG, PNG o GIF.
	 * 
	 **/
	public void ejecutarFileChooser() {
		String ruta = "";
		JFileChooser fileChooser = new JFileChooser();
		int result = fileChooser.showOpenDialog(null);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
		fileChooser.setFileFilter(filter);

		if (result == JFileChooser.APPROVE_OPTION) {
			ruta = fileChooser.getSelectedFile().getPath();
			ImageIcon imagenImport = new ImageIcon(ruta);
			Image redimension = imagenImport.getImage().getScaledInstance(380, 260, Image.SCALE_SMOOTH);
			vf.getPrincipal().getPanelEntrada().getImagenProducto().setIcon(new ImageIcon(redimension));

		}

	}

}
