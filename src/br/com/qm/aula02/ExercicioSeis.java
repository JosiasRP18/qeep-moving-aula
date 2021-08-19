package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSeis {
	
	// 6. Faça um programa que receba dois números e mostre 
	// qual deles é o maior.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## COMPARADOR DE NÚMEROS ##");
		System.out.println("Digite o primeiro número.");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o segundo número");
		int segundoNumero = teclado.nextInt();
		
		if (primeiroNumero == segundoNumero) {
			 System.out.println("Os números digitados são iguais");
		} else if (primeiroNumero > segundoNumero)  {
			System.out.printf("O número %d é maior do que %d", primeiroNumero, 
					segundoNumero);
		} else {
			System.out.printf("O número %d é maior do que %d", segundoNumero, 
					primeiroNumero);
		}
		
		teclado.close();
	}
	
}
