package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDois {

	// 2. Leia uma velocidade em km/h (quilometros por hora) 
	// e apresente-a convertida em m/s (metros por segundo).
	
	//divida o valor de velocidade por 3,6
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## CONVERTER DE KM/H P M/S ##");
		System.out.println("Digite a velocidade em KM/H");
		float velocidadeKm = teclado.nextFloat();
		
		float velocidadeMs = velocidadeKm / 3.6F;
		
		System.out.printf("A velocidade digitada em M/S é: %.2f",
				velocidadeMs);
		
		teclado.close();
	}
}
