package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio03 { // Fa�a um Programa que verifique se uma letra
							// digitada � "F" ou "M". Conforme a letra escrever:
							// F - Feminino, M - Masculino, Sexo Inv�lido.
	private static Scanner entrada;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		String pessoa;

		System.out.println("Descubra qual � o sexo:");

		System.out.println("Digite M ou F:");
		entrada = new Scanner(System.in);
		pessoa = entrada.next();

		if (pessoa.equalsIgnoreCase("M")) {
			System.out.println("A letra digitada corresponde a 'Masculino!'");

		} else if (pessoa.equalsIgnoreCase("F")) {
			System.out.println("A letra digitada corresponde a 'Feminino!'");

		} else {
			System.out.println("O exercicio pede M ou F.\n"
					+ "Digito n�o correspondente! " + "'" + pessoa + "'"
					+ " � inv�lido!");
		}
		System.out.println("Fim do Exercicio");
	}
}
