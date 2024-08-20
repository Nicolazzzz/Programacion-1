package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Producto;

/**
 * 
 * @author SANTIAGO GRANADOS
 * @version 1.0
 * 
 *          La clase ProductoDAO implementa las operaciones CRUD (Crear, Leer,
 *          Actualizar, Eliminar) para manejar una colección de objetos
 *          {@link Producto}. Utiliza una lista interna para almacenar los
 *          productos de tipo Producto.
 */
public class ProductoDAO implements CRUDOperation<Producto> {

	private ArrayList<Producto> listaProductos;

	/**
	 * Constructor por defecto que inicializa la lista de productos.
	 */
	public ProductoDAO() {
		listaProductos = new ArrayList<>();
	}

	/**
	 * Crea un nuevo objeto Producto y lo agrega a la lista de productos.
	 *
	 * @param data El objeto Producto a agregar a la lista.
	 */
	@Override
	public void crear(Producto data) {
		listaProductos.add(data);
	}

	/**
	 * Muestra todos los objetos Producto en la lista.
	 *
	 * @return Una cadena con la representación de todos los productos en la lista.
	 *         Si la lista está vacía, retorna un mensaje indicando que no hay
	 *         productos registrados.
	 */
	@Override
	public String mostrar() {
		int pos = 1;

		if (listaProductos.isEmpty()) {
			return "No hay productos registrados";
		} else {
			StringBuilder contenido = new StringBuilder();
			for (Producto producto : listaProductos) {
				contenido.append("\nProducto: ").append(pos);
				contenido.append(producto.toString());
				pos++;
			}
			return contenido.toString();
		}
	}

	/**
	 * Actualiza un objeto Producto en la lista en la posición especificada.
	 *
	 * @param index   El índice en la lista donde se debe actualizar el objeto.
	 * @param newData El nuevo objeto Producto que reemplazará al objeto existente
	 *                en la lista.
	 * @return Un mensaje indicando si la actualización fue exitosa o si hubo un
	 *         error con el índice.
	 */
	@Override
	public String actualizar(int index, Producto newData) {
		if (index < 0) {
			return "\nEl índice no puede tener valores negativos";
		} else if (index >= listaProductos.size()) {
			return "\nEl índice se excede del tamaño actual de la lista, tamaño actual: " + listaProductos.size()
					+ " datos";
		} else {
			listaProductos.set(index, newData);
			return "\nDato actualizado correctamente";
		}
	}

	/**
	 * Verifica si el índice dado es válido para la lista de productos.
	 *
	 * @param index El índice a verificar.
	 * @return "s" si el índice es válido, "n" si el índice es inválido.
	 */
	@Override
	public String checkearIndex(int index) {
		if (index < 0 || index >= listaProductos.size()) {
			return "n";
		}
		return "s";
	}

	/**
	 * Elimina un objeto Producto de la lista basándose en el nombre del producto.
	 *
	 * @param name El nombre del producto Producto a eliminar.
	 * @return Un mensaje indicando si la eliminación fue exitosa o si el nombre no
	 *         coincide con ningún producto registrado.
	 */
	@Override
	public String eliminarPorNombre(String name) {
		for (int i = 0; i < listaProductos.size(); i++) {
			Producto producto = listaProductos.get(i);
			if (producto.getNombre().toLowerCase().equals(name.toLowerCase())) {
				listaProductos.remove(i);
				return "Producto eliminado exitosamente";
			}
		}
		return "El nombre del producto no coincide con ninguno registrado";
	}
}
