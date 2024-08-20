package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Panaderia;

/**
 * @author 
 * @version 1.0
 * 
 * La clase PanaderiaDAO implementa las operaciones CRUD (Crear, Leer,
 * Actualizar, Eliminar) para manejar una colección de objetos
 * {@link Panaderia}. Utiliza una lista interna para almacenar los productos de
 * tipo Panaderia.
 */
public class PanaderiaDAO implements CRUDOperation<Panaderia> {

	private ArrayList<Panaderia> listaPanaderia;

	/**
	 * Constructor por defecto que inicializa la lista de panadería.
	 */
	public PanaderiaDAO() {
		listaPanaderia = new ArrayList<>();
	}

	/**
	 * Crea un nuevo objeto Panaderia y lo agrega a la lista de panadería.
	 *
	 * @param data El objeto Panaderia a agregar a la lista.
	 */
	@Override
	public void crear(Panaderia data) {
		listaPanaderia.add(data);
	}

	/**
	 * Muestra todos los objetos Panaderia en la lista.
	 *
	 * @return Una cadena con la representación de todos los productos en la lista.
	 *         Si la lista está vacía, retorna un mensaje indicando que no hay
	 *         productos registrados.
	 */
	@Override
	public String mostrar() {
		int pos = 1;

		if (listaPanaderia.isEmpty()) {
			return "No hay productos registrados";
		} else {
			StringBuilder contenido = new StringBuilder();
			for (Panaderia producto : listaPanaderia) {
				contenido.append("\nProducto: ").append(pos);
				contenido.append(producto.toString());
				pos++;
			}
			return contenido.toString();
		}
	}

	/**
	 * Actualiza un objeto Panaderia en la lista en la posición especificada.
	 *
	 * @param index   El índice en la lista donde se debe actualizar el objeto.
	 * @param newData El nuevo objeto Panaderia que reemplazará al objeto existente
	 *                en la lista.
	 * @return Un mensaje indicando si la actualización fue exitosa o si hubo un
	 *         error con el índice.
	 */
	@Override
	public String actualizar(int index, Panaderia newData) {
		if (index < 0) {
			return "\nEl índice no puede tener valores negativos";
		} else if (index >= listaPanaderia.size()) {
			return "\nEl índice se excede del tamaño actual de la lista, tamaño actual: " + listaPanaderia.size()
					+ " datos";
		} else {
			listaPanaderia.set(index, newData);
			return "\nDato actualizado correctamente";
		}
	}

	/**
	 * Verifica si el índice dado es válido para la lista de panadería.
	 *
	 * @param index El índice a verificar.
	 * @return "s" si el índice es válido, "n" si el índice es inválido.
	 */
	@Override
	public String checkearIndex(int index) {
		if (index < 0 || index >= listaPanaderia.size()) {
			return "n";
		}
		return "s";
	}

	/**
	 * Elimina un objeto Panaderia de la lista basándose en el nombre del producto.
	 *
	 * @param name El nombre del producto Panaderia a eliminar.
	 * @return Un mensaje indicando si la eliminación fue exitosa o si el nombre no
	 *         coincide con ningún producto registrado.
	 */
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
