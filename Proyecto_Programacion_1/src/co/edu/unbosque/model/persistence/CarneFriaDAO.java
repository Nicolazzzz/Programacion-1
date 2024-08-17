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
				pos++;
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
	public String eliminarPorNombre(String name) {

		for (int i = 0; i < listaCarnesFrias.size(); i++) {
			CarneFria carneFria = listaCarnesFrias.get(i);
			if (carneFria.getNombre().toLowerCase().equals(name.toLowerCase())) {
				listaCarnesFrias.remove(i);
				return "Producto eliminado exitosamente";
			}
		}
		return "El nombre del producto no coincide con ninguno registrado";
	}

	@Override
	public String checkearIndex(int index) {
		if (index < 0 || index >= listaCarnesFrias.size()) {
			return "n";
		}
		return "s";
	}

}
