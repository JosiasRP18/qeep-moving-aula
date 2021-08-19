package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioDois {

	// 2. Faça um programa que leia n inteiros e imprima sua média.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## MEDIA DE N INTEIROS ##");
		System.out.println("De quantos números você quer tirar a média?");
		int qtdNumeros = teclado.nextInt();
		
		int soma = 0;
		for (int i = 0; i < qtdNumeros; i++) {
			
			System.out.println("Digite um número: ");
			soma += teclado.nextInt();
			
		}
		
		float media = soma / (float) qtdNumeros;
		System.out.printf("A média dos números lidos foi: %.2f", media);
		teclado.close();
	}
}
