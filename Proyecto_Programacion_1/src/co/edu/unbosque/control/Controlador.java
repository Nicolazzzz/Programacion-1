package co.edu.unbosque.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import co.edu.unbosque.model.CarneFria;
import co.edu.unbosque.model.FrutaVerdura;
import co.edu.unbosque.model.Juguete;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.Panaderia;
import co.edu.unbosque.view.ViewFacade;

public class Controlador implements ActionListener {

	private ModelFacade mf;
	private ViewFacade vf;
	private boolean carne = false;
	private boolean frutaV = false;
	private boolean juguete = false;
	private boolean pan = false;

	public Controlador() {
		mf = new ModelFacade();
		vf = new ViewFacade();

		asignarLectores();
		run();
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

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		// MENU PRINCIPAL
		case "CARNEFRIA":
			vf.getPrincipal().setTitle("ADMINISTRANDO CARNES FRIAS");
			vf.getPrincipal().getMenuGestion().getImagenCarne().setVisible(true);
			vf.getPrincipal().getMenuGestion().getImagenFV().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenJuguete().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPan().setVisible(false);
			vf.getPrincipal().mostrarPanelMenuGestion();
			carne = true;
			frutaV = false;
			juguete = false;
			pan = false;
			break;

		case "FRUTAVERDURA":
			vf.getPrincipal().setTitle("ADMINISTRANDO FRUTAS Y VERDURAS");
			vf.getPrincipal().getMenuGestion().getImagenCarne().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenFV().setVisible(true);
			vf.getPrincipal().getMenuGestion().getImagenJuguete().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPan().setVisible(false);
			vf.getPrincipal().mostrarPanelMenuGestion();
			carne = false;
			frutaV = true;
			juguete = false;
			pan = false;
			break;

		case "JUGUETE":
			vf.getPrincipal().setTitle("ADMINISTRANDO JUGUETES");
			vf.getPrincipal().getMenuGestion().getImagenCarne().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenFV().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenJuguete().setVisible(true);
			vf.getPrincipal().getMenuGestion().getImagenPan().setVisible(false);
			vf.getPrincipal().mostrarPanelMenuGestion();
			carne = false;
			frutaV = false;
			juguete = true;
			pan = false;
			break;

		case "PAN":
			vf.getPrincipal().setTitle("ADMINISTRANDO PANADERIA");
			vf.getPrincipal().getMenuGestion().getImagenCarne().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenFV().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenJuguete().setVisible(false);
			vf.getPrincipal().getMenuGestion().getImagenPan().setVisible(true);
			vf.getPrincipal().mostrarPanelMenuGestion();
			carne = false;
			frutaV = false;
			juguete = false;
			pan = true;
			break;

		// MENU GESTION

		case "AGREGAR":

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

					int index = Integer
							.parseInt(vf.getCon().leerEntradaEmergente("Ingrese la posición a actualizar: "));

					if (mf.getCarneFriaDAO().checkearIndex(index - 1).equals("s")) {
						vf.getPrincipal().setTitle("ACTUALIZANDO CARNES FRIAS");
						vf.getPrincipal().mostrarPanelAgregar();

						long numId = Long.parseLong(vf.getPrincipal().getPanelAgregar().getNumId().getText());

						String nombre = vf.getPrincipal().getPanelAgregar().getNombre().getText();

						String empresa = vf.getPrincipal().getPanelAgregar().getEmpresa().getText();

						float precio = Float.parseFloat(vf.getPrincipal().getPanelAgregar().getPrecio().getText());

						int cantidad = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

						String animalOrigen = vf.getPrincipal().getPanelAgregar().getAtributoPropio1().getText();

						mf.getCarneFriaDAO().actualizar(index - 1,
								new CarneFria(numId, nombre, empresa, precio, cantidad, animalOrigen));
						vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");
					} else {
						vf.getCon().mostrarAlerta("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");
					}

				}
				if (frutaV == true) {
					int index1 = Integer
							.parseInt(vf.getCon().leerEntradaEmergente("Ingrese la posición a actualizar: "));
					if (mf.getFrutaVerduraDAO().checkearIndex(index1 - 1).equals("s")) {
						vf.getPrincipal().setTitle("ACTUALIZANDO FRUTAS Y VEGETALES");
						vf.getPrincipal().mostrarPanelAgregar();
						try {
							long numId1 = Long.parseLong(vf.getPrincipal().getPanelAgregar().getNumId().getText());

							String nombre1 = vf.getPrincipal().getPanelAgregar().getNombre().getText();

							String empresa1 = vf.getPrincipal().getPanelAgregar().getEmpresa().getText();

							float precio1 = Float.parseFloat(vf.getPrincipal().getPanelAgregar().getPrecio().getText());

							int cantidad1 = Integer
									.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

							SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
							String date = vf.getPrincipal().getPanelAgregar().getAtributoPropio1().getText();
							Date cosecha;
							cosecha = sdf.parse(date);

							String organico = (vf.getPrincipal().getPanelAgregar().getAtributoPropio2().getText());
							boolean esOrganico = vf.getCon().leerBoolean(organico);
							vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");

							mf.getFrutaVerduraDAO().actualizar(index1 - 1, new FrutaVerdura(numId1, nombre1, empresa1,
									precio1, cantidad1, cosecha, esOrganico));
						} catch (ParseException e1) {
							vf.getCon().mostrarError("Formato de fecha no válido, ingrese dd/MM/yyyy");
						}
					} else {
						vf.getCon().mostrarAlerta("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");

					}
				}
				if (juguete == true) {

					int index2 = Integer
							.parseInt(vf.getCon().leerEntradaEmergente("Ingrese la posición a actualizar: "));
					if (mf.getJugueteDAO().checkearIndex(index2 - 1).equals("s")) {
						long numId2 = Long.parseLong(vf.getPrincipal().getPanelAgregar().getNumId().getText());

						String nombre2 = vf.getPrincipal().getPanelAgregar().getNombre().getText();

						String empresa2 = vf.getPrincipal().getPanelAgregar().getEmpresa().getText();

						float precio2 = Float.parseFloat(vf.getPrincipal().getPanelAgregar().getPrecio().getText());

						int cantidad2 = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

						int edadMinima = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

						int numeroJugadores = Integer
								.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

						mf.getJugueteDAO().actualizar(index2 - 1, new Juguete(numId2, nombre2, empresa2, precio2,
								cantidad2, edadMinima, numeroJugadores));
						vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");
					} else {
						vf.getCon().mostrarAlerta("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");

					}
				}
				if (pan == true) {
					int index3 = Integer
							.parseInt(vf.getCon().leerEntradaEmergente("Ingrese la posición a actualizar: "));

					if (mf.getPanaderiaDAO().checkearIndex(index3 - 1).equals("s")) {

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

						mf.getPanaderiaDAO().actualizar(index3 - 1, new Panaderia(numId3, nombre3, empresa3, precio3,
								cantidad3, esLibreGluten, esIntegral, esLibreLevadura));
						vf.getCon().mostrarMensajeEmergente("Producto actualizado exitosamente");

					} else {
						vf.getCon().mostrarAlerta("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");
					}
				}
			} catch (NumberFormatException f) {
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
			vf.getPrincipal().mostrarPanelMenuPrincipal();
			break;

		// PANEL AGREGAR
		case "VOLVERDEADD":
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

					int edadMinima = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

					int numeroJugadores = Integer.parseInt(vf.getPrincipal().getPanelAgregar().getCantidad().getText());

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

				break;

			} catch (NumberFormatException i) {
				vf.getCon().mostrarError("Verifique el formato de los datos ingresados");
			}
		}

	}

	public void run() {

		vf.getPrincipal().setVisible(true);
		vf.getPrincipal().mostrarPanelMenuPrincipal();
		vf.getCon().mostrarMensajeEmergente(
				"Bienvenido!, este es tu espacio para administrar inventario de almacenes éxito");

		mainloop: while (true) {

			mostrarMenuPrincipal();
			int op = vf.getCon().readInt();

			switch (op) {

			case 1:
				mostrarMenuCarne();
				break;

			case 2:
				mostrarMenuFrutaVerdura();
				break;

			case 3:
				mostrarMenuJuguete();
				break;

			case 4:
				mostrarMenuPanaderia();
				break;

			case 5:
				vf.getCon().printNewLine("Te esperamos pronto!");
				break mainloop;

			default:
				vf.getCon().printNewLine("INGRESE UNA OPCION VALIDA");

				break;
			}

		}

	}

	public void mostrarMenuPrincipal() {

		String menuPpal = """

				BIENVENDO AL MENU PRINCIPAL DE ALMACENES EXITO!

				*Ingrese el solo el número de la opción deseada*

				1) Administrar carnes frías
				2) Administrar frutas y verduras
				3) Administrar juguetes
				4) Administrar la panadería

				5) SALIR

				""";

		vf.getCon().printNewLine(menuPpal);

	}

	public void mostrarMenuCarne() {

		meatloop: while (true) {

			vf.getCon().printNewLine("---MENU CARNES FRIAS---");
			vf.getCon().printNewLine("\n1) Agregar\n2) Mostrar\n3) Actualizar\n4) Eliminar \n5) Volver");
			int op1 = vf.getCon().readInt();
			vf.getCon().burnLine();
			switch (op1) {
			case 1:
				vf.getCon().printNewLine("---AGREGANDO CARNE FRIA---");

				vf.getCon().printSameLine("Ingrese el número de identificación del producto: ");
				long numId = vf.getCon().readLong();
				vf.getCon().burnLine();

				vf.getCon().printSameLine("Ingrese el nombre del producto: ");
				String nombre = vf.getCon().readLine();

				vf.getCon().printSameLine("Ingrese el nombre de la empresa del producto: ");
				String empresa = vf.getCon().readLine();

				vf.getCon().printSameLine("Ingrese el precio del producto: ");
				float precio = vf.getCon().readFloat();

				vf.getCon().printSameLine("Ingrese la cantidad del producto: ");
				int cantidad = vf.getCon().readInt();
				vf.getCon().burnLine();

				vf.getCon().printSameLine("Ingrese el nombre del animal de origen del producto: ");
				String animalOrigen = vf.getCon().readLine();

				mf.getCarneFriaDAO().crear(new CarneFria(numId, nombre, empresa, precio, cantidad, animalOrigen));
				vf.getCon().printNewLine("Producto creado exitosamente");

				break;

			case 2:
				boolean temp = false;
				while (temp != true) {
					vf.getCon().printNewLine("---MOSTRANDO LISTA CARNES FRIAS---");
					vf.getCon().printNewLine(mf.getCarneFriaDAO().mostrar());
					vf.getCon().printNewLine("\nDesea continuar? \n)Si \n)No ");
					temp = vf.getCon().readBoolean();
					if (temp != true) {

						temp = false;

						vf.getCon().printNewLine("--MOSTRANDO NUEVAMENTE--\n");

					}
				}
				break;

			case 3:
				vf.getCon().printNewLine("---ACTUALIZANDO CARNE FRIA---");
				vf.getCon().printSameLine("Ingrese el dato que desea actualizar: ");
				int indexCarAct = vf.getCon().readInt();
				vf.getCon().burnLine();

				if (mf.getCarneFriaDAO().checkearIndex(indexCarAct - 1).equals("s")) {

					vf.getCon().printNewLine("\n*Rellene los datos solicitados*\n");

					vf.getCon().printSameLine("Ingrese el número de identificación del producto: ");
					long numIdAct = vf.getCon().readLong();
					vf.getCon().burnLine();

					vf.getCon().printSameLine("Ingrese el nombre del producto: ");
					String nombreAct = vf.getCon().readLine();

					vf.getCon().printSameLine("Ingrese el nombre de la empresa del producto: ");
					String empresaAct = vf.getCon().readLine();

					vf.getCon().printSameLine("Ingrese el precio del producto: ");
					float precioAct = vf.getCon().readFloat();

					vf.getCon().printSameLine("Ingrese la cantidad del producto: ");
					int cantidadAct = vf.getCon().readInt();
					vf.getCon().burnLine();

					vf.getCon().printSameLine("Ingrese el nombre del animal de origen del producto: ");
					String animalOrigenAct = vf.getCon().readLine();

					mf.getCarneFriaDAO().actualizar(indexCarAct - 1,
							new CarneFria(numIdAct, nombreAct, empresaAct, precioAct, cantidadAct, animalOrigenAct));
					vf.getCon().printNewLine("\nProducto actualizado con exito\n");

				} else {
					vf.getCon().printNewLine("Ingrese un indice valido, recuerde "
							+ "que no puede ser negativo ni exceder el tamaño de la lista");
				}

				break;

			case 4:
				vf.getCon().printNewLine("---ELIMINANDO CARNE FRIA---");
				vf.getCon().printNewLine("Ingrese el nombre del dato a eliminar: ");
				String carneDelete = vf.getCon().readLine();
				vf.getCon().printNewLine(mf.getCarneFriaDAO().eliminarPorNombre(carneDelete));
				break;

			case 5:
				vf.getCon().printNewLine("---VOLVIENDO A MENU PRINCIPAL---");
				break meatloop;

			default:
				vf.getCon().printNewLine("INGRESE UNA OPCION VALIDA");

				break;
			}

		}
	}

	public void mostrarMenuFrutaVerdura() {
		fruitloop: while (true) {

			vf.getCon().printNewLine("---MENU FRUTAS Y VERDURAS---");
			vf.getCon().printNewLine("\n1) Agregar\n2) Mostrar\n3) Actualizar\n4) Eliminar \n5) Volver");
			int op1 = vf.getCon().readInt();

			switch (op1) {
			case 1:
				try {
					vf.getCon().printNewLine("---AGREGANDO FRUTA / VERDURA---");

					vf.getCon().printSameLine("Ingrese el número de identificación del producto: ");
					long numId = vf.getCon().readLong();
					vf.getCon().burnLine();

					vf.getCon().printSameLine("Ingrese el nombre del producto: ");
					String nombre = vf.getCon().readLine();

					vf.getCon().printSameLine("Ingrese el nombre de la empresa del producto: ");
					String empresa = vf.getCon().readLine();

					vf.getCon().printSameLine("Ingrese el precio del producto: ");
					float precio = vf.getCon().readFloat();

					vf.getCon().printSameLine("Ingrese la cantidad del producto: ");
					int cantidad = vf.getCon().readInt();
					vf.getCon().burnLine();

					vf.getCon().printSameLine("Ingresela fecha de cosecha del prodcuto dd/MM/aaaa: ");
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					String date = vf.getCon().readLine();
					Date cosecha;
					cosecha = sdf.parse(date);

					vf.getCon().printSameLine("El producto es organico: Si / No ");
					boolean esOrganico = vf.getCon().readBoolean();

					mf.getFrutaVerduraDAO()
							.crear(new FrutaVerdura(numId, nombre, empresa, precio, cantidad, cosecha, esOrganico));
					vf.getCon().printNewLine("Producto creado exitosamente");

				} catch (ParseException e) {
					vf.getCon().printNewLine("El formato de fecha debe ser dd/MM/aaaa");

				}

				break;

			case 2:
				boolean temp = false;
				while (temp != true) {
					vf.getCon().printNewLine("---MOSTRANDO LISTA FRUTAS / VERDURAS---");
					vf.getCon().printNewLine(mf.getFrutaVerduraDAO().mostrar());
					vf.getCon().printNewLine("\nDesea continuar? \n)Si \n)No ");
					temp = vf.getCon().readBoolean();
					if (temp != true) {

						temp = false;

						vf.getCon().printNewLine("--MOSTRANDO NUEVAMENTE--\n");

					}
				}
				break;

			case 3:
				try {
					vf.getCon().printNewLine("---ACTUALIZANDO FRUTA / VERDURA---");
					vf.getCon().printNewLine("Ingrese el dato que desea actualizar");
					int indexCarAct = vf.getCon().readInt();
					vf.getCon().burnLine();

					if (mf.getFrutaVerduraDAO().checkearIndex(indexCarAct - 1).equals("s")) {
						vf.getCon().printNewLine("\n*Rellene los datos solicitados*\n");

						vf.getCon().printSameLine("Ingrese el número de identificación del producto: ");
						long numIdAct = vf.getCon().readLong();
						vf.getCon().burnLine();

						vf.getCon().printSameLine("Ingrese el nombre del producto: ");
						String nombreAct = vf.getCon().readLine();

						vf.getCon().printSameLine("Ingrese el nombre de la empresa del producto: ");
						String empresaAct = vf.getCon().readLine();

						vf.getCon().printSameLine("Ingrese el precio del producto: ");
						float precioAct = vf.getCon().readFloat();

						vf.getCon().printSameLine("Ingrese la cantidad del producto: ");
						int cantidadAct = vf.getCon().readInt();
						vf.getCon().burnLine();

						vf.getCon().printSameLine("Ingresela fecha de cosecha del prodcuto dd/MM/aaaa: ");
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						String dateAct = vf.getCon().readLine();
						Date cosechaAct;
						cosechaAct = sdf.parse(dateAct);

						vf.getCon().printSameLine("El producto es organico: Si / No ");
						boolean esOrganicoAct = vf.getCon().readBoolean();

						mf.getFrutaVerduraDAO().actualizar(indexCarAct - 1, new FrutaVerdura(numIdAct, nombreAct,
								empresaAct, precioAct, cantidadAct, cosechaAct, esOrganicoAct));
						vf.getCon().printNewLine("Dato actualizado con exito");

					} else {
						vf.getCon().printNewLine("Ingrese un indice valido, recuerde "
								+ "que no puede ser negativo ni exceder el tamaño de la lista");
					}
				} catch (ParseException e) {
					vf.getCon().printNewLine("El formato de fecha debe ser dd/MM/aaaa");
				}

				break;

			case 4:

				vf.getCon().printNewLine("---ELIMINANDO FRUTA / VERDURA---");
				vf.getCon().printNewLine("Ingrese el nombre del dato a eliminar: ");
				vf.getCon().burnLine();
				String fvDelete = vf.getCon().readLine();
				vf.getCon().printNewLine(mf.getFrutaVerduraDAO().eliminarPorNombre(fvDelete));
				break;
			case 5:
				vf.getCon().printNewLine("---VOLVIENDO A MENU PRINCIPAL---");
				break fruitloop;

			default:
				vf.getCon().printNewLine("INGRESE UNA OPCION VALIDA");
				break;
			}

		}

	}

	public void mostrarMenuJuguete() {
		toyloop: while (true) {

			vf.getCon().printNewLine("---MENU JUGUETES---");
			vf.getCon().printNewLine("\n1) Agregar\n2) Mostrar\n3) Actualizar\n4) Eliminar \n5) Volver");
			int op1 = vf.getCon().readInt();
			vf.getCon().burnLine();
			switch (op1) {
			case 1:
				vf.getCon().printNewLine("---AGREGANDO JUGUETES---");

				vf.getCon().printSameLine("Ingrese el número de identificación del producto: ");
				long numId = vf.getCon().readLong();
				vf.getCon().burnLine();

				vf.getCon().printSameLine("Ingrese el nombre del producto: ");
				String nombre = vf.getCon().readLine();

				vf.getCon().printSameLine("Ingrese el nombre de la empresa del producto: ");
				String empresa = vf.getCon().readLine();

				vf.getCon().printSameLine("Ingrese el precio del producto: ");
				float precio = vf.getCon().readFloat();

				vf.getCon().printSameLine("Ingrese la cantidad del producto: ");
				int cantidad = vf.getCon().readInt();

				vf.getCon().printSameLine("Ingrese la edad minima establecida del producto: ");
				int edadMinima = vf.getCon().readInt();

				vf.getCon().printSameLine("Ingrese la cantidad de jugadores del producto: ");
				int numeroJugadores = vf.getCon().readInt();

				mf.getJugueteDAO()
						.crear(new Juguete(numId, nombre, empresa, precio, cantidad, edadMinima, numeroJugadores));
				vf.getCon().printNewLine("Producto creado exitosamente");

				break;

			case 2:
				boolean temp = false;
				while (temp != true) {
					vf.getCon().printNewLine("---MOSTRANDO JUGUETES---");
					vf.getCon().printNewLine(mf.getJugueteDAO().mostrar());
					vf.getCon().printNewLine("\nDesea continuar? \n)Si \n)No ");
					temp = vf.getCon().readBoolean();
					if (temp != true) {

						temp = false;

						vf.getCon().printNewLine("--MOSTRANDO NUEVAMENTE--\n");

					}
				}
				break;

			case 3:
				vf.getCon().printNewLine("---ACTUALIZANDO JUGUETES---");
				vf.getCon().printSameLine("Ingrese el dato que desea actualizar");
				int indexCarAct = vf.getCon().readInt();
				vf.getCon().burnLine();

				if (mf.getJugueteDAO().checkearIndex(indexCarAct - 1).equals("s")) {

					vf.getCon().printNewLine("\n*Rellene los datos solicitados*\n");

					vf.getCon().printSameLine("Ingrese el número de identificación del producto: ");
					long numIdAct = vf.getCon().readLong();
					vf.getCon().burnLine();

					vf.getCon().printSameLine("Ingrese el nombre del producto: ");
					String nombreAct = vf.getCon().readLine();

					vf.getCon().printSameLine("Ingrese el nombre de la empresa del producto: ");
					String empresaAct = vf.getCon().readLine();

					vf.getCon().printSameLine("Ingrese el precio del producto: ");
					float precioAct = vf.getCon().readFloat();

					vf.getCon().printSameLine("Ingrese la cantidad del producto: ");
					int cantidadAct = vf.getCon().readInt();
					vf.getCon().burnLine();

					vf.getCon().printSameLine("Ingrese la edad minima establecida del producto: ");
					int edadMinimaAct = vf.getCon().readInt();

					vf.getCon().printSameLine("Ingrese la cantidad de jugadores del producto: ");
					int numeroJugadoresAct = vf.getCon().readInt();

					mf.getJugueteDAO().actualizar(indexCarAct - 1, new Juguete(numIdAct, nombreAct, empresaAct,
							precioAct, cantidadAct, edadMinimaAct, numeroJugadoresAct));
					vf.getCon().printNewLine("Dato actualizado con exito");

				} else {
					vf.getCon().printNewLine("Ingrese un indice valido, recuerde "
							+ "que no puede ser negativo ni exceder el tamaño de la lista");
				}

				break;

			case 4:
				vf.getCon().printNewLine("---ELIMINANDO CARNE FRIA---");
				vf.getCon().printNewLine("Ingrese el nombre del dato a eliminar: ");
				String carneDelete = vf.getCon().readLine();
				vf.getCon().printNewLine(mf.getJugueteDAO().eliminarPorNombre(carneDelete));
				break;

			case 5:
				vf.getCon().printNewLine("---VOLVIENDO A MENU PRINCIPAL---");
				break toyloop;

			default:
				vf.getCon().printNewLine("INGRESE UNA OPCION VALIDA");

				break;
			}

		}

	}

	public void mostrarMenuPanaderia() {

		breadloop: while (true) {

			vf.getCon().printNewLine("---MENU PANADERIA---");
			vf.getCon().printNewLine("\n1) Agregar\n2) Mostrar\n3) Actualizar\n4) Eliminar \n5) Volver");
			int op1 = vf.getCon().readInt();
			vf.getCon().burnLine();
			switch (op1) {
			case 1:
				vf.getCon().printNewLine("---AGREGANDO PANES---");

				vf.getCon().printSameLine("Ingrese el número de identificación del producto: ");
				long numId = vf.getCon().readLong();
				vf.getCon().burnLine();

				vf.getCon().printSameLine("Ingrese el nombre del producto: ");
				String nombre = vf.getCon().readLine();

				vf.getCon().printSameLine("Ingrese el nombre de la empresa del producto: ");
				String empresa = vf.getCon().readLine();

				vf.getCon().printSameLine("Ingrese el precio del producto: ");
				float precio = vf.getCon().readFloat();

				vf.getCon().printSameLine("Ingrese la cantidad del producto: ");
				int cantidad = vf.getCon().readInt();
				vf.getCon().burnLine();

				vf.getCon().printSameLine("Ingrese si el producto es libre de gluten: Si / No");
				boolean esLibreGluten = vf.getCon().readBoolean();

				vf.getCon().printSameLine("Ingrese si el producto es integral: Si / No");
				boolean esIntegral = vf.getCon().readBoolean();

				vf.getCon().printSameLine("Ingrese si el producto es libre de levaduras: Si / No");
				boolean esLibreLevadura = vf.getCon().readBoolean();

				mf.getPanaderiaDAO().crear(new Panaderia(numId, nombre, empresa, precio, cantidad, esLibreGluten,
						esIntegral, esLibreLevadura));
				vf.getCon().printNewLine("Producto creado exitosamente");

				break;

			case 2:
				boolean temp = false;
				while (temp != true) {
					vf.getCon().printNewLine("---MOSTRANDO LISTA CARNES FRIAS---");
					vf.getCon().printNewLine(mf.getPanaderiaDAO().mostrar());
					vf.getCon().printNewLine("\nDesea continuar? \n)Si \n)No ");
					temp = vf.getCon().readBoolean();
					if (temp != true) {

						temp = false;

						vf.getCon().printNewLine("--MOSTRANDO NUEVAMENTE--\n");

					}
				}
				break;

			case 3:

				vf.getCon().printNewLine("---ACTUALIZANDO PANES---");
				vf.getCon().printSameLine("Ingrese el dato que desea actualizar");
				int indexCarAct = vf.getCon().readInt();
				vf.getCon().burnLine();

				if (mf.getPanaderiaDAO().checkearIndex(indexCarAct - 1).equals("s")) {

					vf.getCon().printNewLine("\n*Rellene los datos solicitados*\n");

					vf.getCon().printSameLine("Ingrese el número de identificación del producto: ");
					long numIdAct = vf.getCon().readLong();
					vf.getCon().burnLine();

					vf.getCon().printSameLine("Ingrese el nombre del producto: ");
					String nombreAct = vf.getCon().readLine();

					vf.getCon().printSameLine("Ingrese el nombre de la empresa del producto: ");
					String empresaAct = vf.getCon().readLine();

					vf.getCon().printSameLine("Ingrese el precio del producto: ");
					float precioAct = vf.getCon().readFloat();

					vf.getCon().printSameLine("Ingrese la cantidad del producto: ");
					int cantidadAct = vf.getCon().readInt();
					vf.getCon().burnLine();

					vf.getCon().printSameLine("Ingrese si el producto es libre de gluten: Si / No");
					boolean esLibreGlutenAct = vf.getCon().readBoolean();

					vf.getCon().printSameLine("Ingrese si el producto es integral: Si / No");
					boolean esIntegralAct = vf.getCon().readBoolean();

					vf.getCon().printSameLine("Ingrese si el producto es libre de levaduras: Si / No");
					boolean esLibreLevaduraAct = vf.getCon().readBoolean();

					mf.getPanaderiaDAO().actualizar(indexCarAct - 1, new Panaderia(numIdAct, nombreAct, empresaAct,
							precioAct, cantidadAct, esLibreGlutenAct, esIntegralAct, esLibreLevaduraAct));
					vf.getCon().printNewLine("Producto actualizado con exito");

				} else {
					vf.getCon().printNewLine("Ingrese un indice valido, recuerde "
							+ "que no puede ser negativo ni exceder el tamaño de la lista");
				}

				break;

			case 4:
				vf.getCon().printNewLine("---ELIMINANDO PANES---");
				vf.getCon().printNewLine("Ingrese el nombre del dato a eliminar: ");
				String panDelete = vf.getCon().readLine();
				vf.getCon().printNewLine(mf.getPanaderiaDAO().eliminarPorNombre(panDelete));
				break;

			case 5:
				vf.getCon().printNewLine("---VOLVIENDO A MENU PRINCIPAL---");
				break breadloop;

			default:
				vf.getCon().printNewLine("INGRESE UNA OPCION VALIDA");

				break;

			}
		}
	}

}
