package co.edu.unbosque.model.persistence;

public interface CRUDOperation<T> {

	public void crear(T data);

	public String mostrar();

	public String actualizar(int index, T newData);

	public String eliminarPorNombre(String name);

	public String checkearIndex(int index);

}
