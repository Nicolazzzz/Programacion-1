package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.FrutaVerdura;

/**
 * La clase FrutaVerduraDAO implementa las operaciones CRUD (Crear, Leer,
 * Actualizar, Eliminar) para manejar una colección de objetos
 * {@link FrutaVerdura}. Utiliza una lista interna para almacenar los productos
 * de tipo FrutaVerdura.
 */
public class FrutaVerduraDAO implements CRUDOperation<FrutaVerdura> {

	private ArrayList<FrutaVerdura> listaFrutasVerduras;

	/**
	 * Constructor por defecto que inicializa la lista de frutasVerdura.
	 */
	public FrutaVerduraDAO() {
		listaFrutasVerduras = new ArrayList<>();
	}

	/**
	 * Crea un nuevo objeto FrutaVerdura y lo agrega a la listafrutasVerdura
	 * 
	 * @param data El objeto FrutaVerdura a agregar a la lista.
	 */
	@Override
	public void crear(FrutaVerdura data) {
		listaFrutasVerduras.add(data);
	}

	/**
	 * Muestra todos los objetos FrutaVerdura en la lista.
	 *
	 * @return Una cadena con la representación de todos los productos en la lista.
	 *         Si la lista está vacía, retorna un mensaje indicando que no hay
	 *         productos registrados.
	 */
	@Override
	public String mostrar() {
		int pos = 1;

		if (listaFrutasVerduras.isEmpty()) {
			return "No hay productos registrados";
		} else {
			StringBuilder contenido = new StringBuilder();
			for (FrutaVerdura producto : listaFrutasVerduras) {
				contenido.append("\nProducto: ").append(pos);
				contenido.append(producto.toString());
				pos++;
			}
			return contenido.toString();
		}
	}

	/**
	 * Actualiza un objeto FrutaVerdura en la lista en la posición especificada.
	 *
	 * @param index   El índice en la lista donde se debe actualizar el objeto.
	 * @param newData El nuevo objeto FrutaVerdura que reemplazará al objeto
	 *                existente en la lista.
	 * @return Un mensaje indicando si la actualización fue exitosa o si hubo un
	 *         error con el índice.
	 */
	@Override
	public String actualizar(int index, FrutaVerdura newData) {
		if (index < 0) {
			return "\nEl índice no puede tener valores negativos";
		} else if (index >= listaFrutasVerduras.size()) {
			return "\nEl índice se excede del tamaño actual de la lista, tamaño actual: " + listaFrutasVerduras.size()
					+ " datos";
		} else {
			listaFrutasVerduras.set(index, newData);
			return "\nDato actualizado correctamente";
		}
	}

	/**
	 * Verifica si el índice dado es válido para la lista frutasVerdura.
	 *
	 * @param index El índice a verificar.
	 * @return "s" si el índice es válido, "n" si el índice es inválido.
	 */
	@Override
	public String checkearIndex(int index) {
		if (index < 0 || index >= listaFrutasVerduras.size()) {
			return "n";
		}
		return "s";
	}

	/**
	 * Elimina un objeto FrutaVerdura de la lista basándose en el nombre del
	 * producto.
	 *
	 * @param name El nombre del producto FrutaVerdura a eliminar.
	 * @return Un mensaje indicando si la eliminación fue exitosa o si el nombre no
	 *         coincide con ningún producto registrado.
	 */
	@Override
	public String eliminarPorNombre(String name) {
		for (int i = 0; i < listaFrutasVerduras.size(); i++) {
			FrutaVerdura frutaVerdura = listaFrutasVerduras.get(i);
			if (frutaVerdura.getNombre().toLowerCase().equals(name.toLowerCase())) {
				listaFrutasVerduras.remove(i);
				return "Producto eliminado exitosamente";
			}
		}
		return "El nombre del producto no coincide con ninguno registrado";
	}
}
