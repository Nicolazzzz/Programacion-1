package co.edu.unbosque.control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import co.edu.unbosque.model.CarneFria;
import co.edu.unbosque.model.FrutaVerdura;
import co.edu.unbosque.model.Juguete;
import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.Panaderia;
import co.edu.unbosque.view.ViewFacade;

public class Controlador {

	private ModelFacade mf;
	private ViewFacade vf;

	public Controlador() {
		mf = new ModelFacade();
		vf = new ViewFacade();
		run();
	}

	public void run() {

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
