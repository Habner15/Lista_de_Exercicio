package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio12 { // Fa�a um Programa que pe�a um n�mero e informe se o
							// n�mero � inteiro ou decimal. Dica: utilize uma
							// fun��o de arredondamento.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra se o n�mero � inteiro ou decimal:");

		System.out.print("Digite um n�mero e confirme: ");
		double num1 = teclado.nextDouble();
		int num2 = (int) num1;

		if (num1 - num2 == 0) {
			System.out.println("O valor � inteiro: n�mero " + num1);

		} else {
			System.out.println("O valor � decimal: n�mero " + num1);
		}
	}
}