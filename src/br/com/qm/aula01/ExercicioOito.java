package br.com.qm.aula01;

import java.math.BigInteger;
import java.util.Scanner;

public class ExercicioOito {

	//Leia um número inteiro e imprima a soma do sucessor de seu 
	//triplo com o antecessor de seu dobro.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## NÓ NA CABEÇA ##");
		System.out.println("Digite um número inteiro: ");
		int numeroLido = teclado.nextInt();
		
		int sucessorDoTriplo = (numeroLido * 3) + 1; 
		int antecessorDoDobro = (numeroLido * 2) - 1;
		
		int soma = sucessorDoTriplo + antecessorDoDobro;
		
		System.out.printf("A soma do sucessor do triplo com "
				+ "o antecessor do Dobro é: %d", soma);

		
		teclado.close();
	}
	
}
