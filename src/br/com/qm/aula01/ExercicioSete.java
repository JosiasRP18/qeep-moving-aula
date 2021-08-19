package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioSete {
	
	// 7. Leia um número inteiro e imprima o seu 
	// antecessor e o seu sucessor.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## ANTECESSOR E SUCESSOR ##");
		System.out.println("Digite um número inteiro: ");
		int numeroLido = teclado.nextInt();
		
		int antecessor = numeroLido - 1;
		int sucessor = numeroLido + 1;
		
		System.out.printf("O antecessor de %d é %d e o sucessor é %d", numeroLido, 
				antecessor, sucessor );
		
		teclado.close();
	}
	
	
}
