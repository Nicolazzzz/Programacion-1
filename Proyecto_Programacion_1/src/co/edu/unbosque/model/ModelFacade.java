package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CarneFriaDAO;
import co.edu.unbosque.model.persistence.FrutaVerduraDAO;
import co.edu.unbosque.model.persistence.JugueteDAO;
import co.edu.unbosque.model.persistence.PanaderiaDAO;
import co.edu.unbosque.model.persistence.ProductoDAO;

public class ModelFacade {

	private CarneFriaDAO carneFriaDAO;
	private FrutaVerduraDAO frutaVerduraDAO;
	private JugueteDAO jugueteDAO;
	private PanaderiaDAO panaderiaDAO;
	private ProductoDAO productoDAO;

	public ModelFacade() {

		carneFriaDAO = new CarneFriaDAO();
		frutaVerduraDAO = new FrutaVerduraDAO();
		jugueteDAO = new JugueteDAO();
		panaderiaDAO = new PanaderiaDAO();
		productoDAO = new ProductoDAO();

	}

	public CarneFriaDAO getCarneFriaDAO() {
		return carneFriaDAO;
	}

	public void setCarneFriaDAO(CarneFriaDAO carneFriaDAO) {
		this.carneFriaDAO = carneFriaDAO;
	}

	public FrutaVerduraDAO getFrutaVerduraDAO() {
		return frutaVerduraDAO;
	}

	public void setFrutaVerduraDAO(FrutaVerduraDAO frutaVerduraDAO) {
		this.frutaVerduraDAO = frutaVerduraDAO;
	}

	public JugueteDAO getJugueteDAO() {
		return jugueteDAO;
	}

	public void setJugueteDAO(JugueteDAO jugueteDAO) {
		this.jugueteDAO = jugueteDAO;
	}

	public PanaderiaDAO getPanaderiaDAO() {
		return panaderiaDAO;
	}

	public void setPanaderiaDAO(PanaderiaDAO panaderiaDAO) {
		this.panaderiaDAO = panaderiaDAO;
	}

	public ProductoDAO getProductoDAO() {
		return productoDAO;
	}

	public void setProductoDAO(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}

}
