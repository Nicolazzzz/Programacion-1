package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.FrutaVerdura;

public class FrutaVerduraDAO implements CRUDOperation<FrutaVerdura> {

	private ArrayList<FrutaVerdura> listaFrutasVerduras;

	public FrutaVerduraDAO() {
		listaFrutasVerduras = new ArrayList<>();

	}

	@Override
	public void crear(FrutaVerdura data) {
		listaFrutasVerduras.add(data);
	}

	@Override
	public String mostrar() {
		int pos = 1;

		if (listaFrutasVerduras.isEmpty()) {
			return "No hay productos registrados";
		} else {
			String contenido = "";
			for (FrutaVerdura producto : listaFrutasVerduras) {

				contenido += "\nProducto: " + pos;
				contenido += producto.toString();

			}
			return contenido;
		}
	}

	@Override
	public String actualizar(int index, FrutaVerdura newData) {
		if (index < 0) {
			return "\nEl indice no puede tener valores negativos";
		} else if (index >= 0) {
			return "\nEl indice se excede del tamaño actual de la lista, tamaño actual: " + listaFrutasVerduras.size()
					+ " datos";
		} else {

			listaFrutasVerduras.set(index, newData);
			return "\nDato actualizado correctamente";

		}
	}

	@Override
	public String eliminar(int index) {

		if (index < 0) {
			return "\nEl indice no puede tener valores negativos";
		} else if (index >= listaFrutasVerduras.size()) {
			return "\nEl indice se excede del tamaño actual de la lista, tamaño actual: " + listaFrutasVerduras.size()
					+ " datos";
		} else {
			listaFrutasVerduras.remove(index);
			return "\nProducto en indice " + index + " eliminado exitosamente";
		}
	}

	@Override
	public boolean eliminar(FrutaVerdura datoEliminar) {
		if (listaFrutasVerduras.remove(datoEliminar)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String checkearIndex(int index) {
		if (index < 0 || index >= listaFrutasVerduras.size()) {
			return "n";
		}
		return "s";
	}
}
