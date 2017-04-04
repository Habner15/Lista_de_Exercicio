package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio08 { // Faça um Programa que leia três números e mostre o
							// maior deles.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra qual é o maior valor:");

		System.out.println("Digite o primeiro número e tecle enter:");
		int x = teclado.nextInt();

		System.out.println("Digite o segundo número e tecle enter:");
		int y = teclado.nextInt();

		System.out.println("Digite o terceiro número e tecle enter:");
		int z = teclado.nextInt();

		if (x > y && y > z) {
			System.out.println("O maior valor é: " + x);

		} else if (x > z && z > y) {
			System.out.println("O maior valor é: " + x);

		} else if (y > x && x > z) {
			System.out.println("O maior valor é: " + y);

		} else if (y > z && z > x) {
			System.out.println("O maior valor é: " + y);

		} else if (z > x && x > y) {
			System.out.println("O maior valor é: " + z);

		} else if (z > y && y > x) {
			System.out.println("O maior valor é: " + z);

		} else if (x == y && y < z) {
			System.out.println("O maior valor é: " + z);

		} else if (x == z && z < y) {
			System.out.println("O maior valor é: " + y);

		} else if (y == z && z > x) {
			System.out.println("O maior valor é: " + y);

		} else if (y == z && z < x) {
			System.out.println("O maior valor é: " + x);

		} else if (x == z && z > y) {
			System.out.println("O maior valor é: " + x);

		} else if (x == y && y > z) {
			System.out.println("O maior valor é: " + x);

		} else if (x == y && y == z) {
			System.out.println("O maior valor é: " + x);

		} else {
			System.out.println("O Digito é inválido!");
		}
		System.out.println("Fim do Exercicio");
	}
}