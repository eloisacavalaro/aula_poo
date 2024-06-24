package com.poo.introducao;

import java.util.Scanner;

public class Lista3 {

    public static void ex1 (){

        Scanner scanner = new Scanner(System.in);
        int segundos = 0;

        System.out.println("======== TIMER ========");

        while (true) {
            System.out.print("Digite um número de segundos entre 1 e 59: ");
            if (scanner.hasNextInt()) {
                segundos = scanner.nextInt();
                if (segundos >= 1 && segundos <= 59) {
                      break;
                 } else {
                    System.out.println("Erro: Digite um número entre 1 e 59.");
                }
            } else {
                System.out.println("Erro: número inválida. Digite um número inteiro entre 1 e 59.");
                 scanner.next();

            } 
        }
            try {
                 for (int i = segundos; i > 0; i--) {
                    System.out.println(i + " segundo(s) restante(s)...");
                    Thread.sleep(1000); 
                } 
            }
            catch (InterruptedException e) {
                System.out.println("O cronômetro foi interrompido."); 
            }
        } public static void ex2 (){

            Scanner scanner = new Scanner(System.in);
            int numero;

            System.out.println("====== TABUADA ======");
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();

            for(int i = 1; i<10; i++){
                System.out.println(numero + " x " + i + " = " + (numero * i) );
            }



        } 
        public static void ex3 () {
            Scanner scanner = new Scanner(System.in);
            int numero1, numero2;

            System.out.println("Digite o primeiro número: ");
            numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            numero2 = scanner.nextInt();

            int menorNumero = Math.min(numero1, numero2);
            int maiorNumero = Math.max(numero1, numero2);

            for (int i = menorNumero; i <= maiorNumero; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
           

    }
    public static void ex4 (){

        Scanner scanner = new Scanner(System.in);
        int numeroEscolhido;
        int numeroTentativa;
        int tentativa = 3;
        int diferenca;

        do{
            System.out.print("Escolha um número entre 1 e 100: ");
            numeroEscolhido = scanner.nextInt();

         

            System.out.println("Agora tente adivinhar. Digite sua tentativa: ");
            numeroTentativa = scanner.nextInt();

            diferenca = Math.abs(tentativa - numeroEscolhido);
            if (numeroTentativa == numeroEscolhido){
                System.out.println("Parabéns! Você adivinhou o número certo!");
            }else if (diferenca <= 10) {
                System.out.println("Quase lá!");
            } else if (diferenca > 10 ) {
                System.out.println("Quase lá!");
            } else if (diferenca <= 20) {
                System.out.println("Muito baixo.");
            }else if (diferenca > 20) {
                System.out.println("Muito alto.");
            }
        } while (numeroTentativa != numeroEscolhido);



    }
    public static void ex5 () {

        Scanner scanner = new Scanner(System.in);
        String loginCorreto = "eloisa";
        String senhaCorreta = "123";
        int tentativa = 3;

        do {

        System.out.print("Digite seu login: ");
        String login = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        boolean loginIncorreto = !login.equals(loginCorreto);
        boolean senhaIncorreta = !senha.equals(senhaCorreta);

            if (!loginIncorreto && !senhaIncorreta) {
            System.out.println("Login bem-sucedido!");
            break;
            } else if (loginIncorreto) {
                System.out.println("Login incorreto.");
                tentativa--;
            } else if (senhaIncorreta) {
                System.out.println("Senha incorreta.");
                tentativa--;
            } 
        } while ( tentativa > 0);

        if(tentativa == 0){
            System.out.println("Suas tentativas acabaram. Acesso bloqueado.");
        }


    }
    public static void ex6(){

        Scanner scanner = new Scanner(System.in);
        int numeroDeAndares;

        System.out.println("Digite o número de andares desejado: ");
        numeroDeAndares = scanner.nextInt();

        for (int i = 1; i <= numeroDeAndares; i++) {
            for (int j = 0; j < numeroDeAndares - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    } 
    public static void ex7(){

        Scanner scanner = new Scanner(System.in);
        int largura;
        int altura;

        System.out.println("Digite a largura do retângulo: ");
        largura = scanner.nextInt();

        System.out.println("Digite a altura do retângulo: ");
        altura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            System.out.println();
    }
}
}




        

        
      
    


   

