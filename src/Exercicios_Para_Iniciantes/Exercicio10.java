package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio10 { // Fa�a um programa que pergunte o pre�o de tr�s
							// produtos e informe qual produto voc� deve
							// comprar, sabendo que a decis�o � sempre pelo mais
							// barato.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra qual produto voc� deve comprar:");

		System.out.println("Digite o pre�o do primeiro produto e tecle enter:");
		double produto1 = teclado.nextDouble();

		System.out.println("Digite o pre�o do segundo produto e tecle enter:");
		double produto2 = teclado.nextDouble();

		System.out.println("Digite o pre�o do terceiro produto e tecle enter:");
		double produto3 = teclado.nextDouble();

		if (produto1 < produto2 && produto2 < produto3) {
			System.out.println("O produto mais barato � o primeiro: Pre�o R$" + produto1);

		} else if (produto1 < produto3 && produto3 < produto2) {
			System.out.println("O produto mais barato � o primeiro: Pre�o R$" + produto1);

		} else if (produto2 < produto1 && produto1 < produto3) {
			System.out.println("O produto mais barato � o segundo: Pre�o R$" + produto2);

		} else if (produto2 < produto3 && produto3 < produto1) {
			System.out.println("O produto mais barato � o segundo: Pre�o R$" + produto2);

		} else if (produto3 < produto1 && produto1 < produto2) {
			System.out.println("O produto mais barato � o terceiro: Pre�o R$" + produto3);

		} else if (produto3 < produto2 && produto2 < produto1) {
			System.out.println("O produto mais barato � o terceiro: Pre�o R$" + produto3);

		} else if (produto1 == produto2 && produto2 < produto3) {
			System.out.println("O produto mais barato � o 1� e o 2�: Pre�o R$" + produto1);

		} else if (produto1 == produto3 && produto3 < produto2) {
			System.out.println("O produto mais barato � o 1� e o 3�: Pre�o R$" + produto1);

		} else if (produto2 == produto3 && produto3 > produto1) {
			System.out.println("O produto mais barato � o primeiro: Pre�o R$" + produto1);

		} else if (produto2 == produto3 && produto3 < produto1) {
			System.out.println("O produto mais barato � o 2� e o 3�: Pre�o R$" + produto2);

		} else if (produto1 == produto3 && produto3 > produto2) {
			System.out.println("O produto mais barato � o segundo: Pre�o R$" + produto2);

		} else if (produto1 == produto2 && produto2 > produto3) {
			System.out.println("O produto mais barato � o terceiro: Pre�o R$" + produto3);

		} else if (produto1 == produto2 && produto2 == produto3) {
			System.out.println("Os tr�s produtos possuem o mesmo valor: Pre�o R$" + produto1);

		}
		System.out.println("Fim do Exercicio");
	}
}