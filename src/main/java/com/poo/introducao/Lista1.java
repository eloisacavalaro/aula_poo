package com.poo.introducao;

import java.util.Scanner;

public class Lista1 {

    public static void ex6(){

		Scanner scanner = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media;

		System.out.println("Digite sua nota 1:");
		nota1 = scanner.nextDouble();

		System.out.println("Digete sua nota 2: ");
		nota2 = scanner.nextDouble();

		System.out.println("Digite sua nota 3: ");
		nota3 = scanner.nextDouble();

		System.out.println("Digite sua nota 4: ");
		nota4 = scanner.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A média do aluno foi:"+ media);

    }
        
        
}
