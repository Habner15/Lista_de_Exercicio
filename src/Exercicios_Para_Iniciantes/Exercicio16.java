package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio16 { // Altere o programa que calcula a m�dia do
							// aluno, e mostre a mensagem de acordo com a m�dia.
							// De 0 a 3 - Reprovado, de 3 a 6.9 - Em Exame, de 7
							// a 10 - Aprovado
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra a sua m�dia semestral! ");

		System.out.println("Digite a sua primeira nota tecle enter:");
		double nota1 = teclado.nextDouble();

		if (nota1 > 10 || nota1 < 0) {
			System.out.println("Esta m�dia � inv�lida pois a nota vai de 0.0 ao 10.0, e "
							+ nota1 + " n�o � v�lido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}
		System.out.println("Digite a sua segunda nota tecle enter:");
		double nota2 = teclado.nextDouble();

		if (nota2 > 10 || nota2 < 0) {
			System.out.println("Esta m�dia � inv�lida pois a nota vai de 0.0 ao 10.0, e "
							+ nota2 + " n�o � v�lido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}
		float nota = (float) ((nota1 + nota2) / 2);

		if (nota < 3) {
			System.out.println("Infeslismente voc� est� reprovado: m�dia " + nota);

		} else if (nota >= 3 && nota < 7) {
			System.out.println("Voc� est� em exame: m�dia " + nota);

		} else if (nota >= 7 && nota < 10) {
			System.out.println("Voc� est� aprovado parab�ns: m�dia " + nota);

		} else if (nota == 10) {
			System.out.println("Voc� � um aluno nota 10 aprovado: m�dia " + nota);
			System.out.println("Continue sendo assim parab�ns!");

		} else {
			System.out.println("voc� infelismente est� reprovado: m�dia " + nota);

		}
		System.out.println("Fim do Exercicio");
	}
}