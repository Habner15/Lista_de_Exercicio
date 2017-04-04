package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio06 { // Faça um Programa que leia três números e mostre-os
							// em ordem decrescente.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra a ordem decrecente dos números: ");

		System.out.println("Digite um número e aperte enter: ");
		int a = teclado.nextInt();

		System.out.println("Digite um número e aperte enter: ");
		int b = teclado.nextInt();

		System.out.println("Digite um número e aperte enter: ");
		int c = teclado.nextInt();

		System.out
				.println("Em ordem decrecente, os números seguem essa ordem: ");

		if (a == b && b == c) {
			System.out.println("Todos os números digitados são iguais: " + c);

		} else if (a == b && b < c) {
			System.out.println("O Primeiro: " + c);
			System.out.println("O Segundo : " + b);
			System.out.println("O Terceiro: " + a);

		} else if (a == c && c < b) {
			System.out.println("O Primeiro: " + b);
			System.out.println("O Segundo : " + c);
			System.out.println("O Terceiro: " + a);

		} else if (b == c && c > a) {
			System.out.println("O Primeiro: " + b);
			System.out.println("O Segundo : " + c);
			System.out.println("O Terceiro: " + a);

		} else if (b == c && c < a) {
			System.out.println("O Primeiro: " + a);
			System.out.println("O Segundo : " + c);
			System.out.println("O Terceiro: " + b);

		} else if (a == c && c > b) {
			System.out.println("O Primeiro: " + a);
			System.out.println("O Segundo : " + c);
			System.out.println("O Terceiro: " + b);

		} else if (a == b && b > c) {
			System.out.println("O Primeiro: " + a);
			System.out.println("O Segundo : " + b);
			System.out.println("O Terceiro: " + c);

		} else if (a < b && b < c) {
			System.out.println("O Primeiro: " + c);
			System.out.println("O Segundo : " + b);
			System.out.println("O Terceiro: " + a);

		} else if (a < c && c < b) {
			System.out.println("O Primeiro: " + b);
			System.out.println("O Segundo : " + c);
			System.out.println("O Terceiro: " + a);

		} else if (b < a && a < c) {
			System.out.println("O Primeiro: " + c);
			System.out.println("O Segundo : " + a);
			System.out.println("O Terceiro: " + b);

		} else if (b < c && c < a) {
			System.out.println("O Primeiro: " + a);
			System.out.println("O Segundo : " + c);
			System.out.println("O Terceiro: " + b);

		} else if (c < a && a < b) {
			System.out.println("O Primeiro: " + b);
			System.out.println("O Segundo : " + a);
			System.out.println("O Terceiro: " + c);

		} else if (c < b && b < a) {
			System.out.println("O Primeiro: " + a);
			System.out.println("O Segundo : " + b);
			System.out.println("O Terceiro: " + c);

		} else {
			System.out.println("O Digito é inválido!");

		}
		System.out.println("Fim do Exercicio");
	}
}