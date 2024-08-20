package co.edu.unbosque.control;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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

public class Controlador implements ActionListener {

	private ModelFacade mf;
	private ViewFacade vf;
	private int index = 0;
	private boolean carne = false;
	private boolean frutaV = false;
	private boolean juguete = false;
	private boolean pan = false;

	private boolean newcarne = false;
	private boolean newfrutaV = false;
	private boolean newjuguete = false;
	private boolean newpan = false;

	public Controlador() {
		mf = new ModelFacade();
		vf = new ViewFacade();

		vf.getPrincipal().mostrarPanelMenuPrincipal();
		vf.getCon().mostrarMensajeEmergente("Bienvenido a almacenes exito!");

		asignarLectores();
	}

	public void asignarLectores() {

		// MENU PRINCIPAL
		vf.getPrincipal().getMenuPpal().getBtnCarne().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getBtnCarne().setActionCommand("CARNEFRIA");

		vf.getPrincipal().getMenuPpal().getBtnFrutaV().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getBtnFrutaV().setActionCommand("FRUTAVERDURA");

		vf.getPrincipal().getMenuPpal().getBtnJuguete().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getBtnJuguete().setActionCommand("JUGUETE");

		vf.getPrincipal().getMenuPpal().getBtnPan().addActionListener(this);
		vf.getPrincipal().getMenuPpal().getBtnPan().setActionCommand("PAN");

		// MENU GESTION
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

		// PANEL AGREGAR
		vf.getPrincipal().getPanelAgregar().getBtnAgregar().addActionListener(this);
		vf.getPrincipal().getPanelAgregar().getBtnAgregar().setActionCommand("AGREGARPRODUCTO");

		vf.getPrincipal().getPanelAgregar().getBtnVolver().addActionListener(this);
		vf.getPrincipal().getPanelAgregar().getBtnVolver().setActionCommand("VOLVERDEADD");

		vf.getPrincipal().getPanelAgregar().getBtnJFileChooser().addActionListener(this);
		vf.getPrincipal().getPanelAgregar().getBtnJFileChooser().setActionCommand("IMAGEN");

		vf.getPrincipal().getPanelAgregar().getBtnActualizar().addActionListener(this);
		vf.getPrincipal().getPanelAgregar().getBtnActualizar().setActionCommand("UPDATE");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		// MENU PRINCIPAL
		case "CARNEFRIA":
			vf.getPrincipal().setTitle("ADMINISTRANDO CARNES FRIAS");
			// labels fondo
			vf.getPrincipal().getPanelAgregar().getImagenAgregarC().setVisible(true);
			vf.getPrincipal().getPanelAgregar().getImagenAgregarV().setVisible(false);
			vf.getPrincipal().getPanelAgregar().getImagenAgregarJ().setVisible(false);
			vf.getPrincipal().getPanelAgregar().getImagenAgregarP().setVisible(false);

			vf.getPrincipal().getMenuGestion().getImagenCarne().setVisible(true);
			vf.getPrincipal().getMenuGestion().getImagenFV().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenJuguete().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPan().setVisible(false);

			vf.getPrincipal().getPanelAgregar().getAtributoPropio1().setVisible(true);
			vf.getPrincipal().getPanelAgregar().getAtributoPropio2().setVisible(false);
			vf.getPrincipal().getPanelAgregar().getAtributoPropio3().setVisible(false);

			vf.getPrincipal().mostrarPanelMenuGestion();
			carne = true;
			frutaV = false;
			juguete = false;
			pan = false;
			break;

		case "FRUTAVERDURA":
			vf.getPrincipal().setTitle("ADMINISTRANDO FRUTAS Y VERDURAS");

			vf.getPrincipal().getPanelAgregar().getImagenAgregarC().setVisible(false);
			vf.getPrincipal().getPanelAgregar().getImagenAgregarV().setVisible(true);
			vf.getPrincipal().getPanelAgregar().getImagenAgregarJ().setVisible(false);
			vf.getPrincipal().getPanelAgregar().getImagenAgregarP().setVisible(false);

			vf.getPrincipal().getMenuGestion().getImagenCarne().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenFV().setVisible(true);
			vf.getPrincipal().getMenuGestion().getImagenJuguete().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPan().setVisible(false);

			vf.getPrincipal().getPanelAgregar().getAtributoPropio1().setVisible(true);
			vf.getPrincipal().getPanelAgregar().getAtributoPropio2().setVisible(true);
			vf.getPrincipal().getPanelAgregar().getAtributoPropio3().setVisible(false);

			vf.getPrincipal().getPanelAgregar().getAtributoPropio1().setText("dd/mm/yyyy");
			vf.getPrincipal().getPanelAgregar().getAtributoPropio2().setText("Si / No");

			vf.getPrincipal().mostrarPanelMenuGestion();
			carne = false;
			frutaV = true;
			juguete = false;
			pan = false;
			break;

		case "JUGUETE":
			vf.getPrincipal().setTitle("ADMINISTRANDO JUGUETES");
			// labels fondo
			vf.getPrincipal().getPanelAgregar().getImagenAgregarC().setVisible(false);
			vf.getPrincipal().getPanelAgregar().getImagenAgregarV().setVisible(false);
			vf.getPrincipal().getPanelAgregar().getImagenAgregarJ().setVisible(true);
			vf.getPrincipal().getPanelAgregar().getImagenAgregarP().setVisible(false);

			vf.getPrincipal().getMenuGestion().getImagenCarne().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenFV().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenJuguete().setVisible(true);
			vf.getPrincipal().getMenuGestion().getImagenPan().setVisible(false);

			vf.getPrincipal().getPanelAgregar().getAtributoPropio1().setVisible(true);
			vf.getPrincipal().getPanelAgregar().getAtributoPropio2().setVisible(true);
			vf.getPrincipal().getPanelAgregar().getAtributoPropio3().setVisible(false);

			vf.getPrincipal().mostrarPanelMenuGestion();
			carne = false;
			frutaV = false;
			juguete = true;
			pan = false;
			break;

		case "PAN":
			vf.getPrincipal().setTitle("ADMINISTRANDO PANADERIA");
			// labels fondo
			vf.getPrincipal().getPanelAgregar().getImagenAgregarC().setVisible(false);
			vf.getPrincipal().getPanelAgregar().getImagenAgregarV().setVisible(false);
			vf.getPrincipal().getPanelAgregar().getImagenAgregarJ().setVisible(false);
			vf.getPrincipal().getPanelAgregar().getImagenAgregarP().setVisible(true);

			vf.getPrincipal().getMenuGestion().getImagenCarne().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenFV().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenJuguete().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPan().setVisible(true);

			vf.getPrincipal().getPanelAgregar().getAtributoPropio1().setVisible(true);
			vf.getPrincipal().getPanelAgregar().getAtributoPropio2().setVisible(true);
			vf.getPrincipal().getPanelAgregar().getAtributoPropio3().setVisible(true);

			vf.getPrincipal().getPanelAgregar().getAtributoPropio1().setText("Si / No");
			vf.getPrincipal().getPanelAgregar().getAtributoPropio2().setText("Si / No");
			vf.getPrincipal().getPanelAgregar().getAtributoPropio3().setText("Si / No");

			vf.getPrincipal().mostrarPanelMenuGestion();
			carne = false;
			frutaV = false;
			juguete = false;
			pan = true;
			break;

		// MENU GESTION
		case "AGREGAR":

			vf.getPrincipal().getPanelAgregar().getBtnActualizar().setVisible(false);

			if (carne == true) {
				vf.getPrincipal().setTitle("AGREGANDO CARNES FRIAS");
				vf.getPrincipal().mostrarPanelAgregar();
			}
			if (frutaV == true) {
				vf.getPrincipal().setTitle("AGREGANDO FRUTAS Y VERDURAS");
				vf.getPrincipal().mostrarPanelAgregar();

			}
			if (juguete == true) {
				vf.getPrincipal().setTitle("AGREGANDO JUGUETES");
				vf.getPrincipal().mostrarPanelAgregar();

			}
			if (pan == true) {
				vf.getPrincipal().setTitle("AGREGANDO EN PANADERIA");
				vf.getPrincipal().mostrarPanelAgregar();

			}
			break;

		case "MOSTRAR":

			if (carne == true) {
				vf.getCon().mostrarListado(mf.getCarneFriaDAO().mostrar());
			}
			if (frutaV == true) {
				vf.getCon().mostrarListado(mf.getFrutaVerduraDAO().mostrar());

			}
			if (juguete == true) {
				vf.getCon().mostrarListado(mf.getJugueteDAO().mostrar());

			}
			if (pan == true) {
				vf.getCon().mostrarListado(mf.getPanaderiaDAO().mostrar());
			}
			break;

		case "ACTUALIZAR":
			try {

				if (carne == true) {
					vf.getPrincipal().setTitle("ACTUALIZANDO CARNES FRIAS");
					index = Integer.parseInt(vf.getCon().leerEntradaEmergente("Ingrese la posición a actualizar: "));
					if (mf.getCarneFriaDAO().checkearIndex(index - 1).equals("s")) {
						vf.getPrincipal().getPanelAgregar().getBtnAgregar().setVisible(false);
						vf.getPrincipal().getPanelAgregar().getBtnActualizar().setVisible(true);
						vf.getPrincipal().mostrarPanelAgregar();
						newcarne = true;
						newfrutaV = false;
						newjuguete = false;
						newpan = false;

					} else {
						vf.getCon().mostrarAlerta("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");
					}
				}

				if (frutaV == true) {
					vf.getPrincipal().setTitle("ACTUALIZANDO FRUTAS Y VEGETALES");
					index = Integer.parseInt(vf.getCon().leerEntradaEmergente("Ingrese la posición a actualizar: "));
					if (mf.getFrutaVerduraDAO().checkearIndex(index - 1).equals("s")) {
						vf.getPrincipal().getPanelAgregar().getBtnAgregar().setVisible(false);
						vf.getPrincipal().getPanelAgregar().getBtnActualizar().setVisible(true);
						vf.getPrincipal().mostrarPanelAgregar();
						newcarne = false;
						newfrutaV = true;
						newjuguete = false;
						newpan = false;

					} else {
						vf.getCon().mostrarAlerta("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");

					}
				}
				if (juguete == true) {
					vf.getPrincipal().setTitle("ACTUALIZANDO JUGUETES");
					index = Integer.parseInt(vf.getCon().leerEntradaEmergente("Ingrese la posición a actualizar: "));
					if (mf.getJugueteDAO().checkearIndex(index - 1).equals("s")) {
						vf.getPrincipal().getPanelAgregar().getBtnAgregar().setVisible(false);
						vf.getPrincipal().getPanelAgregar().getBtnActualizar().setVisible(true);
						vf.getPrincipal().mostrarPanelAgregar();
						newcarne = false;
						newfrutaV = false;
						newjuguete = true;
						newpan = false;

					} else {
						vf.getCon().mostrarAlerta("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");

					}
				}
				if (pan == true) {
					vf.getPrincipal().setTitle("ACTUALIZANDO PANADERIA");
					index = Integer.parseInt(vf.getCon().leerEntradaEmergente("Ingrese la posición a actualizar: "));
					if (mf.getPanaderiaDAO().checkearIndex(index - 1).equals("s")) {
						vf.getPrincipal().getPanelAgregar().getBtnAgregar().setVisible(false);
						vf.getPrincipal().getPanelAgregar().getBtnActualizar().setVisible(true);
						vf.getPrincipal().mostrarPanelAgregar();
						newcarne = false;
						newfrutaV = false;
						newjuguete = false;
						newpan = true;

					} else {
						vf.getCon().mostrarAlerta("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");

					}
				}
			} catch (NumberFormatException j) {
				vf.getCon().mostrarError("Verifique el formato de los datos ingresados");
			}
			break;

		case "ELIMINAR":
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

		case "VOLVER":
			vf.getPrincipal().setTitle("MENU PRINCIPAL");
			vf.getPrincipal().getPanelAgregar().getImagenProducto().setIcon(null);
			vf.getPrincipal().mostrarPanelMenuPrincipal();
			break;

		// PANEL AGREGAR
		case "VOLVERDEADD":
			vf.getPrincipal().getPanelAgregar().getBtnAgregar().setVisible(true);
			vf.getPrincipal().getPanelAgregar().getBtnActualizar().setVisible(false);
			vf.getPrincipal().getPanelAgregar().getImagenProducto().setIcon(null);

			if (carne == true) {
				vf.getPrincipal().setTitle("ADMINISTRANDO CARNES FRIAS");
				vf.getPrincipal().mostrarPanelMenuGestion();
			}
			if (frutaV == true) {
				vf.getPrincipal().setTitle("ADMINISTRANDO FRUTAS Y VERDURAS");
				vf.getPrincipal().mostrarPanelMenuGestion();

			}
			if (juguete == true) {
				vf.getPrincipal().setTitle("ADMINISTRANDO JUGUETES");
				vf.getPrincipal().mostrarPanelMenuGestion();

			}
			if (pan == true) {
				vf.getPrincipal().setTitle("ADMINISTRANDO PANADERIA");
				vf.getPrincipal().mostrarPanelMenuGestion();

			}

			vf.getPrincipal().getPanelAgregar().getNumId().setText("");
			vf.getPrincipal().getPanelAgregar().getNombre().setText("");
			vf.getPrincipal().getPanelAgregar().getEmpresa().setText("");
			vf.getPrincipal().getPanelAgregar().getPrecio().setText("");
			vf.getPrincipal().getPanelAgregar().getCantidad().setText("");
			vf.getPrincipal().getPanelAgregar().getAtributoPropio1().setText("");
			vf.getPrincipal().getPanelAgregar().getAtributoPropio2().setText("");
			vf.getPrincipal().getPanelAgregar().getAtributoPropio3().setText("");
			break;

		case "AGREGARPRODUCTO":

			try {

				if (carne == true) {
					long numId = Long.parseLong(vf.getPrincipal().getPanelAgregar().getNumId().getText());

					String nombre = vf.getPrincipal().getPanelAgregar().getNombre().getText();

					String empresa = vf.getPrincipal().getPanelAgregar().getEmpresa().getText();

					float precio = Float.parseFloat(vf.getPrincipal().getPanelAgregar().getPrecio().getText());

					int cantidad = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

					String animalOrigen = vf.getPrincipal().getPanelAgregar().getAtributoPropio1().getText();

					mf.getCarneFriaDAO().crear(new CarneFria(numId, nombre, empresa, precio, cantidad, animalOrigen));
					vf.getCon().mostrarMensajeEmergente("Producto creado exitosamente");

				}
				if (frutaV == true) {

					try {
						long numId1 = Long.parseLong(vf.getPrincipal().getPanelAgregar().getNumId().getText());

						String nombre1 = vf.getPrincipal().getPanelAgregar().getNombre().getText();

						String empresa1 = vf.getPrincipal().getPanelAgregar().getEmpresa().getText();

						float precio1 = Float.parseFloat(vf.getPrincipal().getPanelAgregar().getPrecio().getText());

						int cantidad1 = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						String date = vf.getPrincipal().getPanelAgregar().getAtributoPropio1().getText();
						Date cosecha;
						cosecha = sdf.parse(date);

						String organico = (vf.getPrincipal().getPanelAgregar().getAtributoPropio2().getText());
						boolean esOrganico = vf.getCon().leerBoolean(organico);

						mf.getFrutaVerduraDAO().crear(
								new FrutaVerdura(numId1, nombre1, empresa1, precio1, cantidad1, cosecha, esOrganico));
						vf.getCon().mostrarMensajeEmergente("Producto creado exitosamente");

					} catch (ParseException e1) {
						vf.getCon().mostrarError("Formato de fecha no válido, ingrese dd/MM/yyyy");
					}

				}
				if (juguete == true) {
					long numId2 = Long.parseLong(vf.getPrincipal().getPanelAgregar().getNumId().getText());

					String nombre2 = vf.getPrincipal().getPanelAgregar().getNombre().getText();

					String empresa2 = vf.getPrincipal().getPanelAgregar().getEmpresa().getText();

					float precio2 = Float.parseFloat(vf.getPrincipal().getPanelAgregar().getPrecio().getText());

					int cantidad2 = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

					int edadMinima = Integer
							.parseInt(vf.getPrincipal().getPanelAgregar().getAtributoPropio1().getText());

					int numeroJugadores = Integer
							.parseInt(vf.getPrincipal().getPanelAgregar().getAtributoPropio2().getText());

					mf.getJugueteDAO().crear(
							new Juguete(numId2, nombre2, empresa2, precio2, cantidad2, edadMinima, numeroJugadores));
					vf.getCon().mostrarMensajeEmergente("Producto creado exitosamente");

				}
				if (pan == true) {

					long numId3 = Long.parseLong(vf.getPrincipal().getPanelAgregar().getNumId().getText());

					String nombre3 = vf.getPrincipal().getPanelAgregar().getNombre().getText();

					String empresa3 = vf.getPrincipal().getPanelAgregar().getEmpresa().getText();

					float precio3 = Float.parseFloat(vf.getPrincipal().getPanelAgregar().getPrecio().getText());

					int cantidad3 = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

					String lGluten = (vf.getPrincipal().getPanelAgregar().getAtributoPropio1().getText());
					boolean esLibreGluten = vf.getCon().leerBoolean(lGluten);

					String integral = (vf.getPrincipal().getPanelAgregar().getAtributoPropio2().getText());
					boolean esIntegral = vf.getCon().leerBoolean(integral);

					String lLevadura = (vf.getPrincipal().getPanelAgregar().getAtributoPropio3().getText());
					boolean esLibreLevadura = vf.getCon().leerBoolean(lLevadura);

					mf.getPanaderiaDAO().crear(new Panaderia(numId3, nombre3, empresa3, precio3, cantidad3,
							esLibreGluten, esIntegral, esLibreLevadura));
					vf.getCon().mostrarMensajeEmergente("Producto creado exitosamente");
				}

			} catch (NumberFormatException i) {
				vf.getCon().mostrarError("Verifique el formato de los datos ingresados");
			}
			break;

		case "UPDATE":

			try {
				if (carne == true && newcarne == true) {

					long numId = Long.parseLong(vf.getPrincipal().getPanelAgregar().getNumId().getText());

					String nombre = vf.getPrincipal().getPanelAgregar().getNombre().getText();

					String empresa = vf.getPrincipal().getPanelAgregar().getEmpresa().getText();

					float precio = Float.parseFloat(vf.getPrincipal().getPanelAgregar().getPrecio().getText());

					int cantidad = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

					String animalOrigen = vf.getPrincipal().getPanelAgregar().getAtributoPropio1().getText();

					mf.getCarneFriaDAO().actualizar(index - 1,
							new CarneFria(numId, nombre, empresa, precio, cantidad, animalOrigen));
					vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");
				}

				if (frutaV == true && newfrutaV == true) {
					try {
						long numId1 = Long.parseLong(vf.getPrincipal().getPanelAgregar().getNumId().getText());

						String nombre1 = vf.getPrincipal().getPanelAgregar().getNombre().getText();

						String empresa1 = vf.getPrincipal().getPanelAgregar().getEmpresa().getText();

						float precio1 = Float.parseFloat(vf.getPrincipal().getPanelAgregar().getPrecio().getText());

						int cantidad1 = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						String date = vf.getPrincipal().getPanelAgregar().getAtributoPropio1().getText();
						Date cosecha;
						cosecha = sdf.parse(date);

						String organico = (vf.getPrincipal().getPanelAgregar().getAtributoPropio2().getText());
						boolean esOrganico = vf.getCon().leerBoolean(organico);
						vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");

						mf.getFrutaVerduraDAO().actualizar(index - 1,
								new FrutaVerdura(numId1, nombre1, empresa1, precio1, cantidad1, cosecha, esOrganico));
					} catch (ParseException e1) {
						vf.getCon().mostrarError("Formato de fecha no válido, ingrese dd/MM/yyyy");
					}
				}

				if (juguete == true && newjuguete == true) {

					long numId2 = Long.parseLong(vf.getPrincipal().getPanelAgregar().getNumId().getText());

					String nombre2 = vf.getPrincipal().getPanelAgregar().getNombre().getText();

					String empresa2 = vf.getPrincipal().getPanelAgregar().getEmpresa().getText();

					float precio2 = Float.parseFloat(vf.getPrincipal().getPanelAgregar().getPrecio().getText());

					int cantidad2 = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

					int edadMinima = Integer
							.parseInt(vf.getPrincipal().getPanelAgregar().getAtributoPropio1().getText());

					int numeroJugadores = Integer
							.parseInt(vf.getPrincipal().getPanelAgregar().getAtributoPropio2().getText());

					mf.getJugueteDAO().actualizar(index - 1,
							new Juguete(numId2, nombre2, empresa2, precio2, cantidad2, edadMinima, numeroJugadores));
					vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");

				}

				if (pan == true && newpan == true) {

					long numId3 = Long.parseLong(vf.getPrincipal().getPanelAgregar().getNumId().getText());

					String nombre3 = vf.getPrincipal().getPanelAgregar().getNombre().getText();

					String empresa3 = vf.getPrincipal().getPanelAgregar().getEmpresa().getText();

					float precio3 = Float.parseFloat(vf.getPrincipal().getPanelAgregar().getPrecio().getText());

					int cantidad3 = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

					String lGluten = (vf.getPrincipal().getPanelAgregar().getAtributoPropio1().getText());
					boolean esLibreGluten = vf.getCon().leerBoolean(lGluten);

					String integral = (vf.getPrincipal().getPanelAgregar().getAtributoPropio2().getText());
					boolean esIntegral = vf.getCon().leerBoolean(integral);

					String lLevadura = (vf.getPrincipal().getPanelAgregar().getAtributoPropio3().getText());
					boolean esLibreLevadura = vf.getCon().leerBoolean(lLevadura);

					mf.getPanaderiaDAO().actualizar(index - 1, new Panaderia(numId3, nombre3, empresa3, precio3,
							cantidad3, esLibreGluten, esIntegral, esLibreLevadura));
					vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");

				}
			} catch (

			NumberFormatException f) {
				vf.getCon().mostrarError("Verifique el formato de los datos ingresados");

			}

			break;

		case "IMAGEN":
			vf.getPrincipal().getPanelAgregar().getImagenProducto().setVisible(true);

			ejecutarFileChooser();

			break;

		}

	}

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
			vf.getPrincipal().getPanelAgregar().getImagenProducto().setIcon(new ImageIcon(redimension));

		}

	}

}
