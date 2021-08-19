package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioTres {

	// 3. Escreva um programa que leia 10 números e escreva o menor
	// valor lido e o maior valor lido.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("## MAIOR E MENOR ##");
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite um valor: ");
			int valorLido = teclado.nextInt();
		
//			if (i == 0) {
//				maior = valorLido;
//				menor = valorLido;
//				continue;
//			}
			
			if (valorLido > maior) {
				maior = valorLido;
			}
			
			if (valorLido < menor) {
				menor = valorLido;
			}
			
		}
		
		System.out.printf("O maior valor lido foi %d"
				+ "\nOmenor valor lido foi %d.", maior, menor);
		
		teclado.close();
	}
	
}
