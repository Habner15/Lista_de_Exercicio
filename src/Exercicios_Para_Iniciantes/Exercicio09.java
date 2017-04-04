package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio09 {// Faça um Programa que leia três números e mostre o
							// maior e o menor deles.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra qual é o maior e o menor valor:");

		System.out.println("Digite o primeiro número e aperte enter:");
		int valor1 = teclado.nextInt();

		System.out.println("Digite o segundo número e aperte enter:");
		int valor2 = teclado.nextInt();

		System.out.println("Digite o terceiro número e aperte enter:");
		int valor3 = teclado.nextInt();

		if (valor1 < valor2 && valor2 < valor3) {
			System.out.println("O maior valor é: " + valor3);
			System.out.println("O menor valor é: " + valor1);

		} else if (valor1 < valor3 && valor3 < valor2) {
			System.out.println("O maior valor é: " + valor2);
			System.out.println("O menor valor é: " + valor1);

		} else if (valor2 < valor1 && valor1 < valor3) {
			System.out.println("O maior valor é: " + valor3);
			System.out.println("O menor valor é: " + valor2);

		} else if (valor2 < valor3 && valor3 < valor1) {
			System.out.println("O maior valor é: " + valor1);
			System.out.println("O menor valor é: " + valor2);

		} else if (valor3 < valor1 && valor1 < valor2) {
			System.out.println("O maior valor é: " + valor2);
			System.out.println("O menor valor é: " + valor3);

		} else if (valor3 < valor2 && valor2 < valor1) {
			System.out.println("O maior valor é: " + valor1);
			System.out.println("O menor valor é: " + valor3);

		} else if (valor1 == valor2 && valor2 < valor3) {
			System.out.println("O maior valor é: " + valor3);
			System.out.println("O menor valor é: " + valor1);

		} else if (valor1 == valor3 && valor3 < valor2) {
			System.out.println("O maior valor é: " + valor2);
			System.out.println("O menor valor é: " + valor1);

		} else if (valor2 == valor3 && valor3 > valor1) {
			System.out.println("O maior valor é: " + valor2);
			System.out.println("O menor valor é: " + valor1);

		} else if (valor2 == valor3 && valor3 < valor1) {
			System.out.println("O maior valor é: " + valor1);
			System.out.println("O menor valor é: " + valor2);

		} else if (valor1 == valor3 && valor3 > valor2) {
			System.out.println("O maior valor é: " + valor1);
			System.out.println("O menor valor é: " + valor2);

		} else if (valor1 == valor2 && valor2 > valor3) {
			System.out.println("O maior valor é: " + valor1);
			System.out.println("O menor valor é: " + valor3);

		} else if (valor1 == valor2 && valor2 == valor3) {
			System.out.println("O maior valor é: " + valor1);

		}
		System.out.println("Fim do Exercicio");
	}
}