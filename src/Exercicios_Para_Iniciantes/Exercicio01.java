package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio01 { // Faça um Programa que peça dois números e imprima o
							// maior deles.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		System.out.println("Descubra qual é o maior número:");

		System.out.println("Digite o primeiro número e tecle enter:");
		teclado = new Scanner(System.in);
		int valor1 = teclado.nextInt();

		System.out.println("Digite o segundo número e tecle enter:");
		int valor2 = teclado.nextInt();

		if (valor1 > valor2) {
			System.out.println("O maior valor é o primeio: número " + valor1);

		} else if (valor1 < valor2) {
			System.out.println("O maior valor é o segundo: número " + valor2);

		} else {
			System.out.printf(
					"Os dois valores digitados são iguais: número %d\n",valor1 = valor2);

		}
		System.out.println("Fim do Exercicio");
	}
}