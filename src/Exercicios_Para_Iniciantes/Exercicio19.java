package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio19 {/* Fa�a um programa que calcule as ra�zes de uma equa��o
						 * do segundo grau, na forma ax2 + bx + c. O programa
						 * dever� pedir os valores de a, b e c e fazer as
						 * consist�ncias, informando ao usu�rio nas seguintes
						 * situa��es: Se o usu�rio informar o valor de A igual a
						 * zero, a equa��o n�o � do segundo grau e o programa
						 * n�o deve fazer pedir os demais valores, sendo
						 * encerrado; Se o delta calculado for negativo, a
						 * equa��o n�o possui raizes reais. Informe ao usu�rio e
						 * encerre o programa; Se o delta calculado for igual a
						 * zero a equa��o possui apenas uma raiz real; informea
						 * ao usu�rio; Se o delta for positivo, a equa��o possui
						 * duas raiz reais; informe-as ao usu�rio;*/
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra os valores da equa��o do 2o grau: ax� + bx + cx = 0");

		float a, b, c, delta = 0;

		System.out.print("Entre com o valor de a: ");
		a = teclado.nextFloat();

		if (a == 0) {
			System.out.println("Coeficiente 'a' inv�lido. N�o � uma equa��o do 2o grau");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}
		System.out.print("Entre com o valor de b: ");
		b = teclado.nextFloat();

		System.out.print("Entre com o valor de c: ");
		c = teclado.nextFloat();

		delta = (b * b) - 4 * a * c;
		if (delta < 0) {

			System.out.println("A equa��o n�o possui raizes reais: " + delta);
			System.out.println("Fim do exerc�cio");
			System.exit(0);

		} else if (delta == 0) {

			double x = (-b + Math.sqrt(delta)) / 2 * a;

			System.out.println("A raiz da equa��o �: " + x);

		} else {
			double x1 = (-b + Math.sqrt(delta)) / 2 * a;
			double x2 = (-b - Math.sqrt(delta)) / 2 * a;

			System.out.println("A equa��o possui raizes reais: " + x1 + " e " + x2);
			System.out.println("Fim do exerc�cio");
		}
	}
}
