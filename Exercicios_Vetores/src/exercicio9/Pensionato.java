package exercicio9;

import java.util.Scanner;

import exercicio9.entities.Aluguel;

public class Pensionato {

	public static void main(String[] args) {
		// A dona de um pensionato possui dez quartos para alugar para estudantes, 
		// sendo esses quartos identificados pelos números de 0 a 9.
		// Fazer um programa que inicie com todos os dez quartos vazios, e depois
		// leia uma quantidade N representando o número de estudantes que vão alugar 
		// quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes.
		// Para cada registro de aluguel, informar o nome e email do estudante, bem como qual
		// dos quartos ele escolheu (de 0 a 9). Suoonha que seja escolhido um quarto vago.
		// Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato,
		// por ordem de quarto, conforme exemplo.
		
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vetor = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados?");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Alguel #" + (i+1) + ":");
			System.out.print("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email:");
			String email = sc.next();
			System.out.print("Quarto:");
			int numeroQuarto = sc.nextInt();
			
			Aluguel aluguel = new Aluguel(nome, email);
			vetor[numeroQuarto] = aluguel;			
		}
		
		System.out.println();
		System.out.println("Quartos alugados:");
		
		for(int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		
	
		
		
		
		
		
		sc.close();
	}

}
