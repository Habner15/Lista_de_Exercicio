package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio02 { // Faça um Programa que peça um valor e mostre se o
							// valor é positivo ou negativo.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		System.out.println("Descubra se o valor é positivo ou negativo:");

		System.out.println("Digite um valor e aperte enter:");
		teclado = new Scanner(System.in);
		int valor = teclado.nextInt();

		if (valor > 0) {
			System.out.println("O valor digitado é positivo: número " + valor);

		} else if (valor < 0) {
			System.out.println("O valor digitado é negativo: número " + valor);

		} else {
			System.out.println("O valor digitado é: " + valor);
		}
		System.out.println("Fim do Exercicio");
	}
}
