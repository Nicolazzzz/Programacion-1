package co.edu.unbosque.view;

import javax.swing.JOptionPane;

/*
* @author MARIO RODRIGUEZ
* @version 1.0
*/
public class Consola {

	public void mostrarMensajeEmergente(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarAlerta(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Alerta", JOptionPane.WARNING_MESSAGE);
	}

	public void mostrarError(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Error", JOptionPane.ERROR_MESSAGE);
	}

	public void mostrarListado(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Lista productos registrados", JOptionPane.INFORMATION_MESSAGE);
	}

	public String leerInputEliminar(String texto) {
		return JOptionPane.showInputDialog(null, texto, "Eliminando producto", JOptionPane.WARNING_MESSAGE);
	}

	public String leerEntradaEmergente(String texto) {
		return JOptionPane.showInputDialog(null, texto, "Ingresando dato", JOptionPane.WARNING_MESSAGE);
	}

	public boolean leerBoolean(String entrada) {
		if (entrada.toLowerCase().contains("si")) {
			return true;
		}
		return false;
	}

}
