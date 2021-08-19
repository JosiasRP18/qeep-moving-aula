package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuinze {

	// 15. Faça um programa que mostre ao usuário um menu com 4 opções de operações
	// matemáticas (as básicas, por exemplo). O usuário escolhe uma das opções e o 
	// seu programa então pede dois valores numéricos e realiza a operação, 
	// mostrando o resultado e saindo.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## PRIMEIRA CALCULADORA ##");
		System.out.println(" -- Digite 1 para soma -- ");
		System.out.println(" -- Digite 2 para subtração -- ");
		System.out.println(" -- Digite 3 para multiplicação -- ");
		System.out.println(" -- Digite 4 para divisão -- ");
		int opcao = teclado.nextInt();
		
		switch (opcao) {
			case 1:
				System.out.println("Digite o primeiro valor: ");
				float primeiroValor = teclado.nextFloat();
				System.out.println("Digite o segundo valor: ");
				float segundoValor = teclado.nextFloat();
				float soma = primeiroValor + segundoValor;
				System.out.printf("A soma dos valores é: %.2f", soma);
				break;
			case 2:
				System.out.println("Digite o primeiro valor AQUI: ");
				float primeiroValorSub = teclado.nextFloat();
				System.out.println("Digite o segundo valor: ");
				float segundoValorSub = teclado.nextFloat();
				float subtracao = primeiroValorSub - segundoValorSub;
				System.out.printf("A diferenca dos valores é: %.2f", subtracao);
				break;
			default:
				System.out.println("Opção inválida.");
		
		}
		
		teclado.close();
	}
	
}
