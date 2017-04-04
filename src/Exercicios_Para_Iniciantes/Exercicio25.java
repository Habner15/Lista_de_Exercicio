package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio25 { /* Fa�a um Programa para leitura de tr�s notas
							 * parciais de um aluno. O programa deve calcular a
							 * m�dia alcan�ada por aluno e presentar:
							 * A mensagem "Aprovado", se a m�dia for maior ou
							 * igual a 7, com a respectiva m�dia alcan�ada;
							 * A mensagem "Reprovado", se a m�dia for menor do
							 * que 7, com a respectiva m�dia alcan�ada;
							 * A mensagem "Aprovado com Distin��o", se a m�dia
							 * for igual a 10.*/
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra a sua m�dia de tr�s notas! ");

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
		System.out.println("Digite a sua terceira nota tecle enter:");
		double nota3 = teclado.nextDouble();

		if (nota3 > 10 || nota3 < 0) {
			System.out.println("Esta m�dia � inv�lida pois a nota vai de 0.0 ao 10.0, e "
							+ nota2 + " n�o � v�lido! ");
			System.out.println("Fim do Exercicio");
			System.exit(0);
		}
		double nota = (nota1 + nota2 + nota3) / 3;

		if (nota >= 7 && nota < 10) {
			System.out.println("Voc� est� aprovado parab�ns: m�dia " + nota);

		} else if (nota == 10) {
			System.out.println("Voc� � um aluno nota 10 aprovado: m�dia "
					+ nota);

		} else {
			System.out.println("voc� infelismente est� reprovado: m�dia "
					+ nota);
		}
		System.out.println("Fim do Exercicio");
	}
}