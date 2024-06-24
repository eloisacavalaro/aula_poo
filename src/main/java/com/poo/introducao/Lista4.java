package com.poo.introducao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class Lista4 {

    private static  String[] lista = new String[10];
    private static int itensLista = 0;

    public static void ex1 (){

        double[] vendasDia = {3.50, 10.50, 15, 9, 1, 3.55, 7.25, 50, 30};
        double soma = 0;

        for(int i = 0; i<(vendasDia.length); i++){
            soma = soma + vendasDia[i];
        }
        System.out.println("O seu total do dia é : R$ " + soma);

    }
    public static void ex2 (){

        double[] vendasDia = {3.50, 10.50, 15, 9, 1, 3.55, 7.25, 50, 30};
        double maiorNumero = Double.MIN_VALUE;
        double menorNumero = Double.MAX_VALUE;
        
        for (double numero : vendasDia) {
            maiorNumero = Math.max(maiorNumero, numero);
            menorNumero = Math.min(menorNumero, numero);
        }
        System.out.println("A compra de maior valor foi : R$ " + maiorNumero);
        System.out.println("A compra de menor valor foi : R$ " + menorNumero);

    }
    public static void ex3 (){

        double[] vendasDia = {3.50, 10.50, 15, 9, 1, 3.55, 7.25, 50, 30};
        double mediaDia = 0;
        double soma = 0;

        for(int i = 0; i<(vendasDia.length); i++){
            soma = soma + vendasDia[i];
        }

        mediaDia = soma/10;
    
        System.out.println("Sua média do dia foi: R$ " + mediaDia);
    }
        public static void ex4 (){

        int lista[ ] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };
        int numerosPares = 0;

        for (int numero : lista) {
            if (numero % 2 == 0) {
            numerosPares++;
            } 
        }
        System.out.println("Os números pares são: " + numerosPares);

    }
    public static void exsDo5ao7 (){

        menu();

    }
    public static void menu(){

        Scanner scanner = new Scanner(System.in);
        int alternativa;
        boolean opcao = true;

        do{

            System.out.println("===== Olá, seja bem-vindo a sua lista de compra! =====");
            System.out.println("Selecione uma das alternativas abaixo abaixo: ");
            System.out.println("1 - Adicionar um item a lista de compras.");
            System.out.println("2 - Vizualizar a lista de compras.");
            System.out.println("3 - Desejo sair do app.");
            alternativa = scanner.nextInt();

            if(alternativa == 1){
                adicionarItem();
            } else if (alternativa == 2){
                vizualizarlista();
            } else if ( alternativa == 3){
                opcao= false;
                System.out.println("Saindo do app...");
            } else {
                System.out.println("Opção invalida. Voltando ao menu.");
                menu();
            }

        } while ( opcao);

    } public static void adicionarItem() {

        Scanner scanner = new Scanner(System.in);
        String opcao;
        String itemRemover;
        int i = 0;

        do {
            System.out.println("Qual item deseja adicionar a sua lista de compras? ");
            lista[itensLista] = scanner.nextLine();
            itensLista++;

            System.out.println("Deseja adicionar mais algum item a sua lista de compras? ");
            opcao = scanner.nextLine();

        } while (opcao.equalsIgnoreCase("Sim") && i <10);

        do{
            System.out.println("Deseja remover algum item da lista? ");
            opcao = scanner.nextLine();

        if(opcao.equalsIgnoreCase("Sim")){ 
            System.out.println("Qual item deseja remover da sua lista?");
            itemRemover = scanner.nextLine();
            removerItem(itemRemover);
        } 
        } while(opcao.equalsIgnoreCase("Sim")); 

    } public static void vizualizarlista() {

        for(int i = 0; i<itensLista; i++){
            System.out.println((i+1) + " - " + lista[i]);
        }

    }
    public static void removerItem(String item) {
        for (int i = 0; i < itensLista; i++) {
            if (lista[i].equalsIgnoreCase(item)) {
                for (int j = i; j < itensLista - 1; j++) {
                    lista[j] = lista[j + 1];
                }
                lista[itensLista - 1] = null;
                itensLista--;
                System.out.println("Item removido com sucesso!");
                return;
            }
        }

    } public static void ex8 (){

        double[] vendasDia = {3.50, 10.50, 15, 9, 1, 3.55, 7.25, 50, 30};

        Arrays.sort(vendasDia);

        for(int i = 0; i<(vendasDia.length); i++){
            System.out.println((i+1) + " - " + vendasDia[i]);
        }
    
    }
}
