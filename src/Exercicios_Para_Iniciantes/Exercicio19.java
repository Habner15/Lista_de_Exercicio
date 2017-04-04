package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio19 {/* Faça um programa que calcule as raízes de uma equação
						 * do segundo grau, na forma ax2 + bx + c. O programa
						 * deverá pedir os valores de a, b e c e fazer as
						 * consistências, informando ao usuário nas seguintes
						 * situações: Se o usuário informar o valor de A igual a
						 * zero, a equação não é do segundo grau e o programa
						 * não deve fazer pedir os demais valores, sendo
						 * encerrado; Se o delta calculado for negativo, a
						 * equação não possui raizes reais. Informe ao usuário e
						 * encerre o programa; Se o delta calculado for igual a
						 * zero a equação possui apenas uma raiz real; informea
						 * ao usuário; Se o delta for positivo, a equação possui
						 * duas raiz reais; informe-as ao usuário;*/
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra os valores da equação do 2o grau: ax² + bx + cx = 0");

		float a, b, c, delta = 0;

		System.out.print("Entre com o valor de a: ");
		a = teclado.nextFloat();

		if (a == 0) {
			System.out.println("Coeficiente 'a' inválido. Não é uma equação do 2o grau");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}
		System.out.print("Entre com o valor de b: ");
		b = teclado.nextFloat();

		System.out.print("Entre com o valor de c: ");
		c = teclado.nextFloat();

		delta = (b * b) - 4 * a * c;
		if (delta < 0) {

			System.out.println("A equação não possui raizes reais: " + delta);
			System.out.println("Fim do exercício");
			System.exit(0);

		} else if (delta == 0) {

			double x = (-b + Math.sqrt(delta)) / 2 * a;

			System.out.println("A raiz da equação é: " + x);

		} else {
			double x1 = (-b + Math.sqrt(delta)) / 2 * a;
			double x2 = (-b - Math.sqrt(delta)) / 2 * a;

			System.out.println("A equação possui raizes reais: " + x1 + " e " + x2);
			System.out.println("Fim do exercício");
		}
	}
}
