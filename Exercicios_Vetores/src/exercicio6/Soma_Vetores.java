package exercicio6;

import java.util.Scanner;

public class Soma_Vetores {

	public static void main(String[] args) {
		// Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
		// terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
		// o vetor C gerado. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor?");
		
		int n = sc.nextInt();
		
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i =0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		
		for(int i =0; i<n; i++) {
			B[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i =0; i<n; i++) {
			C[i] = A[i] + B[i];
			System.out.println(C[i]);
		}		
		
		sc.close();
	}

}
