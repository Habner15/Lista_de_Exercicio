package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio13 { /*Fa�a um programa para o c�lculo de uma folha de
						 * pagamento, sabendo que os descontos s�o do Imposto de
						 * Renda, que depende do sal�rio bruto (conforme tabela
						 * abaixo) e 3% para o Sindicato e que o FGTS
						 * corresponde a 1% do Sal�rio Bruto, mas n�o �
						 * descontado (� a empresa que deposita). O Sal�rio
						 * L�quido corresponde ao Sal�rio Bruto menos os
						 * descontos. O programa dever� pedir ao usu�rio o valor
						 * da sua hora e a quantidade de horas trabalhadas no
						 * m�s. Desconto do IR.
						 * Sal�rio Bruto at� 900 (inclusive) - isento Sal�rio
						 * Bruto at� 1500 (inclusive) - desconto de 5% 
						 * Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
						 * Sal�rio Bruto acima de 2500 - desconto de 20% Imprima
						 * na tela as informa��es, dispostas conforme o exemplo
						 * abaixo. No exemplo o valor da hora � 5 e a quantidade
						 * de hora � 220.
						 * Sal�rio Bruto: (5 * 220) : R$ 10,0 (-) IR (5%) : R$
						 * 5,0 (-) INSS ( 10%) : R$ 110,0 FGTS (1%) : R$ 121,0
						 * Total de descontos : R$ 165,0 Sal�rio Liquido : R$935,0*/
	private static Scanner entrada;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		entrada = new Scanner(System.in);

		System.out.println("Digite o n�mero de horas trabalhadas aperte enter:");
		int horas = entrada.nextInt();

		System.out.println("Digite quanto voc� ganha por horas trabalhadas aperte enter:");
		double ganho = entrada.nextInt();
		double salario = horas * ganho;
		double impostoderenda = 0;

		if (salario <= 900) {
			impostoderenda = 0;

		} else if (salario <= 1500) {
			impostoderenda = 5;

		} else if (salario <= 2500) {
			impostoderenda = 10;

		} else if (salario > 2500) {
			impostoderenda = 20;
		}
		System.out.println(("      Sal�rio Bruto: R$" + (salario)));
		System.out.println(("     (-) IR (" + impostoderenda + "%): R$" + ((salario * impostoderenda) / 100)));
		System.out.println("     (-) INSS (10%): R$" + ((salario * 10) / 100));
		System.out.println("          FGTS (1%): R$" + ((salario * 1) / 100));
		System.out.println(" Total de descontos: R$"
						+ (salario * impostoderenda / 100 + salario * 10 / 100 + salario * 1 / 100));
		System.out.println("    Sal�rio Liquido: R$"
				+ (salario - ((salario * impostoderenda / 100 + salario * 10
						/ 100 + salario * 1 / 100))) + ("\n"));

		System.out.println("Fim do Exercicio");
	}
}