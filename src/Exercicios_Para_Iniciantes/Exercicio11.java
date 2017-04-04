package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio11 { // Faça um Programa que pergunte em que turno você
							// estuda. Peça para digitar M- matutino ou V-
							// Vespertino ou N- Noturno. Imprima a mensagem
							// "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou
							// "Valor Inválido!", conforme o caso.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);
		String Turno;

		System.out.println("Em que turno você estuda? \n"
				+ "Digite M - matutino, ou V - Vespertino, ou N - Noturno e confirme:");
		{
			Turno = teclado.next();

			if (Turno.equalsIgnoreCase("M")) {
				System.out.println("Você estuda no período Matutino:");
				System.out.println("Bom dia!");

			} else if (Turno.equalsIgnoreCase("V")) {
				System.out.println("Você estuda no período Vespertino:");
				System.out.println("Boa tarde!");

			} else if (Turno.equalsIgnoreCase("N")) {
				System.out.println("Você estuda no período Noturno:");
				System.out.println("Boa noite!");

			} else {
				System.out.println("O exercicio pede M, V ou N.\n"
						+ "Digito não correspondente! " + "'" + Turno + "'"
						+ " é inválido!");
			}
			System.out.println("Fim do Exercicio");
		}
	}
}
