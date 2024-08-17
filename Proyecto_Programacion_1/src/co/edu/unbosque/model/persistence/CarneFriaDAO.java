package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CarneFria;

public class CarneFriaDAO implements CRUDOperation<CarneFria> {

	private ArrayList<CarneFria> listaCarnesFrias;

	public CarneFriaDAO() {
		listaCarnesFrias = new ArrayList<>();
	}

	@Override
	public void crear(CarneFria data) {
		listaCarnesFrias.add(data);
	}

	@Override
	public String mostrar() {
		int pos = 1;

		if (listaCarnesFrias.isEmpty()) {
			return "No hay productos registrados";
		} else {
			String contenido = "";
			for (CarneFria producto : listaCarnesFrias) {

				contenido += "\nProducto: " + pos;
				contenido += producto.toString();

			}
			return contenido;
		}
	}

	@Override
	public String actualizar(int index, CarneFria newData) {
		if (index < 0) {
			return "\nEl indice no puede tener valores negativos";
		} else if (index >= 0) {
			return "\nEl indice se excede del tamaño actual de la lista, tamaño actual: " + listaCarnesFrias.size()
					+ " datos";
		} else {

			listaCarnesFrias.set(index, newData);
			return "\nDato actualizado correctamente";

		}
	}

	@Override
	public String eliminar(int index) {
		if (index < 0) {
			return "\nEl indice no puede tener valores negativos";
		} else if (index >= listaCarnesFrias.size()) {
			return "\nEl indice se excede del tamaño actual de la lista, tamaño actual: " + listaCarnesFrias.size()
					+ " datos";
		} else {
			listaCarnesFrias.remove(index);
			return "\nProducto en indice " + index + " eliminado exitosamente";
		}
	}

	@Override
	public boolean eliminar(CarneFria datoEliminar) {
		if (listaCarnesFrias.remove(datoEliminar)) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String checkearIndex(int index) {
		if (index < 0 || index >= listaCarnesFrias.size()) {
			return "n";
		}
		return "s";
	}

}
