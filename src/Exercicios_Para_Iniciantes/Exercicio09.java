package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio09 {// Fa�a um Programa que leia tr�s n�meros e mostre o
							// maior e o menor deles.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra qual � o maior e o menor valor:");

		System.out.println("Digite o primeiro n�mero e aperte enter:");
		int valor1 = teclado.nextInt();

		System.out.println("Digite o segundo n�mero e aperte enter:");
		int valor2 = teclado.nextInt();

		System.out.println("Digite o terceiro n�mero e aperte enter:");
		int valor3 = teclado.nextInt();

		if (valor1 < valor2 && valor2 < valor3) {
			System.out.println("O maior valor �: " + valor3);
			System.out.println("O menor valor �: " + valor1);

		} else if (valor1 < valor3 && valor3 < valor2) {
			System.out.println("O maior valor �: " + valor2);
			System.out.println("O menor valor �: " + valor1);

		} else if (valor2 < valor1 && valor1 < valor3) {
			System.out.println("O maior valor �: " + valor3);
			System.out.println("O menor valor �: " + valor2);

		} else if (valor2 < valor3 && valor3 < valor1) {
			System.out.println("O maior valor �: " + valor1);
			System.out.println("O menor valor �: " + valor2);

		} else if (valor3 < valor1 && valor1 < valor2) {
			System.out.println("O maior valor �: " + valor2);
			System.out.println("O menor valor �: " + valor3);

		} else if (valor3 < valor2 && valor2 < valor1) {
			System.out.println("O maior valor �: " + valor1);
			System.out.println("O menor valor �: " + valor3);

		} else if (valor1 == valor2 && valor2 < valor3) {
			System.out.println("O maior valor �: " + valor3);
			System.out.println("O menor valor �: " + valor1);

		} else if (valor1 == valor3 && valor3 < valor2) {
			System.out.println("O maior valor �: " + valor2);
			System.out.println("O menor valor �: " + valor1);

		} else if (valor2 == valor3 && valor3 > valor1) {
			System.out.println("O maior valor �: " + valor2);
			System.out.println("O menor valor �: " + valor1);

		} else if (valor2 == valor3 && valor3 < valor1) {
			System.out.println("O maior valor �: " + valor1);
			System.out.println("O menor valor �: " + valor2);

		} else if (valor1 == valor3 && valor3 > valor2) {
			System.out.println("O maior valor �: " + valor1);
			System.out.println("O menor valor �: " + valor2);

		} else if (valor1 == valor2 && valor2 > valor3) {
			System.out.println("O maior valor �: " + valor1);
			System.out.println("O menor valor �: " + valor3);

		} else if (valor1 == valor2 && valor2 == valor3) {
			System.out.println("O maior valor �: " + valor1);

		}
		System.out.println("Fim do Exercicio");
	}
}