package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

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
		setVisible(true);

		btnCarne = new JButton("carnes");
		btnCarne.setBounds(584, 454, 160, 120);
		btnCarne.setOpaque(false);
		btnCarne.setActionCommand("CARNEFRIA");

		btnFrutaV = new JButton("frutaV");
		btnFrutaV.setBounds(758, 454, 192, 120);
		btnFrutaV.setOpaque(false);
		btnFrutaV.setActionCommand("FRUTAVERDURA");

		btnJuguete = new JButton("juguetes");
		btnJuguete.setBounds(584, 606, 160, 107);
		btnJuguete.setOpaque(false);
		btnJuguete.setActionCommand("JUGUETE");

		btnPan = new JButton("pan");
		btnPan.setBounds(758, 606, 192, 107);
		btnPan.setOpaque(false);
		btnPan.setActionCommand("PAN");

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        
		imagenPpal = new JLabel();
		ImageIcon imagen = new ImageIcon("src/media/VentanaExito.png");
		Image redimensionado = imagen.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
		imagenPpal.setIcon(new ImageIcon(redimensionado));
		imagenPpal.setBounds(0, 0, screenWidth, screenHeight);
		
		/*ImageIcon imagenVentana = new ImageIcon("VentanaExito.png");
        Image imagenVentana1 = imagenVentana.getImage();
        Image imagenRedimensionada = imagenVentana1.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
        JLabel label1 = new JLabel(iconoRedimensionado);
        label1.setBounds(0, 0, screenWidth, screenHeight);*/

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
