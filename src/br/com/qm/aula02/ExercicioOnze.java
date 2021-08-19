package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOnze {

	// 11. Faça um Programa que leia três números
	// e mostre o maior deles.
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## MAIOR NUMERO ##");
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = teclado.nextInt();

		System.out.println("Digite o segundo número: ");
		int segundoNumero = teclado.nextInt();

		System.out.println("Digite o terceiro número: ");
		int terceiroNumero = teclado.nextInt();

//		if (primeiroNumero == segundoNumero 
//					&& segundoNumero == terceiroNumero) {
//			System.out.println("Os numeros são iguais.");
//		} else if (primeiroNumero > segundoNumero 
//					&& primeiroNumero > terceiroNumero) {
//			System.out.println("O primeiro número é o maior digitado.");
//		} else if (segundoNumero > primeiroNumero 
//					&& segundoNumero > terceiroNumero) {
//			System.out.println("O segundo número é o maior digitado.");
//		} else {
//			System.out.println("O terceiro número é o maior digitado.");
//		}

		boolean numerosIguais = primeiroNumero == segundoNumero 
					&& segundoNumero == terceiroNumero;
		boolean primeiroNumeroMaior = primeiroNumero > segundoNumero 
					&& primeiroNumero > terceiroNumero;
		boolean segundoNumeroMaior = segundoNumero > primeiroNumero 
					&& segundoNumero > terceiroNumero;

		if (numerosIguais) {
			System.out.println("Os numeros são iguais.");
		} else if (primeiroNumeroMaior) {
			System.out.println("O primeiro número é o maior digitado.");
		} else if (segundoNumeroMaior) {
			System.out.println("O segundo número é o maior digitado.");
		} else {
			System.out.println("O terceiro número é o maior digitado.");
		}

		teclado.close();
	}
}
