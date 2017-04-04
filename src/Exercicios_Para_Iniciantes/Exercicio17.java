package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio17 { /* Faça um programa que lê as duas notas
							 * parciais obtidas por um aluno numa disciplina ao
							 * longo de um semestre, e calcule a sua média. A
							 * atribuição de conceitos obedece à tabela abaixo:
							 * Entre 9.0 e 10.0 A Entre 7.5 e 9.0 B Entre 6.0 e
							 * 7.5 C Entre 4.0 e 6.0 D
							 * Média de Aproveitamento Conceito Entre 4.0 e
							 * zero. O algoritmo deve mostrar na tela as notas,
							 * a média, o conceito correspondente e a mensagem
							 * “APROVADO” se o conceito for A, B ou C ou
							 * “REPROVADO” se o conceito for D ou E.*/
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra a sua média semestral! ");

		System.out.println("Digite a sua primeira nota e confirme no enter:");
		double nota1 = teclado.nextDouble();

		if (nota1 > 10 || nota1 < 0) {
			System.out.println("Esta média é inválida pois a nota vai de 0.0 ao 10.0, e "
							+ nota1 + " não é válido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}
		System.out.println("Digite a sua segunda nota e confirme no enter:");
		double nota2 = teclado.nextDouble();

		if (nota2 > 10 || nota2 < 0) {
			System.out.println("Esta média é inválida pois a nota vai de 0.0 ao 10.0, e "
							+ nota2 + " não é válido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}
		float nota = (float) ((nota1 + nota2) / 2);

		if (nota >= 9.0 && nota <= 10.0) {
			System.out.println("Você tirou um: A");
			System.out.println("Você está aprovado parabéns: média " + nota);

		} else if (nota >= 7.5 && nota < 9.0) {
			System.out.println("Você tirou um: B");
			System.out.println("Você está aprovado parabéns: média " + nota);

		} else if (nota >= 6 && nota < 7.5) {
			System.out.println("Você tirou um: C");
			System.out.println("Você está aprovado parabéns: média " + nota);

		} else if (nota >= 4 && nota < 6) {
			System.out.println("Você tirou um: D");
			System.out.println("você infelismente está reprovado: média " + nota);

		} else if (nota >= 0 && nota < 4) {
			System.out.println("Você tirou um: E");
			System.out.println("você está reprovado péssimo aproveitamento: média " + nota);
		}
		System.out.println("Fim do Exercicio");
	}
}