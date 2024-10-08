package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
		// tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
		// bem como os nomes dessas pessoas caso houver.
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		double alturaTotal = 0, alturaMedia, percentualMenores = 0;
		int nMenores = 0;
	
		
		for (int i = 0; i<n; i++) {
			System.out.println("Dados da " +  (i + 1) +  "a pessoa");
			System.out.print("Nome:");
			nomes[i] = sc.next();
			System.out.print("Idade:");
			idades[i] = sc.nextInt();
			System.out.print("Altura:");
			alturas[i] = sc.nextDouble();
			
		}
		
		for (int i = 0; i<n; i++) {
			if (idades[i] < 16) {
				nMenores++;				
			}
			alturaTotal += alturas[i];
		 }
				
		alturaMedia = alturaTotal / alturas.length;
		percentualMenores = ((double)nMenores / n) * 100.0;
		
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenores);
		
		for(int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	        	System.out.println(nomes[i]);
	        }
	    }
		
		
		sc.close();
	}

}
