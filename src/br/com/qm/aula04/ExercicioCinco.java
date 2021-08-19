package br.com.qm.aula04;

import java.util.Scanner;

public class ExercicioCinco {

	// Leia um vetor de 10 posições. 
	// Contar e escrever quantos valores pares ele possui.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## CONTADOR DE PARES ##");
		int[] numerosLidos = new int[10];
		
		int contadorDePares = 0;
		for (int i = 0; i < numerosLidos.length; i++) {
			System.out.println("Digite um valor: ");
			numerosLidos[i] = teclado.nextInt();
			
			if (numerosLidos[i] % 2 == 0) {
				contadorDePares++;
			}
			
		}
		
		System.out.printf("O programa leu %d valores pares", contadorDePares);
		teclado.close();
	}
	
}
