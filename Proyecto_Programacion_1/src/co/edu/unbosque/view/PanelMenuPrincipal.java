package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMenuPrincipal extends JPanel {

	private JLabel imagenPpal;
	private JButton carne, frutaV, juguete, pan;

	public PanelMenuPrincipal() {

		setLayout(null);
		setSize(1280, 720);
		setVisible(false);

		carne = new JButton("carnes");
		carne.setBounds(485, 378, 135, 100);
		carne.setOpaque(false);
		carne.setActionCommand("CARNEFRIA");

		frutaV = new JButton("frutaV");
		frutaV.setBounds(634, 378, 156, 100);
		frutaV.setOpaque(false);
		frutaV.setActionCommand("FRUTAVERDURA");

		juguete = new JButton("juguetes");
		juguete.setBounds(485, 500, 135, 100);
		juguete.setOpaque(false);
		juguete.setActionCommand("JUGUETE");

		pan = new JButton("pan");
		pan.setBounds(634, 500, 156, 100);
		pan.setOpaque(false);
		pan.setActionCommand("PAN");

		imagenPpal = new JLabel();
		ImageIcon imagen = new ImageIcon("src/media/ventanaPrincipalExito2.png");
		Image redimensionado = imagen.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenPpal.setIcon(new ImageIcon(redimensionado));
		imagenPpal.setBounds(0, 0, 1280, 720);

		add(imagenPpal);
		add(carne);
		add(frutaV);
		add(juguete);
		add(pan);

	}

}
