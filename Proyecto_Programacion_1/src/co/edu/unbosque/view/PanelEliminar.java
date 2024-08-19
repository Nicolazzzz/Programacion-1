package co.edu.unbosque.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelEliminar extends JPanel {

	JTextField txtNombre;
	JLabel imagen;

	public PanelEliminar() {

		setLayout(null);
		setSize(1280, 720);
		setVisible(true);

		txtNombre = new JTextField("NOMBRE PRODUCTO");
		txtNombre.setBounds(100, 100, 150, 150);
		txtNombre.setOpaque(true);

		add(txtNombre);
	}

}
