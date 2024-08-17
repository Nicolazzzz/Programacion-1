package co.edu.unbosque.model.persistence;

public interface CRUDOperation<T> {

	public void crear(T data);

	public String mostrar();

	public String actualizar(int index, T newData);

	public String eliminar(int index);

	public boolean eliminar(T datoEliminar);

	public String checkearIndex(int index);

}
