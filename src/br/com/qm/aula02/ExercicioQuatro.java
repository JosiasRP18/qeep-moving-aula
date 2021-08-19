package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		// 4. Receba a altura do degrau de uma escada e a altura que o 
		// usuário deseja alcançar subindo a escada. 
		// Calcule e mostre quantos degraus o usuário deverá 
		// subir para atingir seu objetivo.
		
		// degrau: cm, altura: m
		Scanner teclado = new Scanner(System.in);
		System.out.println("## Calculador de Degraus ##");
		System.out.println("Digite a altura do degrau em cm: ");
		float alturaDegrau = teclado.nextFloat();
		System.out.println("Digite a altura da escada em m: ");
		float alturaEscada = teclado.nextFloat();
		
		
		float qtdDegraus = (alturaEscada * 100) / alturaDegrau;
		
		System.out.printf("A quantidade de degraus dessa escada é %.0f", qtdDegraus);
		
		teclado.close();
	}
	
}
