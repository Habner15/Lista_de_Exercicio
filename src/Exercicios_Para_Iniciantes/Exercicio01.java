package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio01 { // Fa�a um Programa que pe�a dois n�meros e imprima o
							// maior deles.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		System.out.println("Descubra qual � o maior n�mero:");

		System.out.println("Digite o primeiro n�mero e tecle enter:");
		teclado = new Scanner(System.in);
		int valor1 = teclado.nextInt();

		System.out.println("Digite o segundo n�mero e tecle enter:");
		int valor2 = teclado.nextInt();

		if (valor1 > valor2) {
			System.out.println("O maior valor � o primeio: n�mero " + valor1);

		} else if (valor1 < valor2) {
			System.out.println("O maior valor � o segundo: n�mero " + valor2);

		} else {
			System.out.printf(
					"Os dois valores digitados s�o iguais: n�mero %d\n",valor1 = valor2);

		}
		System.out.println("Fim do Exercicio");
	}
}