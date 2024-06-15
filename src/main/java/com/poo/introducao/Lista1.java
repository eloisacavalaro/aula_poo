package com.poo.introducao;

import java.util.Scanner;

public class Lista1 {

    public static void ex4(){

		Scanner scanner = new Scanner(System.in);
		int numeroDigitado;
    	int antecessor;
    	int sucessor;

		System.out.println("Digite um número para saber seu antecessor e sucessor:");
		numeroDigitado = scanner.nextInt();

		antecessor = numeroDigitado - 1;
		sucessor = numeroDigitado + 1;

		System.out.println("O sucessor de "+ numeroDigitado + " é " + sucessor+ " e seu antecessor é "+ antecessor +".");

    }
        
        
}
