package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio05 { // Faça um Programa que verifique se uma letra
							// digitada é vogal ou consoante.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		String letra;

		System.out.println("Descubra Se a letra digitada é vogal ou consoante:");

		System.out.println("Digite uma letra e tecle enter:");
		teclado = new Scanner(System.in);
		letra = teclado.next();

		if (letra.length() > 1) {
			System.out.println("A letra informada possui mais do que um caracter.");
			System.out.println("Digite apenas um caracter.");

		} else if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E")
				|| letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("0")
				|| letra.equalsIgnoreCase("U")) {
			System.out.println("A letra digitada corresponde a uma vogal!");

		} else if (letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C")
				|| letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("F")
				|| letra.equalsIgnoreCase("G") || letra.equalsIgnoreCase("H")
				|| letra.equalsIgnoreCase("J") || letra.equalsIgnoreCase("K")
				|| letra.equalsIgnoreCase("L") || letra.equalsIgnoreCase("M")
				|| letra.equalsIgnoreCase("N") || letra.equalsIgnoreCase("P")
				|| letra.equalsIgnoreCase("Q") || letra.equalsIgnoreCase("R")
				|| letra.equalsIgnoreCase("S") || letra.equalsIgnoreCase("T")
				|| letra.equalsIgnoreCase("V") || letra.equalsIgnoreCase("W")
				|| letra.equalsIgnoreCase("X") || letra.equalsIgnoreCase("Y")
				|| letra.equalsIgnoreCase("Z")) {
			System.out.println("A letra digitada corresponde a uma consoante!");

		} else {
			System.out.println("O exercicio pede uma letra.\n"
					+ "Digito não correspondente! " + "'" + letra + "'"
					+ " é inválido!");
		}
		System.out.println("Fim do Exercicio");
	}
}