package exercicio1;

import java.util.Iterator;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int N = sc.nextInt();
		
		int[] positivos = new int[N];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero:");
			positivos[i] = sc.nextInt();
		}
		
		System.out.println("Numeros Negativos:");
		
		for (int i = 0; i < N; i++) {
			if (positivos[i] < 0) {
				System.out.println(positivos[i]);	
			}
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
