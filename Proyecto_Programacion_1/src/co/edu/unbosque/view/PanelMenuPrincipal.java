package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMenuPrincipal extends JPanel {

	private JLabel imagenPpal;
	private JButton btnCarne, btnFrutaV, btnJuguete, btnPan;

	public PanelMenuPrincipal() {

		setLayout(null);
		setSize(1280, 720);
		setVisible(false);

		btnCarne = new JButton("carnes");
		btnCarne.setBounds(485, 378, 135, 100);
		btnCarne.setOpaque(false);
		btnCarne.setActionCommand("CARNEFRIA");

		btnFrutaV = new JButton("frutaV");
		btnFrutaV.setBounds(634, 378, 156, 100);
		btnFrutaV.setOpaque(false);
		btnFrutaV.setActionCommand("FRUTAVERDURA");

		btnJuguete = new JButton("juguetes");
		btnJuguete.setBounds(485, 500, 135, 100);
		btnJuguete.setOpaque(false);
		btnJuguete.setActionCommand("JUGUETE");

		btnPan = new JButton("pan");
		btnPan.setBounds(634, 500, 156, 100);
		btnPan.setOpaque(false);
		btnPan.setActionCommand("PAN");

		imagenPpal = new JLabel();
		ImageIcon imagen = new ImageIcon("src/media/ventanaPrincipalExito2.png");
		Image redimensionado = imagen.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenPpal.setIcon(new ImageIcon(redimensionado));
		imagenPpal.setBounds(0, 0, 1280, 720);

		add(imagenPpal);
		add(btnCarne);
		add(btnFrutaV);
		add(btnJuguete);
		add(btnPan);
	}

	public JLabel getImagenPpal() {
		return imagenPpal;
	}

	public JButton getBtnCarne() {
		return btnCarne;
	}

	public JButton getBtnFrutaV() {
		return btnFrutaV;
	}

	public JButton getBtnJuguete() {
		return btnJuguete;
	}

	public JButton getBtnPan() {
		return btnPan;
	}
	
	

}
