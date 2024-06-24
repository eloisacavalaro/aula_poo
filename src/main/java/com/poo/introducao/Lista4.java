package com.poo.introducao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class Lista4 {

    private static  String[] lista = new String[10];
    private static int itensLista = 0;
    static double[] precos = new double[10];

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
    public static void exsDo5ao8 (){

        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int alternativa;
        boolean opcao = true;

        do {
            System.out.println("===== Olá, seja bem-vindo a sua lista de compra! =====");
            System.out.println("Selecione uma das alternativas abaixo: ");
            System.out.println("1 - Adicionar um item a lista de compras.");
            System.out.println("2 - Visualizar a lista de compras.");
            System.out.println("3 - Visualizar a lista de compras por ordem de preço.");
            System.out.println("4 - Desejo sair do app.");
            alternativa = scanner.nextInt();

            if (alternativa == 1) {
                adicionarItem();
            } else if (alternativa == 2) {
                visualizarLista();
            } else if (alternativa == 3) {
                visualizarListaPorPreco();
            } else if (alternativa == 4) {
                opcao = false;
                System.out.println("Saindo do app...");
            } else {
                System.out.println("Opção inválida. Voltando ao menu.");
            }
        } while (opcao);
    }

    public static void adicionarItem() {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        String itemRemover;
        int i = 0;

        do {
            if (itensLista >= lista.length) {
                System.out.println("Lista cheia! Não é possível adicionar mais itens.");
                return;
            }

            System.out.println("Qual item deseja adicionar a sua lista de compras?");
            lista[itensLista] = scanner.nextLine();

            System.out.println("Qual é o preço do item?");
            precos[itensLista] = scanner.nextDouble();
            scanner.nextLine();

            itensLista++;

            System.out.println("Deseja adicionar mais algum item a sua lista de compras? (Sim/Não)");
            opcao = scanner.nextLine();

        } while (opcao.equalsIgnoreCase("Sim") && itensLista < lista.length);

        do {
            System.out.println("Deseja remover algum item da lista? (Sim/Não)");
            opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("Sim")) {
                System.out.println("Qual item deseja remover da sua lista?");
                itemRemover = scanner.nextLine();
                removerItem(itemRemover);
            }
        } while (opcao.equalsIgnoreCase("Sim"));
    }

    public static void visualizarLista() {
        for (int i = 0; i < itensLista; i++) {
            System.out.println((i + 1) + " - " + lista[i] + " - R$" + precos[i]);
        }
    }

    public static void visualizarListaPorPreco() {
        String[] listaOrdem = Arrays.copyOf(lista, itensLista);
        double[] precosOrdemCrescente = Arrays.copyOf(precos, itensLista);

        for (int i = 0; i < itensLista - 1; i++) {
            for (int j = 0; j < itensLista - i - 1; j++) {
                if (precosOrdemCrescente[j] > precosOrdemCrescente[j + 1]) {
                    double tempPreco = precosOrdemCrescente[j];
                    precosOrdemCrescente[j] = precosOrdemCrescente[j + 1];
                    precosOrdemCrescente[j + 1] = tempPreco;

                    String tempItem = listaOrdem[j];
                    listaOrdem[j] = listaOrdem[j + 1];
                    listaOrdem[j + 1] = tempItem;
                }
            }
        }

        for (int i = 0; i < itensLista; i++) {
            System.out.println((i + 1) + " - " + listaOrdem[i] + " - R$" + precosOrdemCrescente[i]);
        }
    }

    public static void removerItem(String item) {
        for (int i = 0; i < itensLista; i++) {
            if (lista[i].equalsIgnoreCase(item)) {
                for (int j = i; j < itensLista - 1; j++) {
                    lista[j] = lista[j + 1];
                    precos[j] = precos[j + 1];
                }
                lista[itensLista - 1] = null;
                precos[itensLista - 1] = 0;
                itensLista--;
                System.out.println("Item removido com sucesso!");
                return;
            }
        }
        System.out.println("Item não encontrado na lista.");
    }

}