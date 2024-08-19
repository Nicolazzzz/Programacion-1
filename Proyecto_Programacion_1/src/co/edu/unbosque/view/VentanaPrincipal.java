package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private PanelMenuPrincipal menuPpal;
	private PanelMenuGestion menuGestion;
	private PanelAgregarCarne panelAgregar;

	public VentanaPrincipal() {

		setLocation(70, 70);
		setSize(1280, 720);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);

		setTitle("MENU PRINCIPAL");

		ImageIcon logo = new ImageIcon("src/media/logoexito.png");
		setIconImage(logo.getImage());

		menuPpal = new PanelMenuPrincipal();
		menuGestion = new PanelMenuGestion();
		panelAgregar = new PanelAgregarCarne();

	}

	public void mostrarPanelMenuPrincipal() {
		setContentPane(menuPpal);
	}

	public void mostrarPanelMenuGestion() {
		setContentPane(menuGestion);
	}

	public void mostrarPanelAgregar() {
		setContentPane(panelAgregar);
	}

	public PanelMenuPrincipal getMenuPpal() {
		return menuPpal;
	}

	public PanelMenuGestion getMenuGestion() {
		return menuGestion;
	}

	public PanelAgregarCarne getPanelAgregar() {
		return panelAgregar;
	}

}
