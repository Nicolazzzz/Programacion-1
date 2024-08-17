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
	public String checkearIndex(int index) {
		if (index < 0 || index >= listaPanaderia.size()) {
			return "n";
		}
		return "s";
	}

	@Override
	public String eliminarPorNombre(String name) {
		for (int i = 0; i < listaPanaderia.size(); i++) {
			Panaderia panaderia = listaPanaderia.get(i);
			if (panaderia.getNombre().toLowerCase().equals(name.toLowerCase())) {
				listaPanaderia.remove(i);
				return "Producto eliminado exitosamente";
			}
		}
		return "El nombre del producto no coincide con ninguno registrado";
	}

}
