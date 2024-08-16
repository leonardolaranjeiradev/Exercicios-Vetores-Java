package exercicio4;

import java.util.Scanner;

public class Numeros_Pares {

	public static void main(String[] args) {
		// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
		// tela todos os números pares, e também a quantidade de números pares. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		
		int pares = 0;
		
		int[] vetor = new int[n];
		
		for (int i =0; i<n; i++) {
			System.out.print("Digite um numero: ");			
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES:");
		
		for (int i =0; i<n; i++) {
			if (vetor[i] % 2 == 0) {				
				System.out.println(vetor[i]);
				pares++;
			}
		}
		
		System.out.println("QUANTIDADE DE PARES = " + pares);
		
		
		
		sc.close();
	}

}
