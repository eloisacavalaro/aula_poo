package com.poo.introducao;

import java.util.Scanner;

public class Lista1 {

    public static void ex7(){

		Scanner scanner = new Scanner(System.in);
		double temperaturaEmFahrenheit;
   		double temperaturaEmCelsius;

		System.out.println("Digite a temperatura em Fahrenheit: ");
		temperaturaEmFahrenheit = scanner.nextDouble();

		temperaturaEmCelsius = (temperaturaEmFahrenheit - 32) / 1.8;

		System.out.println(+temperaturaEmFahrenheit+ " oF corresponde a "+ temperaturaEmCelsius+ " oC");

    }
        
        
}
