package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio07 { /* Fa�a um programa para a leitura de duas notas
						 * parciais de um aluno. O programa deve calcular a
						 * m�dia alcan�ada por aluno e apresentar: A mensagem
						 * "Aprovado", se a m�dia alcan�ada for maior ou igual a
						 * sete; A mensagem "Reprovado", se a m�dia for menor do
						 * que sete; A mensagem "Aprovado com Distin��o", se a
						 * m�dia for igual a dez.*/
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra a sua m�dia semestral! ");

		System.out.println("Digite a sua primeira nota aperte enter:");
		double nota1 = teclado.nextDouble();

		if (nota1 > 10 || nota1 < 0) {
			System.out
					.println("Esta nota � inv�lida pois a nota vai de 0.0 ao 10.0, e "
							+ nota1 + " n�o � v�lido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}

		System.out.println("Digite a sua segunda nota aperte enter:");
		double nota2 = teclado.nextDouble();

		if (nota2 > 10 || nota2 < 0) {
			System.out
					.println("Esta nota � inv�lida pois a nota vai de 0.0 ao 10.0, e "
							+ nota2 + " n�o � v�lido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}

		float nota = (float) ((nota1 + nota2) / 2);

		if (nota >= 7 && nota < 10) {
			System.out.println("Voc� est� aprovado parab�ns: m�dia " + nota);

		} else if (nota == 10) {
			System.out.println("Voc� � um aluno nota 10 aprovado: m�dia "
					+ nota);
			System.out.println("Continue sendo assim parab�ns!");

		} else {
			System.out.println("voc� infelismente est� reprovado: m�dia "
					+ nota);
		}
		System.out.println("Fim do Exercicio");
	}
}