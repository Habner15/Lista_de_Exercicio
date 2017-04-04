package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio23 { // Faça um Programa para um caixa eletrônico. O
							// programa deverá perguntar ao usuário a valor do
							// saque e depois informar quantas notas de cada
							// valor serão fornecidas. As notas disponíveis
							// serão as de 1, 5, 10, 50 e 100 reais. O valor
							// mínimo é de 10 reais e o máximo de 600 reais. O
							// programa não deve se preocupar com a quantidade
							// de notas existentes na máquina.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.print("Digite o valor do saque e aperte enter: ");
		int valor = teclado.nextInt();
		int cem = 0, cinquenta = 0, dez = 0, cinco = 0, um = 0;

		if (valor < 10 || valor > 600) {
			System.out.println("Não é possivel efetuar um saque maior que 600 "
					+ "é menor que 10, \n" + valor + " não é válido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);

		}
		if (valor >= 100) {
			cem = valor / 100;
			valor = valor % 100;
		}
		
		if (valor >= 50) {
			cinquenta = valor / 50;
			valor = valor % 50;
		}
		
		if (valor >= 10) {
			dez = valor / 10;
			valor = valor % 10;
		}
		
		if (valor >= 5) {
			cinco = valor / 5;
			valor = valor % 5;
		}
		
		if (valor >= 1) {
			um = valor / 1;
		}	
		System.out.println("O valor do saque pode ser expresso em:");
		System.out.println(cem + " notas de 100");
		System.out.println(cinquenta + " notas de 50");
		System.out.println(dez + " notas de 10");
		System.out.println(cinco + " notas de 5");
		System.out.println(um + " notas de 1");
		System.out.println("Fim do Exercicio");
	}
}