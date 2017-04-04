package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio18 { /* Faça um Programa que peça os 3 lados de um
							 * triângulo. O programa deverá informar se os
							 * valores podem ser um triângulo. Indique, caso os
							 * lados formem um triângulo, se o mesmo é:
							 * equilátero, isósceles ou escaleno. Dicas: Três
							 * lados formam um triângulo quando a soma de
							 * quaisquer dois lados for maior que o terceiro;
							 * Triângulo Equilátero: três lados iguais;
							 * Triângulo Isósceles: quaisquer dois lados iguais;
							 * Triângulo Escaleno: três lados diferentes;*/
	private static Scanner entrada;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		System.out.println("Descubra que tipo de triângulo é:");

		entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro valor do triângulo e tecle enter:");
		double lado1 = entrada.nextDouble();

		System.out.println("Digite o segundo valor do triângulo e tecle enter:");
		double lado2 = entrada.nextDouble();

		System.out.println("Digite o terceiro valor do triângulo e tecle enter:");
		double lado3 = entrada.nextDouble();

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("O triângulo tem os três lados iguais.\n"
					+ "Então o Triângulo é Equilátero! ");

		} else if (lado1 == lado2 && lado2 < lado3) {
			System.out.println("O triângulo tem dois lados iguais.\n"
					+ "Então o Triângulo é Isósceles! ");

		} else if (lado1 == lado3 && lado3 < lado2) {
			System.out.println("O triângulo tem dois lados iguais.\n"
					+ "Então o Triângulo é Isósceles! ");

		} else if (lado2 == lado3 && lado3 > lado1) {
			System.out.println("O triângulo tem dois lados iguais.\n"
					+ "Então o Triângulo é Isósceles! ");

		} else if (lado2 == lado3 && lado3 < lado1) {
			System.out.println("O triângulo tem dois lados iguais.\n"
					+ "Então o Triângulo é Isósceles! ");

		} else if (lado1 == lado3 && lado3 > lado2) {
			System.out.println("O triângulo tem dois lados iguais.\n"
					+ "Então o Triângulo é Isósceles! ");

		} else if (lado1 == lado2 && lado2 > lado3) {
			System.out.println("O triângulo tem dois lados iguais.\n"
					+ "Então o Triângulo é Isósceles! ");

		} else if (lado1 < lado2 && lado2 < lado3) {
			System.out.println("O triângulo tem os três lados diferentes.\n"
					+ "Então o Triângulo é Escaleno! ");

		} else if (lado1 < lado3 && lado3 < lado2) {
			System.out.println("O triângulo tem os três lados diferentes.\n"
					+ "Então o Triângulo é Escaleno! ");

		} else if (lado2 < lado1 && lado1 < lado3) {
			System.out.println("O triângulo tem os três lados diferentes.\n"
					+ "Então o Triângulo é Escaleno! ");

		} else if (lado2 < lado3 && lado3 < lado1) {
			System.out.println("O triângulo tem os três lados diferentes.\n"
					+ "Então o Triângulo é Escaleno! ");

		} else if (lado3 < lado1 && lado1 < lado2) {
			System.out.println("O triângulo tem os três lados diferentes.\n"
					+ "Então o Triângulo é Escaleno! ");

		} else if (lado3 < lado2 && lado2 < lado1) {
			System.out.println("O triângulo tem os três lados diferentes.\n"
					+ "Então o Triângulo é Escaleno! ");

		}
		System.out.println("Fim do Exercicio");
	}
}