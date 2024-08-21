package co.edu.unbosque.view;

import javax.swing.JOptionPane;

/*
* @author MARIO RODRIGUEZ
* @version 1.0
*/

/**
 * La clase Consola proporciona métodos para interactuar con el usuario mediante
 * cuadros de diálogo utilizando JOptionPane. Esta clase ofrece funcionalidad
 * para mostrar mensajes, alertas, errores, listas de información, así como para
 * leer entradas del usuario.
 */
public class Consola {

	/**
	 * Muestra un cuadro de diálogo informativo con el mensaje proporcionado.
	 *
	 * @param texto El mensaje a mostrar.
	 */
	public void mostrarMensajeEmergente(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Muestra un cuadro de diálogo de advertencia con el mensaje proporcionado.
	 *
	 * @param texto El mensaje de advertencia a mostrar.
	 */
	public void mostrarAlerta(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Alerta", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Muestra un cuadro de diálogo de error con el mensaje proporcionado.
	 *
	 * @param texto El mensaje de error a mostrar.
	 */
	public void mostrarError(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Error", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Muestra un cuadro de diálogo informativo que contiene una lista o información
	 * extensa.
	 *
	 * @param texto La lista o información a mostrar.
	 */
	public void mostrarListado(String texto) {
		JOptionPane.showMessageDialog(null, texto, "Lista productos registrados", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Muestra un cuadro de diálogo de advertencia que solicita al usuario ingresar
	 * un dato.
	 *
	 * @param texto La solicitud o pregunta al usuario.
	 * @return El dato ingresado por el usuario como una cadena de texto.
	 */
	public String leerInputEliminar(String texto) {
		return JOptionPane.showInputDialog(null, texto, "Eliminando producto", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Muestra un cuadro de diálogo que solicita al usuario ingresar un dato.
	 *
	 * @param texto La solicitud o pregunta al usuario.
	 * @return El dato ingresado por el usuario como una cadena de texto.
	 */
	public String leerEntradaEmergente(String texto) {
		return JOptionPane.showInputDialog(null, texto, "Ingresando dato", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Convierte una entrada de texto en un valor booleano.
	 *
	 * @param entrada El texto ingresado por el usuario.
	 * @return {@code true} si el texto contiene "si" (ignorando mayúsculas o
	 *         minúsculas), {@code false} en caso contrario.
	 */
	public boolean leerBoolean(String entrada) {
		if (entrada.toLowerCase().contains("si")) {
			return true;
		}
		return false;
	}
}