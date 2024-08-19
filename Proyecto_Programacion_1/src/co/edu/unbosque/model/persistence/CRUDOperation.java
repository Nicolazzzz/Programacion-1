package co.edu.unbosque.model.persistence;

/**
 * La interfaz CRUDOperation define las operaciones básicas de crear, mostrar, actualizar y eliminar (CRUD) 
 * que deben implementar las clases que manejen objetos de tipo genérico.
 *
 * @param <T> El tipo de objeto que se manipulará en las operaciones CRUD.
 */
public interface CRUDOperation<T> {

    /**
     * Crea un nuevo objeto de tipo T.
     *
     * @param data El objeto a ser creado.
     */
    public void crear(T data);

    /**
     * Muestra una representación en cadena de los objetos almacenados.
     *
     * @return Una cadena que representa los objetos almacenados.
     */
    public String mostrar();

    /**
     * Actualiza un objeto en una posición específica con nuevos datos.
     *
     * @param index   La posición del objeto a actualizar.
     * @param newData Los nuevos datos para actualizar el objeto.
     * @return Una cadena que indica el resultado de la operación de actualización.
     */
    public String actualizar(int index, T newData);

    /**
     * Elimina un objeto basado en su nombre.
     *
     * @param name El nombre del objeto a eliminar.
     * @return Una cadena que indica el resultado de la operación de eliminación.
     */
    public String eliminarPorNombre(String name);

    /**
     * Verifica si un índice específico es válido.
     *
     * @param index El índice a verificar.
     * @return Una cadena que indica si el índice es válido o no.
     */
    public String checkearIndex(int index);
}
