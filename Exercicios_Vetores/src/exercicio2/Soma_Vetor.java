package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {

	public static void main(String[] args) {
		// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		// Imprimir todos os elementos do vetor
		// Mostrar na tela a soma e a média dos elementos do vetor
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int N = sc.nextInt();
		double[] vet1 = new double[N];
		double soma = 0;
		double media = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero:");
			vet1[i] = sc.nextDouble();
		}
		
		System.out.println("VALORES = " + vet1[0] +"  "+ vet1[1] + "  " + vet1[2] + "  " + vet1[3]);
		
		for (int i = 0; i<N; i++) {
			soma += vet1[i];
		}
		
		media = soma / vet1.length;
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
