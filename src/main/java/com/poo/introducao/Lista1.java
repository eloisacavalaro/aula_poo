package com.poo.introducao;

import java.util.Scanner;

public class Lista1 {

    public static void ex1(){

        Scanner scanner = new Scanner(System.in);
		int numero1;
		int numero2;
		int resultado;

		System.out.println("Digite um número: ");
		numero1 = scanner.nextInt();

		System.out.println("Digite outro número: ");
		numero2 = scanner.nextInt();

        resultado = numero1 + numero2;
		System.out.println("A soma dos dois numeros é: " + resultado);
    }
        
        
}
