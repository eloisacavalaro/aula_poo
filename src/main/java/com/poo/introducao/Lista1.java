package com.poo.introducao;

import java.util.Scanner;

public class Lista1 {

    public static void ex3(){

        Scanner scanner = new Scanner(System.in);
		double valorDigitadoEmReais;
		double valorConvertidoParaDolar;

		System.out.print("Digite o valor em reais: R$ ");
        valorDigitadoEmReais = scanner.nextDouble();
		
		valorConvertidoParaDolar = valorDigitadoEmReais / 5.25;

		System.out.printf("O valor em dólares é: " + valorConvertidoParaDolar);

    }
        
        
}
