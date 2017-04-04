package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio14 { // Faça um Programa que leia um número e exiba o dia
							// correspondente da semana. (1- Domingo, 2-
							// Segunda, etc.), se digitar outro valor deve
							// aparecer valor inválido.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra qual o dia da semana:");

		System.out.println("Digite um um número de 1 a 7 e tecle enter:");
		int Dia = teclado.nextInt();

		if (Dia == 1) {
			System.out.println("O número digitado corresponde a Domingo!");

		} else if (Dia == 2) {
			System.out.println("O número digitado corresponde a Segunda-feira!");

		} else if (Dia == 3) {
			System.out.println("O número digitado corresponde a Terça-feira!");

		} else if (Dia == 4) {
			System.out.println("O número digitado corresponde a Quarta-feira!");

		} else if (Dia == 5) {
			System.out.println("O número digitado corresponde a Quinta-feira!");

		} else if (Dia == 6) {
			System.out.println("O número digitado corresponde a Sexta-feira!");

		} else if (Dia == 7) {
			System.out.println("O número digitado corresponde a Sábado!");

		} else {
			System.out.println("Número Invalido: Digite um número de 1 ao 7.\n"
					+ "Esse número é " + Dia
					+ " ele não corresponde a solicitação:");
		}
		System.out.println("Fim do Exercicio");
	}
}