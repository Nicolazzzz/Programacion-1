package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Juguete;

/**
 * La clase JugueteDAO implementa las operaciones CRUD (Crear, Leer, Actualizar,
 * Eliminar) para manejar una colección de objetos {@link Juguete}. Utiliza una
 * lista interna para almacenar los productos de tipo Juguete.
 */
public class JugueteDAO implements CRUDOperation<Juguete> {

	private ArrayList<Juguete> listaJuguetes;

	/**
	 * Constructor por defecto que inicializa la lista de juguetes.
	 */
	public JugueteDAO() {
		listaJuguetes = new ArrayList<>();
	}

	/**
	 * Crea un nuevo objeto Juguete y lo agrega a la lista de juguetes.
	 *
	 * @param data El objeto Juguete a agregar a la lista.
	 */
	@Override
	public void crear(Juguete data) {
		listaJuguetes.add(data);
	}

	/**
	 * Muestra todos los objetos Juguete en la lista.
	 *
	 * @return Una cadena con la representación de todos los productos en la lista.
	 *         Si la lista está vacía, retorna un mensaje indicando que no hay
	 *         productos registrados.
	 */
	@Override
	public String mostrar() {
		int pos = 1;

		if (listaJuguetes.isEmpty()) {
			return "No hay productos registrados";
		} else {
			StringBuilder contenido = new StringBuilder();
			for (Juguete producto : listaJuguetes) {
				contenido.append("\nProducto: ").append(pos);
				contenido.append(producto.toString());
				pos++;
			}
			return contenido.toString();
		}
	}

	/**
	 * Actualiza un objeto Juguete en la lista en la posición especificada.
	 *
	 * @param index   El índice en la lista donde se debe actualizar el objeto.
	 * @param newData El nuevo objeto Juguete que reemplazará al objeto existente en
	 *                la lista.
	 * @return Un mensaje indicando si la actualización fue exitosa o si hubo un
	 *         error con el índice.
	 */
	@Override
	public String actualizar(int index, Juguete newData) {
		if (index < 0) {
			return "\nEl índice no puede tener valores negativos";
		} else if (index >= listaJuguetes.size()) {
			return "\nEl índice se excede del tamaño actual de la lista, tamaño actual: " + listaJuguetes.size()
					+ " datos";
		} else {
			listaJuguetes.set(index, newData);
			return "\nDato actualizado correctamente";
		}
	}

	/**
	 * Verifica si el índice dado es válido para la lista de juguetes.
	 *
	 * @param index El índice a verificar.
	 * @return "s" si el índice es válido, "n" si el índice es inválido.
	 */
	@Override
	public String checkearIndex(int index) {
		if (index < 0 || index >= listaJuguetes.size()) {
			return "n";
		}
		return "s";
	}

	/**
	 * Elimina un objeto Juguete de la lista basándose en el nombre del producto.
	 *
	 * @param name El nombre del producto Juguete a eliminar.
	 * @return Un mensaje indicando si la eliminación fue exitosa o si el nombre no
	 *         coincide con ningún producto registrado.
	 */
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