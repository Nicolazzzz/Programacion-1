package co.edu.unbosque.model;

/**
 * @author NICOLAS ABRIL
 * @version 1.0
 * 
 * La clase CarneFria representa un producto del tipo carne fría, que hereda de la clase Producto.
 * Además de los atributos heredados, incluye el atributo animalOrigen, que indica el animal de donde proviene la carne.
 */
public class CarneFria extends Producto {

    private String animalOrigen;

    /**
     * Constructor vacio de la clase CarneFria.
     */
    public CarneFria() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Constructor que inicializa la clase CarneFria con el animal de origen.
     *
     * @param animalOrigen El nombre del animal de donde proviene la carne.
     */
    public CarneFria(String animalOrigen) {
        super();
        this.animalOrigen = animalOrigen;
    }

    /**
     * Constructor que inicializa todos los atributos de la clase CarneFria, incluyendo los heredados.
     *
     * @param numId       El número de identificación del producto.
     * @param nombre      El nombre del producto.
     * @param empresa     El nombre de la empresa que produce el producto.
     * @param precio      El precio del producto.
     * @param cantidad    La cantidad disponible del producto.
     * @param animalOrigen El nombre del animal de donde proviene la carne.
     */
    public CarneFria(long numId, String nombre, String empresa, float precio, int cantidad, String animalOrigen) {
        super(numId, nombre, empresa, precio, cantidad);
        this.animalOrigen = animalOrigen;
    }

    /**
     * Constructor que inicializa todos los atributos heredados de la clase Producto, sin especificar el animal de origen.
     *
     * @param numId    El número de identificación del producto.
     * @param nombre   El nombre del producto.
     * @param empresa  El nombre de la empresa que produce el producto.
     * @param precio   El precio del producto.
     * @param cantidad La cantidad disponible del producto.
     */
    public CarneFria(long numId, String nombre, String empresa, float precio, int cantidad) {
        super(numId, nombre, empresa, precio, cantidad);
    }

    /**
     * Obtiene el animal de origen de la carne.
     *
     * @return El nombre del animal de origen.
     */
    public String getAnimalOrigen() {
        return animalOrigen;
    }

    /**
     * Establece el animal de origen de la carne.
     *
     * @param animalOrigen El nombre del animal de origen a establecer.
     */
    public void setAnimalOrigen(String animalOrigen) {
        this.animalOrigen = animalOrigen;
    }

    /**
     * Devuelve una representación en cadena de la información de la carne fría, incluyendo los atributos heredados y el animal de origen.
     *
     * @return Una cadena con la información del producto.
     */
    @Override
    public String toString() {
        return super.toString() + "\nAnimal de origen: " + animalOrigen;
    }
}
