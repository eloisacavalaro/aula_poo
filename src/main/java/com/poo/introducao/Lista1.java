package com.poo.introducao;

import java.util.Scanner;

public class Lista1 {

    public static void ex8(){

		Scanner scanner = new Scanner(System.in);
		double distanciaPercorrida;
		double combustivelGasto;
		double consumoMedio;

		System.out.print("Digite a distância percorrida em km: ");
        distanciaPercorrida = scanner.nextDouble();

		System.out.print("Digite o total de combustível gasto em litros: ");
        combustivelGasto = scanner.nextDouble();

		consumoMedio = distanciaPercorrida / combustivelGasto;

		System.out.printf("O consumo médio do veículo é: " + consumoMedio);

    }
        
        
}
