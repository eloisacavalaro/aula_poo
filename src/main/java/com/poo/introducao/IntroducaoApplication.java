package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);

		Scanner scanner = new Scanner(System.in);
		double distanciaPercorrida;
		double combustivelGasto;
		double consumoMedio;

		System.out.print("Digite a distância percorrida (em km): ");
        distanciaPercorrida = scanner.nextDouble();

		System.out.print("Digite o total de combustível gasto (em litros): ");
        combustivelGasto = scanner.nextDouble();

		consumoMedio = distanciaPercorrida / combustivelGasto;

		System.out.printf("O consumo médio do veículo é: " + consumoMedio);

		
	}

}
