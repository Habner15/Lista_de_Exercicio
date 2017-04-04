package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio16 { // Altere o programa que calcula a média do
							// aluno, e mostre a mensagem de acordo com a média.
							// De 0 a 3 - Reprovado, de 3 a 6.9 - Em Exame, de 7
							// a 10 - Aprovado
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra a sua média semestral! ");

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
		float nota = (float) ((nota1 + nota2) / 2);

		if (nota < 3) {
			System.out.println("Infeslismente você está reprovado: média " + nota);

		} else if (nota >= 3 && nota < 7) {
			System.out.println("Você está em exame: média " + nota);

		} else if (nota >= 7 && nota < 10) {
			System.out.println("Você está aprovado parabéns: média " + nota);

		} else if (nota == 10) {
			System.out.println("Você é um aluno nota 10 aprovado: média " + nota);
			System.out.println("Continue sendo assim parabéns!");

		} else {
			System.out.println("você infelismente está reprovado: média " + nota);

		}
		System.out.println("Fim do Exercicio");
	}
}