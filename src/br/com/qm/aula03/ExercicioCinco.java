package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioCinco {

	// 5. Faça um programa que leia um número inteiro positivo n e
	// calcule a soma dos 
	// n primeiros números naturais.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## SOMA DOS N INTEIROS POSITIVOS ##");
		System.out.println("Digite qual a quantidade de números: ");
		int qtdNumeros = teclado.nextInt();
		
		if (qtdNumeros < 0) {
			System.out.println("Quantidade inválida");
			return; //break
		}
		
		int soma = 0;
		for (int i = 1; i <= qtdNumeros; i++) {
			soma += i;
		}
		
		System.out.printf("A soma dos %d inteiros positivos é %d", 
				qtdNumeros, soma);
		
		teclado.close();
	}
}
