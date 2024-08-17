package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Panaderia;

public class PanaderiaDAO implements CRUDOperation<Panaderia> {

	private ArrayList<Panaderia> listaPanaderia;

	public PanaderiaDAO() {
		listaPanaderia = new ArrayList<>();
	}

	@Override
	public void crear(Panaderia data) {
		listaPanaderia.add(data);

	}

	@Override
	public String mostrar() {
		int pos = 1;

		if (listaPanaderia.isEmpty()) {
			return "No hay productos registrados";
		} else {
			String contenido = "";
			for (Panaderia producto : listaPanaderia) {

				contenido += "\nProducto: " + pos;
				contenido += producto.toString();

			}
			return contenido;
		}
	}

	@Override
	public String actualizar(int index, Panaderia newData) {
		if (index < 0) {
			return "\nEl indice no puede tener valores negativos";
		} else if (index >= 0) {
			return "\nEl indice se excede del tamaño actual de la lista, tamaño actual: " + listaPanaderia.size()
					+ " datos";
		} else {

			listaPanaderia.set(index, newData);
			return "\nDato actualizado correctamente";

		}
	}

	@Override
	public String eliminar(int index) {
		if (index < 0) {
			return "\nEl indice no puede tener valores negativos";
		} else if (index >= listaPanaderia.size()) {
			return "\nEl indice se excede del tamaño actual de la lista, tamaño actual: " + listaPanaderia.size()
					+ " datos";
		} else {
			listaPanaderia.remove(index);
			return "\nProducto en indice " + index + " eliminado exitosamente";
		}
	}

	@Override
	public boolean eliminar(Panaderia datoEliminar) {
		if (listaPanaderia.remove(datoEliminar)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String checkearIndex(int index) {
		if (index < 0 || index >= listaPanaderia.size()) {
			return "n";
		}
		return "s";
	}

}
