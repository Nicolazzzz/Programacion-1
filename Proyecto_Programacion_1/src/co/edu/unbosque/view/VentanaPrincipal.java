package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private PanelMenuPrincipal menuPpal;

	public VentanaPrincipal() {

		setSize(1280, 720);
		setLocation(70, 70);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);

		menuPpal = new PanelMenuPrincipal();

	}

	public void mostrarPanelMenuPrincipal() {
		setContentPane(menuPpal);
	}

	public PanelMenuPrincipal getMenuPpal() {
		return menuPpal;
	}

}
