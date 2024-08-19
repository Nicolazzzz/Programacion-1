package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.CarneFria;

/**
 * La clase CarneFriaDAO implementa las operaciones CRUD (Crear, Leer,
 * Actualizar, Eliminar) para manejar una colección de objetos
 * {@link CarneFria}. Utiliza una lista interna para almacenar los productos de
 * tipo CarneFria.
 */
public class CarneFriaDAO implements CRUDOperation<CarneFria> {

	private ArrayList<CarneFria> listaCarnesFrias;

	/**
	 * Constructor pro defecto que inicializa la lista de carnes frías.
	 */
	public CarneFriaDAO() {
		listaCarnesFrias = new ArrayList<>();
	}

	/**
	 * Crea un nuevo objeto CarneFria y lo agrega a la lista de carnes frías.
	 *
	 * @param data El objeto CarneFria a agregar a la lista.
	 */
	@Override
	public void crear(CarneFria data) {
		listaCarnesFrias.add(data);
	}

	/**
	 * Muestra todos los objetos CarneFria en la lista.
	 *
	 * @return Una cadena con la representación de todos los productos en la lista.
	 *         Si la lista está vacía, retorna un mensaje indicando que no hay
	 *         productos registrados.
	 */
	@Override
	public String mostrar() {
		int pos = 1;

		if (listaCarnesFrias.isEmpty()) {
			return "No hay productos registrados";
		} else {
			StringBuilder contenido = new StringBuilder();
			for (CarneFria producto : listaCarnesFrias) {
				contenido.append("\nProducto: ").append(pos);
				contenido.append(producto.toString()).append("\n");
				pos++;
			}
			return contenido.toString();
		}
	}

	/**
	 * Actualiza un objeto CarneFria en la lista en la posición especificada.
	 *
	 * @param index   El índice en la lista donde se debe actualizar el objeto.
	 * @param newData El nuevo objeto CarneFria que reemplazará al objeto existente
	 *                en la lista.
	 * @return Un mensaje indicando si la actualización fue exitosa o si hubo un
	 *         error con el índice.
	 */
	@Override
	public String actualizar(int index, CarneFria newData) {
		if (index < 0) {
			return "\nEl índice no puede tener valores negativos";
		} else if (index >= listaCarnesFrias.size()) {
			return "\nEl índice se excede del tamaño actual de la lista, tamaño actual: " + listaCarnesFrias.size()
					+ " datos";
		} else {
			listaCarnesFrias.set(index, newData);
			return "\nDato actualizado correctamente";
		}
	}

	/**
	 * Elimina un objeto CarneFria de la lista basándose en el nombre del producto.
	 *
	 * @param name El nombre del producto CarneFria a eliminar.
	 * @return Un mensaje indicando si la eliminación fue exitosa o si el nombre no
	 *         coincide con ningún producto registrado.
	 */
	@Override
	public String eliminarPorNombre(String name) {
		name += "";
		for (int i = 0; i < listaCarnesFrias.size(); i++) {
			CarneFria carneFria = listaCarnesFrias.get(i);
			if (carneFria.getNombre().toLowerCase().equals(name.toLowerCase())) {
				listaCarnesFrias.remove(i);
				return "Producto eliminado exitosamente";
			}
		}
		return "El nombre del producto no coincide con ninguno registrado";
	}

	/**
	 * Verifica si el índice dado es válido para la lista de carnes frías.
	 *
	 * @param index El índice a verificar.
	 * @return "s" si el índice es válido, "n" si el índice es inválido.
	 */
	@Override
	public String checkearIndex(int index) {
		if (index < 0 || index >= listaCarnesFrias.size()) {
			return "n";
		}
		return "s";
	}
}
