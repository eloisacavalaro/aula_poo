package com.poo.introducao;

import java.util.Scanner;

public class Lista1 {

    public static void ex2(){

        Scanner scanner = new Scanner(System.in);
		String nome; 
		String sobrenome;

		System.out.println("Qual é o seu nome?: ");
		nome = scanner.nextLine();

		System.out.println("Qual é o seu sobrenome?: ");
		sobrenome = scanner.nextLine();

		System.out.println("Olá " + nome + " "+ sobrenome + "!");

    }
        
        
}
