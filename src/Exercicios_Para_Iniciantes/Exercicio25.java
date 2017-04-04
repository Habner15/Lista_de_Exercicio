package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio25 { /* Faça um Programa para leitura de três notas
							 * parciais de um aluno. O programa deve calcular a
							 * média alcançada por aluno e presentar:
							 * A mensagem "Aprovado", se a média for maior ou
							 * igual a 7, com a respectiva média alcançada;
							 * A mensagem "Reprovado", se a média for menor do
							 * que 7, com a respectiva média alcançada;
							 * A mensagem "Aprovado com Distinção", se a média
							 * for igual a 10.*/
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra a sua média de três notas! ");

		System.out.println("Digite a sua primeira nota tecle enter:");
		double nota1 = teclado.nextDouble();

		if (nota1 > 10 || nota1 < 0) {
			System.out.println("Esta média é inválida pois a nota vai de 0.0 ao 10.0, e "
							+ nota1 + " não é válido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}
		System.out.println("Digite a sua segunda nota tecle enter:");
		double nota2 = teclado.nextDouble();

		if (nota2 > 10 || nota2 < 0) {
			System.out.println("Esta média é inválida pois a nota vai de 0.0 ao 10.0, e "
							+ nota2 + " não é válido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}
		System.out.println("Digite a sua terceira nota tecle enter:");
		double nota3 = teclado.nextDouble();

		if (nota3 > 10 || nota3 < 0) {
			System.out.println("Esta média é inválida pois a nota vai de 0.0 ao 10.0, e "
							+ nota2 + " não é válido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}
		double nota = (nota1 + nota2 + nota3) / 3;

		if (nota >= 7 && nota < 10) {
			System.out.println("Você está aprovado parabéns: média " + nota);

		} else if (nota == 10) {
			System.out.println("Você é um aluno nota 10 aprovado: média "
					+ nota);

		} else {
			System.out.println("você infelismente está reprovado: média "
					+ nota);
		}
		System.out.println("Fim do Exercicio");
	}
}