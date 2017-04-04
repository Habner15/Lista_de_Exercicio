package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio10 { // Faça um programa que pergunte o preço de três
							// produtos e informe qual produto você deve
							// comprar, sabendo que a decisão é sempre pelo mais
							// barato.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra qual produto você deve comprar:");

		System.out.println("Digite o preço do primeiro produto e tecle enter:");
		double produto1 = teclado.nextDouble();

		System.out.println("Digite o preço do segundo produto e tecle enter:");
		double produto2 = teclado.nextDouble();

		System.out.println("Digite o preço do terceiro produto e tecle enter:");
		double produto3 = teclado.nextDouble();

		if (produto1 < produto2 && produto2 < produto3) {
			System.out.println("O produto mais barato é o primeiro: Preço R$" + produto1);

		} else if (produto1 < produto3 && produto3 < produto2) {
			System.out.println("O produto mais barato é o primeiro: Preço R$" + produto1);

		} else if (produto2 < produto1 && produto1 < produto3) {
			System.out.println("O produto mais barato é o segundo: Preço R$" + produto2);

		} else if (produto2 < produto3 && produto3 < produto1) {
			System.out.println("O produto mais barato é o segundo: Preço R$" + produto2);

		} else if (produto3 < produto1 && produto1 < produto2) {
			System.out.println("O produto mais barato é o terceiro: Preço R$" + produto3);

		} else if (produto3 < produto2 && produto2 < produto1) {
			System.out.println("O produto mais barato é o terceiro: Preço R$" + produto3);

		} else if (produto1 == produto2 && produto2 < produto3) {
			System.out.println("O produto mais barato é o 1º e o 2º: Preço R$" + produto1);

		} else if (produto1 == produto3 && produto3 < produto2) {
			System.out.println("O produto mais barato é o 1º e o 3º: Preço R$" + produto1);

		} else if (produto2 == produto3 && produto3 > produto1) {
			System.out.println("O produto mais barato é o primeiro: Preço R$" + produto1);

		} else if (produto2 == produto3 && produto3 < produto1) {
			System.out.println("O produto mais barato é o 2º e o 3º: Preço R$" + produto2);

		} else if (produto1 == produto3 && produto3 > produto2) {
			System.out.println("O produto mais barato é o segundo: Preço R$" + produto2);

		} else if (produto1 == produto2 && produto2 > produto3) {
			System.out.println("O produto mais barato é o terceiro: Preço R$" + produto3);

		} else if (produto1 == produto2 && produto2 == produto3) {
			System.out.println("Os três produtos possuem o mesmo valor: Preço R$" + produto1);

		}
		System.out.println("Fim do Exercicio");
	}
}