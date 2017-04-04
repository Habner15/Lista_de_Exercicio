package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio29 { // Escrever um algoritmo que l� 5 pares de valores a,
							// b, todos inteiros e positivos, um par de cada
							// vez, informe  o valor atual de cada um deles e ao
							// final se A > B escreve que A tem mais valores que
							// B, se n�o B tem mais valores que A.
	private static Scanner teclado;

	public static void main(String[] args) {
		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra os valores pares:");

		int contador1 = 0;
		int contador2 = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite o " + i
					+ "� numero par, para A e tecle enter: Total Atual "
					+ contador1);
			int par1 = teclado.nextInt();
			if (par1 % 2 != 0) {
				System.out.println("Este numero n�o � Par");
			} else if (par1 < 0) {
				System.out.println("Este numero n�o � Positivo");
			} else {
				contador1++;
			}

			System.out.println("Digite o " + i
					+ "� numero par, para B e tecle enter: Total Atual "
					+ contador2);
			int par2 = teclado.nextInt();
			if (par2 % 2 != 0) {
				System.out.println("Este numero n�o � Par");
			} else if (par2 < 0) {
				System.out.println("Este numero n�o � Positivo");
			} else {
				contador2++;
			}
		}
		if (contador1 > contador2) {
			System.out.println("\nO A possue mais Pares B");

		} else if (contador1 < contador2) {
			System.out.println("\nO B possue mais Pares A");
		} else {
			System.out.println("\nO A e B possue a mesma contidade de Pares");

		}
		System.out.println("Fim do Exercicio");
	}
}
