package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio30 { // Escreva um algoritmo que leia 20 valores e
							// encontre o maior e o menor deles. Mostre o
							// resultado.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");
		
		int numero = 0;
		int maior = 0;
		int menor = 0;
		
		System.out.println("Descubra qual maior valor entre 20 valores:");
		
		System.out.println("Digite o 1� n�mero e tecle enter:");
		teclado = new Scanner(System.in);
		numero = teclado.nextInt();

		maior = numero;
		menor = numero;
		
		
		for (int i = 2; i <= 20; i++) {
			System.out.println("Digite o " + i + "� n�mero e tecle enter:");
			numero = teclado.nextInt();
			if (numero > maior) {
				maior = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
		}
		System.out.println("O Maior Valor � :" + maior);
		System.out.println("O Menor Valor � :" + menor);
		System.out.println("Fim do Exercicio");
	}
}