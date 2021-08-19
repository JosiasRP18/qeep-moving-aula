package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioTres {

	// 3. Peça ao usuário para digitar três valores inteiros e 
	// imprima a soma deles.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## SOMA DE TRÊS NÚMEROS ##");
		System.out.println("Digite três valores e eu "
				+ "vou imprimir a soma deles: ");
		
		System.out.println("Digite o primeiro número: ");
		int primeiroLido = teclado.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoLido = teclado.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int terceiroLido = teclado.nextInt();
		
		int soma = primeiroLido + segundoLido + terceiroLido;
		System.out.printf("A soma dos números lidos é: %d", 
				soma);
		
		teclado.close();
	}	
}
