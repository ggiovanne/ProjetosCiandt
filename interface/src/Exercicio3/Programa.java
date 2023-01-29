package Exercicio3;

import java.util.Scanner;

public class Programa {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Adicao add = new Adicao();
		
		OperacaoMatematica adc = new Adicao();
		OperacaoMatematica sub = new Subtracao();
		OperacaoMatematica mult = new Multiplicacao();
		OperacaoMatematica div = new Divisao();

		System.out.println("BEM VINDO A CALCULADORA ARITMÉTICA");
		System.out.println("Digite o primeiro número: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		double n2 = sc.nextDouble();

		System.out.println("-----------------------------------");
		System.out.println("   ESCOLHA O OPERADOR MATEMÁTICO   ");
		System.out.println("-----------------------------------");
		System.out.println("[1] ADIÇÃO");
		System.out.println("[2] SUBTRAÇÃO");
		System.out.println("[3] MULTIPLICAÇÃO");
		System.out.println("[4] DIVISÃO");
		int resposta = sc.nextInt();

		OperacaoMatematica selecionado = null;

		switch (resposta) {

		case 1:
			selecionado = adc;
			break;

		case 2:
			selecionado = sub;
			break;

		case 3:
			selecionado = mult;
			break;

		case 4:
			selecionado = div;
			break;

		default:
			System.out.println("Número inválido");
		}

		if (selecionado != null && selecionado.valoresValidos(n1, n2)) {
			selecionado.calcular(n1, n2);
		}	

	}

}
