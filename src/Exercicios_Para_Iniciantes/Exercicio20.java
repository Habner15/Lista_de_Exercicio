package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio20 { /* Escreva um programa para imprimir o menu abaixo:
							 * 1 - Solteiro(a) 2 - Desquitado(a) 3 - Casado(a) 4
							 * - Divorciado(a) 5 - Vi�vo(a) O usu�rio dever�
							 * selecionar uma das op��es do menu e este dever�
							 * escrever o estado civil da pessoa. Emitir
							 * mensagem de erro caso seja escolhida uma op��o
							 * inexistente.*/
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		int pessoa = 0;
		System.out.println("1 - Solteiro(a)");
		System.out.println("2 - Desquitado(a)");
		System.out.println("3 - Casado(a)");
		System.out.println("4 - Divorciado(a)");
		System.out.println("5 - Vi�vo(a)");
		System.out.println("Selecione a sua op��o:");
		teclado = new Scanner(System.in);
		pessoa = teclado.nextInt();

		if (pessoa == 1) {
			System.out.println("Estado Civil: Solteiro(a)");

		} else if (pessoa == 2) {
			System.out.println("Estado Civil: Desquitado(a)");

		} else if (pessoa == 3) {
			System.out.println("Estado Civil: Casado(a)");

		} else if (pessoa == 4) {
			System.out.println("Estado Civil: Divorciado(a)");

		} else if (pessoa == 5) {
			System.out.println("Estado Civil: Vi�vo(a)");

		} else {
			System.out.println("Erro op��o inexistente");
		}
		System.out.println("Fim do Exercicio");
	}
}