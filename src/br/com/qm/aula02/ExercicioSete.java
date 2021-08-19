package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSete {
	
	// Faça um programa que peça um valor e 
	//mostre na tela se o valor é positivo ou negativo.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## POSITIVO OU NEGATIVO ##");
		System.out.println("Digite um número: ");
		int numeroLido = teclado.nextInt();
		
		// maior do que zero é positivo
		// menor do que zero é negativo
		// o valor é nulo
		
		if (numeroLido == 0) {
			System.out.println("O número é nulo (igual a 0)");
		} else if (numeroLido > 0) {
			System.out.println("O número é positivo!");
		} else {
			System.out.println("O número é negativo!");
		}
		
		// Não se preocupem com o close.
		teclado.close();
	}
	
}
