package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CarneFriaDAO;
import co.edu.unbosque.model.persistence.FrutaVerduraDAO;
import co.edu.unbosque.model.persistence.JugueteDAO;
import co.edu.unbosque.model.persistence.PanaderiaDAO;
import co.edu.unbosque.model.persistence.ProductoDAO;

/**
 * La clase ModelFacade actúa como un intermediario entre la capa de negocio y la capa de persistencia.
 * Proporciona un punto de acceso centralizado para interactuar con los diferentes DAOs del sistema.
 */
public class ModelFacade {

    private CarneFriaDAO carneFriaDAO;
    private FrutaVerduraDAO frutaVerduraDAO;
    private JugueteDAO jugueteDAO;
    private PanaderiaDAO panaderiaDAO;
    private ProductoDAO productoDAO;

    /**
     * Constructor por defecto que inicializa los objetos DAO.
     */
    public ModelFacade() {
        carneFriaDAO = new CarneFriaDAO();
        frutaVerduraDAO = new FrutaVerduraDAO();
        jugueteDAO = new JugueteDAO();
        panaderiaDAO = new PanaderiaDAO();
        productoDAO = new ProductoDAO();
    }

    /**
     * Obtiene el DAO de Carne Fría.
     * 
     * @return una instancia de CarneFriaDAO.
     */
    public CarneFriaDAO getCarneFriaDAO() {
        return carneFriaDAO;
    }

    /**
     * Establece el DAO de Carne Fría.
     * 
     * @param carneFriaDAO la instancia de CarneFriaDAO a establecer.
     */
    public void setCarneFriaDAO(CarneFriaDAO carneFriaDAO) {
        this.carneFriaDAO = carneFriaDAO;
    }

    /**
     * Obtiene el DAO de Fruta y Verdura.
     * 
     * @return una instancia de FrutaVerduraDAO.
     */
    public FrutaVerduraDAO getFrutaVerduraDAO() {
        return frutaVerduraDAO;
    }

    /**
     * Establece el DAO de Fruta y Verdura.
     * 
     * @param frutaVerduraDAO la instancia de FrutaVerduraDAO a establecer.
     */
    public void setFrutaVerduraDAO(FrutaVerduraDAO frutaVerduraDAO) {
        this.frutaVerduraDAO = frutaVerduraDAO;
    }

    /**
     * Obtiene el DAO de Juguetes.
     * 
     * @return una instancia de JugueteDAO.
     */
    public JugueteDAO getJugueteDAO() {
        return jugueteDAO;
    }

    /**
     * Establece el DAO de Juguetes.
     * 
     * @param jugueteDAO la instancia de JugueteDAO a establecer.
     */
    public void setJugueteDAO(JugueteDAO jugueteDAO) {
        this.jugueteDAO = jugueteDAO;
    }

    /**
     * Obtiene el DAO de Panadería.
     * 
     * @return una instancia de PanaderiaDAO.
     */
    public PanaderiaDAO getPanaderiaDAO() {
        return panaderiaDAO;
    }

    /**
     * Establece el DAO de Panadería.
     * 
     * @param panaderiaDAO la instancia de PanaderiaDAO a establecer.
     */
    public void setPanaderiaDAO(PanaderiaDAO panaderiaDAO) {
        this.panaderiaDAO = panaderiaDAO;
    }

    /**
     * Obtiene el DAO de Productos.
     * 
     * @return una instancia de ProductoDAO.
     */
    public ProductoDAO getProductoDAO() {
        return productoDAO;
    }

    /**
     * Establece el DAO de Productos.
     * 
     * @param productoDAO la instancia de ProductoDAO a establecer.
     */
    public void setProductoDAO(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }

}
