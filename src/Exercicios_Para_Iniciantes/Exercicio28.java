package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio28 { // Escrever um algoritmo que l� 10 valores, um de
							// cada vez, e conta quantos deles est�o no
							// intervalo [10,20] e quantos deles est�o fora do
							// intervalo, escrevendo estas informa��es.
	private static Scanner teclado;
	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		System.out.println("Descubra qual est� no intervalo entre 10 e 20:");
		
		int contador = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o "+ i +"� n�mero e tecle enter: \nTotal Atual: "+ contador );
			teclado = new Scanner(System.in);
			int valor1 = teclado.nextInt();
			if(valor1 >= 10 && valor1 <= 20){
				contador++; 
			}
		}
		System.out.println("Fim do Exercicio");
	}
}