package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio21 { // Faça um Programa que peça uma data no formato
							// d/m/a e determine se a mesma é uma data válida.
	private static Scanner teclado;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		teclado = new Scanner(System.in);

		System.out.println("Descubra se a data é correta:");

		System.out.println("Digite o dia e tecle enter:");
		int dia = teclado.nextInt();

		System.out.println("Digite o mês e tecle enter:");
		int mes = teclado.nextInt();

		System.out.println("Digite o ano e tecle enter:");
		int ano = teclado.nextInt();

		if (mes == 2 && dia <= 28 && ano >= 0 && dia > 0)
			System.out.println("Está data é válida " + dia + "/" + mes + "/" + ano);
		
		if ((mes == 2 && dia == 29 && ano >= 0 && dia > 0)			
				&& ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)))
			System.out.println("Está data é válida " + dia + "/" + mes + "/" + ano);
		
		if (ano >= 0 && dia > 0 && mes == 4 || mes == 6 || mes == 9
				|| mes == 11 && dia <= 30)
			System.out.println("Está data é válida " + dia + "/" + mes + "/" + ano);
		
		if (ano >= 0 && dia > 0 && mes == 1 || mes == 3 || mes == 5 || mes == 7
				|| mes == 8 || mes == 10 || mes == 12 && dia <= 31) {
			System.out.println("Está data é válida " + dia + "/" + mes + "/" + ano);
			
		} else if (((mes > 12 || mes < 1 || ano < 0 || dia < 1) || (mes == 2 && dia == 29)
				&& ((ano % 4 != 0))))
			System.out.println("Está data é inválida " + dia + "/" + mes + "/" + ano);
		
		else if (mes == 2 && dia > 29)
			System.out.println("Está data é inválida " + dia + "/" + mes + "/" + ano);
		
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 30)
			System.out.println("Está data é inválida " + dia + "/" + mes + "/" + ano);
		
		else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
				|| mes == 10 || mes == 12 && dia > 31) {
			System.out.println("Está data é inválida " + dia + "/" + mes + "/" + ano);
		}
		System.out.println("Fim do Exercicio");
	}
}
