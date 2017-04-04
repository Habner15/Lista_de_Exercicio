package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio04 { // Fa�a um Programa que pe�a para entrar com um ano
							// com 4 d�gitos e determine se o mesmo � ou n�o
							// bissexto.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		System.out.println("Descubra se o ano digitado � ou n�o bissexto:");

		System.out.println("Digite um ano com 4 d�gitos e aperte enter:");
		teclado = new Scanner(System.in);
		int ano = teclado.nextInt();

		if (ano < 1000 || ano > 9999) {
			System.out.println("O exercicio pede um n�mero de 4 digitos.\n"
					+ "Este n�mero n�o corresponde! " + ano + " � inv�lido!");
			System.exit(0);

		} else if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O Ano digitado � Bissexto: " + ano);
			// Anos como 1100, 1300, 1400, 1500, 1700, 1800, 1900 n�o s�o
			// bissextos!

		} else {
			System.out.println("O Ano digitado n�o � Bissexto: " + ano);

		}
		System.out.println("Fim do Exercicio");
	}
}