package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {

	private Scanner sc;

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
