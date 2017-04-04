package Exercicios_Para_Iniciantes;

import java.text.DecimalFormat;

public class Exercicio27 { // Faça um algoritmo que calcule os 20 primeiros
							// números primos.
	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		int i = 1;
		double x = 2, Divisor;
		String Impressao = "";
		boolean Primo = true;
		DecimalFormat df = new DecimalFormat("#,##0");

		while (i <= 20) {
			for (Divisor = 2; Divisor <= (x / 2); Divisor++) { // o Divisor só
																// precisa ir
																// até a metade
																// do valor de
																// x.
				if (x % Divisor == 0) {
					Primo = false;
					break;
				}
			}
			if (Primo == true) {
				Impressao += "\n" + i + "º - " + df.format(x);
				i++;
				x++;
			} else {
				x++;
				Primo = true;
			}
		}
		System.out.println("Os 20 primeiros números primos são:" + Impressao);
		System.out.println("Fim do Exercicio");
	}
}