package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio12 { // Faça um Programa que peça um número e informe se o
							// número é inteiro ou decimal. Dica: utilize uma
							// função de arredondamento.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra se o número é inteiro ou decimal:");

		System.out.print("Digite um número e confirme: ");
		double num1 = teclado.nextDouble();
		int num2 = (int) num1;

		if (num1 - num2 == 0) {
			System.out.println("O valor é inteiro: número " + num1);

		} else {
			System.out.println("O valor é decimal: número " + num1);
		}
	}
}