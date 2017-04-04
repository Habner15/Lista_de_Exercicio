package Exercicios_Para_Iniciantes;

public class Exercicio26 { // Escrever um algoritmo que gera e escreve os números
							// ímpares entre 100 e 200.
	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		System.out.println("Os números impares de 100 a 200 são:");

		for (int impar = 100; impar < 200; impar++) {
			if (impar % 2 != 0) {
				System.out.println("número: " + impar);
			}
		}
		System.out.println("Fim do Exercicio");
	}
}
