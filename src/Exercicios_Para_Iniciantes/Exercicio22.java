package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio22 { // Faça um Programa que leia um número inteiro menor
							// que 1000 e imprima a quantidade de centenas,
							// dezenas e unidades do mesmo.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		System.out.println("Descubra quantas centenas, dezenas e unidades tem um número! ");

		teclado = new Scanner(System.in);

		System.out.print("Digite um número até 999 e tecle enter: ");
		int num = teclado.nextInt();
		int centena = 0, dezena = 0, unidade = 0;

		if (num > 999) {
			System.out.println("Este número é inválido pois é maior que 999, \n"
							+ num + " não é válido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}
		
		if (num >= 100) {
			centena = num / 100;
			num = num % 100;
		}
		
		if (num >= 10) {
			dezena = num / 10;
			num = num % 10;
		}
		
		if (num >= 1) {
			unidade = num / 1;
			System.out.println("O número digitado tem:");
			System.out.println(centena + " Centenas.");
			System.out.println(dezena + " Dezenas.");
			System.out.println(unidade + " Unidades.");
		}
		
		System.out.println("Fim do Exercicio");
	}
}