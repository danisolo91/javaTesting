package org.itacademy.javatesting.junit;

public class CalculoDni {

	public static String getLetra(String n) {
		int numero = Integer.parseInt(n);
		String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

		return letras[numero % 23];
	}
}
