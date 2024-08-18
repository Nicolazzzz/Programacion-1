package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Juguete;

public class JugueteDAO implements CRUDOperation<Juguete> {

	private ArrayList<Juguete> listaJuguetes;

	public JugueteDAO() {
		listaJuguetes = new ArrayList<>();
	}

	@Override
	public void crear(Juguete data) {
		listaJuguetes.add(data);
	}

	@Override
	public String mostrar() {
		int pos = 1;

		if (listaJuguetes.isEmpty()) {
			return "No hay productos registrados";
		} else {
			String contenido = "";
			for (Juguete producto : listaJuguetes) {

				contenido += "\nProducto: " + pos;
				contenido += producto.toString();
				pos++;
			}
			return contenido;
		}
	}

	@Override
	public String actualizar(int index, Juguete newData) {
		if (index < 0) {
			return "\nEl indice no puede tener valores negativos";
		} else if (index >= listaJuguetes.size()) {
			return "\nEl indice se excede del tamaño actual de la lista, tamaño actual: " + listaJuguetes.size()
					+ " datos";
		} else {

			listaJuguetes.set(index, newData);
			return "\nDato actualizado correctamente";

		}
	}

	@Override
	public String checkearIndex(int index) {
		if (index < 0 || index >= listaJuguetes.size()) {
			return "n";
		}
		return "s";
	}

	@Override
	public String eliminarPorNombre(String name) {
		for (int i = 0; i < listaJuguetes.size(); i++) {
			Juguete juguete = listaJuguetes.get(i);
			if (juguete.getNombre().toLowerCase().equals(name.toLowerCase())) {
				listaJuguetes.remove(i);
				return "Producto eliminado exitosamente";
			}
		}
		return "El nombre del producto no coincide con ninguno registrado";
	}

}
