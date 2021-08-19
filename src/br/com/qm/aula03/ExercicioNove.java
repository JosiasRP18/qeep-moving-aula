package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioNove {

	// Faça um programa que calcule o fatorial de um número 
	// inteiro fornecido pelo usuário.
	// 3 = 3 * 2 * 1; 
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## FATORIAL ##");
		System.out.println("Digite um valor para calculo de fatorial: ");
		int numeroLido = teclado.nextInt();
		
		double fatorial = 1;
		// 5
		for (int i = numeroLido; i > 1; i--) {
			
			// 1 iteração i = 5 - fatorial = 1
			// 2 iteração i = 4 - fatorial = 5
			// 3 iteração i = 3 - fatorial = 20
			// 4 iteração i = 2 - fatorial = 60
			// fatorial = 120
			fatorial = fatorial * i;
			
		}
		
		System.out.printf("O fatorial de %d é %2f", 
				numeroLido, fatorial);
		
	}
}
