package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio15 { // Fa�a um Programa que tendo como dados de entrada o
							// pre�o de custo de um produto e um c�digo de
							// origem, emita o pre�o junto de sua proced�ncia.
							// Caso o c�digo n�o seja nenhum dos especificados,
							// o produto deve ser classificado como importado.
							// C�digo de origem: 1 - Sul, 2 - Norte 3 - Leste, 4
							// - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste.
	private static Scanner tecla;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		tecla = new Scanner(System.in);

		System.out.println("Descubra qual � a origem do produto:");

		System.out.println("Digite um n�mero correspondente a origem e tecle enter: ");
		int origem = tecla.nextInt();

		if (origem == 1) {
			System.out.println("O produto tem como origem o Sul!");

		} else if (origem == 2) {
			System.out.println("O produto tem como origem o Norte!");

		} else if (origem == 3) {
			System.out.println("O produto tem como origem o Leste!");

		} else if (origem == 4) {
			System.out.println("O produto tem como origem o Oeste!");

		} else if (origem == 5 || origem == 6) {
			System.out.println("O produto tem como origem o Nordeste!");

		} else if (origem == 7 || origem == 8) {
			System.out.println("O produto tem como origem o Centro-Oeste!");

		} else {
			System.out.println("O produto � importado");

		}
		System.out.println("Fim do Exercicio");
	}
}
