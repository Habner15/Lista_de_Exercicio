package Exercicios_Para_Iniciantes;

import java.util.Scanner;

public class Exercicio13 { /*Faça um programa para o cálculo de uma folha de
						 * pagamento, sabendo que os descontos são do Imposto de
						 * Renda, que depende do salário bruto (conforme tabela
						 * abaixo) e 3% para o Sindicato e que o FGTS
						 * corresponde a 1% do Salário Bruto, mas não é
						 * descontado (é a empresa que deposita). O Salário
						 * Líquido corresponde ao Salário Bruto menos os
						 * descontos. O programa deverá pedir ao usuário o valor
						 * da sua hora e a quantidade de horas trabalhadas no
						 * mês. Desconto do IR.
						 * Salário Bruto até 900 (inclusive) - isento Salário
						 * Bruto até 1500 (inclusive) - desconto de 5% 
						 * Salário Bruto até 2500 (inclusive) - desconto de 10%
						 * Salário Bruto acima de 2500 - desconto de 20% Imprima
						 * na tela as informações, dispostas conforme o exemplo
						 * abaixo. No exemplo o valor da hora é 5 e a quantidade
						 * de hora é 220.
						 * Salário Bruto: (5 * 220) : R$ 10,0 (-) IR (5%) : R$
						 * 5,0 (-) INSS ( 10%) : R$ 110,0 FGTS (1%) : R$ 121,0
						 * Total de descontos : R$ 165,0 Salário Liquido : R$935,0*/
	private static Scanner entrada;

	public static void main(String[] args) {

		System.out.println("Inicio do Exercicio");

		entrada = new Scanner(System.in);

		System.out.println("Digite o número de horas trabalhadas aperte enter:");
		int horas = entrada.nextInt();

		System.out.println("Digite quanto você ganha por horas trabalhadas aperte enter:");
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
		System.out.println(("      Salário Bruto: R$" + (salario)));
		System.out.println(("     (-) IR (" + impostoderenda + "%): R$" + ((salario * impostoderenda) / 100)));
		System.out.println("     (-) INSS (10%): R$" + ((salario * 10) / 100));
		System.out.println("          FGTS (1%): R$" + ((salario * 1) / 100));
		System.out.println(" Total de descontos: R$"
						+ (salario * impostoderenda / 100 + salario * 10 / 100 + salario * 1 / 100));
		System.out.println("    Salário Liquido: R$"
				+ (salario - ((salario * impostoderenda / 100 + salario * 10
						/ 100 + salario * 1 / 100))) + ("\n"));

		System.out.println("Fim do Exercicio");
	}
}