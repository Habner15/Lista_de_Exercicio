package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio11 { // Fa�a um Programa que pergunte em que turno voc�
							// estuda. Pe�a para digitar M- matutino ou V-
							// Vespertino ou N- Noturno. Imprima a mensagem
							// "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou
							// "Valor Inv�lido!", conforme o caso.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);
		String Turno;

		System.out.println("Em que turno voc� estuda? \n"
				+ "Digite M - matutino, ou V - Vespertino, ou N - Noturno e confirme:");
		{
			Turno = teclado.next();

			if (Turno.equalsIgnoreCase("M")) {
				System.out.println("Voc� estuda no per�odo Matutino:");
				System.out.println("Bom dia!");

			} else if (Turno.equalsIgnoreCase("V")) {
				System.out.println("Voc� estuda no per�odo Vespertino:");
				System.out.println("Boa tarde!");

			} else if (Turno.equalsIgnoreCase("N")) {
				System.out.println("Voc� estuda no per�odo Noturno:");
				System.out.println("Boa noite!");

			} else {
				System.out.println("O exercicio pede M, V ou N.\n"
						+ "Digito n�o correspondente! " + "'" + Turno + "'"
						+ " � inv�lido!");
			}
			System.out.println("Fim do Exercicio");
		}
	}
}
