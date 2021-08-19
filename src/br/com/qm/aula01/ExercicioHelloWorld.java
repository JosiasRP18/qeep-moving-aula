package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioHelloWorld {
	
	// 1. Faça um programa que leia um número inteiro e o imprima.
	
	public static void main(String[] args) {
		
		System.out.println("Olá querido usuário, digite um número:");
		Scanner teclado = new Scanner(System.in);
		
		int inteiroLido = teclado.nextInt();
		
		System.out.printf("\nO número lido foi: %d", inteiroLido);
	}

}
