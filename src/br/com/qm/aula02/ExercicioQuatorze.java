package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuatorze {

	//14. Usando switch, escreva um programa que leia um inteiro 
	// entre 1 e 7 e imprima o dia da semana correspondente a este número. Isto e, domingo se 1, 
	// segunda-feira se 2, e assim por diante.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## DIAS DA SEMANA COM SWITCH ##");
		System.out.println("Digite um número inteiro: ");
		int dia = teclado.nextInt();
		
		switch (dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3: 
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Você não digitou um número válido.");
		}
		
		teclado.close();
	}
	
}
