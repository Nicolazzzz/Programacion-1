package co.edu.unbosque.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMenuPrincipal extends JPanel {

	private JLabel imagenPpal;
	private JButton btnCarne, btnFrutaV, btnJuguete, btnPan;

	/**
	 * @author SANTIAGO GRANADOS y MARIO RODRIGUEZ
	 * @version 1.0
	 */

	public PanelMenuPrincipal() {

		setLayout(null);
		setSize(1280, 720);
		setVisible(true);

		imagenPpal = new JLabel();
		ImageIcon imagen1 = new ImageIcon("src/media/ventanaPrincipalExito2.png");
		Image redimensionado = imagen1.getImage().getScaledInstance(1280, 720, Image.SCALE_SMOOTH);
		imagenPpal.setIcon(new ImageIcon(redimensionado));
		imagenPpal.setBounds(0, 0, 1280, 720);

		btnCarne = new JButton("carnes");
		btnCarne.setBounds(482, 378, 140, 100);
		btnCarne.setOpaque(false);
		btnCarne.setActionCommand("CARNEFRIA");

		btnFrutaV = new JButton("frutaV");
		btnFrutaV.setBounds(634, 378, 155, 100);
		btnFrutaV.setOpaque(false);
		btnFrutaV.setActionCommand("FRUTAVERDURA");

		btnJuguete = new JButton("juguetes");
		btnJuguete.setBounds(485, 504, 140, 90);
		btnJuguete.setOpaque(false);
		btnJuguete.setActionCommand("JUGUETE");

		btnPan = new JButton("pan");
		btnPan.setBounds(634, 504, 155, 92);
		btnPan.setOpaque(false);
		btnPan.setActionCommand("PAN");

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
