package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio24 { /* Faça um Programa para ler três idades de alunos e
							 * seguir as seguintes instruções:
							 * Se a média de idade dos alunos é inferior de 25,
							 * apresentar a mensagem "Turma Jovem";
							 * Se a média de idade dos alunos é entre 25 e 40,
							 * apresentar a mensagem "Turma Adulta";
							 * Se a média de idade dos alunos é acima de 40
							 * anos, apresentar a mensagem "Turma Idosa".*/
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		System.out.println("Descubra de qual turma você pertence:");

		teclado = new Scanner(System.in);

		System.out.println("Digite a sua idade e tecle enter:");
		int idade = teclado.nextInt();

		if (idade < 0 || idade >= 130) {
			System.out.println("Idade Inválida");
			System.out.println("Não existem pessoas com " + idade
					+ " anos no século em que vivemos!");

		} else if (idade < 25) {
			System.out.println("Você pertence a uma 'Turma Jovem'");
			System.out.println("Idade correspondente a " + idade + " anos.");

		} else if (idade <= 40) {
			System.out.println("Você pertence a uma 'Turma Adulta'");
			System.out.println("Idade correspondente a " + idade + " anos.");

		} else {
			System.out.println("Você pertence a uma 'Turma Idosa'");
			System.out.println("Idade correspondente a " + idade + " anos.");

		}
		System.out.println("Fim do Exercicio");
	}
}