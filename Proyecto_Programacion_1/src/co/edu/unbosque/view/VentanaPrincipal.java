package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private PanelMenuPrincipal menuPpal;
	private PanelMenuGestion menuGestion;
	private PanelEliminar panelEliminar;

	public VentanaPrincipal() {

		setSize(1280, 720);
		setLocation(70, 70);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);

		menuPpal = new PanelMenuPrincipal();
		menuGestion = new PanelMenuGestion();
		panelEliminar = new PanelEliminar();

	}

	public void mostrarPanelMenuPrincipal() {
		setContentPane(menuPpal);
	}

	public void mostrarPanelMenuGestion() {
		setContentPane(menuGestion);
	}

	public void mostrarPanelEliminar() {
		setContentPane(panelEliminar);
	}

	public PanelMenuPrincipal getMenuPpal() {
		return menuPpal;
	}

	public PanelMenuGestion getMenuGestion() {
		return menuGestion;
	}

	public PanelEliminar getPanelEliminar() {
		return panelEliminar;
	}

}
