package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMenuGestion extends JPanel {

	JLabel imagen1;
	JButton btnAgregar, btnMostrar, btnActualizar, btnEliminar, btnVolver;

	public PanelMenuGestion() {

		setLayout(null);
		setVisible(false);
		setSize(1280, 720);

		btnAgregar = new JButton("agregar");
		btnAgregar.setBounds(200, 100, 100, 100);
		btnAgregar.setOpaque(true);
		btnAgregar.setActionCommand("AGREGAR");

		btnMostrar = new JButton("mostrar");
		btnMostrar.setBounds(200, 200, 100, 100);
		btnMostrar.setOpaque(true);
		btnMostrar.setActionCommand("MOSTRAR");

		btnActualizar = new JButton("actualizar");
		btnActualizar.setBounds(200, 300, 100, 100);
		btnActualizar.setOpaque(true);
		btnActualizar.setActionCommand("ACTUALIZAR");

		btnEliminar = new JButton("eliminar");
		btnEliminar.setBounds(200, 400, 100, 100);
		btnEliminar.setOpaque(true);
		btnEliminar.setActionCommand("ELIMINAR");

		imagen1 = new JLabel();
		ImageIcon imagen = new ImageIcon("");
		Image redimensionado = imagen.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagen1.setIcon(new ImageIcon(redimensionado));
		imagen1.setBounds(0, 0, 1280, 720);

		add(btnAgregar);
		add(btnMostrar);
		add(btnActualizar);
		add(btnEliminar);
		add(imagen1);

	}

	public JLabel getImagen1() {
		return imagen1;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public JButton getBtnMostrar() {
		return btnMostrar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

}
