package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioOito {
	
	
	// Faça um programa que peça um número inteiro e 
	//determine se ele é ou não um número primo. 
	//Um número primo é aquele que 
	//é divisível somente por ele mesmo e por 1.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## DESCOBRIDOR DE PRIMOS ##");
		System.out.println("Digite um número inteiro e "
				+ "eu te direi se ele é ou não primo.");
		int numeroLido = teclado.nextInt();
		
		int contador = 0;
		// resto da divisão é 0
		
		
		// numeroLido = 5
		// contador = 0
		// numeroLido = 8
		// contador = 1
		for (int i = numeroLido - 1; i > 1; i--) {
			// 1 iteração i = 4
			// 2 iteração i = 3
			// 3 iteração i = 2
			
			// 1 iteração i = 7
			// 2 iteração i = 6
			// 3 iteração i = 5
			// 4 iteração i = 4
			if (numeroLido % i == 0) {
				contador++;
				break;
			}
			
		}
		
		if (contador == 1) {
			System.out.println("Não é primo!");
		} else {
			System.out.println("É primo!");
		}
		
		teclado.close();
	}

}
