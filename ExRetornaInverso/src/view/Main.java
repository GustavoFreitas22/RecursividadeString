package view;

import Controller.PalavraController;

public class Main {

	public static void main(String[] args) {
		
		PalavraController invert = new PalavraController();
		
		String palavra = "Testando";
		String resultado = "";

		resultado = invert.inverter(palavra, palavra.length(), resultado);
		System.out.printf("O resultado foi: " + resultado);
	}

}