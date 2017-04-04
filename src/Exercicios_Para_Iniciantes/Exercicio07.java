package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio07 { /* Faça um programa para a leitura de duas notas
						 * parciais de um aluno. O programa deve calcular a
						 * média alcançada por aluno e apresentar: A mensagem
						 * "Aprovado", se a média alcançada for maior ou igual a
						 * sete; A mensagem "Reprovado", se a média for menor do
						 * que sete; A mensagem "Aprovado com Distinção", se a
						 * média for igual a dez.*/
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra a sua média semestral! ");

		System.out.println("Digite a sua primeira nota aperte enter:");
		double nota1 = teclado.nextDouble();

		if (nota1 > 10 || nota1 < 0) {
			System.out
					.println("Esta nota é inválida pois a nota vai de 0.0 ao 10.0, e "
							+ nota1 + " não é válido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}

		System.out.println("Digite a sua segunda nota aperte enter:");
		double nota2 = teclado.nextDouble();

		if (nota2 > 10 || nota2 < 0) {
			System.out
					.println("Esta nota é inválida pois a nota vai de 0.0 ao 10.0, e "
							+ nota2 + " não é válido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}

		float nota = (float) ((nota1 + nota2) / 2);

		if (nota >= 7 && nota < 10) {
			System.out.println("Você está aprovado parabéns: média " + nota);

		} else if (nota == 10) {
			System.out.println("Você é um aluno nota 10 aprovado: média "
					+ nota);
			System.out.println("Continue sendo assim parabéns!");

		} else {
			System.out.println("você infelismente está reprovado: média "
					+ nota);
		}
		System.out.println("Fim do Exercicio");
	}
}