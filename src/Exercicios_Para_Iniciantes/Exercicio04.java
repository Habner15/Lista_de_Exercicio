package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio04 { // Faça um Programa que peça para entrar com um ano
							// com 4 dígitos e determine se o mesmo é ou não
							// bissexto.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		System.out.println("Descubra se o ano digitado é ou não bissexto:");

		System.out.println("Digite um ano com 4 dígitos e aperte enter:");
		teclado = new Scanner(System.in);
		int ano = teclado.nextInt();

		if (ano < 1000 || ano > 9999) {
			System.out.println("O exercicio pede um número de 4 digitos.\n"
					+ "Este número não corresponde! " + ano + " é inválido!");
			System.exit(0);

		} else if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O Ano digitado é Bissexto: " + ano);
			// Anos como 1100, 1300, 1400, 1500, 1700, 1800, 1900 não são
			// bissextos!

		} else {
			System.out.println("O Ano digitado não é Bissexto: " + ano);

		}
		System.out.println("Fim do Exercicio");
	}
}