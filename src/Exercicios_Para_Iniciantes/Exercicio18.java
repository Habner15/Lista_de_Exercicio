package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio18 { /* Fa�a um Programa que pe�a os 3 lados de um
							 * tri�ngulo. O programa dever� informar se os
							 * valores podem ser um tri�ngulo. Indique, caso os
							 * lados formem um tri�ngulo, se o mesmo �:
							 * equil�tero, is�sceles ou escaleno. Dicas: Tr�s
							 * lados formam um tri�ngulo quando a soma de
							 * quaisquer dois lados for maior que o terceiro;
							 * Tri�ngulo Equil�tero: tr�s lados iguais;
							 * Tri�ngulo Is�sceles: quaisquer dois lados iguais;
							 * Tri�ngulo Escaleno: tr�s lados diferentes;*/
	private static Scanner entrada;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		System.out.println("Descubra que tipo de tri�ngulo �:");

		entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro valor do tri�ngulo e tecle enter:");
		double lado1 = entrada.nextDouble();

		System.out.println("Digite o segundo valor do tri�ngulo e tecle enter:");
		double lado2 = entrada.nextDouble();

		System.out.println("Digite o terceiro valor do tri�ngulo e tecle enter:");
		double lado3 = entrada.nextDouble();

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("O tri�ngulo tem os tr�s lados iguais.\n"
					+ "Ent�o o Tri�ngulo � Equil�tero! ");

		} else if (lado1 == lado2 && lado2 < lado3) {
			System.out.println("O tri�ngulo tem dois lados iguais.\n"
					+ "Ent�o o Tri�ngulo � Is�sceles! ");

		} else if (lado1 == lado3 && lado3 < lado2) {
			System.out.println("O tri�ngulo tem dois lados iguais.\n"
					+ "Ent�o o Tri�ngulo � Is�sceles! ");

		} else if (lado2 == lado3 && lado3 > lado1) {
			System.out.println("O tri�ngulo tem dois lados iguais.\n"
					+ "Ent�o o Tri�ngulo � Is�sceles! ");

		} else if (lado2 == lado3 && lado3 < lado1) {
			System.out.println("O tri�ngulo tem dois lados iguais.\n"
					+ "Ent�o o Tri�ngulo � Is�sceles! ");

		} else if (lado1 == lado3 && lado3 > lado2) {
			System.out.println("O tri�ngulo tem dois lados iguais.\n"
					+ "Ent�o o Tri�ngulo � Is�sceles! ");

		} else if (lado1 == lado2 && lado2 > lado3) {
			System.out.println("O tri�ngulo tem dois lados iguais.\n"
					+ "Ent�o o Tri�ngulo � Is�sceles! ");

		} else if (lado1 < lado2 && lado2 < lado3) {
			System.out.println("O tri�ngulo tem os tr�s lados diferentes.\n"
					+ "Ent�o o Tri�ngulo � Escaleno! ");

		} else if (lado1 < lado3 && lado3 < lado2) {
			System.out.println("O tri�ngulo tem os tr�s lados diferentes.\n"
					+ "Ent�o o Tri�ngulo � Escaleno! ");

		} else if (lado2 < lado1 && lado1 < lado3) {
			System.out.println("O tri�ngulo tem os tr�s lados diferentes.\n"
					+ "Ent�o o Tri�ngulo � Escaleno! ");

		} else if (lado2 < lado3 && lado3 < lado1) {
			System.out.println("O tri�ngulo tem os tr�s lados diferentes.\n"
					+ "Ent�o o Tri�ngulo � Escaleno! ");

		} else if (lado3 < lado1 && lado1 < lado2) {
			System.out.println("O tri�ngulo tem os tr�s lados diferentes.\n"
					+ "Ent�o o Tri�ngulo � Escaleno! ");

		} else if (lado3 < lado2 && lado2 < lado1) {
			System.out.println("O tri�ngulo tem os tr�s lados diferentes.\n"
					+ "Ent�o o Tri�ngulo � Escaleno! ");

		}
		System.out.println("Fim do Exercicio");
	}
}