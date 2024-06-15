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
	public static void ex3(){

        Scanner scanner = new Scanner(System.in);
		double valorDigitadoEmReais;
		double valorConvertidoParaDolar;

		System.out.print("Digite o valor em reais: R$ ");
        valorDigitadoEmReais = scanner.nextDouble();
		
		valorConvertidoParaDolar = valorDigitadoEmReais / 5.25;

		System.out.printf("O valor em dólares é: " + valorConvertidoParaDolar);

    } 
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
	public static void ex7(){

		Scanner scanner = new Scanner(System.in);
		double temperaturaEmFahrenheit;
   		double temperaturaEmCelsius;

		System.out.println("Digite a temperatura em Fahrenheit: ");
		temperaturaEmFahrenheit = scanner.nextDouble();

		temperaturaEmCelsius = (temperaturaEmFahrenheit - 32) / 1.8;

		System.out.println(+temperaturaEmFahrenheit+ " oF corresponde a "+ temperaturaEmCelsius+ " oC");

    }
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
