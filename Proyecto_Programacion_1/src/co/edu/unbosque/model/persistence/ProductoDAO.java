package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Producto;

public class ProductoDAO implements CRUDOperation<Producto> {

	private ArrayList<Producto> listaProductos;

	public ProductoDAO() {
		listaProductos = new ArrayList<>();
	}

	@Override
	public void crear(Producto data) {

		listaProductos.add(data);

	}

	@Override
	public String mostrar() {

		int pos = 1;

		if (listaProductos.isEmpty()) {
			return "No hay productos registrados";
		} else {
			String contenido = "";
			for (Producto producto : listaProductos) {

				contenido += "\nProducto: " + pos;
				contenido += producto.toString();

			}
			return contenido;
		}
	}

	@Override
	public String actualizar(int index, Producto newData) {

		if (index < 0) {
			return "\nEl indice no puede tener valores negativos";
		} else if (index >= 0) {
			return "\nEl indice se excede del tamaño actual de la lista, tamaño actual: " + listaProductos.size()
					+ " datos";
		} else {

			listaProductos.set(index, newData);
			return "\nDato actualizado correctamente";

		}

	}

	@Override
	public String eliminar(int index) {

		if (index < 0) {
			return "\nEl indice no puede tener valores negativos";
		} else if (index >= listaProductos.size()) {
			return "\nEl indice se excede del tamaño actual de la lista, tamaño actual: " + listaProductos.size()
					+ " datos";
		} else {
			listaProductos.remove(index);
			return "\nProducto en indice " + index + " eliminado exitosamente";
		}

	}

	@Override
	public boolean eliminar(Producto datoEliminar) {
		if (listaProductos.remove(datoEliminar)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String checkearIndex(int index) {
		if (index < 0 || index >= listaProductos.size()) {
			return "n";
		}
		return "s";
	}

}
