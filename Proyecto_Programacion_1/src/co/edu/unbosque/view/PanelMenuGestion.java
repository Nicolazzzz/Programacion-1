package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMenuGestion extends JPanel {

	JLabel imagen1;
	JButton btnAgregar, btnMostrar, btnActualizar, btnEliminar, btnVolver;

	public PanelMenuGestion() {

		setLayout(null);
		setVisible(true);
		setSize(1280, 720);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        setPreferredSize(new Dimension(screenWidth, screenHeight));

		btnAgregar = new JButton("agregar");
		btnAgregar.setBounds(583, 335, 140, 130);
		btnAgregar.setOpaque(true);
		btnAgregar.setActionCommand("AGREGAR");

		btnMostrar = new JButton("mostrar");
		btnMostrar.setBounds(787, 335, 158, 130);
		btnMostrar.setOpaque(true);
		btnMostrar.setActionCommand("MOSTRAR");

		btnActualizar = new JButton("actualizar");
		btnActualizar.setBounds(583, 500, 140, 130);
		btnActualizar.setOpaque(true);
		btnActualizar.setActionCommand("ACTUALIZAR");

		btnEliminar = new JButton("eliminar");
		btnEliminar.setBounds(787, 500, 158, 130);
		btnEliminar.setOpaque(true);
		btnEliminar.setActionCommand("ELIMINAR");

		btnVolver = new JButton("volver");
		btnVolver.setBounds(690, 655, 140, 125);
		btnVolver.setOpaque(true);
		btnVolver.setActionCommand("VOLVER");
		
		imagen1 = new JLabel();
		ImageIcon imagen = new ImageIcon("src/media/MenuAcciones.png");
		Image redimensionado = imagen.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
		imagen1.setIcon(new ImageIcon(redimensionado));
		imagen1.setBounds(0, 0, screenWidth, screenHeight);

		add(btnAgregar);
		add(btnMostrar);
		add(btnActualizar);
		add(btnEliminar);
		add(btnVolver);
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
