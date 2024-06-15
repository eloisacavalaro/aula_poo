package com.poo.introducao;

import java.util.Scanner;

public class Lista1 {

    public static void ex5(){

		Scanner scanner = new Scanner(System.in);
		int larguraTerreno;
		int comprimentoTerreno;
		int area;
		int valorDoM2;

		System.out.println("Qual a largura do terreno em metros?");
		larguraTerreno = scanner.nextInt();

		System.out.println("Qual a comprimento do terreno em metros?");
		comprimentoTerreno = scanner.nextInt();

		area = larguraTerreno * comprimentoTerreno;

		System.out.println("Qual o valor do m2 na região em R$?");
		valorDoM2 = scanner.nextInt();

		System.out.println("O valor total do terreno é: R$" + (valorDoM2 * area) );

    }
        
        
}
