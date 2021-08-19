package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioSeis {

	// 6. Leia o tamanho do lado de um quadrado e imprima como 
	//	resultado a sua área.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## CALCULADOR DE ÁREA DE UM RETÂNGULO");
		System.out.println("Digite a altura do retângulo: ");
		int altura = teclado.nextInt();
		
		System.out.println("Digite a base do retângulo: ");
		int base = teclado.nextInt();
		
		int area = base * altura;
		
		System.out.printf("A área do retângulo é: %d", area);
		teclado.close();
	}
}
