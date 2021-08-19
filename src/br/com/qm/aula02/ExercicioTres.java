package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioTres {

	// Implemente um programa que calcule o ano de nascimento de 
	//uma pessoa a partir de sua idade e o último ano que fez
	//aniversário.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## CALCULADOR DE ANO DE NASCIMENTO ##");
		System.out.println("Digite a sua idade: ");
		int idade = teclado.nextInt();
		System.out.println("Digite o último ano que fez aniversário: ");
		int anoAtual = teclado.nextInt();
		//int anoAtual = 2021;
		int anoNascimento = anoAtual - idade;
		
		System.out.printf("Você nasceu em: %d", anoNascimento);
		teclado.close();
	}
	
}
