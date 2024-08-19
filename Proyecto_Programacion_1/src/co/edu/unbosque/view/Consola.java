package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Consola {

	private Scanner sc;

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

	public Consola() {
		sc = new Scanner(System.in);
	}

	public void burnLine() {
		sc.nextLine();
	}

	public String readLine() {
		return sc.nextLine();
	}

	public String readWord() {
		return sc.next();
	}

	public int readInt() {
		return sc.nextInt();
	}

	public long readLong() {
		return sc.nextLong();
	}

	public float readFloat() {
		return sc.nextFloat();
	}

	public boolean readBoolean() {
		String input = sc.nextLine();
		if (input.toLowerCase().contains("si")) {
			return true;
		}
		return false;
	}

	////////////////////////////////////////////////////

	public void printNewLine(String text) {
		System.out.println(text);
	}

	public void printSameLine(String text) {
		System.out.print(text);
	}

}
